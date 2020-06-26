package Ex1.questions;

import net.serenitybdd.screenplay.Question;

public class TheRusults {
    public static Question<Boolean> verifyPrice(){
        return new Price();
    }
    public static Question<Boolean> verifyNameProduct(){
        return new NameProduct();
    }
    public static Question<Boolean> verifyImageProduct(){
        return new ImageProduct();
    }
    public static Question<Boolean> verifyChooseBuy(){
        return new ChooseBuy();
    }
}
