package Controller;


import org.springframework.web.bind.annotation.*;

@RestController
public class CustomerChoiceController {

    @RequestMapping("/customerchoice/{id}")
    @ResponseBody
    public String getCustomerChoice(@PathVariable String id){
    System.out.println("Customer Choice Created!" + id);

        return "Success";
}
}
