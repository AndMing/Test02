package com.andming.dao;

import com.andming.domain.TbBrand;

import java.util.List;

public interface BrandDao {

    List<TbBrand> findAll();

    //添加
    void add(TbBrand brand);

    //删除
    void del(long id);

    //根据主键查询
    TbBrand findOne(long id);

    //修改
    void updata(TbBrand brand);
}
