package com.bbps.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bbps.model.Biller;
import com.bbps.service.BillerService;

@RestController
@RequestMapping("/bbps")
public class BillerController {
	private final Logger logger=LoggerFactory.getLogger(BillerController.class);
	
	@Autowired
	private BillerService billerService;

	@GetMapping("/getBillers")
	public Biller getBiller(@RequestParam("agentID") String agentId) {
		logger.debug("agentId >>{}",agentId);
		return billerService.getBiller(agentId);
	}
}
