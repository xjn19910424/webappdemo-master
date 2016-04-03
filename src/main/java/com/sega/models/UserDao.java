package com.sega.models;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

@Transactional
public interface UserDao extends CrudRepository<User, Long> {
  public static User findByUsername(String username) {
	// TODO Auto-generated method stub
	return null;
}
} 
