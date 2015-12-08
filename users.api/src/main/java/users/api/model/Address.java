package users.api.model;

/**
 * Created by timmygilissen on 8/12/15.
 */
public class Address {

    public final String Street;

    public final int number;

    public final String City;

    public final String postalCode;

    public final String country;

    private Address(Builder builder) {
        Street = builder.Street;
        number = builder.number;
        City = builder.City;
        postalCode = builder.postalCode;
        country = builder.country;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static final class Builder {
        private String Street;
        private int number;
        private String City;
        private String postalCode;
        private String country;

        private Builder() {
        }

        public Builder withStreet(String val) {
            Street = val;
            return this;
        }

        public Builder withNumber(int val) {
            number = val;
            return this;
        }

        public Builder withCity(String val) {
            City = val;
            return this;
        }

        public Builder withPostalCode(String val) {
            postalCode = val;
            return this;
        }

        public Builder withCountry(String val) {
            country = val;
            return this;
        }

        public Address build() {
            return new Address(this);
        }
    }
}
