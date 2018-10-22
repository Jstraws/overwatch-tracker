package com.straus.repositories;

import com.straus.beans.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppUserRepository extends JpaRepository<AppUser, Integer> {
	AppUser findAppUserByUserNameAndPassword(String username, int password);
}
