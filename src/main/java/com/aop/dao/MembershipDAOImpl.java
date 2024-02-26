package com.aop.dao;

import org.springframework.stereotype.Component;

@Component
public class MembershipDAOImpl implements MembershipDAO {
	public void addAccount()
	{
		System.out.println(getClass() + " doing my job adding a new account");
	}
}
