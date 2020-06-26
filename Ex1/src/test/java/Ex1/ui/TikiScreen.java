package Ex1.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class TikiScreen {
    public static Target MENU_BUTTON = Target.the("danh muc button")
            .located(By.xpath("(//*[@text=\"Danh mục\"])[1]"));
    public static Target SCROLL_LEFT_BUTTON = Target.the("scroll left button")
            .located(By.id("vn.tiki.app.tikiandroid.category2:id/ervLeft"));
    public static Target FASHION_BUTTON = Target.the("fashion button")
            .located(By.xpath("(//*[@text=\"Thời Trang\"])[1]"));
    public static Target CAMERA_BUTTON = Target.the("Camera button")
            .located(By.xpath("//*[@text=\"Máy Ảnh - Máy Quay Phim\"]"));
    public static Target FASHION_ACCESSORIES_BUTTON = Target.the("fashion accessories button")
            .located(By.xpath("//*[@text='Phụ kiện thời trang']"));
    public static Target VIEW_ALL_BUTTON = Target.the("view all button")
            .located(By.xpath("//*[@text='TẤT CẢ']"));
    public static Target JEWELRY_BUTTON = Target.the("Jewelry button")
            .located(By.xpath("//*[@text='Trang sức']"));
    public static Target GOLD_BARS_BUTTON = Target.the("Gold bars button")
            .located(By.xpath("//*[@text='Vàng miếng']"));
    public static Target LITS_ITEMS_FIELD = Target.the("list items field")
            .located(By.id("vn.tiki.app.tikiandroid:id/vContainer"));
    public static Target IMAGE_PRODUCT_FIELD = Target.the("product image field")
            .located(By.id("vn.tiki.app.tikiandroid.productDetail2:id/ivPhoto"));
    public static Target NAME_PRODUCT_FIELD = Target.the("product name field")
            .located(By.xpath("//*[contains(@text,'Mặt mạ vàng 24K Phật 12 Con Giáp cầu bình an')]"));
    public static Target PRICE_FIELD = Target.the("price field")
            .located(By.id("vn.tiki.app.tikiandroid.productDetail2:id/tvPrice"));
    public static Target CHOOSE_BUY_BUTTON = Target.the("choose to buy button")
            .located(By.id("vn.tiki.app.tikiandroid:id/button"));
}
