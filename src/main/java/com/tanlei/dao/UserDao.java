package com.tanlei.dao;

import com.tanlei.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author <a href="mailto:lei.tan@vtradex.net">谭磊/a>
 * @since 2019-12-18 23:20
 */
public interface UserDao extends JpaRepository<User,Long> {
    User findByUserName(String userName);
    User findByUserNameOrEmail(String username, String email);
}
