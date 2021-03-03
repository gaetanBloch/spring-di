package com.gbloch.di.controllers;

import com.gbloch.di.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * <br>
 * Created on 02/03/2021
 *
 * @author gbloch
 * @version 1.0
 * @since 1.0
 */
@Controller
public final class GreetingController {
    private final GreetingService greetingService;

    // @Autowired and @Qualifier annotations are Optional since we are using
    // @Primary beans and @Profile annotations
    @Autowired
    public GreetingController(@Qualifier("greetingService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String greeting() {
        return greetingService.greeting();
    }
}
