package com.omrbranch.login.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PojoPostA {

	private int status;
	private String message;
	private PojoPostb data;
	private String refer_msg;
	private int cart_count;
	private String role;
}
