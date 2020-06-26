package Ex1.features.search;

import Ex1.questions.TheRusults;
import Ex1.tasks.OpenItems;
import Ex1.tasks.ViewProduct;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItem;

@RunWith(SerenityRunner.class)
public class SearchByKeywordStory {
    Actor anna = Actor.named("Anna");
    @Managed(driver = "appium")
    public WebDriver herBrowser;
    @Before
    public void annaCanBrowseTheWeb() {
        anna.can(BrowseTheWeb.with(herBrowser));
    }
    @Test
    public void search_results_should_show_the_search_term_in_the_title() {
        anna.attemptsTo(
                ViewProduct.open()
        );
        anna.should(
                seeThat(TheRusults.verifyImageProduct(),equalTo(true)),
                seeThat(TheRusults.verifyNameProduct(),equalTo(true)),
                seeThat(TheRusults.verifyPrice(),equalTo(true)),
                seeThat(TheRusults.verifyChooseBuy(),equalTo(true))
        );
    }

}