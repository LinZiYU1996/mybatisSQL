package com.lin.many_to_many;

import com.lin.many_to_many.entity.Orders;
import com.lin.many_to_many.entity.User;
import com.lin.many_to_many.mapper.OrdersMapper;
import com.lin.many_to_many.mapper.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Primary;

import java.util.List;

@SpringBootTest
@Slf4j
class ManyToManyApplicationTests {

    @Test
    void contextLoads() {
    }

    @Autowired
    private OrdersMapper ordersMapper;


    @Autowired
    private UserMapper userMapper;

    @Test
    public void t1() {

        Orders orders = ordersMapper.selectOrderAndUserByOrderID(1);
        log.info(orders.toString());
//Orders(id=1, userId=1, number=122, user=User{id=1, username=1, sex=男})


    }

    @Test
    public void t2() {
        Orders orders = ordersMapper.getOrderByOrderId(1);

        log.info(orders.toString());

    }

    @Test
    public void t3() {

        User u = userMapper.selectUserAndOrdersByUserId(1);

        log.info(u.toString());
        //User(id=1, username=1, sex=男, orders=[Orders(id=1, userId=null, number=122, user=null)])
    }

    @Test
    public void t5() {

        List<User> u = userMapper.getUserByRoleId(1);

        log.info(u.toString());
//[User(id=1, username=1, sex=男, orders=null, roles=null)]

    }

}
