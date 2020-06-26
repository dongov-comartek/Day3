package Ex3.questons;

import Ex3.ui.TikiScreen;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class SKU implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return TikiScreen.SKU_FIELD.resolveFor(actor).isVisible();
    }
}
