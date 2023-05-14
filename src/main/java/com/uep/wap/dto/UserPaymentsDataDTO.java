package com.uep.wap.dto;

import java.util.List;

public class UserPaymentsDataDTO {

    List<UserPaymentDTO> userPayments;

    public List<UserPaymentDTO> getUserPayments() {
        return userPayments;
    }

    public void setUserPayments(List<UserPaymentDTO> userPayments) {
        this.userPayments = userPayments;
    }
}
