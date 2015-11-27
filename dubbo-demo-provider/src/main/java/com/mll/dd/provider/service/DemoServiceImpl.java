package com.mll.dd.provider.service;

import com.mll.dd.remote.service.DemoService;
import com.mll.dd.remote.vo.DemoVo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * Created by rocky on 15/11/27.
 */
@Service
public class DemoServiceImpl implements DemoService {

    private static final Logger LOGGER = LoggerFactory.getLogger(DemoServiceImpl.class);

    public DemoVo getDemoVo() {
        DemoVo demoVo = new DemoVo();
        demoVo.setName("test");
        demoVo.setAge(1);
        return demoVo;
    }

    public void insertDemoVo(DemoVo demoVo) {
        LOGGER.info("this is demoVo name : {} , age : {}" , demoVo.getName() , demoVo.getAge());
    }
}
