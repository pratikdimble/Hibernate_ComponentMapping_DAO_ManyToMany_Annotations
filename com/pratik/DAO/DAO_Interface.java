package com.pratik.DAO;

import java.util.List;

import com.pratik.domain.person;

public interface DAO_Interface {
	public int savedata(person details);
	public List<person> getdata();
	public List<Object[]> getdataCondition();

}
