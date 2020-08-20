package com.assignment.walletpay;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class RestHandler {
	
	@Autowired
	WalletService walletService;
	
	@RequestMapping("/createUserAccount")
	public String createUserAccount() {
		
		System.out.println("Create User Account");
		
		return "Created";
	}
	
	@RequestMapping("/wallet/getbyUserID/{userID}")
	public UserDetail getbyUserID(@PathVariable String userID) {
		return walletService.getbyUserID(userID);
	}
	
	@RequestMapping("/wallet/getbyUserName/{userName}")
	public UserDetail getbyUserName(@PathVariable String userName) {
		
		System.out.println(walletService.getbyUserName("USER 1"));
		
		return walletService.getbyUserName(userName);
	}
	
	@RequestMapping("/getAllUsers")
	public List<UserDetail> getAllUsers() {
		return walletService.getAllUserData();
	}
}
