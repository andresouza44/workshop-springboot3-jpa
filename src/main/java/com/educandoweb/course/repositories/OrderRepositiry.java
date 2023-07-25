package com.educandoweb.course.repositories;

import com.educandoweb.course.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepositiry extends JpaRepository <Order, Long> {
}
