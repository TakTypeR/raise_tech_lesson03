package com.example.raise_tech_lesson03.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.LinkedHashMap;
import java.util.Map;

@Controller
public class HelloController {
    // rootからのURLをマッピングして指定のhtml名を返す
    @RequestMapping("/hello0")
    public String hello0(){
        return "hello0.html";
    }

    @RequestMapping(value = "/hello1", method = RequestMethod.GET)
    public String hello1(Model iModel){
        iModel.addAttribute("selectItems", getItems());
        iModel.addAttribute( "initKey", "key_B" );
        return "hello1.html";
    }

    /**
     *
     * @return 選択肢情報
     */
    private Map<String, String> getItems(){
        Map<String, String> itemMap = new LinkedHashMap<>(){
            {
                put( "key_A", "選択肢A" );
                put( "key_B", "選択肢B" );
                put( "key_C", "選択肢C" );
            }
        };

        return itemMap;
    }
}
