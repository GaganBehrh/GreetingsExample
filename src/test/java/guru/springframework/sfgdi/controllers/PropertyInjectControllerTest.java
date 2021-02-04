package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.Services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyInjectControllerTest {
PropertyInjectController controller;
@BeforeEach
void setUp(){
    controller= new PropertyInjectController();
    controller.greetingService= new ConstructorGreetingService();
    }


@Test
    void getGreeting() {
    System.out.println(controller.getGreeting());

    }
}