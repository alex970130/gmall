package com.atguigu.gmall.bean;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

/**
 *  三级分类表 pms_base_catalog3
 */
@Data
public class PmsBaseCatalog3 implements Serializable {

    /** 编号 */
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    /** 三级分类名称 */
    @Column
    private String name;

    /** 二级分类编号 */
    @Column
    private String catalog2Id;
}
