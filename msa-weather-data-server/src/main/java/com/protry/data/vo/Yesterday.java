package com.protry.data.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * @author protry
 */
@Data
public class Yesterday implements Serializable {

    private String date;
    private String high;
    private String fx;
    private String low;
    private String fl;
    private String type;

}
