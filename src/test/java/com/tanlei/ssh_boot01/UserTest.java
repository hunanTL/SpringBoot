package com.tanlei.ssh_boot01;

import com.tanlei.dao.UserDao;
import com.tanlei.pojo.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.text.DateFormat;
import java.util.Date;

/**
 * @author <a href="mailto:lei.tan@vtradex.net">谭磊/a>
 * @since 2019-12-18 23:23
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class UserTest {
    @Autowired
    private UserDao userDao;

    @Test
    public void test() throws Exception {
        Date date = new Date();
        DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG);
        String formattedDate = dateFormat.format(date);

        userDao.save(new User("aa1", "aa@126.com", "aa", "aa123456",formattedDate));
        userDao.save(new User("bb2", "bb@126.com", "bb", "bb123456",formattedDate));
        userDao.save(new User("cc3", "cc@126.com", "cc", "cc123456",formattedDate));

       userDao.findByUserName("aa1");
    }
}
