package com.containerized.app.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/path")
public class ArithmeticController
{
    @Autowired
    ArithmeticService arithmeticService;

    @PostMapping(value = "/performOperation")
    public int factorial(@RequestParam Integer number)
    {
        return arithmeticService.getFactorial(number);
    }
}
