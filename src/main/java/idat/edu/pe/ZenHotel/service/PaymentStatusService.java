package idat.edu.pe.ZenHotel.service;

import idat.edu.pe.ZenHotel.model.PaymentStatusModel;
import idat.edu.pe.ZenHotel.repository.PaymentStatusRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PaymentStatusService {
    private final PaymentStatusRepository paymentStatusRepository;

    public PaymentStatusService(PaymentStatusRepository paymentStatusRepository) {
        this.paymentStatusRepository = paymentStatusRepository;
    }

    public List<PaymentStatusModel> getPaymentStatus() {
        return paymentStatusRepository.findAll();
    }

    public PaymentStatusModel getPaymentStatusById(int id) {
        return paymentStatusRepository.findById(id).orElse(null);
    }

    public void savePaymentStatus(PaymentStatusModel paymentstatus) {
        paymentStatusRepository.save(paymentstatus);
    }
}