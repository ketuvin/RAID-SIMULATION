package RAID;

import java.awt.Dimension;
import java.awt.Toolkit;

import RAID.Raid;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

public class Raid5 {

	private static Pane pane = Raid.pane;
	private static Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	@SuppressWarnings("unused")
	private static int screenWidth = (int) screenSize.getWidth();
	private static int screenHeight = (int) screenSize.getHeight();

	public static void createThreeDisksForTenBlocks() {

		int yIncrement = 0;
		for (int i = 0; i < 60; i++) {
			Rectangles rect = new Rectangles();
			if (i == 6) {
				rect.setIndex(i);
				i += 2;
				rect.setLayoutX(300);
				rect.setLayoutY(80 + yIncrement);
				rect.setWidth(100);
				rect.setHeight(20);
				rect.setFill(Color.rgb(191, 191, 191));
				rect.setStroke(Color.BLACK);
				rect.setStrokeWidth(2);
			} else {
				rect.setIndex(i);
				i += 2;
				rect.setLayoutX(300);
				rect.setLayoutY(80 + yIncrement);
				rect.setWidth(100);
				rect.setHeight(20);
				rect.setFill(Color.WHITE);
				rect.setStroke(Color.BLACK);
				rect.setStrokeWidth(2);
			}
			yIncrement += 20;
			Raid.raid0.add(rect);
			pane.getChildren().add(rect);

		}

		int y2Increment = 0;
		for (int i = 1; i < 60; i++) {
			Rectangles rect = new Rectangles();
			if (i == 4 || i == 13) {
				rect.setIndex(i);
				i += 2;
				rect.setLayoutX(500);
				rect.setLayoutY(80 + y2Increment);
				rect.setWidth(100);
				rect.setHeight(20);
				rect.setFill(Color.rgb(191, 191, 191));
				rect.setStroke(Color.BLACK);
				rect.setStrokeWidth(2);
			} else {
				rect.setIndex(i);
				i += 2;
				rect.setLayoutX(500);
				rect.setLayoutY(80 + y2Increment);
				rect.setWidth(100);
				rect.setHeight(20);
				rect.setFill(Color.WHITE);
				rect.setStroke(Color.BLACK);
				rect.setStrokeWidth(2);
			}
			y2Increment += 20;
			Raid.raid0.add(rect);
			pane.getChildren().add(rect);
		}

		int y3Increment = 0;
		for (int i = 2; i < 60; i++) {
			Rectangles rect = new Rectangles();
			if (i == 2 || i == 11) {
				rect.setIndex(i);
				i += 2;
				rect.setLayoutX(700);
				rect.setLayoutY(80 + y3Increment);
				rect.setWidth(100);
				rect.setHeight(20);
				rect.setFill(Color.rgb(191, 191, 191));
				rect.setStroke(Color.BLACK);
				rect.setStrokeWidth(2);
			} else {
				rect.setIndex(i);
				i += 2;
				rect.setLayoutX(700);
				rect.setLayoutY(80 + y3Increment);
				rect.setWidth(100);
				rect.setHeight(20);
				rect.setFill(Color.WHITE);
				rect.setStroke(Color.BLACK);
				rect.setStrokeWidth(2);
			}
			y3Increment += 20;
			Raid.raid0.add(rect);
			pane.getChildren().add(rect);
		}
	}

	public static void createThreeDisksForTwentyBlocks() {

		int yIncrement = 0;
		for (int i = 0; i < 60; i++) {
			Rectangles rect = new Rectangles();
			if (i == 6 || i == 15 || i == 24) {
				rect.setIndex(i);
				i += 2;
				rect.setLayoutX(300);
				rect.setLayoutY(80 + yIncrement);
				rect.setWidth(100);
				rect.setHeight(20);
				rect.setFill(Color.rgb(191, 191, 191));
				rect.setStroke(Color.BLACK);
				rect.setStrokeWidth(2);
			} else {
				rect.setIndex(i);
				i += 2;
				rect.setLayoutX(300);
				rect.setLayoutY(80 + yIncrement);
				rect.setWidth(100);
				rect.setHeight(20);
				rect.setFill(Color.WHITE);
				rect.setStroke(Color.BLACK);
				rect.setStrokeWidth(2);
			}
			yIncrement += 20;
			Raid.raid0.add(rect);
			pane.getChildren().add(rect);

		}

		int y2Increment = 0;
		for (int i = 1; i < 60; i++) {
			Rectangles rect = new Rectangles();
			if (i == 4 || i == 13 || i == 22) {
				rect.setIndex(i);
				i += 2;
				rect.setLayoutX(500);
				rect.setLayoutY(80 + y2Increment);
				rect.setWidth(100);
				rect.setHeight(20);
				rect.setFill(Color.rgb(191, 191, 191));
				rect.setStroke(Color.BLACK);
				rect.setStrokeWidth(2);
			} else {
				rect.setIndex(i);
				i += 2;
				rect.setLayoutX(500);
				rect.setLayoutY(80 + y2Increment);
				rect.setWidth(100);
				rect.setHeight(20);
				rect.setFill(Color.WHITE);
				rect.setStroke(Color.BLACK);
				rect.setStrokeWidth(2);
			}
			y2Increment += 20;
			Raid.raid0.add(rect);
			pane.getChildren().add(rect);
		}

		int y3Increment = 0;
		for (int i = 2; i < 60; i++) {
			Rectangles rect = new Rectangles();
			if (i == 2 || i == 11 || i == 20 || i == 29) {
				rect.setIndex(i);
				i += 2;
				rect.setLayoutX(700);
				rect.setLayoutY(80 + y3Increment);
				rect.setWidth(100);
				rect.setHeight(20);
				rect.setFill(Color.rgb(191, 191, 191));
				rect.setStroke(Color.BLACK);
				rect.setStrokeWidth(2);
			} else {
				rect.setIndex(i);
				i += 2;
				rect.setLayoutX(700);
				rect.setLayoutY(80 + y3Increment);
				rect.setWidth(100);
				rect.setHeight(20);
				rect.setFill(Color.WHITE);
				rect.setStroke(Color.BLACK);
				rect.setStrokeWidth(2);
			}
			y3Increment += 20;
			Raid.raid0.add(rect);
			pane.getChildren().add(rect);
		}
	}

	public static void createFourDisksForTenBlocks() {

		double yIncrement = 0;
		for (int i = 0; i < 80; i++) {
			Rectangles rect = new Rectangles();
			if (i == 12) {
				rect.setIndex(i);
				i += 3;
				rect.setLayoutX(300);
				rect.setLayoutY(80 + yIncrement);
				rect.setWidth(100);
				rect.setHeight(20);
				rect.setFill(Color.rgb(191, 191, 191));
				rect.setStroke(Color.BLACK);
				rect.setStrokeWidth(2);
			} else {
				rect.setIndex(i);
				i += 3;
				rect.setLayoutX(300);
				rect.setLayoutY(80 + yIncrement);
				rect.setWidth(100);
				rect.setHeight(20);
				rect.setFill(Color.WHITE);
				rect.setStroke(Color.BLACK);
				rect.setStrokeWidth(2);
			}
			yIncrement += 20;
			Raid.raid0.add(rect);
			pane.getChildren().add(rect);

		}

		double y2Increment = 0;
		for (int i = 1; i < 80; i++) {
			Rectangles rect = new Rectangles();
			if (i == 9) {
				rect.setIndex(i);
				i += 3;
				rect.setLayoutX(450);
				rect.setLayoutY(80 + y2Increment);
				rect.setWidth(100);
				rect.setHeight(20);
				rect.setFill(Color.rgb(191, 191, 191));
				rect.setStroke(Color.BLACK);
				rect.setStrokeWidth(2);
			} else {
				rect.setIndex(i);
				i += 3;
				rect.setLayoutX(450);
				rect.setLayoutY(80 + y2Increment);
				rect.setWidth(100);
				rect.setHeight(20);
				rect.setFill(Color.WHITE);
				rect.setStroke(Color.BLACK);
				rect.setStrokeWidth(2);
			}
			y2Increment += 20;
			Raid.raid0.add(rect);
			pane.getChildren().add(rect);
		}

		double y3Increment = 0;
		for (int i = 2; i < 80; i++) {
			Rectangles rect = new Rectangles();
			if (i == 6) {
				rect.setIndex(i);
				i += 3;
				rect.setLayoutX(600);
				rect.setLayoutY(80 + y3Increment);
				rect.setWidth(100);
				rect.setHeight(20);
				rect.setFill(Color.rgb(191, 191, 191));
				rect.setStroke(Color.BLACK);
				rect.setStrokeWidth(2);
			} else {
				rect.setIndex(i);
				i += 3;
				rect.setLayoutX(600);
				rect.setLayoutY(80 + y3Increment);
				rect.setWidth(100);
				rect.setHeight(20);
				rect.setFill(Color.WHITE);
				rect.setStroke(Color.BLACK);
				rect.setStrokeWidth(2);
			}
			y3Increment += 20;
			Raid.raid0.add(rect);
			pane.getChildren().add(rect);
		}

		double y4Increment = 0;
		for (int i = 3; i < 80; i++) {
			Rectangles rect = new Rectangles();
			if (i == 3) {
				rect.setIndex(i);
				i += 3;
				rect.setLayoutX(750);
				rect.setLayoutY(80 + y4Increment);
				rect.setWidth(100);
				rect.setHeight(20);
				rect.setFill(Color.rgb(191, 191, 191));
				rect.setStroke(Color.BLACK);
				rect.setStrokeWidth(2);
			} else {
				rect.setIndex(i);
				i += 3;
				rect.setLayoutX(750);
				rect.setLayoutY(80 + y4Increment);
				rect.setWidth(100);
				rect.setHeight(20);
				rect.setFill(Color.WHITE);
				rect.setStroke(Color.BLACK);
				rect.setStrokeWidth(2);
			}
			y4Increment += 20;
			Raid.raid0.add(rect);
			pane.getChildren().add(rect);
		}
	}

	public static void createFourDisksForTwentyBlocks() {

		double yIncrement = 0;
		for (int i = 0; i < 80; i++) {
			Rectangles rect = new Rectangles();
			if (i == 12) {
				rect.setIndex(i);
				i += 3;
				rect.setLayoutX(300);
				rect.setLayoutY(80 + yIncrement);
				rect.setWidth(100);
				rect.setHeight(20);
				rect.setFill(Color.rgb(191, 191, 191));
				rect.setStroke(Color.BLACK);
				rect.setStrokeWidth(2);
			} else {
				rect.setIndex(i);
				i += 3;
				rect.setLayoutX(300);
				rect.setLayoutY(80 + yIncrement);
				rect.setWidth(100);
				rect.setHeight(20);
				rect.setFill(Color.WHITE);
				rect.setStroke(Color.BLACK);
				rect.setStrokeWidth(2);
			}
			yIncrement += 20;
			Raid.raid0.add(rect);
			pane.getChildren().add(rect);

		}

		double y2Increment = 0;
		for (int i = 1; i < 80; i++) {
			Rectangles rect = new Rectangles();
			if (i == 9 || i == 25) {
				rect.setIndex(i);
				i += 3;
				rect.setLayoutX(450);
				rect.setLayoutY(80 + y2Increment);
				rect.setWidth(100);
				rect.setHeight(20);
				rect.setFill(Color.rgb(191, 191, 191));
				rect.setStroke(Color.BLACK);
				rect.setStrokeWidth(2);
			} else {
				rect.setIndex(i);
				i += 3;
				rect.setLayoutX(450);
				rect.setLayoutY(80 + y2Increment);
				rect.setWidth(100);
				rect.setHeight(20);
				rect.setFill(Color.WHITE);
				rect.setStroke(Color.BLACK);
				rect.setStrokeWidth(2);
			}
			y2Increment += 20;
			Raid.raid0.add(rect);
			pane.getChildren().add(rect);
		}

		double y3Increment = 0;
		for (int i = 2; i < 80; i++) {
			Rectangles rect = new Rectangles();
			if (i == 6 || i == 22) {
				rect.setIndex(i);
				i += 3;
				rect.setLayoutX(600);
				rect.setLayoutY(80 + y3Increment);
				rect.setWidth(100);
				rect.setHeight(20);
				rect.setFill(Color.rgb(191, 191, 191));
				rect.setStroke(Color.BLACK);
				rect.setStrokeWidth(2);
			} else {
				rect.setIndex(i);
				i += 3;
				rect.setLayoutX(600);
				rect.setLayoutY(80 + y3Increment);
				rect.setWidth(100);
				rect.setHeight(20);
				rect.setFill(Color.WHITE);
				rect.setStroke(Color.BLACK);
				rect.setStrokeWidth(2);
			}
			y3Increment += 20;
			Raid.raid0.add(rect);
			pane.getChildren().add(rect);
		}

		double y4Increment = 0;
		for (int i = 3; i < 80; i++) {
			Rectangles rect = new Rectangles();
			if (i == 3 || i == 19) {
				rect.setIndex(i);
				i += 3;
				rect.setLayoutX(750);
				rect.setLayoutY(80 + y4Increment);
				rect.setWidth(100);
				rect.setHeight(20);
				rect.setFill(Color.rgb(191, 191, 191));
				rect.setStroke(Color.BLACK);
				rect.setStrokeWidth(2);
			} else {
				rect.setIndex(i);
				i += 3;
				rect.setLayoutX(750);
				rect.setLayoutY(80 + y4Increment);
				rect.setWidth(100);
				rect.setHeight(20);
				rect.setFill(Color.WHITE);
				rect.setStroke(Color.BLACK);
				rect.setStrokeWidth(2);
			}
			y4Increment += 20;
			Raid.raid0.add(rect);
			pane.getChildren().add(rect);
		}
	}

	public static void createFiveDisksForTenBlocks() {

		double yIncrement = 0;
		for (int i = 0; i < 100; i++) {
			Rectangles rect = new Rectangles();
			if (i == 10) {
				rect.setIndex(i);
				i += 4;
				rect.setLayoutX(300);
				rect.setLayoutY(80 + yIncrement);
				rect.setWidth(100);
				rect.setHeight(20);
				rect.setFill(Color.rgb(191, 191, 191));
				rect.setStroke(Color.BLACK);
				rect.setStrokeWidth(2);
			} else {
				rect.setIndex(i);
				i += 4;
				rect.setLayoutX(300);
				rect.setLayoutY(80 + yIncrement);
				rect.setWidth(100);
				rect.setHeight(20);
				rect.setFill(Color.WHITE);
				rect.setStroke(Color.BLACK);
				rect.setStrokeWidth(2);
			}
			yIncrement += 20;
			Raid.raid0.add(rect);
			pane.getChildren().add(rect);

		}

		double y2Increment = 0;
		for (int i = 1; i < 100; i++) {
			Rectangles rect = new Rectangles();
			rect.setIndex(i);
			i += 4;
			rect.setLayoutX(450);
			rect.setLayoutY(80 + y2Increment);
			rect.setWidth(100);
			rect.setHeight(20);
			rect.setFill(Color.WHITE);
			rect.setStroke(Color.BLACK);
			rect.setStrokeWidth(2);
			y2Increment += 20;
			Raid.raid0.add(rect);
			pane.getChildren().add(rect);
		}

		double y3Increment = 0;
		for (int i = 2; i < 100; i++) {
			Rectangles rect = new Rectangles();
			if (i == 7) {
				rect.setIndex(i);
				i += 4;
				rect.setLayoutX(600);
				rect.setLayoutY(80 + y3Increment);
				rect.setWidth(100);
				rect.setHeight(20);
				rect.setFill(Color.rgb(191, 191, 191));
				rect.setStroke(Color.BLACK);
				rect.setStrokeWidth(2);
			} else {
				rect.setIndex(i);
				i += 4;
				rect.setLayoutX(600);
				rect.setLayoutY(80 + y3Increment);
				rect.setWidth(100);
				rect.setHeight(20);
				rect.setFill(Color.WHITE);
				rect.setStroke(Color.BLACK);
				rect.setStrokeWidth(2);
			}
			y3Increment += 20;
			Raid.raid0.add(rect);
			pane.getChildren().add(rect);
		}

		double y4Increment = 0;
		for (int i = 3; i < 100; i++) {
			Rectangles rect = new Rectangles();
			rect.setIndex(i);
			i += 4;
			rect.setLayoutX(750);
			rect.setLayoutY(80 + y4Increment);
			rect.setWidth(100);
			rect.setHeight(20);
			rect.setFill(Color.WHITE);
			rect.setStroke(Color.BLACK);
			rect.setStrokeWidth(2);
			y4Increment += 20;
			Raid.raid0.add(rect);
			pane.getChildren().add(rect);
		}

		double y5Increment = 0;
		for (int i = 4; i < 100; i++) {
			Rectangles rect = new Rectangles();
			if (i == 4) {
				rect.setIndex(i);
				i += 4;
				rect.setLayoutX(900);
				rect.setLayoutY(80 + y5Increment);
				rect.setWidth(100);
				rect.setHeight(20);
				rect.setFill(Color.rgb(191, 191, 191));
				rect.setStroke(Color.BLACK);
				rect.setStrokeWidth(2);
			} else {
				rect.setIndex(i);
				i += 4;
				rect.setLayoutX(900);
				rect.setLayoutY(80 + y5Increment);
				rect.setWidth(100);
				rect.setHeight(20);
				rect.setFill(Color.WHITE);
				rect.setStroke(Color.BLACK);
				rect.setStrokeWidth(2);
			}
			y5Increment += 20;
			Raid.raid0.add(rect);
			pane.getChildren().add(rect);
		}
	}

	public static void createFiveDisksForTwentyBlocks() {

		double yIncrement = 0;
		for (int i = 0; i < 100; i++) {
			Rectangles rect = new Rectangles();
			if (i == 10) {
				rect.setIndex(i);
				i += 4;
				rect.setLayoutX(300);
				rect.setLayoutY(80 + yIncrement);
				rect.setWidth(100);
				rect.setHeight(20);
				rect.setFill(Color.rgb(191, 191, 191));
				rect.setStroke(Color.BLACK);
				rect.setStrokeWidth(2);
			} else {
				rect.setIndex(i);
				i += 4;
				rect.setLayoutX(300);
				rect.setLayoutY(80 + yIncrement);
				rect.setWidth(100);
				rect.setHeight(20);
				rect.setFill(Color.WHITE);
				rect.setStroke(Color.BLACK);
				rect.setStrokeWidth(2);
			}
			yIncrement += 20;
			Raid.raid0.add(rect);
			pane.getChildren().add(rect);

		}

		double y2Increment = 0;
		for (int i = 1; i < 100; i++) {
			Rectangles rect = new Rectangles();
			if (i == 21) {
				rect.setIndex(i);
				i += 4;
				rect.setLayoutX(450);
				rect.setLayoutY(80 + y2Increment);
				rect.setWidth(100);
				rect.setHeight(20);
				rect.setFill(Color.rgb(191, 191, 191));
				rect.setStroke(Color.BLACK);
				rect.setStrokeWidth(2);
			} else {
				rect.setIndex(i);
				i += 4;
				rect.setLayoutX(450);
				rect.setLayoutY(80 + y2Increment);
				rect.setWidth(100);
				rect.setHeight(20);
				rect.setFill(Color.WHITE);
				rect.setStroke(Color.BLACK);
				rect.setStrokeWidth(2);
			}
			y2Increment += 20;
			Raid.raid0.add(rect);
			pane.getChildren().add(rect);
		}

		double y3Increment = 0;
		for (int i = 2; i < 100; i++) {
			Rectangles rect = new Rectangles();
			if (i == 7) {
				rect.setIndex(i);
				i += 4;
				rect.setLayoutX(600);
				rect.setLayoutY(80 + y3Increment);
				rect.setWidth(100);
				rect.setHeight(20);
				rect.setFill(Color.rgb(191, 191, 191));
				rect.setStroke(Color.BLACK);
				rect.setStrokeWidth(2);
			} else {
				rect.setIndex(i);
				i += 4;
				rect.setLayoutX(600);
				rect.setLayoutY(80 + y3Increment);
				rect.setWidth(100);
				rect.setHeight(20);
				rect.setFill(Color.WHITE);
				rect.setStroke(Color.BLACK);
				rect.setStrokeWidth(2);
			}
			y3Increment += 20;
			Raid.raid0.add(rect);
			pane.getChildren().add(rect);
		}

		double y4Increment = 0;
		for (int i = 3; i < 100; i++) {
			Rectangles rect = new Rectangles();
			if (i == 18) {
				rect.setIndex(i);
				i += 4;
				rect.setLayoutX(750);
				rect.setLayoutY(80 + y4Increment);
				rect.setWidth(100);
				rect.setHeight(20);
				rect.setFill(Color.rgb(191, 191, 191));
				rect.setStroke(Color.BLACK);
				rect.setStrokeWidth(2);
			} else {
				rect.setIndex(i);
				i += 4;
				rect.setLayoutX(750);
				rect.setLayoutY(80 + y4Increment);
				rect.setWidth(100);
				rect.setHeight(20);
				rect.setFill(Color.WHITE);
				rect.setStroke(Color.BLACK);
				rect.setStrokeWidth(2);
			}
			y4Increment += 20;
			Raid.raid0.add(rect);
			pane.getChildren().add(rect);
		}

		double y5Increment = 0;
		for (int i = 4; i < 100; i++) {
			Rectangles rect = new Rectangles();
			if (i == 4) {
				rect.setIndex(i);
				i += 4;
				rect.setLayoutX(900);
				rect.setLayoutY(80 + y5Increment);
				rect.setWidth(100);
				rect.setHeight(20);
				rect.setFill(Color.rgb(191, 191, 191));
				rect.setStroke(Color.BLACK);
				rect.setStrokeWidth(2);
			} else {
				rect.setIndex(i);
				i += 4;
				rect.setLayoutX(900);
				rect.setLayoutY(80 + y5Increment);
				rect.setWidth(100);
				rect.setHeight(20);
				rect.setFill(Color.WHITE);
				rect.setStroke(Color.BLACK);
				rect.setStrokeWidth(2);
			}
			y5Increment += 20;
			Raid.raid0.add(rect);
			pane.getChildren().add(rect);
		}
	}

	public static void create3DisksRaid5Labels() {

		Text1 physicalDisk = new Text1();
		Text1 physicalDisk1 = new Text1();
		Text1 physicalDisk2 = new Text1();

		physicalDisk.setText("DISK 1");
		physicalDisk1.setText("DISK 2");
		physicalDisk2.setText("DISK 3");

		physicalDisk.setLayoutX(335);
		physicalDisk.setLayoutY(screenHeight - 95);
		physicalDisk1.setLayoutX(535);
		physicalDisk1.setLayoutY(screenHeight - 95);
		physicalDisk2.setLayoutX(735);
		physicalDisk2.setLayoutY(screenHeight - 95);

		pane.getChildren().addAll(physicalDisk, physicalDisk1, physicalDisk2);
	}

	public static void create4DisksRaid5Labels() {

		Text1 physicalDisk = new Text1();
		Text1 physicalDisk1 = new Text1();
		Text1 physicalDisk2 = new Text1();
		Text1 physicalDisk3 = new Text1();

		physicalDisk.setText("DISK 1");
		physicalDisk1.setText("DISK 2");
		physicalDisk2.setText("DISK 3");
		physicalDisk3.setText("DISK 4");

		physicalDisk.setLayoutX(335);
		physicalDisk.setLayoutY(screenHeight - 95);
		physicalDisk1.setLayoutX(485);
		physicalDisk1.setLayoutY(screenHeight - 95);
		physicalDisk2.setLayoutX(635);
		physicalDisk2.setLayoutY(screenHeight - 95);
		physicalDisk3.setLayoutX(785);
		physicalDisk3.setLayoutY(screenHeight - 95);

		pane.getChildren().addAll(physicalDisk, physicalDisk1, physicalDisk2, physicalDisk3);
	}

	public static void create5DisksRaid5Labels() {

		Text1 physicalDisk = new Text1();
		Text1 physicalDisk1 = new Text1();
		Text1 physicalDisk2 = new Text1();
		Text1 physicalDisk3 = new Text1();
		Text1 physicalDisk4 = new Text1();

		physicalDisk.setText("DISK 1");
		physicalDisk1.setText("DISK 2");
		physicalDisk2.setText("DISK 3");
		physicalDisk3.setText("DISK 4");
		physicalDisk4.setText("DISK 5");

		physicalDisk.setLayoutX(335);
		physicalDisk.setLayoutY(screenHeight - 95);
		physicalDisk1.setLayoutX(485);
		physicalDisk1.setLayoutY(screenHeight - 95);
		physicalDisk2.setLayoutX(635);
		physicalDisk2.setLayoutY(screenHeight - 95);
		physicalDisk3.setLayoutX(785);
		physicalDisk3.setLayoutY(screenHeight - 95);
		physicalDisk4.setLayoutX(935);
		physicalDisk4.setLayoutY(screenHeight - 95);

		pane.getChildren().addAll(physicalDisk, physicalDisk1, physicalDisk2, physicalDisk3, physicalDisk4);
	}
}
