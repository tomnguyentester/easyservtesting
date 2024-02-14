package com.easyserv.testcases.Admin;

import com.easyserv.common.BaseSetup;
import com.easyserv.common.ValidateHelper;
import com.easyserv.dataprovider.EasyServ.DataLoginMoto;
import com.easyserv.pages.AdminPortalPages.StoreManagement.StoreManaListPage;
import com.easyserv.pages.AdminPortalPages.UserManagement.UserManaListPage;
import net.datafaker.Faker;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.Locale;

public class StoreManaListTest extends BaseSetup {
    private WebDriver driver;
    private StoreManaListPage storeManaListPage;
    private ValidateHelper validateHelper;

    Faker faker = new Faker(new Locale("AUS"));
    String name_ = faker.name().firstName();
    String procode_ = "PRO"+faker.number().digit();
    String job_ = faker.job().position();
    String emailAdd_ = name_.toLowerCase() +"@gmail.com";
    String mobiphone_ = "03"+ faker.phoneNumber().subscriberNumber(8);
    String address_ = faker.address().streetAddress();

    @BeforeClass
    public void setup() {
        driver = getDriver();
        storeManaListPage = new StoreManaListPage(driver);
        validateHelper = new ValidateHelper(driver);
    }

    @Test(priority = 1, description = "Verify that system will jump to \"Store Management\" list success  _011", dataProvider = "AccountInfo", dataProviderClass = DataLoginMoto.class)
    public void StoreManaListTest_TC001(String email, String password) {
        storeManaListPage.StoreManaList_TC001(email,password);
        Assert.assertEquals(storeManaListPage.verifyStoreManaHeader(),"Store Management");
    }

    @Test(priority = 2, description = "Verify the system in case the user search with value valid \"Name\" _012", dataProvider = "AccountInfo", dataProviderClass = DataLoginMoto.class)
    public void StoreManaListTest_TC002(String email, String password) {
        storeManaListPage.StoreManaList_TC002(email,password,"Kotara");
        Assert.assertEquals(storeManaListPage.verifyStoreNamecol(),"Kotara");
    }

    @Test(priority = 3, description = "Verify the system in case the user search with value valid \"Phone\" _012", dataProvider = "AccountInfo", dataProviderClass = DataLoginMoto.class)
    public void StoreManaListTest_TC003(String email, String password) {
        storeManaListPage.StoreManaList_TC003(email,password,"0249410899");
        Assert.assertEquals(storeManaListPage.verifyPhoneNumcol(),"02 4941 0899");
    }

    @Test(priority = 4, description = "Verify that the default count of the pagination should be selected. _019", dataProvider = "AccountInfo", dataProviderClass = DataLoginMoto.class)
    public void StoreManaListTest_TC004(String email, String password) {
        storeManaListPage.StoreManaList_TC004(email,password);
        Assert.assertEquals(storeManaListPage.verifyTotalStore(),10);
    }

    @Test(priority = 5, description = "Verify that system in case the user click on \"Add Store\" button _020", dataProvider = "AccountInfo", dataProviderClass = DataLoginMoto.class)
    public void StoreManaListTest_TC005(String email, String password) {
        storeManaListPage.StoreManaList_TC005(email,password);
        Assert.assertEquals(storeManaListPage.verifyStoreDetailHeader(),"Store Details");
    }

    @Test(priority = 6, description = "Verify validation message for \"Store Detail\" section in case The All field is blank  _021", dataProvider = "AccountInfo", dataProviderClass = DataLoginMoto.class)
    public void StoreManaListTest_TC006(String email, String password) {
        storeManaListPage.StoreManaList_TC006(email,password);
        Assert.assertEquals(storeManaListPage.verifyNameReqMess(),"The Name field is required");
        Assert.assertEquals(storeManaListPage.verifyPhoneReqMess(),"The Phone Number field is required");
        Assert.assertEquals(storeManaListPage.verifyEmailReqMess(),"The Email field is required");
        Assert.assertEquals(storeManaListPage.verifyAddressReqMess(),"The Address field is required");
        Assert.assertEquals(storeManaListPage.verifyPostCodeReqMess(),"The Postcode field is required");
        Assert.assertEquals(storeManaListPage.verifySubReqMess(),"The suburb field is required");
    }

    @Test(priority = 7, description = "Verify validation message for \"Store Detail\" section in case enter invalid for \"PhoneNumber/Email/Postcode\"  _021", dataProvider = "AccountInfo", dataProviderClass = DataLoginMoto.class)
    public void StoreManaListTest_TC007(String email, String password) {
        storeManaListPage.StoreManaList_TC007(email,password,"testing","testing","testing");
        Assert.assertEquals(storeManaListPage.verifyPhoneValidMess(),"Please add valid Phone Number.");
        Assert.assertEquals(storeManaListPage.verifyEmailValidMess(),"The email field must be a valid email");
        Assert.assertEquals(storeManaListPage.verifyPostcodeValidMess(),"No valid post code found.");
    }

    @Test(priority = 8, description = "Verify that the user can \"Create Store\" is success   _022", dataProvider = "AccountInfo", dataProviderClass = DataLoginMoto.class)
    public void StoreManaListTest_TC008(String email, String password) {
        storeManaListPage.StoreManaList_TC008(email,password,name_,mobiphone_,emailAdd_,address_,"2100");
    }

    @Test(priority = 9, description = "Verify system will clear all changes when the user click on \"Cancel\" button   _024", dataProvider = "AccountInfo", dataProviderClass = DataLoginMoto.class)
    public void StoreManaListTest_TC009(String email, String password) {
        storeManaListPage.StoreManaList_TC009(email,password,name_,mobiphone_,emailAdd_,address_,"2100");
        Assert.assertEquals(storeManaListPage.verifyStoreNameTextbox(),"");
        Assert.assertEquals(storeManaListPage.verifyPhoneTextbox(),"");
    }

    @Test(priority = 10, description = "Verify status \"Hide store on OSB\" checkbox   _024", dataProvider = "AccountInfo", dataProviderClass = DataLoginMoto.class)
    public void StoreManaListTest_TC010(String email, String password) {
        storeManaListPage.StoreManaList_TC010(email,password);
        Assert.assertTrue(storeManaListPage.verifyStatusHideStore());
    }

    @Test(priority = 11, description = "Verify UI \"Operating Hours\" Tab   _031", dataProvider = "AccountInfo", dataProviderClass = DataLoginMoto.class)
    public void StoreManaListTest_TC011(String email, String password) {
        storeManaListPage.StoreManaList_TC011(email,password);
        Assert.assertEquals(storeManaListPage.verifyGeneralScheduleTitle(),"General Schedule");
    }

    @Test(priority = 12, description = "Verify UI \"Promotion Codes\" Tab   _039", dataProvider = "AccountInfo", dataProviderClass = DataLoginMoto.class)
    public void StoreManaListTest_TC012(String email, String password) {
        storeManaListPage.StoreManaList_TC012(email,password);
        Assert.assertEquals(storeManaListPage.verifyPromotionManaTitle(),"Promotion Management");
    }

    @Test(priority = 13, description = "Verify the system in case the user search with \"NamePromo\"   _039", dataProvider = "AccountInfo", dataProviderClass = DataLoginMoto.class)
    public void StoreManaListTest_TC013(String email, String password) {
        storeManaListPage.StoreManaList_TC013(email,password,"Testing");
        Assert.assertEquals(storeManaListPage.verifySearchNamePro(),"Test");
    }

    @Test(priority = 14, description = "Verify the system in case the user search with \"PromoCode\"   _039", dataProvider = "AccountInfo", dataProviderClass = DataLoginMoto.class)
    public void StoreManaListTest_TC014(String email, String password) {
        storeManaListPage.StoreManaList_TC014(email,password,"Testing");
        Assert.assertEquals(storeManaListPage.verifySearchProCode(),"Testing");
    }

    @Test(priority = 15, description = "Verify the system in case the user search with \"PromoDescription\"   _039", dataProvider = "AccountInfo", dataProviderClass = DataLoginMoto.class)
    public void StoreManaListTest_TC015(String email, String password) {
        storeManaListPage.StoreManaList_TC015(email,password,"Hello everyone");
        Assert.assertEquals(storeManaListPage.verifySearchProDes(),"Hello everyone");
    }

    @Test(priority = 16, description = "Verify the system in case the user search with a invalid \"Name/ Description/ Promo Code\" _040", dataProvider = "AccountInfo", dataProviderClass = DataLoginMoto.class)
    public void StoreManaListTest_TC016(String email, String password) {
        storeManaListPage.StoreManaList_TC016(email,password,"Dog");
        Assert.assertEquals(storeManaListPage.verifySearchNoData(),"No data");
    }

    @Test(priority = 17, description = "Verify UI filter \"Promo Code\" _040", dataProvider = "AccountInfo", dataProviderClass = DataLoginMoto.class)
    public void StoreManaListTest_TC017(String email, String password) {
        storeManaListPage.StoreManaList_TC017(email,password);
        Assert.assertEquals(storeManaListPage.verifyFilterHeader(),"Filters");
        Assert.assertTrue(storeManaListPage.verifyStatusApplyButton());
        Assert.assertTrue(storeManaListPage.verifyStatusClearAllButton());
    }

    @Test(priority = 18, description = "Verify validation message in case  \"Promo Code\" is blank _050", dataProvider = "AccountInfo", dataProviderClass = DataLoginMoto.class)
    public void StoreManaListTest_TC018(String email, String password) {
        storeManaListPage.StoreManaList_TC018(email,password,"test","teting by SS team");
        Assert.assertEquals(storeManaListPage.verifyProCodeReqMess(),"The Promo Code field is required");
    }

    @Test(priority = 19, description = "Verify validation message in case  \"Name\" is blank _050", dataProvider = "AccountInfo", dataProviderClass = DataLoginMoto.class)
    public void StoreManaListTest_TC019(String email, String password) {
        storeManaListPage.StoreManaList_TC019(email,password,"test","teting by SS team");
        Assert.assertEquals(storeManaListPage.verifyProNameReqMess(),"The Name field is required");
    }

    @Test(priority = 20, description = "Verify Add ProCode is success _050", dataProvider = "AccountInfo", dataProviderClass = DataLoginMoto.class)
    public void StoreManaListTest_TC020(String email, String password) {
        storeManaListPage.StoreManaList_TC020(email,password,name_,procode_,"testing by sss");
        Assert.assertEquals(storeManaListPage.verifyAddProSuccess(),"Create successful");
    }

    @Test(priority = 21, description = "Verify UI Pakage Categories tab _052", dataProvider = "AccountInfo", dataProviderClass = DataLoginMoto.class)
    public void StoreManaListTest_TC021(String email, String password) {
        storeManaListPage.StoreManaList_TC021(email,password);
        Assert.assertEquals(storeManaListPage.verifyServiceTitle(),"Service");
        Assert.assertEquals(storeManaListPage.verifyRepairTitle(),"Repairs");
        Assert.assertEquals(storeManaListPage.verifyInspecTitle(),"Inspections");
        Assert.assertEquals(storeManaListPage.verifyOthersTitle(),"Others");
    }

    @Test(priority = 22, description = "Verify UI Capacity Settings tab _057", dataProvider = "AccountInfo", dataProviderClass = DataLoginMoto.class)
    public void StoreManaListTest_TC022(String email, String password) {
        storeManaListPage.StoreManaList_TC022(email,password);
        Assert.assertEquals(storeManaListPage.verifyCapaSettingTitle(),"Capacity Setting");
    }





}
