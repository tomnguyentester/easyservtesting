package com.easyserv.dataprovider;

import org.testng.annotations.DataProvider;

public class DataBookingService {
    @DataProvider(name = "data_enqiry_1")
    public Object[][] dataEnquiry() {
        return new Object[][]{
                {
                        "Testing by SS team 11111111111111111111111111111111",
                        "Testing by SS team 11111111111111111111111111111111",
                        "0909789789789789789789",
                        "testing@gmail.commmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm",
                        "123"
                },
                {
                        "Testing by SS team Testing by SS team Testing by SS team",
                        "Testing by SS team Testing by SS team Testing by SS team",
                        "0909789789789789789789",
                        "testing@gmail.commmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm",
                        "21"
                }
        };
    }

    @DataProvider(name = "data_enqiry_2")
    public Object[][] dataInvalidEnquiry() {
        return new Object[][]{
                {
                        "test", "test", "testing by ss team", "test"
                },
                {
                        "123456", "testing@", "testing by ss team", "123A"
                }
        };
    }

    @DataProvider(name = "data_enqiry_3")
    public Object[][] dataValidEnquiry() {
        return new Object[][]{
                {
                        "Tom",
                        "Testing",
                        "0938669499",
                        "tomtesting499@gmail.com",
                        "2100",
                        "Testing by SS Team.........."
                }
        };
    }

    @DataProvider(name = "data_store")
    public Object[][] dataStore() {
        return new Object[][]{
                {
                        "123456",
                        "Artarmon"
                }
        };
    }

    @DataProvider(name = "data_contact")
    public Object[][] dataContactDetail() {
        return new Object[][]{
                {
                        "123456",
                        "Artarmon",
                        "Testing by SS team 11111111111111111111111111111111",
                        "Testing by SS team 11111111111111111111111111111111",
                        "0909789789789789789789",
                        "testing@gmail.commmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm",
                        "123"
                }
        };
    }

    @DataProvider(name = "data_InvaContact")
    public Object[][] dataInvalidContact() {
        return new Object[][]{
                {
                        "123456",
                        "Artarmon",
                        "test",
                        "test",
                        "test"
                }
        };
    }

    @DataProvider(name = "data_ValidContact")
    public Object[][] dataValidContact() {
        return new Object[][]{
                {
                        "123456",
                        "Artarmon",
                        "tom",
                        "testing",
                        "0938669429",
                        "tomtesting@gmail.com",
                        "364 Cong Hoa",
                        "222 Australia",
                        "2100",
                        "2311",
                        "SiliconStack Comp.",
                        "test",
                        "Testing by SS Team 2023"
                }
        };
    }

    @DataProvider(name = "data_login")
    public Object[][] dataValidLogin() {
        return new Object[][]{
                {
                        "nguyentrungdtu@gmail.com",
                        "123456@"
                }
        };
    }

    @DataProvider(name = "dataInvalid_login")
    public Object[][] dataInvalidLogin() {
        return new Object[][]{
                {
                        "testing123@gmail.com",
                        "12345678"
                }
        };
    }

    @DataProvider(name = "dataMaxlength_login")
    public Object[][] dataMaxlengthLogin() {
        return new Object[][]{
                {
                        "nguyentrungdtu@gmail.com",
                        "123456789012345678900@"
                }
        };
    }

    @DataProvider(name = "dataEmail_login")
    public Object[][] dataEmailLogin() {
        return new Object[][]{
                {
                        "tom.nguyen@.com.au"
                },
                {
                        "tom.nguyen@siliconstack"
                },
                {
                        "tom.nguyensiliconstack.com.au"
                },
                {
                        "@siliconstack.com.au"
                }
        };
    }
    @DataProvider(name = "dataBlank_login")
    public Object[][] dataBlankLogin() {
        return new Object[][]{
                {
                        "",""
                },
                {
                        "tom.nguyen@siliconstack.com.au",""
                },
                {
                        "","12345678"
                }
        };
    }

    @DataProvider(name = "dataLength_SignUp")
    public Object[][] dataLengthSignUp() {
        return new Object[][]{
                {
                        "Tuyet Anh Tuyet Anh Tuyet Anh Tuyet Anh Tuyet Anh Tuyet Anh",
                        "Nguyễn Nguyễn Nguyễn Nguyễn Nguyễn Nguyễn Nguyễn Nguyễn",
                        "anh@gmail",
                        "ii7829u^%^hduheuiudwiojwio",
                        "123abc&^%a"
                }
        };
    }

    @DataProvider(name = "dataValid_SignUp")
    public Object[][] dataValidSignUp() {
        return new Object[][]{
                {
                        "Anh",
                        "Nguyễn",
                        "nttuyetanh091@gmail.com",
                        "8462$6xi0*2730j#@-ua",
                        "0939168559"
                }
        };
    }

    @DataProvider(name = "dataFormat_Email")
    public Object[][] dataEmailSignUp() {
        return new Object[][]{
                {
                        "Anh",
                        "Nguyễn",
                        "anh.com",
                },
                {
                        "Anh",
                        "Nguyễn",
                        "anhnguyen@.com",
                },
                {
                        "Anh",
                        "Nguyễn",
                        "anhnguyen@gmail.",
                }
        };
    }

    @DataProvider(name = "dataEmailExists_SignUp")
    public Object[][] dataEmailExistSignUp() {
        return new Object[][]{
                {
                        "Anh",
                        "Nguyễn",
                        "tuyetanh090711@gmail.com",
                        "8462$6xi0*2730j#@-ua",
                        "0939168559"
                }
        };
    }

    @DataProvider(name = "dataInvalidPhone_SignUp")
    public Object[][] dataInvalidPhoneSignUp() {
        return new Object[][]{
                {
                        "Anh",
                        "Nguyễn",
                        "tuyetanh090711@gmail.com",
                        "12345678",
                        "0939&%$65+"
                },
                {
                        "Anh",
                        "Nguyễn",
                        "tuyetanh090711@gmail.com",
                        "12345678",
                        "a79489dhyp"
                },
                {
                        "Anh",
                        "Nguyễn",
                        "tuyetanh090711@gmail.com",
                        "12345678",
                        "2746397654"
                },
                {
                        "Anh",
                        "Nguyễn",
                        "tuyetanh090711@gmail.com",
                        "12345678",
                        "06 39 7654"
                },
                {
                        "Anh",
                        "Nguyễn",
                        "tuyetanh090711@gmail.com",
                        "12345678",
                        "$6 39 7654"
                },
                {
                        "Anh",
                        "Nguyễn",
                        "tuyetanh090711@gmail.com",
                        "12345678",
                        "012345678"
                },
                {
                        "Anh",
                        "Nguyễn",
                        "tuyetanh090711@gmail.com",
                        "12345678",
                        "27463976544343434343"
                }
        };
    }
}
