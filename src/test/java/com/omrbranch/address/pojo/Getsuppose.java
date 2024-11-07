package com.omrbranch.address.pojo;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Getsuppose {
	 private int status;
	    private String message;
	    private ArrayList<DatumGet> data;
}
