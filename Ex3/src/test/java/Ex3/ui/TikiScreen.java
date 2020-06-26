package Ex3.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class TikiScreen {
    public static Target MENU_BUTTON = Target.the("danh muc button")
            .located(By.xpath("(//*[@text=\"Danh mục\"])[1]"));
    public static Target INTERNATIONAL_BUTTON = Target.the("International Goods button")
            .located(By.xpath("(//*[@text=\"Hàng Quốc Tế\"])[1]"));
    public static Target LAPTOP_PC_BUTTON = Target.the("laptop & pc button")
            .located(By.xpath("//*[@text='Laptop & Máy Vi Tính']"));
    public static Target LITS_ITEMS_FIELD = Target.the("list items field")
            .located(By.id("vn.tiki.app.tikiandroid:id/vContainer"));
    public static Target CATEGORY_BUTTON = Target.the("category field")
            .located(By.xpath("//*[@text='Danh mục']"));
    public static Target PROVIDED_BY_FIELD = Target.the("Provided  field")
            .located(By.xpath("//*[@text='Cung cấp bởi']"));
    public static Target TRADEMARK_FIELD = Target.the("trademark field")
            .located(By.xpath("//*[@text='Thương hiệu']"));
    public static Target SKU_FIELD = Target.the("sku field")
            .located(By.xpath("//*[@text='SKU']"));

}
