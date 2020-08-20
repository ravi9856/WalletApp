package com.assignment.walletpay;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.assignment.walletpay.UserInfo;

@Repository
public interface UserDetailsRepository extends CrudRepository<UserInfo, String> {

	Optional<UserInfo> findByUserName(String name);
}
