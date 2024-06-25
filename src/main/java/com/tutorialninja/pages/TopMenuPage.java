package com.tutorialninja.pages;

import com.tutorialninja.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class TopMenuPage extends Utility {
    private static final Logger log = LogManager.getLogger(TopMenuPage.class.getName());

    @CacheLookup
    @FindBy(linkText = "Desktops")
    WebElement desktopTab;

    @CacheLookup
    @FindBy
    public By topMenu = By.cssSelector(".collapse.navbar-collapse.navbar-ex1-collapse");

    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'Desktops')]")
    WebElement desktopText;

    @CacheLookup
    @FindBy(linkText = "Laptops & Notebooks")
    WebElement laptopsAndNotebooksTab;

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Laptops & Notebooks']")
    WebElement laptopsAndNotebooksText;

    @CacheLookup
    @FindBy(linkText = "Components")
    WebElement componentsTab;

    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'Components')]")
    WebElement componentsText;


    public void selectMenu(String menu) {
        List<WebElement> topMenuList = driver.findElements(By.xpath("//nav[@id='menu']//ul/li[contains(@class, 'open')]/div/child::*"));
        try {
            for (WebElement element : topMenuList) {
                if (element.getText().equalsIgnoreCase(menu)) {
                    element.click();
                }
            }
        } catch (StaleElementReferenceException e) {
            topMenuList = driver.findElements(By.xpath("//nav[@id='menu']//ul/li[contains(@class, 'open')]/div/child::*"));
        }
    }

    public void mouseHoverToElementAndClickOnDesktop() {
        log.info(" Mousehover and Click on desktop " + desktopTab.toString());
        mouseHoverToElementAndClick(desktopTab);
    }

    public String getTextDesktop() {
        log.info("get Text Desktop" + desktopText.toString());
        return getTextFromElement(desktopText);
    }

    public void mouseHoverOnLaptopsAndNotebooksTab() {
        log.info("mouseHoverOnLaptopsAndNotebooksTab" + laptopsAndNotebooksTab.toString());
        mouseHoverToElementAndClick(laptopsAndNotebooksTab);
    }

    public String getLaptopsAndNotebooksText() {
        log.info("getLaptopsAndNotebooksText" + laptopsAndNotebooksText.toString());
        return getTextFromElement(laptopsAndNotebooksText);
    }

    public void mouseHoverToComponentsTab() {
        log.info("mouseHoverToComponentsTab" + componentsTab.toString());
        mouseHoverToElementAndClick(componentsTab);
    }

    public String getComponentsText() {
        log.info("getComponentsText" + componentsText.toString());
        return getTextFromElement(componentsText);
    }
}
