package com.chen.service;

import com.chen.pojo.User;

import java.rmi.RemoteException;

/**
 * 用户查询api接口定义
 */
public interface UserService {
    /**
     * 查询用户记录
     * @param id
     * @return
     * @throws RemoteException
     */
    User queryUserById(Integer id) throws RemoteException;
}
