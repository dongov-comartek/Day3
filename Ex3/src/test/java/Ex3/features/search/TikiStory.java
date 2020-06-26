package Ex3.features.search;

import Ex3.questons.TheResults;
import Ex3.tasks.Items;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.questions.page.TheWebPage;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import Ex3.tasks.OpenItems;

import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static net.serenitybdd.screenplay.EventualConsequence.eventually;
import static org.hamcrest.Matchers.*;

@RunWith(SerenityRunner.class)
public class TikiStory {

    Actor anna = Actor.named("Anna");

    @Managed(driver = "appium")
    public WebDriver herBrowser;

    @Before
    public void annaCanBrowseTheWeb() {
        anna.can(BrowseTheWeb.with(herBrowser));
    }

    @Test
    public void scroll_items_after_verify_infor_items() {
        anna.attemptsTo(
                Items.open()
        );
        anna.should(
                seeThat(TheResults.verifyCategory(),equalTo(true)),
                seeThat(TheResults.verifyProvided(),equalTo(true)),
                seeThat(TheResults.verifySKU(),equalTo(true)),
                seeThat(TheResults.verifyTrademark(),equalTo(true))
        );
    }
}