package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.Services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectController {
@Autowired
    public GreetingService greetingService;
public String getGreeting(){
    return greetingService.sayGreeting();
}
}
