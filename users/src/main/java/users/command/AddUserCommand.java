package users.command;

/**
 * Created by timmygilissen on 10/12/15.
 */
public class AddUserCommand {

    public final String firstName;

    public final String lastName;

    public final String street;

    public final int number;

    public final int postalCode;

    public final String city;

    public final String country;

    private AddUserCommand(Builder builder) {
        firstName = builder.firstName;
        lastName = builder.lastName;
        street = builder.street;
        number = builder.number;
        postalCode = builder.postalCode;
        city = builder.city;
        country = builder.country;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static final class Builder {
        private String firstName;
        private String lastName;
        private String street;
        private int number;
        private int postalCode;
        private String city;
        private String country;

        private Builder() {
        }

        public Builder withFirstName(String val) {
            firstName = val;
            return this;
        }

        public Builder withLastName(String val) {
            lastName = val;
            return this;
        }

        public Builder withStreet(String val) {
            street = val;
            return this;
        }

        public Builder withNumber(int val) {
            number = val;
            return this;
        }

        public Builder withPostalCode(int val) {
            postalCode = val;
            return this;
        }

        public Builder withCity(String val) {
            city = val;
            return this;
        }

        public Builder withCountry(String val) {
            country = val;
            return this;
        }

        public AddUserCommand build() {
            return new AddUserCommand(this);
        }
    }
}
