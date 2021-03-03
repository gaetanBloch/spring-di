package com.gbloch.di.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * <br>
 * Created on 02/03/2021
 *
 * @author gbloch
 * @version 1.0
 * @since 1.0
 */
@Primary
@Profile("EN")
@Service("greetingService")
final class EnglishGreetingService implements GreetingService {
    @Override
    public String greeting() {
        return "Hello my friend! - EN";
    }
}
