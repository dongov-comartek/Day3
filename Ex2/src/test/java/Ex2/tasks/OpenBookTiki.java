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
    @Override
    public <T extends Actor> void performAs(T actor) {
        while (TikiScreen.BOOK_HOME_BUTTON.resolveFor(actor).isVisible()==false) {
            actor.attemptsTo(
                    Swipe.on(TikiScreen.SCROLL_LEFT_BUTTON).DownLeft()
            );
        }
    }
    public static OpenBookTiki open() {
        return instrumented(OpenBookTiki.class);
    }
}
