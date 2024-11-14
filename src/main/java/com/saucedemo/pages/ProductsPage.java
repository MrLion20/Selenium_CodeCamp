package com.saucedemo.pages;

import org.openqa.selenium.By;

public class ProductsPage extends BasePage{
    private By productHeader = By.xpath("//span[text()='Products']");

    public boolean isProductsHeaderDisplayed(){
        return find(productHeader).isDisplayed();
    }
}
