package com.protry.report.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * @author protry
 */
@Data
public class Forecast implements Serializable {

    private String date;
    private String high;
    private String fengli;
    private String low;
    private String fengxiang;
    private String type;

}
