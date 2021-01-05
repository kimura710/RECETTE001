package com.example.demo.Dao;

import java.io.Serializable;
import java.util.List;

import com.example.demo.domain.Menu;

public interface MenuDao extends Serializable{
	
	public List<Menu> search(String name,String cource,String recette);

}
