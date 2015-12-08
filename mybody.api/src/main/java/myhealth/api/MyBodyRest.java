package myhealth.api;

import myhealth.api.model.Body;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import users.api.UserReferenceDTO;

import java.util.Collection;

/**
 * Created by timmygilissen on 4/12/15.
 */
public interface MyBodyRest {
    @RequestMapping("/myhealth/{userreference}")
    Collection<Body> myBody(@PathVariable("userreference") UserReferenceDTO userReferenceDTO);

    @RequestMapping("/user/{reference}")
    Body mybodyByReference(@PathVariable("reference") BodyReference bodyReference);
}
