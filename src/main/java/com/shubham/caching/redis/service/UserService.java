package com.shubham.caching.redis.service;

import com.shubham.caching.redis.dao.UserDao;
import com.shubham.caching.redis.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserDao _userDao ;

    public User getUserDetails(Long id) throws InterruptedException {

        Thread.sleep(10000);
        return _userDao.findById(id).get();

    }
}
