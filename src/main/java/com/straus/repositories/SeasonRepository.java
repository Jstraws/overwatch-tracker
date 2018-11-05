package com.straus.repositories;

import com.straus.beans.Season;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;

@Repository
public interface SeasonRepository extends JpaRepository<Season, Integer> {
	Season findByEndDateAfter(Timestamp currentDate);
}
