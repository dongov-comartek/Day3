package Ex3.tasks;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static org.openqa.selenium.Keys.ENTER;

import Ex3.ui.TikiScreen;

import java.util.List;

public class OpenItems implements Task {
    int index=0;
    public void OpenItems(int index){
        this.index= index;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        List<WebElementFacade> lsItems = TikiScreen.LITS_ITEMS_FIELD.resolveAllFor(actor);
        actor.attemptsTo(
                Click.on(lsItems.get(this.index))
        );

    }
    public static OpenItems click(int index){
        return instrumented(OpenItems.class,index);
    }
}
