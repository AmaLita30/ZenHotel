package idat.edu.pe.ZenHotel.model;

public class EmployeeModel extends PersonModel{
    private Integer idEmployee;
    private String codEmployee;
    private Integer idRole;



    public Integer getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(Integer idEmployee) {
        this.idEmployee = idEmployee;
    }

    public String getCodEmployee() {
        return codEmployee;
    }

    public void setCodEmployee(String codEmployee) {
        this.codEmployee = codEmployee;
    }

    public Integer getIdRole() {
        return idRole;
    }

    public void setIdRole(Integer idRole) {
        this.idRole = idRole;
    }
}
