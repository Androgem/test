package com.andrejstojanovski.demo.dao;

import com.andrejstojanovski.demo.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface UserRepositori extends CrudRepository<User, Long> {

}
