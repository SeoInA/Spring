package com.hello.spring_ex1;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository("UserListDAO")

public class UserListDAOImpl implements UserListDAO {
	
	@Override
	public List<UserListResponseDTO> getUserListDAO(){
		System.out.println("dao call");
		
		List<UserListResponseDTO> userlist=new ArrayList<UserListResponseDTO>();
		
		UserListResponseDTO list1 = new UserListResponseDTO();
		list1.setUserName("홍길동");
		list1.setUserAge("26");
		list1.setUserAddress("경기도 수원시");
		list1.setUserImage("peopleimage.png");
		
		userlist.add(list1);
		
		UserListResponseDTO list2= new UserListResponseDTO();
		list2.setUserName("임꺽정");
		list2.setUserAge("30");
		list2.setUserAddress("경기도 안양시");
		list2.setUserImage("peopleimage.png");
		
		userlist.add(list2);
		
		
		UserListResponseDTO list3 = new UserListResponseDTO();
		list3.setUserName("김철수");
		list3.setUserAge("28");
		list3.setUserAddress("경기도 오산시");
		list3.setUserImage("peopleimage.png");
		
		userlist.add(list3);
		
		return userlist;
	}
}
