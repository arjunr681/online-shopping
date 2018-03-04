package com.arjun.shoppingbackend.dao;

import java.util.List;

import com.arjun.shoppingbackend.dto.Category;

public interface CategoryDAO {
	
	List<Category> list();
	Category get(int id);
	

}
