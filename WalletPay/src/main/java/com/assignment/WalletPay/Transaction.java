package com.assignment.walletpay;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the transactions database table.
 * 
 */
@Entity
@Table(name="transactions")
@NamedQuery(name="Transaction.findAll", query="SELECT t FROM Transaction t")
public class Transaction implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="transaction_id")
	private Integer transactionId;

	@Column(name="transaction_date_time")
	private Timestamp transactionDateTime;

	//bi-directional many-to-one association to Wallet
	@ManyToOne
	@JoinColumn(name="from_wallet_id")
	private Wallet wallet1;

	//bi-directional many-to-one association to Wallet
	@ManyToOne
	@JoinColumn(name="to_wallet_id")
	private Wallet wallet2;

	public Transaction() {
	}

	public Integer getTransactionId() {
		return this.transactionId;
	}

	public void setTransactionId(Integer transactionId) {
		this.transactionId = transactionId;
	}

	public Timestamp getTransactionDateTime() {
		return this.transactionDateTime;
	}

	public void setTransactionDateTime(Timestamp transactionDateTime) {
		this.transactionDateTime = transactionDateTime;
	}

	public Wallet getWallet1() {
		return this.wallet1;
	}

	public void setWallet1(Wallet wallet1) {
		this.wallet1 = wallet1;
	}

	public Wallet getWallet2() {
		return this.wallet2;
	}

	public void setWallet2(Wallet wallet2) {
		this.wallet2 = wallet2;
	}

}