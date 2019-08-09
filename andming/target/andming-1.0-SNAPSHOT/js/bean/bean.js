var app = angular.module("pinyougou",["pagination"]);

app.controller("brandController",function ($scope,$http) {
    //定义查询所有品牌列表的方法
    $scope.findAll=function () {
        //response接收响应结果
        $http.get("../brand/findAll.do").success(function (response) {
            $scope.list=response;
        })
    }

    //分页配置
    $scope.paginationConf = {
        currentPage:1,  				//当前页
        totalItems:10,					//总记录数
        itemsPerPage:10,				//每页记录数
        perPageOptions:[10,20,30,40,50], //分页选项，下拉选择一页多少条记录
        onChange:function(){			//页面变更后触发的方法
            $scope.reloadList();		//启动就会调用分页组件
        }
    };

    $scope.reloadList=function () {
        $scope.findPage($scope.paginationConf.currentPage,$scope.paginationConf.itemsPerPage);
    };

    //发起分页查询请求
    $scope.findPage=function (pageNum,pageSize) {
        $http.get("../brand/findPage.do?pageNum="+pageNum+"&pageSize="+pageSize).success(function (response) {
            $scope.paginationConf.totalItems=response.total;
            $scope.list=response.rows;
        })
    }


});