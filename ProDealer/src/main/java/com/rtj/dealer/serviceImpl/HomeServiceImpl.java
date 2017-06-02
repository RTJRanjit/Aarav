package com.rtj.dealer.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rtj.dealer.dao.HomeDao;
import com.rtj.dealer.service.HomeService;

@Service("homeService")
@Transactional
public class HomeServiceImpl implements HomeService {
	
	@Autowired
	private HomeDao dao;

	
	
	

}
