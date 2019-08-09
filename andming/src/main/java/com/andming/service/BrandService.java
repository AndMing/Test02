package com.andming.service;

import com.andming.domain.TbBrand;
import com.andming.domain.entity.PageResult;

import java.util.List;

public interface BrandService {

    List<TbBrand> findAll();

    //添加
    void add(TbBrand brand);

    //删除
    void del(long[] ids);

    //根据主键查询
    TbBrand findOne(long id);

    //修改
    void updata(TbBrand brand);

    PageResult findPage(Integer pageNum, Integer pageSize);
}
