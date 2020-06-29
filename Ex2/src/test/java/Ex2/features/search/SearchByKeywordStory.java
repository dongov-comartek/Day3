package Ex2.features.search;

import Ex2.questions.TheResults;
import Ex2.tasks.CountItems;
import Ex2.tasks.OpenBookTiki;
import Ex2.ui.TikiScreen;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.questions.page.TheWebPage;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static net.serenitybdd.screenplay.EventualConsequence.eventually;
import static org.hamcrest.Matchers.*;

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
                Click.on(TikiScreen.MENU_BUTTON),
                OpenBookTiki.open(),
                Click.on(TikiScreen.BOOK_HOME_BUTTON),
                Click.on(TikiScreen.VIEW_ALL_BUTTON),
                Click.on(TikiScreen.VIEW_MORE_BUTTON),
                CountItems.check()
        );
        anna.should(
                seeThat(TheResults.verifyItems(),equalTo(16))
        );
    }
}