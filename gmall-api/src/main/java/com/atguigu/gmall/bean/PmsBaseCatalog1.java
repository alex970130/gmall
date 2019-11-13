package com.atguigu.gmall.bean;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * 一级分类表 pms_base_catalog1
 */
@Data
public class PmsBaseCatalog1 implements Serializable {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    /** 分类名称 */
    @Column
    private String name;

    @Transient
    private List<PmsBaseCatalog2> pmsBaseCatalog2;


}
