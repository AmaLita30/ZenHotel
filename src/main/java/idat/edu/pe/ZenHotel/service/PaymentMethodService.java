package idat.edu.pe.ZenHotel.service;

import idat.edu.pe.ZenHotel.model.PaymentMethodModel;
import idat.edu.pe.ZenHotel.repository.PaymentMethodRepository;

import java.util.List;

public class PaymentMethodService {
    private final PaymentMethodRepository paymentMethodRepository;

    public PaymentMethodService(PaymentMethodRepository paymentMethodRepository) {
        this.paymentMethodRepository = paymentMethodRepository;
    }

    public List<PaymentMethodModel> getPaymentMethods() {
        return paymentMethodRepository.findAll();
    }

    public void savePaymentMethod (PaymentMethodModel paymentmethod) {
        paymentMethodRepository.save(paymentmethod);
    }
}
