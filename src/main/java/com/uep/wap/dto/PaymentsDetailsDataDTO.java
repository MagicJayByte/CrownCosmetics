package com.uep.wap.dto;

import java.util.List;

public class PaymentsDetailsDataDTO {

    List<PaymentDetailsDTO> paymentsDetails;

    public List<PaymentDetailsDTO> getPaymentsDetails() {
        return paymentsDetails;
    }

    public void setPaymentsDetails(List<PaymentDetailsDTO> paymentsDetails) {
        this.paymentsDetails = paymentsDetails;
    }
}
