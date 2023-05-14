package com.uep.wap.dto;

import java.sql.Date;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderDetailsDTO {

    private Double price;
    private Date createdAt;
    private Date modifiedAt;
}
