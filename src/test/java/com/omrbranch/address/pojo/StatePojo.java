package com.omrbranch.address.pojo;

import java.util.ArrayList;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class StatePojo {
    public int status;
    public String message;
    public ArrayList<DatumState> data;

}
