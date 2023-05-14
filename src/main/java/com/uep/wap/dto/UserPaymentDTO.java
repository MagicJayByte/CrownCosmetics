package com.uep.wap.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class UserPaymentDTO {

    private long user_payment_id;

    private String payment_type;

    private String provider;

    private String account_number;

    private String IBAN_number;

    private String card_number;

    private Date expire_date;


}
