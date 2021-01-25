/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Nghia.Trainning.dal.repository;

import com.Nghia.Trainning.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author DELL
 */
public interface UserRepository extends JpaRepository<User, Integer> {

    @Override
    public User save(User users);

    @Override
    public boolean existsById(Integer userID);

    @Override
    public void deleteById(Integer userID);

}
