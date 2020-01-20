package com.hello.project3;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.stereotype.Service;


	@Service("sameService")
	
	public class SampleServiceImpl implements SampleService{
		Logger log=LoggerFactory.getLogger(this.getClass());
		
		@Resource (name="sampleDAO")
		private SampleDAO sampleDAO;
		
	
		@Override
		public List<Map<String, Object>> selectBoardList(Map<String, Object> map) throws Exception {
			// TODO Auto-generated method stub
			return sampleDAO.selectBoardList(map);
		}

}
