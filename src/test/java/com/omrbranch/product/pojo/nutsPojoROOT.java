package com.omrbranch.product.pojo;

import java.util.ArrayList;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class nutsPojoROOT {
    private int status;
    private String message;
    private ArrayList<Datumdata> data;
    private String currency;
}
