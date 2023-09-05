package com.meethere.service;


import com.meethere.entity.Order;
import com.meethere.entity.vo.OrderVo;

import java.util.List;

public interface OrderVoService {
    OrderVo returnOrderVoByOrderID(int orderID);
    List<OrderVo> returnVo(List<Order> list);
}
