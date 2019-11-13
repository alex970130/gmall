package com.atguigu.gmall.bean;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Transient;
import java.io.Serializable;

/**
 * 属性值表 pms_base_attr_value
 */
@Data
public class PmsBaseAttrValue implements Serializable {

    /** 编号 */
    @Id
    @Column
    private String id;

    /** 属性值名称 */
    @Column
    private String valueName;

    /** 属性id */
    @Column
    private String attrId;

    /** 状态 */
    @Column
    private String isEnabled;

    @Transient
    private String urlParam;

}
