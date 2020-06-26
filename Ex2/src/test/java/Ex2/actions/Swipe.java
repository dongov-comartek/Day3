package Ex2.actions;

import Ex2.platform.AppiumObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Swipe extends AppiumObject implements Interaction {
    public enum Direction {
        DOWNLEFT, UP, LEFT, RIGHT,DOWNCENTER;

        @Override
        public String toString() {
            return super.toString().toLowerCase();
        }
    }

    Direction direction;
    Target Element;

    public Swipe(Target element, Direction direction) {
        this.Element = element;
        this.direction = direction;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        switch (this.direction) {
            case UP:
                this.swipeUp(this.Element, actor);
                break;
            case DOWNLEFT:
                this.swipeDownLeft(actor);
                break;
            case DOWNCENTER:
                this.swipeDownCenter(actor);
                break;

        }
    }

    public static SwipeBuilder on(Target element) {
        return new SwipeBuilder(element);
    }

    public static class SwipeBuilder {
        private Target Element;

        public SwipeBuilder(Target element) {
            this.Element = element;
        }

        public Interaction Up() {
            return instrumented(Swipe.class, this.Element, Direction.UP);
        }
        public Interaction DownCenter() {
            return instrumented(Swipe.class, this.Element, Direction.DOWNCENTER);
        }
        public Interaction DownLeft() {
            return instrumented(Swipe.class, this.Element, Direction.DOWNLEFT);
        }


        public Interaction Left() {
            return instrumented(Swipe.class, this.Element, Direction.LEFT);
        }

        public Interaction Right() {
            return instrumented(Swipe.class, this.Element, Direction.RIGHT);
        }
    }
}

