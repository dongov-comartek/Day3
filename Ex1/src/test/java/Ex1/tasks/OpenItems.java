package Ex1.tasks;

import Ex1.actions.Swipe;
import Ex1.ui.TikiScreen;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.conditions.Check;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.List;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class OpenItems implements Task {

    int index=0;
    public OpenItems(int index){this.index=index;}
    @Override
    public <T extends Actor> void performAs(T actor) {
        List<WebElementFacade> lsItems =TikiScreen.LITS_ITEMS_FIELD.resolveAllFor(actor);
        actor.attemptsTo(

                Click.on(lsItems.get(this.index))
        );
    }

    public static OpenItems click(int index) {
        return instrumented(OpenItems.class,index);
    }
}
