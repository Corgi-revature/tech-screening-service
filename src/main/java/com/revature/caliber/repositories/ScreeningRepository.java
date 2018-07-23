package com.revature.caliber.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.revature.caliber.beans.SimpleScreening;

import ch.qos.logback.core.net.SyslogOutputStream;

@Repository
public interface ScreeningRepository extends JpaRepository<SimpleScreening, Integer>{
	List<SimpleScreening> getByStatus(String status);
	
	void findByStatus(String status);
	
	@Transactional
	@Modifying(clearAutomatically = true)
	@Query("update SimpleScheduledScreening s set s.status = ?1 where s.scheduledScreeningId = ?2")
	void updateStatus(String screened, Integer scheduledScreeningId);
	
	SimpleScreening findByScreeningId(SimpleScreening simpleScreening);

}
