package com.tlg.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tlg.repository.FundOpsRepository;
import com.tlg.service.FundOpsService;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class FundOpsServiceImpl implements FundOpsService {

	@Autowired
	private FundOpsRepository fundOpsRepository;

	@Override
	public void insertInstitution(String institutionId, String institutionName) {
		log.info("FundOpsServiceImpl : {} {} ", institutionId, institutionName);
		fundOpsRepository.insertInstitution(institutionId, institutionName);
	}
}