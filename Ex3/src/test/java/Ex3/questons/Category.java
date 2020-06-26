package Ex3.questons;

import Ex3.ui.TikiScreen;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class Category implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return TikiScreen.CATEGORY_BUTTON.resolveFor(actor).isVisible();
    }
}
