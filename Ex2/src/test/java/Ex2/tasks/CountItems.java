package Ex2.tasks;

import Ex2.actions.Swipe;
import Ex2.ui.TikiScreen;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import java.util.List;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CountItems implements Task {
    public static int totalItems = 0;

    @Override
    public <T extends Actor> void performAs(T actor) {
        while (TikiScreen.NORMAL_BOOK_FIELD.resolveFor(actor).isVisible() == false) {
            actor.attemptsTo(
                    Swipe.on(TikiScreen.BOOK_HOME_BUTTON).DownCenter()
            );
            List<WebElementFacade> lsitems = TikiScreen.LITS_ITEMS_FIELD.resolveAllFor(actor);
            totalItems = totalItems + lsitems.size()-2;
        }
    }

    public static CountItems check() {
        return instrumented(CountItems.class);
    }
}