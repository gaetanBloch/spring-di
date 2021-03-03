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
@Profile({"FR", "default"})
@Service("greetingService")
final class FrenchGreetingService implements GreetingService {
    @Override
    public String greeting() {
        return "Bonjour mon ami! - FR";
    }
}
