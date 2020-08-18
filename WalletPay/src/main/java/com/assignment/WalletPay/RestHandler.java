package com.assignment.WalletPay;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestHandler {

	
	@RequestMapping("/getData")
	public String getData() {
		return "HELLO!!";
	}
}
