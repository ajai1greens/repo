package com.omrbranch.address.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class AddAdressOutputPojo {
	private int status;
	private String message;
	private int address_id;

}
