package com.mll.dd.test.service;

import com.mll.dd.remote.service.DemoService;
import com.mll.dd.remote.vo.DemoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * Created by rocky on 2015/11/27.
 */
@Service
public class TestService {

    @Autowired
    private DemoService demoService;

    public DemoVo select() {
        return demoService.getDemoVo();
    }

    public void insert() {
        demoService.insertDemoVo(select());
    }
}
