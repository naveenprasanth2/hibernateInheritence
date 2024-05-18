package com.bharath.springdata.hibernateinheritence;

import com.bharath.springdata.hibernateinheritence.entities.Check;
import com.bharath.springdata.hibernateinheritence.entities.CreditCard;
import com.bharath.springdata.hibernateinheritence.entities.Payment;
import com.bharath.springdata.hibernateinheritence.repository.PaymentRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class HibernateInheritenceApplicationTests {

    @Autowired
    private PaymentRepository paymentRepository;

    @Test
    void contextLoads() {
    }
    
    @Test
    void testCreatePaymentThroughCC(){
        CreditCard creditCard = new CreditCard();
        creditCard.setId(123);
        creditCard.setAmount(1000);
        creditCard.setCardnumber("1234567890");
        paymentRepository.save(creditCard);
    }

    @Test
    void testCreateCheckPayment(){
        Check check = new Check();
        check.setId(124);
        check.setAmount(1000);
        check.setChecknumber("1234567890");
        paymentRepository.save(check);
    }

}
