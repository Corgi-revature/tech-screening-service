package com.revature.caliber.screening.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.revature.caliber.beans.ScheduledScreening;
import com.revature.caliber.beans.Screening;
import com.revature.caliber.screening.data.ScheduledScreeningRepository;
import com.revature.caliber.screening.services.ScreeningServiceImpl;


/**
 * The controller for incoming REST requests to the Screening service.
 * 
 * @author Aaron Ware | 1805-WVU-MAY29 | Richard Orr
 *
 * @author David Miller | 1805-WVU-MAY29 | Richard Orr
 * 
 * @author Jakob LaSorella | 1805-WVU-MAY29 | Richard Orr
 */
@RestController
@CrossOrigin
public class ScreeningController {
	
	@Autowired
	private ScreeningServiceImpl screeningService;
	
	@Autowired
	private ScheduledScreeningRepository scheduledScreeningRepository;
	
	@RequestMapping(value = "/screening/start", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Integer> createScreening(@RequestBody Screening screening){
		Screening i = screeningService.setPending(screening);
		return new ResponseEntity<>(i.getScreeningId(),HttpStatus.OK);
	}

	/**
	 * Get screenings based on the status provided.
	 * 
	 * @param status - A string notifying whether the screening is pending or complete.
	 * @return - List of SimpleScreening objects corresponding to status.
	 */
	@RequestMapping(value="/screening/scheduledScreenings", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<ScheduledScreening>> getAllScheduledScreenings(){
		List<ScheduledScreening> scheduledScreenings = scheduledScreeningRepository.findByStatus("PENDING");
		
		return new ResponseEntity<>(scheduledScreenings, HttpStatus.OK);
	}
}
