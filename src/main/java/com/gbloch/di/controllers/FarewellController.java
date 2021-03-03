package com.gbloch.di.controllers;

import com.gbloch.di.services.FarewellService;
import org.springframework.stereotype.Controller;

/**
 * <br>
 * Created on 03/03/2021
 *
 * @author gbloch
 * @version 1.0
 * @since 1.0
 */
@Controller
public final class FarewellController {
    private final FarewellService farewellService;

    public FarewellController(FarewellService farewellService) {
        this.farewellService = farewellService;
    }

    public String farewell() {
        return this.farewellService.farewell();
    }
}
