package com.imooc.service;

import com.imooc.pojo.UserAddress;
import com.imooc.pojo.bo.AddressBO;

import java.util.List;

/**
 * @author :Administrator
 * @path :CarouselService
 * @date :2023-06-25 19:58:14
 * @describe :interface
 */
public interface AddressService {


    /**
     * 根据用户id查询用户收货地址
     *
     * @param userId -
     * @return -
     */
    public List<UserAddress> queryAll(String userId);

    /**
     * 用户新增地址
     *
     * @param addressBO
     */
    public void addNewUserAddress(AddressBO addressBO);

    /**
     * 用户修改地址
     *
     * @param addressBO
     */
    public void updateUserAddress(AddressBO addressBO);

    /**
     * 根据用户id和地址id，删除对应的用户地址信息
     *
     * @param userId
     * @param addressId
     */
    public void deleteUserAddress(String userId, String addressId);

    /**
     * 修改默认地址
     *
     * @param userId
     * @param addressId
     */
    public void updateUserAddressToBeDefault(String userId, String addressId);

}
