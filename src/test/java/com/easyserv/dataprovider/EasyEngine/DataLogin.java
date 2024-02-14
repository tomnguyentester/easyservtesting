package com.easyserv.dataprovider.EasyEngine;

import org.testng.annotations.DataProvider;

public class DataLogin {
    @DataProvider(name = "EmailInvalid")
    public Object[][] dataEmail() {
        return new Object[][]{
                {
                        "thaidnjf@.com"
                },
                {
                        "@.com"
                },
                {
                        "thaidnjf@"
                },
                {
                        "thaidnjf@com"
                },
        };
    }

    @DataProvider(name = "AccountInfo")
    public Object[][] dataAccount() {
        return new Object[][]{
                {
                        "trungnguyen@gmail.com",
                        "Testing123@"
                }
        };
    }

    @DataProvider(name = "AccountOneDepart")
    public Object[][] dataAccountWithDepart() {
        return new Object[][]{
                {
                        "admin@example.com",
                        "12345678"
                }
        };
    }

    @DataProvider(name = "NewPass")
    public Object[][] dataNewPass() {
        return new Object[][]{
                {"1"},{"1a"},{"1e2"},{"1%*"},{"1yt 9"}
        };
    }

    @DataProvider(name = "MobileInvalid")
    public Object[][] dataMobile() {
        return new Object[][]{
                {
                        "09abc123yh"
                },
                {
                        "09 456 123"
                },
                {
                        "09$456&123"
                },
                {
                        "09$ abc &1"
                },
        };
    }
}
