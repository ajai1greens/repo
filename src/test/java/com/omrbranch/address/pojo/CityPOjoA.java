package com.omrbranch.address.pojo;

import java.util.ArrayList;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CityPOjoA {
    private int status;
    private String message;
    private ArrayList<Datumpojocity> data;
}
