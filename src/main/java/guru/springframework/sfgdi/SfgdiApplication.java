package guru.springframework.sfgdi;

import guru.springframework.sfgdi.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
@SpringBootApplication
public class SfgdiApplication {
	public static void main(String[] args) {
		ApplicationContext ctx= SpringApplication.run(SfgdiApplication.class, args);

		I18nController i18nController=(I18nController) ctx.getBean("i18nController");
		System.out.println(i18nController.sayHello());
		MyController myController=(MyController) ctx.getBean("myController");
		System.out.println("----Primary Bean-----");
		System.out.println(myController.sayHello());


		System.out.println("-------Property-------");
		PropertyInjectController propertyInjectController=(PropertyInjectController) ctx.getBean("propertyInjectController");
		System.out.println(propertyInjectController.getGreeting());

		System.out.println("-------Setter-------");
		SetterInjectionController SetterInjectionController=(SetterInjectionController) ctx.getBean("setterInjectionController");
		System.out.println(SetterInjectionController.getGreeting());

		System.out.println("-------Constructor-------");
		ConstructorInjectedController constructorInjectedController=(ConstructorInjectedController) ctx.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreeting());
	}

}
