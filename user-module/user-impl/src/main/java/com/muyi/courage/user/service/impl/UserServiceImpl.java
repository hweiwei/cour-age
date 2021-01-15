package com.muyi.courage.user.service.impl;

import com.muyi.courage.common.dto.DTO;
import com.muyi.courage.common.util.RetCodeEnum;
import com.muyi.courage.user.domain.UserDO;
import com.muyi.courage.user.dto.UserDTO;
import com.muyi.courage.user.repository.UserMapper;
import com.muyi.courage.user.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 杨志勇
 * @date 2021-01-15 13:54
 */
@Slf4j
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Resource
    private UserMapper userMapper;

    @Override
    public DTO addUser(UserDTO userDTO) {
        DTO dto = new DTO(RetCodeEnum.FAIL);
        //TODO check userDTO

        UserDO domain = new UserDO();
        domain.setUserNo(userDTO.getUserNo());
        domain.setUserName(userDTO.getUserName());
        domain.setPassword(bCryptPasswordEncoder.encode(userDTO.getPassword()).replace("{bcrypt}", ""));
        domain.setStatus(1);


        if (userMapper.insert(domain) == 1) {
            dto.setResult(RetCodeEnum.SUCCEED);
            return dto;
        }
        return new DTO(RetCodeEnum.FAIL);
    }
}