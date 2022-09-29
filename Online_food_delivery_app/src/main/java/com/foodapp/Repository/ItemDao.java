package com.foodapp.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.foodapp.model.Item;


@Repository
public interface ItemDao extends JpaRepository<Item, Integer> {
//	public List<Item> findAll(Category cat);
//	
//	public List<Item> viewAllItems(Restaurant res) ;
//	
//	public List<Item> findbyName(String name);
}
