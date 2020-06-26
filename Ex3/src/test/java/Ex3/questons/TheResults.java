package Ex3.questons;

import net.serenitybdd.screenplay.Question;

public class TheResults {
    public static Question<Boolean> verifyCategory(){
        return new Category();
    }
    public static Question<Boolean> verifyProvided(){
        return new Provided();
    }
    public static Question<Boolean> verifySKU(){
        return new SKU();
    }
    public static Question<Boolean> verifyTrademark(){
        return new Trademark();
    }
}
