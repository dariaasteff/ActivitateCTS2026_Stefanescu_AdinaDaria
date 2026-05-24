package ro.ase.cts.clase;

public class Student {
    private String nume;
    private String nrTel;
    private String email;

    public Student(String nume, String nrTel, String email) {
        this.nume = nume;
        this.nrTel = nrTel;
        this.email = email;
    }

    public String getNume() {
        return nume;
    }

    public String getNrTel() {
        return nrTel;
    }

    public String getEmail() {
        return email;
    }
}
