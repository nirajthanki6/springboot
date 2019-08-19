package Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/person")
public class PersonController {

    @GetMapping("/all")
    public String getallperson(){
        return "All Person Returned!";
    }

    @GetMapping("/{id}")
    public int getpersonByid(@PathVariable String id){

        return 0;
    }


}
