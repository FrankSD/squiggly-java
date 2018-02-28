package com.github.bohnman.squiggly.core.convert.joda;

import com.github.bohnman.squiggly.core.convert.ListConverterRegistry;
import com.github.bohnman.squiggly.core.convert.SquigglyConverterRegistry;

import java.util.function.Consumer;

public class SquigglyConverterRegistries {

    public SquigglyConverterRegistries() {
    }

    public static SquigglyConverterRegistry create() {
        return new ListConverterRegistry();
    }

    public static SquigglyConverterRegistry create(Consumer<SquigglyConverterRegistry> registrar) {
        SquigglyConverterRegistry registry = create();
        registrar.accept(registry);
        return registry;
    }
}
