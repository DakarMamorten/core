package com.vlad.web.dvdrental.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * @author Sergey Manko
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerDTO {
	private long customerId;
	@Column(name = "stored_id")
	private long storeId;
	@Column(name = "first_name")
	private String firstName;
	@Column(name = "last_name")
	private String lastName;
	private String email;
	@Column(name = "address_id")
	private long addressId;
	private boolean activebool;
	@Column(name = "create_date")
	private LocalDate createDate;
	@Column(name = "last_update")
	private LocalDateTime lastUpdate;
	private long active;

	public CustomerDTO(long storeId, String firstName, String lastName, String email, long addressId, boolean activebool, long active) {
		this.storeId = storeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.addressId = addressId;
		this.activebool = activebool;
		this.active = active;
	}
}
