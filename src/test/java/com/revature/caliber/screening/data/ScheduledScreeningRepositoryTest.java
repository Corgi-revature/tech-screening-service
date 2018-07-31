package com.revature.caliber.screening.data;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.revature.caliber.beans.Candidate;
import com.revature.caliber.beans.ScheduledScreening;
import com.revature.caliber.screening.Application;

/**
 * Scheduled Screening Repository Testing class
 * 
 * @author Aaron Ware | 1805-WVU-MAY29 | Richard Orr
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=Application.class)
public class ScheduledScreeningRepositoryTest {
	
	@Autowired
	ScheduledScreeningRepository ssr;
	
	@Test
	public void saveObjectTest() {
		ScheduledScreening scheduledScreening = new ScheduledScreening();
		scheduledScreening.setCandidate(new Candidate());
		scheduledScreening.getCandidate().setId(1);
		scheduledScreening.setTrainer(1);
		
		ssr.save(scheduledScreening);
		
		assertTrue(scheduledScreening.getScheduledScreeningId() != 0);
	}
	
	@Test
	public void findPendingTest() {
		List<ScheduledScreening> scheduledScreenings = ssr.findByScheduledStatus("PENDING");
		assertTrue(scheduledScreenings != null && !scheduledScreenings.isEmpty());
	}
	
}
