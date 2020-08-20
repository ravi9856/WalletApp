package com.assignment.walletpay;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class WalletService {

	@Autowired
	UserDetailsRepository userDetailsRepository;
	
	public List<UserInfo> getAllUserData() {
		List<UserInfo> listOfUsers = new ArrayList<>();
		userDetailsRepository.findAll().forEach(listOfUsers::add);
		System.out.println("User List : "+listOfUsers);
		return listOfUsers;
	}
	
	public UserInfo getbyUserID(String id) {
		return userDetailsRepository.findById(id).orElse(null);
	}
	
	public UserInfo getbyUserName(String name) {
		return userDetailsRepository.findByUserName(name).orElse(null);
	}
	
}
