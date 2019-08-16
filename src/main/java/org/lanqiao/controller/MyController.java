package org.lanqiao.controller;

import org.lanqiao.entity.Kind;
import org.lanqiao.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @Autowired
    MyService myService;

    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }

    /*
    * @RequestMapping("/getkind/{kind_id}")括号“{}”中的参数要与函数的参数同名
    * @PathVariable不可少，少了在浏览器里传参数后台无法识别
    * */
//    @CrossOrigin
//    @RequestMapping("/getkind/{kind_id}")
//    public Kind getKind(@PathVariable Long kind_id){return myService.selectByPrimaryKey(kind_id);}
}
