package com.uep.wap.dto;

import lombok.Getter;
import lombok.Setter;

import java.sql.Date;

@Setter
@Getter
public class OrderItemsDTO {

    private int quantity;
    private Date created_at;
    private Date modified_at;
}
