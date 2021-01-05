package com.example.demo.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.example.demo.domain.Menu;

@Repository
public class MenuDaoImpl implements MenuDao{

	 
	
	@Override
	public List<Menu> search(String name, String cource, String recette) {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

}
