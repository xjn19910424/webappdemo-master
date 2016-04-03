package com.sega.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "users")

/**
 * Created by sega on 2016/3/26.
 */
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private int id;
	@NotNull
    private String username;
	
    @NotNull
    private String password;

    public String getUsername(){
        return this.username;
    }

    public void setUsername(String username){
        this.username = username;
    }

    public String getPassword(){
        return this.password;
    }

    public void setPassword(String password){
        this.password = password;
    }

}
