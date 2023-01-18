package com.yolo.nft.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yolo.nft.controller.dto.UserDTO;
import com.yolo.nft.entity.User;
import com.yolo.nft.mapper.UserMapper;

import org.springframework.stereotype.Service;

@Service
public class UserService extends ServiceImpl<UserMapper,User> {

//    @Autowired
//    private UserMapper userMapper;
//    public int save(User user){
//        if(user.getId()==null){
//            return userMapper.insert(user);
//        }else{
//            return userMapper.update(user);
//        }
//    }

    //mybatis-plus 方法
    public boolean saveUser(User user) {
        return saveOrUpdate(user);
    }


}
