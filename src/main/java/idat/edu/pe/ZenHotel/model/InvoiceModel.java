package idat.edu.pe.ZenHotel.model;
import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "invoice")
public class InvoiceModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idinvoice;
    @ManyToOne
    @JoinColumn(name = "idbooking")
    private BookingModel booking;
    @ManyToOne
    @JoinColumn(name = "idbooking")
    private Integer idpaymentmethod;
    private Integer idpaymentstatus;
    private Integer idextraservice;
    private Double amount;
    private Date paymentdate;


}