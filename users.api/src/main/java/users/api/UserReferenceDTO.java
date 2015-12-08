package users.api;

public class UserReferenceDTO {

    public final String reference;

    private UserReferenceDTO(Builder builder) {
        reference = builder.reference;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static final class Builder {
        private String reference;

        private Builder() {
        }

        public Builder withReference(String val) {
            reference = val;
            return this;
        }

        public UserReferenceDTO build() {
            return new UserReferenceDTO(this);
        }
    }
}
