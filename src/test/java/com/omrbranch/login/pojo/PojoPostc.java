package com.omrbranch.login.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PojoPostc {
	private int id;
	private String role;
	private String name;
	private String status;
	private String created_at;
	private String updated_at;
	private Pivot pivot;

}
