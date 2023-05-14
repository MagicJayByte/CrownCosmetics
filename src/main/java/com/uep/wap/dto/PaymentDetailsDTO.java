package com.uep.wap.dto;

import lombok.Getter;
import lombok.Setter;

import java.sql.Date;

@Getter
@Setter
public class PaymentDetailsDTO {

    private String provider;
    private int amount;
    private String status;
    private Date createdAt;
    private Date modifiedAt;


}
