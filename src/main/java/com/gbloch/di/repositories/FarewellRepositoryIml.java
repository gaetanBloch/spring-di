package com.gbloch.di.repositories;

import org.springframework.stereotype.Repository;

/**
 * <br>
 * Created on 03/03/2021
 *
 * @author gbloch
 * @version 1.0
 * @since 1.0
 */
@Repository
final class FarewellRepositoryIml implements FarewellRepository {
    @Override
    public String getEnglishFarewell() {
        return "Farewell my friend! - EN";
    }

    @Override
    public String getFrenchFarewell() {
        return "Adieu mon ami! - FR";
    }

    @Override
    public String getSpanishFarewell() {
        return "Adios mi amigo! - ES";
    }
}
