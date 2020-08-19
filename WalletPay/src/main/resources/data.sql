
CREATE TABLE user_details(
	user_id VARCHAR(20) PRIMARY KEY,
	passwd VARCHAR(20),
	user_name VARCHAR(100) NOT NULL
);

CREATE TABLE wallet(
	wallet_id INT PRIMARY KEY,
	user_id VARCHAR(20),
	balance INT NOT NULL,
	FOREIGN KEY (user_id) REFERENCES user_details(user_id)
-- );

CREATE TABLE transactions(
	transaction_id INT PRIMARY KEY,
	from_wallet_id INT,
	to_wallet_id INT,
	transaction_date_time TIMESTAMP,
	FOREIGN KEY (from_wallet_id) REFERENCES wallet(wallet_id),
	FOREIGN KEY (to_wallet_id) REFERENCES wallet(wallet_id)
)