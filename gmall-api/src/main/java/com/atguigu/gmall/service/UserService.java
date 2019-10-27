package com.atguigu.gmall.service;

import com.atguigu.gmall.bean.UmsMember;
import com.atguigu.gmall.bean.UmsMemberReceiveAddress;

import java.util.List;

public interface UserService {

    /**获取所有用户信息*/
    List<UmsMember> getAllUser();

    /**根据用户id获取收获地址*/
    List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId);
}
