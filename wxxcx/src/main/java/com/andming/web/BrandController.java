package com.andming.web;

import com.andming.domain.TbBrand;
import com.andming.domain.entity.PageResult;
import com.andming.domain.entity.Result;
import com.andming.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("brand")
@ResponseBody
public class BrandController {

    @Autowired
    private BrandService service;

    @RequestMapping("findAll")
    public List<TbBrand> findAll(){
        List<TbBrand> brands = service.findAll();
        return brands;
    }

    @RequestMapping("findPage")
    public PageResult findPage(Integer pageNum, Integer pageSize){
        return service.findPage(pageNum,pageSize);
    }

    @RequestMapping("findOne")
    public TbBrand findOne(long id){

        return service.findOne(id);
    }

    @RequestMapping("add")
    public Result add(@RequestBody TbBrand brand){
        System.out.println(brand);
        try {
            service.add(brand);
            return new Result(true,"添加成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false,"添加失败");
        }
    }

    @RequestMapping("update")
    public Result update(@RequestBody TbBrand brand){
        try {
            System.out.println(brand);
            service.updata(brand);
            return new Result(true,"修改成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false,"修改失败");
        }
    }

    @RequestMapping("delete")
    public Result delete(long[] ids){
        try {
            service.del(ids);
            return new Result(true,"删除成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false,"删除失败");
        }
    }

}
