package Ex1.questions;

import Ex1.ui.TikiScreen;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class NameProduct implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return TikiScreen.NAME_PRODUCT_FIELD.resolveFor(actor).isVisible();
    }
}
