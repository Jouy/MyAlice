package com.myalice.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.myalice.domain.Users;
import com.myalice.mapping.UsersMapper;
import com.myalice.utils.MyAliceConstant;

@Service
public class UsersService {
	
	protected int pageSize = MyAliceConstant.PAGE_SIZE; 
	
	@Autowired
	protected UsersMapper usersMapper ;
	
	@Transactional(propagation = Propagation.SUPPORTS)
	public Page<Users> searchUsers(Integer pageNum , Users users){
		Page<Users> startPage = PageHelper.startPage(pageNum, pageSize) ;
		usersMapper.searchUsers(users);
		return startPage ; 
	}
	
	@Transactional
	public int updateUser(Users users){
		return usersMapper.updateByPrimaryKey(users) ;
	}
	
	@Transactional
	public int insert(Users user){
		return usersMapper.insert(user); 
	}
	
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
}