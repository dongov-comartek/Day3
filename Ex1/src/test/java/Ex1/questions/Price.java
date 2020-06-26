package Ex1.questions;

import Ex1.ui.TikiScreen;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class Price implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return TikiScreen.PRICE_FIELD.resolveFor(actor).isVisible();
    }
}
