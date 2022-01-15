package com.test;

import java.util.Arrays;
import java.util.Collection;

import com.regex.UserRegistrationException;
import com.regex.ValidateUserInfo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class EmailIdTest {
    private String emailIds;
    private String expectedResult;

    public EmailIdTest(String emailIds, String expectedResult) {
        this.emailIds = emailIds;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Collection mailIdsExpectedResult() {
        return Arrays.asList(new Object[][]{
                {"abc@yahoo.com", "E-Mail Matches"},
                {"abc-100@yahoo.com", "E-Mail Matches"},
                {"abc.100@yahoo.com", "E-Mail Matches"},
                {"abc111@abc.com", "E-Mail Matches"},
                {"abc-100@abc.net", "E-Mail Matches"},
                {"abc.100@abc.com.au", "E-Mail Matches"},
                {"abc@1.com", "E-Mail Matches"},
                {"abc@gmail.com.com", "E-Mail Matches"},
                {"abc+100@gmail.com", "E-Mail Matches"},
                {"abc", "Not Matched"},
                {"abc@.com.my", "Not Matched"},
                {"abc123@gmail.a", "Not Matched"},
                {"abc123@.com", "Not Matched"},
                {"abc123@.com.com", "Not Matched"},
                {".abc@abc.com", "Not Matched"},
                {"abc()*@gmail.com", "Not Matched"},
                {"abc@%*.com", "Not Matched"},
                {"abc..2002@gmail.com", "Not Matched"},
                {"abc.@gmail.com", "Not Matched"},
                {"abc@abc@gmail.com", "Not Matched"},
                {"abc@gmail.com.1a", "Not Matched"},
                {"abc@gmail.com.aa.au", "Not Matched"},
        });
    }

    @Test
    public void TestEmailIds() throws UserRegistrationException {
        try {
            ValidateUserInfo testEmail = new ValidateUserInfo();
            String result = testEmail.emailId(this.emailIds);
            Assert.assertEquals(this.expectedResult, result);
        } catch ( UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.INVALID_EMAIL_ID, e.type);
        }
    }
}
