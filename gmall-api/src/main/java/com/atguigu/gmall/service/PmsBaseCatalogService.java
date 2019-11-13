package com.atguigu.gmall.service;

import com.atguigu.gmall.bean.PmsBaseCatalog1;
import com.atguigu.gmall.bean.PmsBaseCatalog2;
import com.atguigu.gmall.bean.PmsBaseCatalog3;

import java.util.List;

public interface PmsBaseCatalogService {
    /** 获得一级分类表所有数据 */
    List<PmsBaseCatalog1> getCatalog1();

    /** 获得二级分类表所有数据 */
    List<PmsBaseCatalog2> getCatalog2(String catalog1Id);

    /** 获取三级类目表所有数据 */
    List<PmsBaseCatalog3> getCatalog3(String catalog2Id);
}
