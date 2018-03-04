package com.arjun.shoppingbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.arjun.shoppingbackend.dao.CategoryDAO;
import com.arjun.shoppingbackend.dto.Category;
@Repository("categorydao")
public class CategoryDAOimpl implements CategoryDAO {

	
	private static List<Category> categories = new ArrayList<>(); 
	
	static {
		Category cat = new Category();
		cat.setId(1);
		cat.setName("Television");
		cat.setDescription("Television");
		cat.setImageURL("CAT_1.png");
		
		categories.add(cat);
		
		Category cat2 = new Category();
		cat2.setId(2);
		cat2.setName("Mobile");
		cat2.setDescription("Mobile");
		cat2.setImageURL("CAT_2.png");
		
		categories.add(cat2);
		
		Category cat3 = new Category();
		cat3.setId(3);
		cat3.setName("Laptop");
		cat3.setDescription("Laptop");
		cat3.setImageURL("CAT_3.png");
		
		categories.add(cat3);
		
		
	}
	
	@Override
	public List<Category> list() {
		
		return categories;
	}

	@Override
	public Category get(int id) {
		Category retCat = null;
		for(Category cat : categories) {
			if(cat.getId() == id) {
				retCat = cat;
			}
		}
		
		return retCat;
	}

}
