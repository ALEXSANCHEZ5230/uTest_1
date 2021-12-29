package model.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchCoursePage extends PageObject {
    public static final Target BUTTON_UC = Target.the("select uTest university")
            .located(By.xpath("//div[@class='nav-sidebar-item__text nav-sidebar-item__text--selected']"));
    public static final Target NAME_COURSE = Target.the("look for the course")
            .located(By.id("//h2[normalize-space()='5. Testing Basics']"));
    public static final Target BUTTON_GO = Target.the("click to search the course")
            .located(By.id("//a[@aria-label='Take Course - 5. Testing Basics']"));
    public static final Target SELECT_COURSE = Target.the("click to search the course")
            .located(By.xpath("//a[@aria-label='Take Course - 5. Testing Basics']"));
}
