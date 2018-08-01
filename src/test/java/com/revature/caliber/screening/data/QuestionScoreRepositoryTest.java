package com.revature.caliber.screening.data;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.revature.caliber.beans.SimpleQuestionScore;
import com.revature.caliber.screening.Application;

/**
 * Question Score Repository Testing class
 * 
 * @author Thomas Santillan | 1805-WVU-MAY29 | Richard Orr
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=Application.class)
public class QuestionScoreRepositoryTest {
	
	
	@Autowired
	QuestionScoreRepository qsr;
	
	@Test
	public void saveObjectTest() {
		SimpleQuestionScore qs = new SimpleQuestionScore();
		qs.setQuestionId(1);
		qs.setScreeningId(1);
		qsr.save(qs);

		assertTrue(qs.getScreeningId() != 0);
	}
	
	@Test
	public void findInterViewResultTest() {
		List<SimpleQuestionScore> interviewResults = qsr.findByScreeningId(1);
		assertTrue(interviewResults != null && !interviewResults.isEmpty());
	}
	

}
