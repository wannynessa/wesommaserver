package com.app.wesomma.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.wesomma.models.Profile;

public interface ProfileRepository extends JpaRepository<Profile, Long> {
	
	Profile findById(Integer id);

    void deleteById(Integer id);
}
