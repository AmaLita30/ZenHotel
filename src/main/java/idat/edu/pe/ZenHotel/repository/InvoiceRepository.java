package idat.edu.pe.ZenHotel.repository;

import idat.edu.pe.ZenHotel.model.InvoiceModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Date;

public interface InvoiceRepository extends JpaRepository<InvoiceModel, Integer> {
    @Query(value = """
        UPDATE room
        SET idbooking = :idbooking,
            idpaymentmethod = :idpaymentmethod,
            idpaymentstatus = :idpaymentstatus,
            idextraservice = :idextraservice,
            amount = :amount
            paymentdate = :paymentdate
        WHERE idinvoice = :idinvoice
    """, nativeQuery = true)
    void UpdateInvoice(
            @Param("idbooking") Integer idbooking,
            @Param("idpaymentmethod") Integer idpaymentmethod,
            @Param("idpaymentstatus") Integer idpaymentstatus,
            @Param("idextraservice") Integer idextraservice,
            @Param("amount") Double amount,
            @Param("paymentdate") Date paymentdate,
            @Param("idinvoice") Integer idinvoice
    );
}