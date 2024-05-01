package com.ecom.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Category {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String name;

	private String imageName;

	private Boolean isActive;

	public void setImageName(String imageName2) {
		// TODO Auto-generated method stub
		
	}

	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getId() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getImageName() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getIsActive() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setIsActive(Object isActive2) {
		// TODO Auto-generated method stub
		
	}

	public void setName(String name2) {
		// TODO Auto-generated method stub
		
	}

}