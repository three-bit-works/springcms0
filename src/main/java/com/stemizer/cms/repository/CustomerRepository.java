package com.stemizer.cms.repository;

import com.stemizer.cms.entity.Customer;
import org.springframework.stereotype.Repository;

@Repository
public class CustomerRepository extends BaseRepository {
    CustomerRepository(){
        setTheClass(Customer.class);
    }
}
