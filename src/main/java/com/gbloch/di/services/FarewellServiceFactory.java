package com.gbloch.di.services;

import com.gbloch.di.repositories.FarewellRepository;

/**
 * <br>
 * Created on 03/03/2021
 *
 * @author gbloch
 * @version 1.0
 * @since 1.0
 */
public final class FarewellServiceFactory {
    private final FarewellRepository farewellRepository;

    public FarewellServiceFactory(FarewellRepository farewellRepository) {
        this.farewellRepository = farewellRepository;
    }

    public FarewellService createFarewellService(String lang) {
        switch (lang) {
            case "FR":
                return new FrenchFarewellService(farewellRepository);
            case "ES":
                return new SpanishFarewellService(farewellRepository);
            case "EN":
            default:
                return new EnglishFarewellService(farewellRepository);
        }
    }
}
