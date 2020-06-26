package Ex2.tasks;

import Ex2.actions.Swipe;
import Ex2.ui.TikiScreen;
import io.appium.java_client.android.AndroidDriver;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.List;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OpenBookTiki implements Task {
    public static int totalItems = 0;


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(TikiScreen.MENU_BUTTON),
                Swipe.on(TikiScreen.SCROLL_LEFT_BUTTON).DownLeft(),
                Swipe.on(TikiScreen.SCROLL_LEFT_BUTTON).DownLeft(),
                Swipe.on(TikiScreen.SCROLL_LEFT_BUTTON).DownLeft(),
                Swipe.on(TikiScreen.SCROLL_LEFT_BUTTON).DownLeft(),
                Click.on(TikiScreen.BOOK_HOME_BUTTON),
                Swipe.on(TikiScreen.BOOK_HOME_BUTTON).DownCenter(),
                Swipe.on(TikiScreen.BOOK_HOME_BUTTON).DownCenter(),
                Click.on(TikiScreen.VIEW_ALL_BUTTON)
        );
        List<WebElementFacade> lsitems = TikiScreen.LITS_ITEMS_FIELD.resolveAllFor(actor);

        totalItems = lsitems.size();
    }

    public static OpenBookTiki open() {
        return instrumented(OpenBookTiki.class);
    }
}
