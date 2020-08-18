
DROP TABLE IF EXISTS user_details;
CREATE TABLE user_details(
	user_id VARCHAR(20) PRIMARY KEY,
	password VARCHAR(20),
	user_name VARCHAR(100) NOT NULL
);
DROP TABLE IF EXISTS wallet;
CREATE TABLE wallet(
	wallet_id INT AUTO_INCREMENT PRIMARY KEY,
	user_id VARCHAR(20),
	balance INT NOT NULL,
	FOREIGN KEY (user_id) REFERENCES user_details(user_id)
);


		

