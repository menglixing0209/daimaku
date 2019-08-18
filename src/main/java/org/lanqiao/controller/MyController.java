package org.lanqiao.controller;

import org.lanqiao.entity.*;
import org.lanqiao.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.Null;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    @CrossOrigin
    @RequestMapping("/getkind/{kind_id}")
    public Kind getKind(@PathVariable Long kind_id){return myService.selectByPrimaryKeyKind(kind_id);}
    /***********************************************************************************/

    @CrossOrigin
    @RequestMapping("/getallkind")
    public List<Kind> getAllKind(){return myService.selectAllKind();}

    @CrossOrigin
    @RequestMapping("/getallbrand")
    public List<Brand> getAllBrand(){return myService.selectAllBrand();}

    @CrossOrigin
    @RequestMapping("/getallproduct")
    public List<Product> getAllProduct(){
        return myService.selectAllProduct();
    }

    @CrossOrigin
    @RequestMapping("/getallevaluate")
    public List<Evaluate> getAllEvaluate(){return myService.selectAllEvaluate();}

    @CrossOrigin
    @RequestMapping("/getallusersafe")
    public List<Usersafe> getAllUsersafe(){return myService.selectAllUsersafe();}

    @CrossOrigin
    @RequestMapping("/selectkeykind")
    public Kind getIdKind(Long kind_id){
        return myService.select_Kind_Product(kind_id);
    }

    @CrossOrigin
    @RequestMapping("/selectkeybrand")
    public Brand getIdBrand(Long brand_id){return myService.select_Brand_Product(brand_id);}

    @CrossOrigin
    @RequestMapping("/selectgetproductkbe")
    public List<Product> getProductKBE(){return myService.selectAllProductKBE();}
    /***********************************************************************************/
}
