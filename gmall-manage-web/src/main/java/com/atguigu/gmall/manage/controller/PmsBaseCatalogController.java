package com.atguigu.gmall.manage.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.atguigu.gmall.bean.PmsBaseCatalog1;
import com.atguigu.gmall.bean.PmsBaseCatalog2;
import com.atguigu.gmall.bean.PmsBaseCatalog3;
import com.atguigu.gmall.service.PmsBaseCatalogService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@CrossOrigin
public class PmsBaseCatalogController {

    @Reference
    PmsBaseCatalogService pmsBaseCatalogService;


    /**
     * 获取三级分类表
     * @param catalog2Id
     * @return 三级分类表集合对象
     */
    @RequestMapping("getCatalog3")
    @ResponseBody
    public List<PmsBaseCatalog3> getCatalog3(String catalog2Id){
        List<PmsBaseCatalog3> catalog3 = pmsBaseCatalogService.getCatalog3(catalog2Id);
        return catalog3;
    }

    /**
     * 获取二级分类表
     * @param catalog1Id
     * @return 二级分类表集合对象
     */
    @RequestMapping("getCatalog2")
    @ResponseBody
    public List<PmsBaseCatalog2> getCatalog2(String catalog1Id){
        List<PmsBaseCatalog2> catalog2List = pmsBaseCatalogService.getCatalog2(catalog1Id);
        return catalog2List;
    }


    /**
     * 获取一级分类表
     * @return 一级分类表集合对象
     */
    @RequestMapping("getCatalog1")
    @ResponseBody
    public List<PmsBaseCatalog1> getCatalog1(){
        List<PmsBaseCatalog1> catalog1 = pmsBaseCatalogService.getCatalog1();
        return catalog1;
    }

}
