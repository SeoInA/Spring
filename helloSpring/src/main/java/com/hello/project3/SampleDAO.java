package com.hello.project3;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.hello.project3.AbstractDAO;

@Repository("sampleDAO")
public class SampleDAO extends AbstractDAO{

	@SuppressWarnings("unchecked")
	
	public List<Map<String, Object>> selectBoardList(Map<String, Object> map) throws Exception {
		// TODO Auto-generated method stub
		return (List<Map<String,Object>>)selectList("selectBoardList",map);
	}
	
}
