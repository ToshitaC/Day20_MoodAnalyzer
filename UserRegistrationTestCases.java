package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTestCases {

    UserRegistration userRegistration = new UserRegistration();

    @Test
    public void whenGivenLasttNameWith1stCapitalLetter_shouldReturnTrue() {

        boolean validationStatus = userRegistration.validateLastName("Chaudhari");
        Assert.assertEquals(true, validationStatus);
    }

    @Test
    public void whenGivenLastNameWith1stLetterNotCapital_shouldReturnFalse() {

        boolean validationStatus = userRegistration.validateLastName("chaudhari");
        Assert.assertEquals(false, validationStatus);
    }

    @Test
    public void whenGivenLastNameContainNumericValue_shouldReturnFalse() {

        boolean validationStatus = userRegistration.validateLastName("Chaudhari17");
        Assert.assertEquals(false, validationStatus);
    }

    @Test
    public void whenGivenLastNameContainSpecialCharacter_shouldReturnFalse() {

        boolean validationStatus = userRegistration.validateLastName("Chaudhari@17");
        Assert.assertEquals(false, validationStatus);
    }

    @Test
    public void whenGivenLastNameIsLessThan3Characters_shouldReturnFalse() {

        boolean validationStatus = userRegistration.validateLastName("Ch");
        Assert.assertEquals(false, validationStatus);
    }
}