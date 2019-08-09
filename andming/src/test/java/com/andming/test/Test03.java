package com.andming.test;

import com.andming.domain.TbBrand;
import com.andming.service.BrandService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:bean.xml")
public class Test03 {
   /* @Autowired
    private AccountService service;*/
    @Autowired
    private BrandService brandService;

   /* @Test
    public void testFind(){
        List<Account> all = service.findAll();
        for (Account account : all) {
            System.out.println(account);
        }
    }*/

    /*@Test
    public void add(){
      Account account=new Account();
      account.setName("cs");
      account.setMoney(333f);
      service.add(account);
    }


    @Test
    public void findOne(){
        long id=1;
        Account one = service.findOne(id);
        System.out.println(one);
    }

    @Test
    public void updata(){
        Account one = service.findOne(10);
        one.setName("qq");
        one.setMoney(2432f);
        service.updata(one);
    }
    @Test
    public void del(){
        long[] ids={5,8,9};
        service.del(ids);
    }
*/

    @Test
    public void testFind(){
        List<TbBrand> all = brandService.findAll();
        for (TbBrand brand : all) {
            System.out.println(brand.toString());
        }
    }

}
