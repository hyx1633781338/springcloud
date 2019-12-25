package com.zking.eurekaprovider.controller;

import com.zking.eurekaprovider.service.IHyxService;
import com.zking.eurekaprovider.util.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HyxController {

    @Autowired
    private IHyxService iHyxService;


    @RequestMapping("selectid")
    public JsonData Hello(String name){
        String msg="生产者["+"]为您服务,"+"ts:"+System.currentTimeMillis();
        JsonData jsonData=new JsonData();
        jsonData.setCode(0);
        jsonData.put("name",name);
        return jsonData;
    }
}
