package com.yasin.usercenter;

import com.yasin.usercenter.dao.user.UserMapper;
import com.yasin.usercenter.domain.entity.user.User;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

/**
 * @author Yasin Zhang
 */
@RestController("/")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class TestController {
    private final UserMapper userMapper;

    @GetMapping("test")
    public User testInsert() {
        User user = new User();
        user.setAvatarUrl("xxx");
        user.setBonus(100);
        user.setCreateTime(new Date());
        user.setUpdateTime(new Date());
        this.userMapper.insertSelective(user);

        return user;
    }
}
