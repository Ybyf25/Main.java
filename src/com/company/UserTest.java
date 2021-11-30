package com.company;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static com.company.Main.isInLimit;

public class UserTest {
    @Test
    @DisplayName("NumberIsMoreThan1")
    public void numberMoreThan1() {
        short number = 2;
        boolean expected = true;
        boolean actual = isInLimit(number);
        Assert.assertEquals(expected, actual);
    }
}