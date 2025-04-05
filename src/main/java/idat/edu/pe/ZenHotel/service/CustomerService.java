package idat.edu.pe.ZenHotel.service;

import idat.edu.pe.ZenHotel.model.CustomerModel;
import idat.edu.pe.ZenHotel.repository.CustomerRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CustomerService {
    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public List<CustomerModel> getCustomers() {
        return customerRepository.findAll();
    }

    public CustomerModel getCustomerById(int id) {
        return customerRepository.findById(id).orElse(null);
    }

    public void saveCustomer (CustomerModel customerModel) {
        customerRepository.save(customerModel);
    }
}