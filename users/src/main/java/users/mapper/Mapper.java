package users.mapper;

import users.factory.DTO.UserDTO;
import users.factory.DTO.UserReferenceDTO;
import users.api.request.UserRequestJson;
import users.api.response.UserResponse;
import users.command.AddUserCommand;
import users.domain.User;
import users.domain.UserReference;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Mapper {
    public static UserDTO MapToUserDTO(User u) {

        return UserDTO
                .newBuilder()
                .withDisplayName(u.getDisplayName())
                .withReference(Mapper.MapToReferenceCodeDTO(u.getReference()))
                .build();
    }

    public static UserReferenceDTO MapToReferenceCodeDTO(UserReference reference) {
        return UserReferenceDTO.newBuilder()
                .withReference(reference.getReference())
                .build();
    }

    public static Collection<UserResponse> MapToUserResponses(List<UserDTO> userDTOs) {
        Collection<UserResponse> result = new ArrayList<>();

        for (UserDTO us : userDTOs) {
            result.add(Mapper.MapToUserResponse(us));
        }
        return result;
    }

    public static UserResponse MapToUserResponse(UserDTO us) {
        return new UserResponse(us.id, us.displayName, us.reference.reference);
    }


    public static AddUserCommand MapToAddUserCommand(UserRequestJson input) {
        return AddUserCommand.newBuilder()
                .withFirstName(input.firstName)
                .withLastName(input.lastName)
                .withCity(input.city)
                .withCountry(input.country)
                .withNumber(input.number)
                .withPostalCode(input.postalCode)
                .withStreet(input.street)
                .build();
    }
}
