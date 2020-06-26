package Ex3.questons;

import Ex3.ui.TikiScreen;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class Trademark implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return TikiScreen.TRADEMARK_FIELD.resolveFor(actor).isVisible();
    }
}
