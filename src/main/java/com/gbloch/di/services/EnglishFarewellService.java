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
public final class EnglishFarewellService implements FarewellService {
    private final FarewellRepository farewellRepository;

    public EnglishFarewellService(FarewellRepository farewellRepository) {
        this.farewellRepository = farewellRepository;
    }

    @Override
    public String farewell() {
        return farewellRepository.getEnglishFarewell();
    }
}
