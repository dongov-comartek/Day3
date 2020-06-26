package Ex2.tasks;

import Ex2.actions.Swipe;
import Ex2.ui.TikiScreen;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import java.util.List;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CountItems implements Task {
    public static int totalItems =0;

    @Override
    public <T extends Actor> void performAs(T actor) {

            List<WebElementFacade> lsitems = TikiScreen.LITS_ITEMS_FIELD.resolveAllFor(actor);
        int totalItems1=lsitems.size();
        for (int i = 0;i <24;i++){
            actor.attemptsTo(
                    Swipe.on(TikiScreen.BOOK_HOME_BUTTON).DownCenter()
            );

            totalItems=totalItems1+ lsitems.size();

        }
    }
    public static CountItems check() {
        return instrumented(CountItems.class);
    }
}
