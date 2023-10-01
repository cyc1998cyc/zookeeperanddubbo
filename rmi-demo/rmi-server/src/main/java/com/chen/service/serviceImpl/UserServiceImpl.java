package com.chen.service.serviceImpl;

import com.chen.pojo.User;
import com.chen.service.UserService;
import org.springframework.stereotype.Service;

import java.rmi.RemoteException;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public User queryUserById(Integer id) throws RemoteException {
        System.out.println("服务端收到请求");
        System.out.println(id);
        User user = new User();
        user.setId(id);
        user.setUserName("陈宇超");
        return user;
    }
}
