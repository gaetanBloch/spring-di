package com.gbloch.di.config;

import com.gbloch.di.repositories.FarewellRepository;
import com.gbloch.di.services.FarewellService;
import com.gbloch.di.services.FarewellServiceFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

/**
 * <br>
 * Created on 03/03/2021
 *
 * @author gbloch
 * @version 1.0
 * @since 1.0
 */
@Configuration
class FarewellServiceConfig {
    @Bean
    FarewellServiceFactory farewellServiceFactory(FarewellRepository farewellRepository) {
        return new FarewellServiceFactory(farewellRepository);
    }

    @Bean
    @Primary
    @Profile("EN")
    FarewellService englishFarewellService(FarewellServiceFactory farewellServiceFactory) {
        return farewellServiceFactory.createFarewellService("EN");
    }

    @Bean
    @Primary
    @Profile({"FR", "default"})
    FarewellService frenchFarewellService(FarewellServiceFactory farewellServiceFactory) {
        return farewellServiceFactory.createFarewellService("FR");
    }

    @Bean
    @Primary
    @Profile("ES")
    FarewellService spanishFarewellService(FarewellServiceFactory farewellServiceFactory) {
        return farewellServiceFactory.createFarewellService("ES");
    }
}
