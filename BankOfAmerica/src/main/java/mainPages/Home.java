package mainPages;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Home extends CommonAPI{
    @FindBy(css = "#NAV_PERSONAL")
    public static WebElement personalHomeButton;

    @FindBy(css = "#NAV_BUSINESS_ADVANTAGE")
    public static WebElement smallBusinessButton;

    @FindBy(css = "#NAV_WEALTH_MANAGEMENT")
    public static WebElement wealthManageHomeButton;

    @FindBy(css = "#NAV_BUSINESS_INSTITUTIONS")
    public static WebElement businessInstitutionsHomebtn;

    @FindBy(css = "#NAV_ABOUT_US")
    public static WebElement aboutUsHomeButton;

    @FindBy(xpath = "//*[@id='navChecking']/span[2]")
    public static WebElement checkingHomeButton;

    @FindBy(css = "#navSavings .title")
    public static WebElement savingHomeButton;

    @FindBy(css = "#navCreditCards .title")
    public static WebElement creditCardsHomeButton;

    @FindBy(css = "#navHomeLoans .title")
    public static WebElement homeLoanHomeButton;

    @FindBy(css = "#navAutoLoans .title")
    public static WebElement investingHomeButton;

    @FindBy(css = "#navBetterMoneyHabits span.title")
    public static WebElement betterMoneyHabitsHomeButton;

    @FindBy(css = "#nav-search-query")
    public static WebElement searchHomeButton;

    @FindBy(css = "#NAV_CONTACT_US")
    public static WebElement contactUsHomeButton;

    @FindBy(css = "#NAV_HELP")
    public static WebElement helpHomeButton;

    @FindBy(css = "#onlineId1")
    public static WebElement signInOnlineID;

    @FindBy(css = "#passcode1")
    public static WebElement passcodeHomeButton;

    @FindBy(css = "#saveOnlineId")
    public static WebElement saveOnlineIdCheckBox;

    @FindBy(xpath = "//*[@id=\"searchStub\"]//div[4]/h3/span")
    public static WebElement mobileapp;

    @FindBy(css = "#btnCompareCreditCards")
    public static WebElement shopAllcreditCards;

    @FindBy(css = "#cashRewardsCards")
    public static WebElement cashRewards;

    @FindBy(css = "//*[@id=\"travelRewardsCards\"]")
    public static WebElement travelnAirlicenseRewards;

    @FindBy(css = "#personalCreditCards")
    public static WebElement personalCreditCard;


    public boolean isPersonalTextLinkenable() {
        boolean personal = personalHomeButton.isEnabled();
        return personal;
    }

    public boolean isSmallBusinessbtnenable() {
        boolean smBusiness = smallBusinessButton.isEnabled();
        return smBusiness;
    }

    public boolean isWealthManagementbtnEnabled() {
        boolean weamanage = wealthManageHomeButton.isEnabled();
        return weamanage;
    }

    public boolean isBussnessInstbtnEnabled() {
        boolean busIns = businessInstitutionsHomebtn.isEnabled();
        return busIns;
    }

    public boolean isAboutusbtnEnabled() {
        boolean about = aboutUsHomeButton.isEnabled();
        return about;
    }


    public boolean isCheckingHomebtnEnabled() {
        boolean checking = checkingHomeButton.isEnabled();
        return checking;
    }

    public boolean isAboutbtnEnabled() {
        boolean about = aboutUsHomeButton.isEnabled();
        return about;
    }

    public boolean isSavingbtnEnabled() {
        boolean saving = savingHomeButton.isEnabled();
        return saving;
    }

    public boolean isHomeloansbtnEnabled() {
        boolean hmloan = homeLoanHomeButton.isEnabled();
        return hmloan;
    }

    public boolean isInvestbtnEnabled() {
        boolean invest = investingHomeButton.isEnabled();
        return invest;
    }

    public boolean isBettMoneyHabitsbtnEnabled() {
        boolean moneyHbt = betterMoneyHabitsHomeButton.isEnabled();
        return moneyHbt;
    }

    public boolean isSearchBarEnabled() {
        boolean search = searchHomeButton.isEnabled();
        return search;

    }

    public void clickChecking() {
        checkingHomeButton.click();
    }

    public void clickSaving() {
        savingHomeButton.click();
    }

    public void clickCreditCards() {
        creditCardsHomeButton.click();
    }


    public void searchHome() {
        searchHomeButton.sendKeys("mobile banking", Keys.ENTER);
    }

    public String mobileApplication() {
        String text = mobileapp.getText();
        return text;

    }

    public void creditCardApply() {
        creditCardsHomeButton.click();
        shopAllcreditCards.click();
        navigateForward();
    }

}
