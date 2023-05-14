package com.uep.wap.repository;

import com.uep.wap.model.PaymentDetails;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentDetailsRepository extends CrudRepository<PaymentDetails, Integer> {
}
