package idat.edu.pe.ZenHotel.service;

import idat.edu.pe.ZenHotel.model.PaymentStatusModel;
import idat.edu.pe.ZenHotel.repository.PaymentStatusRepository;

import java.util.List;

public class PaymentStatusService {
    private final PaymentStatusRepository paymentStatusRepository;

    public PaymentStatusService(PaymentStatusRepository paymentStatusRepository) {
        this.paymentStatusRepository = paymentStatusRepository;
    }

    public List<PaymentStatusModel> getPaymentSatuses() {
        return paymentStatusRepository.findAll();
    }

    public void savePaymentStatus(PaymentStatusModel paymentstatus) {
        paymentStatusRepository.save(paymentstatus);
    }
}
