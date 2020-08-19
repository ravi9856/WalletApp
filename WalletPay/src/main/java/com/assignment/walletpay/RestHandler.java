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
	public UserDetail createUserAccount() {
		
		System.out.println(walletService.getbyUserName("sdfsf"));
		
		return walletService.getbyUserName("sdfsf");
	}
	@RequestMapping("/getUser/{userName}")
	public UserDetail getbyUserName(@PathVariable String userName) {
		
		System.out.println(walletService.getbyUserName("sdfsf"));
		
		return walletService.getbyUserName(userName);
	}
	
	@RequestMapping("/getAllUsers")
	public List<UserDetail> getAllUsers() {
		return walletService.getAllUserData();
	}
}
