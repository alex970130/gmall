package com.atguigu.gmall.bean;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * 二级分类表 pms_base_catalog2
 */
@Data
public class PmsBaseCatalog2 implements Serializable {

    /** 编号 */
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    /** 二级分类名称 */
    @Column
    private String name;

    /** 一级分类编号 */
    @Column
    private String catalog1Id;

    @Transient
    private List<PmsBaseCatalog3> pmsBaseCatalog3s;
}
