package com.andming.service.impl;

import com.andming.dao.BrandDao;
import com.andming.domain.TbBrand;
import com.andming.domain.entity.PageResult;
import com.andming.service.BrandService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("brandService")
public class BrandServiceImpl implements BrandService {
    @Autowired
    private BrandDao dao;

    public List<TbBrand> findAll() {

        return dao.findAll();
    }

    public PageResult findPage(Integer pageNum, Integer pageSize) {

        PageHelper.startPage(pageNum, pageSize);

        Page<TbBrand> page = (Page<TbBrand>) dao.findAll();

        PageResult result = new PageResult(page.getTotal(), page.getResult());
        return result;
    }


    public void add(TbBrand brand) {
        dao.add(brand);
    }


    public void del(long[] ids) {
        for (long id : ids) {
            dao.del(id);
        }
    }

    public TbBrand findOne(long id) {
        return dao.findOne(id);
    }

    public void updata(TbBrand brand) {
        dao.updata(brand);

    }


}
