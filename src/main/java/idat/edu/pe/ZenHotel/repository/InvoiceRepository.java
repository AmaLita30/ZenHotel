package idat.edu.pe.ZenHotel.repository;

import idat.edu.pe.ZenHotel.model.InvoiceModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

public interface InvoiceRepository extends JpaRepository<InvoiceModel, Integer> {
    @Modifying(clearAutomatically = true)
    @Transactional
    @Query(value = """
        UPDATE invoice
        SET idbooking = :idbooking,
            idpaymentmethod = :idpaymentmethod,
            idpaymentstatus = :idpaymentstatus,
            idextraservice = :idextraservice,
            amount = :amount,
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

    @Query("SELECT SUM(i.amount) FROM InvoiceModel i")
    Double totalIncome();

    @Query(value = "SELECT SUM(amount), paymentdate FROM invoice GROUP BY paymentdate", nativeQuery = true)
    List<Object[]> findDailyIncome();
}