package RAID;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.util.Duration;

public class Rectangles extends Rectangle {

	int index;
	// public static List<Rectangles> arrMove = Raid0.arrMove;

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public Rectangles() {
		super();

		super.setWidth(100);
		super.setHeight(20);
		super.setFill(Color.WHITE);

		super.setStroke(Color.BLACK);
		super.setStrokeWidth(.4);

	}

	public Timeline moveTo(double destinationX, double destinationY, double height, double width, double speed) {

		double originX = this.getLayoutX();
		double originY = this.getLayoutY();
		double moveX = destinationX - originX;
		double moveY = destinationY - originY;

		Timeline animation = new Timeline(new KeyFrame(Duration.millis(speed), e -> {

			this.setLayoutX(this.getLayoutX() + moveX / 1000);
			this.setLayoutY(this.getLayoutY() + moveY / 1000);
			this.setHeight(height);
			this.setWidth(width);
			this.setFill(Color.RED);

		}));
		animation.setCycleCount(1000);
		return animation;
	}

}
