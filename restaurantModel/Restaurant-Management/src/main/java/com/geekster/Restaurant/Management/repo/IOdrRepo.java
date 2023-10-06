package com.geekster.Restaurant.Management.repo;

import com.geekster.Restaurant.Management.model.Odr;
import com.geekster.Restaurant.Management.model.User;
import jakarta.persistence.criteria.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IOdrRepo extends JpaRepository<Odr,Long> {

    //List<Order> findByUser(User user);
}
