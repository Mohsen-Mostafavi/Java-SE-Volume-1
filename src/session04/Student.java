package session04;

public class Student {

    private String nationalCode;
    private String studentCode;

    public Student() {
    }

    public String getNationalCode() {
        return nationalCode;
    }

    public void setNationalCode(String nationalCode) {
        this.nationalCode = nationalCode;
        this.studentCode = nationalCode + "1399";
    }

    public String getStudentCode() {
        return studentCode;
    }
}
