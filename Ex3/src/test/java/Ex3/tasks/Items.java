package Ex3.tasks;

import Ex3.actions.Swipe;
import Ex3.ui.TikiScreen;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Items implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(TikiScreen.MENU_BUTTON),
                Swipe.on(TikiScreen.INTERNATIONAL_BUTTON).DownLeft(),
                Swipe.on(TikiScreen.INTERNATIONAL_BUTTON).DownLeft(),
                Click.on(TikiScreen.INTERNATIONAL_BUTTON),
                Swipe.on(TikiScreen.INTERNATIONAL_BUTTON).DownCenter(),
                Swipe.on(TikiScreen.INTERNATIONAL_BUTTON).DownCenter(),
                Swipe.on(TikiScreen.INTERNATIONAL_BUTTON).DownCenter(),
                Swipe.on(TikiScreen.INTERNATIONAL_BUTTON).DownCenter(),
                Click.on(TikiScreen.LAPTOP_PC_BUTTON),
                Swipe.on(TikiScreen.INTERNATIONAL_BUTTON).DownCenter(),
                OpenItems.click(0),
                Swipe.on(TikiScreen.INTERNATIONAL_BUTTON).DownCenter(),
                Swipe.on(TikiScreen.INTERNATIONAL_BUTTON).DownCenter(),
                Swipe.on(TikiScreen.INTERNATIONAL_BUTTON).DownCenter(),
                Swipe.on(TikiScreen.INTERNATIONAL_BUTTON).DownCenter()

        );

    }
    public static Items open(){
        return instrumented(Items.class);
    }
}
