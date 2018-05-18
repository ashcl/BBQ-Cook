package org.christopherash.bbqcook.domain.resource;

import com.sun.deploy.net.HttpResponse;
import org.christopherash.bbqcook.domain.model.Cook;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/cook")
public class CookResource {

    @GetMapping(value = "/{id}")
    public ResponseEntity<Cook> findById(@PathVariable("id") String id){
        Cook returnCook = new Cook();
        returnCook.setId(id);
        return new ResponseEntity<>(returnCook, HttpStatus.OK);
    }

}
