package Ex2.questions;

import Ex2.tasks.CountItems;
import Ex2.tasks.OpenBookTiki;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;



public class verifyItemsProducts implements Question<Integer> {

    @Override
    public Integer answeredBy(Actor actor) {

        return CountItems.totalItems;
    }

}
