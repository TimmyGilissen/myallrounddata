package users.mapper;

import users.api.model.AddressDTO;
import users.api.model.UserDTO;
import users.api.model.UserReferenceDTO;
import users.domain.Address;
import users.domain.User;
import users.domain.UserReference;

/**
 * Created by timmygilissen on 8/12/15.
 */
public class Mapper {
    public static UserDTO MapToUserDTO(User u) {

        return UserDTO
                .newBuilder()
                .withAddress(Mapper.MapToAddressDTO(u.getAddress()))
                .withDisplayName(u.getDisplayName())
                .withReference(Mapper.MapToReferenceCodeDTO(u.getReference()))
                .build();
    }

    public static UserReferenceDTO MapToReferenceCodeDTO(UserReference reference) {
        return UserReferenceDTO.newBuilder()
                .withReference(reference.getReference())
                .build();
    }

    public static AddressDTO MapToAddressDTO(Address address) {
        return AddressDTO.newBuilder()
                .withCity(address.getCity())
                .withCountry(address.getCountry())
                .withNumber(address.getNumber())
                .withStreet(address.getStreet())
                .build();
    }
}
