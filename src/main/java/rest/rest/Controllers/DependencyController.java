package rest.rest.Controllers;

import org.springframework.beans.factory.annotation.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import rest.rest.Utils.*;

@RestController
public class DependencyController {

    @Autowired
    JobUtils utils;

    @RequestMapping("/api/dependency/blocked")
    public ResponseEntity<Boolean> isJobBlocked (@RequestParam(value = "name") String name, @RequestParam(value = "args") String args){
        return new ResponseEntity<Boolean>(utils.isJobBlocked(name,args), HttpStatus.OK);
    }

}
