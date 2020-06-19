package app.controller;

import app.entity.Person;
import app.service.Calc;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class PersonController {
    public PersonController(Calc calc) {
        this.calc = calc;
    }

    private final Calc calc;

    @RequestMapping("/persons")
    public List<Person> handle() {
        return Arrays.asList(
                new Person("John", 12),
                new Person("Jane", 13)
        );
    }

    @GetMapping("/calc")
    public String calc() {
        int c = calc.add(1, 2);
        return Integer.toString(c);
    }
}
