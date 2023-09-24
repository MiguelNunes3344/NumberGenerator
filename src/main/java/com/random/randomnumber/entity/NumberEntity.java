package com.random.randomnumber.entity;





import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Number")
public class NumberEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private Long number;
	
	public NumberEntity() {
		
	}
	public NumberEntity(Long number) {
		this.setNumber(number);
	}

	public NumberEntity(Integer id, Long number) {
		this.id = id;
		this.number = number;
	}


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Long getNumber() {
		return number;
	}

	public void setNumber(Long number) {
		this.number = number;
	}

	
	
}
