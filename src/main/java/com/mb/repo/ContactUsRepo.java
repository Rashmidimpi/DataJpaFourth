package com.mb.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mb.entity.ContactUsEntity;

@Repository
public interface ContactUsRepo extends JpaRepository<ContactUsEntity, Integer>{
	

}
