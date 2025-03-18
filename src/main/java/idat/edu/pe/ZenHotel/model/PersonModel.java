package idat.edu.pe.ZenHotel.model;

public class PersonModel {
    private Integer idPerson;
    private String fatherLastName;
    private String motherLastName;
    private String firstName;
    private String midName;
    private Integer dni;
    private Integer telephone;
    private String email;
    private String address;

    public PersonModel(Integer idPerson, String fatherLastName, String motherLastName, String firstName, String midName, Integer dni, Integer telephone, String email, String address) {
        this.idPerson = idPerson;
        this.fatherLastName = fatherLastName;
        this.motherLastName = motherLastName;
        this.firstName = firstName;
        this.midName = midName;
        this.dni = dni;
        this.telephone = telephone;
        this.email = email;
        this.address = address;
    }

    public Integer getIdPerson() {
        return idPerson;
    }

    public void setIdPerson(Integer idPerson) {
        this.idPerson = idPerson;
    }

    public String getFatherLastName() {
        return fatherLastName;
    }

    public void setFatherLastName(String fatherLastName) {
        this.fatherLastName = fatherLastName;
    }

    public String getMotherLastName() {
        return motherLastName;
    }

    public void setMotherLastName(String motherLastName) {
        this.motherLastName = motherLastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMidName() {
        return midName;
    }

    public void setMidName(String midName) {
        this.midName = midName;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public Integer getTelephone() {
        return telephone;
    }

    public void setTelephone(Integer telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
