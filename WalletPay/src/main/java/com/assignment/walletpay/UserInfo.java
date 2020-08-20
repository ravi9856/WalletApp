package com.assignment.walletpay;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the user_details database table.
 * 
 */
@Entity
@Table(name="user_info")
@NamedQuery(name="UserInfo.findAll", query="SELECT u FROM UserInfo u")
public class UserInfo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="user_id")
	private String userId;

	private String passwd;

	@Column(name="user_name")
	private String userName;

	//bi-directional many-to-one association to Wallet
	@OneToMany(mappedBy="userDetail")
	private List<Wallet> wallets;

	public UserInfo() {
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPasswd() {
		return this.passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public List<Wallet> getWallets() {
		return this.wallets;
	}

	public void setWallets(List<Wallet> wallets) {
		this.wallets = wallets;
	}

	public Wallet addWallet(Wallet wallet) {
		getWallets().add(wallet);
		wallet.setUserDetail(this);

		return wallet;
	}

	public Wallet removeWallet(Wallet wallet) {
		getWallets().remove(wallet);
		wallet.setUserDetail(null);

		return wallet;
	}

}