package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTestCases {

    UserRegistration userRegistration = new UserRegistration();

    @Test
    public void whenGivenFirstNameWith1stCapitalLetter_shouldReturnTrue() {

        boolean validationStatus = userRegistration.validateFirstName("Toshita");
        Assert.assertEquals(true, validationStatus);
    }

    @Test
    public void whenGivenFirstNameWith1stLetterNotCapital_shouldReturnFalse() {

        boolean validationStatus = userRegistration.validateFirstName("toshita");
        Assert.assertEquals(false, validationStatus);
    }

    @Test
    public void whenGivenFirstNameContainNumericValue_shouldReturnFalse() {

        boolean validationStatus = userRegistration.validateFirstName("Toshita17");
        Assert.assertEquals(false, validationStatus);
    }

    @Test
    public void whenGivenFirstNameContainSpecialCharacter_shouldReturnFalse() {

        boolean validationStatus = userRegistration.validateFirstName("Toshita@17");
        Assert.assertEquals(false, validationStatus);
    }

    @Test
    public void whenGivenFirstNameIsLessThan3Characters_shouldReturnFalse() {

        boolean validationStatus = userRegistration.validateFirstName("To");
        Assert.assertEquals(false, validationStatus);
    }
}