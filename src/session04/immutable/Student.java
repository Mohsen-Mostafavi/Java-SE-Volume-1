package session04.immutable;

public class Student {
    private String nationalCode;

    private final int MAX_CONT_NATIONALCODE=20;

    private boolean active;

    public String getNationalCode() {
        return nationalCode;
    }

    public void setNationalCode(String nationalCode) {
        if (nationalCode.length()==10) {
            this.nationalCode = nationalCode;
        }else {
            this.nationalCode="";
        }
    }

    public boolean isActive(){
        return active;
    }

    public void setActive(boolean active){
        this.active = active;
    }


    public int getMAX_CONT_NATIONALCODE() {
        return MAX_CONT_NATIONALCODE;
    }
}
