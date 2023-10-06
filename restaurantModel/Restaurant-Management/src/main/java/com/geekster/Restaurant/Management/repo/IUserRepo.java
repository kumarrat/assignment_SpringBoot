package com.geekster.Restaurant.Management.repo;

import com.geekster.Restaurant.Management.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepo extends JpaRepository<User,Long> {
}
