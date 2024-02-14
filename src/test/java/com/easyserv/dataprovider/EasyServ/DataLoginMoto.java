package com.easyserv.dataprovider.EasyServ;

import org.testng.annotations.DataProvider;

public class DataLoginMoto {
    @DataProvider(name = "AccountInfo")
    public Object[][] dataAccount() {
        return new Object[][]{
                {
                        "admin@example.com",
                        "12345678"
                }
        };
    }
}
