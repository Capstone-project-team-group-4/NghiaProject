/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Nghia.Trainning.dal.repository;

import com.Nghia.Trainning.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author DELL
 */
public interface UserRepository extends JpaRepository<Users, String> {

    @Override
    public Users save(Users users);

    @Override
    public boolean existsById(String userID);

}
