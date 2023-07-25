package com.educandoweb.course.services;

import com.educandoweb.course.entities.Order;
import com.educandoweb.course.repositories.OrderRepositiry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    OrderRepositiry orderRepositiry;

    public List<Order> findAll(){
        return orderRepositiry.findAll();
    }

    public Order findById(Long id){
        Optional<Order> obj = orderRepositiry.findById(id);
        return obj.get();
    }

}
