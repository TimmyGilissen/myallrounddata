package users.factory.DTO;


public class UserDTO {

    public final Long id;

    public final UserReferenceDTO reference;

    public final String displayName;

    public final String firstName;

    public final String lastName;

    public final String street;

    public final int number;

    public final int postalCode;

    public final  String city;

    public final String country;

    private UserDTO(Builder builder) {
        id = builder.id;
        reference = builder.reference;
        displayName = builder.displayName;
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
        private Long id;
        private UserReferenceDTO reference;
        private String displayName;
        private String firstName;
        private String lastName;
        private String street;
        private int number;
        private int postalCode;
        private String city;
        private String country;

        private Builder() {
        }

        public Builder withId(Long val) {
            id = val;
            return this;
        }

        public Builder withReference(UserReferenceDTO val) {
            reference = val;
            return this;
        }

        public Builder withDisplayName(String val) {
            displayName = val;
            return this;
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

        public UserDTO build() {
            return new UserDTO(this);
        }
    }
}
