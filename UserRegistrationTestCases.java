package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTestCases {

    UserRegistration userRegistration = new UserRegistration();

    @Test
    public void whenGivenEmailWithSpecialCharactersAtProperPlaces_shouldReturnTrue() {

        boolean validationStatus = userRegistration.validateEmail("chaudharitoshita@gmail.com");
        Assert.assertEquals(true, validationStatus);
    }

    @Test
    public void whenGivenEmailWithSpecialCharactersNotAtProperPlaces_shouldReturnFalse() {
        boolean validationStatus = userRegistration.validateEmail("chaudhari123gmailcom");
        Assert.assertEquals(false, validationStatus);
    }

}
