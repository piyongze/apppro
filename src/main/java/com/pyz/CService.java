package com.pyz;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository(value="cser")
@Transactional 
public class CService {

    @Autowired
    CDao dao;
    
    public void saveCuser(){
        CUser user=new CUser();
        user.setName("propyz");
        dao.save(user);
        testTran();
    }
    
    public int testTran(){
        int b=0;
        int c=2/b;
        return c;
    }
}
