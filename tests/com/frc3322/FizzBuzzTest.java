package com.frc3322;

import org.junit.Test;

import static org.junit.Assert.*;


public class FizzBuzzTest {
    @Test
    public void is_everything_configured() {
        assertTrue(true);
    }

    @Test
    public void value_one_returns_one()
    {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String val = fizzBuzz.get(1);
        assertTrue(val.equals("1"));
    }


}