package Ex3.questons;

import Ex3.ui.TikiScreen;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class Provided implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return TikiScreen.PROVIDED_BY_FIELD.resolveFor(actor).isVisible();
    }
}
