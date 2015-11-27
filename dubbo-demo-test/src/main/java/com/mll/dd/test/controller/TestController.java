package com.mll.dd.test.controller;

import com.mll.dd.remote.service.DemoService;
import com.mll.dd.remote.vo.DemoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by rocky on 2015/11/27.
 */
@Controller
public class TestController {

    @Autowired
    private DemoService demoService;

    @RequestMapping("/test")
    @ResponseBody
    public DemoVo selectDemo() {
        return demoService.getDemoVo();
    }
}
