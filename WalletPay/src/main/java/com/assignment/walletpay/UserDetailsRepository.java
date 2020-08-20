package com.assignment.walletpay;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.assignment.walletpay.UserDetail;

@Repository
public interface UserDetailsRepository extends CrudRepository<UserDetail, String> {

	Optional<UserDetail> findByUserName(String name);
}
