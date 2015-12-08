package users.api.model;


import users.api.UserReferenceDTO;

public class UserDTO {

    private final Long id;

    private final UserReferenceDTO reference;

    private final String displayName;

    private final AddressDTO addressDTO;

    private UserDTO(Builder builder) {
        id = builder.id;
        reference = builder.reference;
        displayName = builder.displayName;
        addressDTO = builder.addressDTO;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static final class Builder {
        private Long id;
        private UserReferenceDTO reference;
        private String displayName;
        private AddressDTO addressDTO;

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

        public Builder withAddress(AddressDTO val) {
            addressDTO = val;
            return this;
        }

        public UserDTO build() {
            return new UserDTO(this);
        }
    }
}
