package com.sun3d.why.demo;

/**
 * Created by xiech on 2018/2/23 0023.
 */
@FunctionalInterface
public interface Converter<F,T> {
    T convert(F f);
}

