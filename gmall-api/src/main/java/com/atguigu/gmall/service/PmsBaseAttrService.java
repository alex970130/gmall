package com.atguigu.gmall.service;

import com.atguigu.gmall.bean.PmsBaseAttrInfo;

import java.util.List;

public interface PmsBaseAttrService {

    /** 获取属性表的属性名称 */
    List<PmsBaseAttrInfo> getAttrInfo(String catalog3Id);
}
