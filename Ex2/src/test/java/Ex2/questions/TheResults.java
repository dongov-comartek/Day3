package Ex2.questions;

import net.serenitybdd.screenplay.Question;

public class TheResults {
    public static Question<Integer> verifyItems(){
        return new verifyItemsProducts();
    }
}
