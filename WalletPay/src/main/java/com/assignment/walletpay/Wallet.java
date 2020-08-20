package com.assignment.walletpay;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the wallet database table.
 * 
 */
@Entity
@NamedQuery(name="Wallet.findAll", query="SELECT w FROM Wallet w")
public class Wallet implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="wallet_id")
	private Integer walletId;

	private Integer balance;

	//bi-directional many-to-one association to Transaction
	@OneToMany(mappedBy="wallet1")
	private List<Transaction> transactions1;

	//bi-directional many-to-one association to Transaction
	@OneToMany(mappedBy="wallet2")
	private List<Transaction> transactions2;

	//bi-directional many-to-one association to UserDetail
	@ManyToOne
	@JoinColumn(name="user_id")
	private UserInfo userDetail;

	public Wallet() {
	}

	public Integer getWalletId() {
		return this.walletId;
	}

	public void setWalletId(Integer walletId) {
		this.walletId = walletId;
	}

	public Integer getBalance() {
		return this.balance;
	}

	public void setBalance(Integer balance) {
		this.balance = balance;
	}

	public List<Transaction> getTransactions1() {
		return this.transactions1;
	}

	public void setTransactions1(List<Transaction> transactions1) {
		this.transactions1 = transactions1;
	}

	public Transaction addTransactions1(Transaction transactions1) {
		getTransactions1().add(transactions1);
		transactions1.setWallet1(this);

		return transactions1;
	}

	public Transaction removeTransactions1(Transaction transactions1) {
		getTransactions1().remove(transactions1);
		transactions1.setWallet1(null);

		return transactions1;
	}

	public List<Transaction> getTransactions2() {
		return this.transactions2;
	}

	public void setTransactions2(List<Transaction> transactions2) {
		this.transactions2 = transactions2;
	}

	public Transaction addTransactions2(Transaction transactions2) {
		getTransactions2().add(transactions2);
		transactions2.setWallet2(this);

		return transactions2;
	}

	public Transaction removeTransactions2(Transaction transactions2) {
		getTransactions2().remove(transactions2);
		transactions2.setWallet2(null);

		return transactions2;
	}

	public UserInfo getUserDetail() {
		return this.userDetail;
	}

	public void setUserDetail(UserInfo userDetail) {
		this.userDetail = userDetail;
	}

}