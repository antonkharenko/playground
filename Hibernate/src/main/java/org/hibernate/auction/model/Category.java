package org.hibernate.auction.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class Category implements Serializable {
	private Long id;
	private String name;
	private Category parentCategory;
	private Set<Category> childCategories = new HashSet<Category>();
	private Set<Item> items = new HashSet<Item>();
	
	public Category() {}
	
	public Category(String name) {
		this.name = name;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Category getParentCategory() {
		return parentCategory;
	}

	public void setParentCategory(Category parentCategory) {
		this.parentCategory = parentCategory;
	}

	public Set<Category> getChildCategories() {
		return childCategories;
	}

	public void setChildCategories(Set<Category> childCategories) {
		this.childCategories = childCategories;
	}

	public void addChildCategory(Category childCategory) {
		childCategories.add(childCategory);
		childCategory.setParentCategory(this);
	};
	
	public Set<Item> getItems() {
		return items;
	}

	public void setItems(Set<Item> items) {
		this.items = items;
	}
}
