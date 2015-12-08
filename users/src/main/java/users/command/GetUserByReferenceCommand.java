package users.command;

import users.api.model.UserReferenceDTO;


public class GetUserByReferenceCommand {

    public final UserReferenceDTO referenceDTO;

    private GetUserByReferenceCommand(Builder builder) {
        referenceDTO = builder.referenceDTO;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static final class Builder {
        private UserReferenceDTO referenceDTO;

        private Builder() {
        }

        public Builder withReferenceDTO(UserReferenceDTO val) {
            referenceDTO = val;
            return this;
        }

        public GetUserByReferenceCommand build() {
            return new GetUserByReferenceCommand(this);
        }
    }
}
