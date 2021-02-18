package session11.classes.nested.builder;

import java.util.Date;

public class ImmutableUser {

    private final String firstname;
    private final String lastname;
    private final String email;
    private final Date creationDate;

    private ImmutableUser(Builder builder) {
        this.creationDate = builder.creationDate;
        this.firstname = builder.firstname;
        this.lastname = builder.lastname;
        this.email = builder.email;
    }

    public static class Builder { // Nested Class

        private final String email;
        private final Date creationDate;
        private String firstname;
        private String lastname;

        public Builder(String email) {
            this.email = email;
            this.creationDate = new Date();
        }

        public Builder firstName(String firsname) {
            this.firstname = firsname;
            return this;
        }

        public Builder lastName(String lastname) {
            this.lastname = lastname;
            return this;
        }

        public ImmutableUser build() {
            return new ImmutableUser(this);
        }

    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getEmail() {
        return email;
    }

    public Date getCreationDate() { // reference types are duplicated in getter
        return new Date( creationDate.getTime() );
    }

    public static void main(String[] args) {

        ImmutableUser user = new Builder("java@acm.org.ir")
                .firstName("Ali") // set by method, not constructor
                .lastName("Parvini")
                .build();

    }

}