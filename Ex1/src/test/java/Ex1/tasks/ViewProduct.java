package Ex1.tasks;

import Ex1.actions.Swipe;
import Ex1.ui.TikiScreen;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ViewProduct implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(TikiScreen.MENU_BUTTON),
                Swipe.on(TikiScreen.CAMERA_BUTTON).DownLeft(),
                Click.on(TikiScreen.FASHION_BUTTON),
                Swipe.on(TikiScreen.FASHION_ACCESSORIES_BUTTON).DownCenter(),
                Swipe.on(TikiScreen.FASHION_ACCESSORIES_BUTTON).DownCenter(),
                Swipe.on(TikiScreen.FASHION_ACCESSORIES_BUTTON).DownCenter(),
                Click.on(TikiScreen.VIEW_ALL_BUTTON),
                Click.on(TikiScreen.JEWELRY_BUTTON),
                Click.on(TikiScreen.GOLD_BARS_BUTTON),
                OpenItems.click(0),
                Swipe.on(TikiScreen.CHOOSE_BUY_BUTTON).DownCenter(),
                Swipe.on(TikiScreen.CHOOSE_BUY_BUTTON).Up(),
                WaitUntil.the(TikiScreen.PRICE_FIELD, isVisible()).forNoMoreThan(60).seconds()
        );
    }
    public static ViewProduct open(){
        return instrumented(ViewProduct.class);
    }
}
