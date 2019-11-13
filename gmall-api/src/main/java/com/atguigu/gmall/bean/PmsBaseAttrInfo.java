package com.atguigu.gmall.bean;

import lombok.Data;
import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * 属性表 pms_base_attr_info
 */
@Data
public class PmsBaseAttrInfo implements Serializable {

    /** 编号 */
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    /** 属性名称 */
    @Column
    private String attrName;

    /** 类目三编号 */
    @Column
    private String catalog3Id;

    /** 状态 */
    private String isEnabled;

    @Transient
    List<PmsBaseAttrValue> pmsBaseAttrValueList;
}
