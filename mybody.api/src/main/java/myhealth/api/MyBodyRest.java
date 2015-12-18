package myhealth.api;

import myhealth.api.model.Body;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by timmygilissen on 4/12/15.
 */
public interface MyBodyRest {

    @RequestMapping("/user/{reference}")
    Body mybodyByReference(@PathVariable("reference") BodyReference bodyReference);
}
