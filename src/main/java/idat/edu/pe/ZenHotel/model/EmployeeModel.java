package idat.edu.pe.ZenHotel.model;
import jakarta.persistence.*;

@Entity
@Table(name = "employee")
public class EmployeeModel{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idemployee;
    private String employeecode;
    private String fatherlastname;
    private String motherlastname;
    private String firstname;
    private String middlename;
    private String dni;
    private String phone;
    private String email;
    @ManyToOne
    @JoinColumn(name = "idrole")
    private RoleModel role;

    public Integer getIdemployee() {
        return idemployee;
    }

    public void setIdemployee(Integer idemployee) {
        this.idemployee = idemployee;
    }

    public String getEmployeecode() {
        return employeecode;
    }

    public void setEmployeecode(String employeecode) {
        this.employeecode = employeecode;
    }

    public String getFatherlastname() {
        return fatherlastname;
    }

    public void setFatherlastname(String fatherlastname) {
        this.fatherlastname = fatherlastname;
    }

    public String getMotherlastname() {
        return motherlastname;
    }

    public void setMotherlastname(String motherlastname) {
        this.motherlastname = motherlastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getMiddlename() {
        return middlename;
    }

    public void setMiddlename(String middlename) {
        this.middlename = middlename;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public RoleModel getRole() {
        return role;
    }

    public void setRole(RoleModel role) {
        this.role = role;
    }
}
