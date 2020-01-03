package com.dell.knowledgebase.repositories;


import com.dell.knowledgebase.entities.User;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Transactional
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}