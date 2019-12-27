package com.zking.eurekaprovider.controller;

import com.zking.eurekaprovider.service.IHyxService;
import com.zking.eurekaprovider.util.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hyx")
public class HyxController {

    @Autowired
    private IHyxService iHyxService;

    JsonData jsonData;
    @ModelAttribute
    public void init(Model model) {
//        System.out.println("init...");
        //用来初始化数据
        jsonData = new JsonData();
    }


    @RequestMapping(value="/selectid",produces = {"application/json;charset=UTF-8"})
    public JsonData test1() {
        jsonData.setCode(0);
        jsonData.setResult(iHyxService.selectByPrimaryKey(4));
        return jsonData;
    }
}
