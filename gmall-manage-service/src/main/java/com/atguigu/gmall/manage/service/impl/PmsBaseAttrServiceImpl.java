package com.atguigu.gmall.manage.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.atguigu.gmall.bean.PmsBaseAttrInfo;
import com.atguigu.gmall.manage.mapper.PmsBaseAttrInfoMapper;
import com.atguigu.gmall.service.PmsBaseAttrService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class PmsBaseAttrServiceImpl implements PmsBaseAttrService {

    @Autowired
    private PmsBaseAttrInfoMapper pmsBaseAttrInfoMapper;

    /**
     * 获取属性表的属性名称
     * @param catalog3Id
     * @return 属性表集合对象
     */
    @Override
    public List<PmsBaseAttrInfo> getAttrInfo(String catalog3Id) {
        PmsBaseAttrInfo pmsBaseAttrInfo = new PmsBaseAttrInfo();
        pmsBaseAttrInfo.setCatalog3Id(catalog3Id);
        List<PmsBaseAttrInfo>  pmsBaseAttrInfoList = pmsBaseAttrInfoMapper.select(pmsBaseAttrInfo);
        return pmsBaseAttrInfoList;
    }
}
