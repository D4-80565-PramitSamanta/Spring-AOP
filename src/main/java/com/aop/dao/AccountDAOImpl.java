package com.aop.dao;

import org.springframework.stereotype.Service;

@Service
public class AccountDAOImpl implements AccountDAO {

	@Override
	public void addAccount() {
		System.out.println(getClass() + " doing my job adding a new account");
	}

}
