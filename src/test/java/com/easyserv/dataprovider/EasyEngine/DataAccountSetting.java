package com.easyserv.dataprovider.EasyEngine;

import org.testng.annotations.DataProvider;

public class DataAccountSetting {
    @DataProvider(name = "PostCode")
    public Object[][] dataPostCode() {
        return new Object[][]{
                {
                        "trungnguyen@gmail.com",
                        "Testing123@",
                        "1acb"
                },
                {
                        "trungnguyen@gmail.com",
                        "Testing123@",
                        "1 60"
                },
                {
                        "trungnguyen@gmail.com",
                        "Testing123@",
                        "1$%5"
                },
                {
                        "trungnguyen@gmail.com",
                        "Testing123@",
                        "a% 9"
                },
        };
    }

    @DataProvider(name = "MobileNumber")
    public Object[][] dataMobileNumber() {
        return new Object[][]{
                {
                        "trungnguyen@gmail.com",
                        "Testing123@",
                        "(+84)9abc123yh"
                },
                {
                        "trungnguyen@gmail.com",
                        "Testing123@",
                        "(+84)9 456 123"
                },
                {
                        "trungnguyen@gmail.com",
                        "Testing123@",
                        "(+84)9$456&123"
                },
                {
                        "trungnguyen@gmail.com",
                        "Testing123@",
                        "(+84)9$ abc &1"
                },
        };
    }

    @DataProvider(name = "EmailAddress")
    public Object[][] dataEmailAddress() {
        return new Object[][]{
                {
                        "trungnguyen@gmail.com",
                        "Testing123@",
                        "thaidnjf@.com"
                },
                {
                        "trungnguyen@gmail.com",
                        "Testing123@",
                        "@.com"
                },
                {
                        "trungnguyen@gmail.com",
                        "Testing123@",
                        "thaidnjf@"
                },
                {
                        "trungnguyen@gmail.com",
                        "Testing123@",
                        "thaidnjf@com"
                },
        };
    }

    @DataProvider(name = "Mobile")
    public Object[][] dataMobile() {
        return new Object[][]{
                {
                        "trungnguyen@gmail.com",
                        "Testing123@",
                        "09abc123yh"
                },
                {
                        "trungnguyen@gmail.com",
                        "Testing123@",
                        "09 456 123"
                },
                {
                        "trungnguyen@gmail.com",
                        "Testing123@",
                        "09$456&123"
                },
                {
                        "trungnguyen@gmail.com",
                        "Testing123@",
                        "09$ abc &1"
                },
        };
    }
}
