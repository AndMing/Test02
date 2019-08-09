var app = angular.module("andming",["pagination"]);

app.controller("brandController",function ($scope,brandService) {
    //定义查询所有品牌列表的方法
    $scope.findAll=function () {
        //response接收响应结果
        brandService.findAll().success(function (response) {
            $scope.list=response;
        })
    }

    //分页配置
    $scope.paginationConf = {
        currentPage:1,  				//当前页
        totalItems:10,					//总记录数
        itemsPerPage:5,				//每页记录数
        perPageOptions:[5,10,15,20], //分页选项，下拉选择一页多少条记录
        onChange:function(){			//页面变更后触发的方法
            $scope.reloadList();		//启动就会调用分页组件
        }
    }

    $scope.reloadList=function () {
        $scope.findPage($scope.paginationConf.currentPage,$scope.paginationConf.itemsPerPage);
    };

    //发起分页查询请求
    $scope.findPage=function (pageNum,pageSize) {
        brandService.findPage(pageNum,pageSize).success(function (response) {
            $scope.paginationConf.totalItems=response.total;
            $scope.list=response.rows;
        })
    };

    $scope.save=function () {
        var method=null;
        if($scope.entity.id!=null){
            //修改操作
            method=brandService.update($scope.entity);
        }else{
            //添加操作
            method=brandService.add($scope.entity);
        }

        method.success(function (response) {
            if(response.success){
                //添加成功，重新加载品牌列表
                $scope.reloadList();
            }else {
                alert(response.message);
            }
        })
    }

    $scope.findOne=function (id) {
        brandService.findOne(id).success(function (response) {
           $scope.entity=response
        })
    }


    //定义记录选中id的数组
    $scope.selectIds=[];

    //更新复选框选中状态
    $scope.updateSelection=function ($event,id) {
        //判断选中状态
        if($event.target.checked){//选中状态
            $scope.selectIds.push(id);
        }else{
            //取消勾选，移除当前id值  //参数一：移除位置的元素的索引值  参数二：从该位置移除几个元素
            var index =$scope.selectIds.indexOf(id);
            $scope.selectIds.splice(index,1);
        }
    }

    //删除操作
    $scope.dele=function () { // 2,3,4
        if(confirm("您确定要删除吗？")){
            brandService.dele( $scope.selectIds).success(function (response) {
                if(response.success){
                    //添加成功，重新加载品牌列表
                    $scope.reloadList();
                }else {
                    alert(response.message);
                }
            })
        }

    }



});