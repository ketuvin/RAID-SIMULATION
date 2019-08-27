package RAID;

import java.awt.Dimension;
import java.awt.Toolkit;

import RAID.Raid;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

public class Raid6 {

	private static Pane pane = Raid.pane;
	private static Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	@SuppressWarnings("unused")
	private static int screenWidth = (int) screenSize.getWidth();
	private static int screenHeight = (int) screenSize.getHeight();

	public static void createThreeDisksForTenBlocks() {

		int yIncrement = 0;
		for (int i = 0; i < 60; i++) {
			Rectangles rect = new Rectangles();
			if (i == 3 || i == 6 || i == 12 || i == 15 || i == 21 || i == 24) {
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
			if (i == 1 || i == 7 || i == 10 || i == 16 || i == 19 || i == 25 || i == 28) {
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
			if (i == 2 || i == 5 || i == 11 || i == 14 || i == 20 || i == 23 || i == 29) {
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
			if (i == 3 || i == 6 || i == 12 || i == 15 || i == 21 || i == 24 || i == 30 || i == 33 || i == 39 || i == 42
					|| i == 48 || i == 51 || i == 57) {
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
			if (i == 1 || i == 7 || i == 10 || i == 16 || i == 19 || i == 25 || i == 28 || i == 34 || i == 37 || i == 43
					|| i == 46 || i == 52 || i == 55) {
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
			if (i == 2 || i == 5 || i == 11 || i == 14 || i == 20 || i == 23 || i == 29 || i == 32 || i == 38 || i == 41
					|| i == 47 || i == 50 || i == 56 || i == 59) {
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
			if (i == 8) {
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
			if (i == 5 || i == 9 || i == 17) {
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
			if (i == 2 || i == 6 || i == 14 || i == 18) {
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
			if (i == 3 || i == 15) {
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
			if (i == 8 || i == 20 || i == 32) {
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
			if (i == 5 || i == 9 || i == 17 || i == 21 || i == 29 || i == 33) {
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
			if (i == 2 || i == 6 || i == 14 || i == 18 || i == 26 || i == 30 || i == 38) {
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
			if (i == 3 || i == 15 || i == 27 || i == 39) {
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
			if (i == 15) {
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
			if (i == 11 || i == 16) {
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
			if (i == 7 || i == 12) {
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
			if (i == 3 || i == 8) {
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

	public static void createFiveDisksForTwentyBlocks() {

		double yIncrement = 0;
		for (int i = 0; i < 100; i++) {
			Rectangles rect = new Rectangles();
			if (i == 15) {
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
			if (i == 11 || i == 16 || i == 31) {
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
			if (i == 7 || i == 12 || i == 27 || i == 32) {
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
			if (i == 3 || i == 8 || i == 23 || i == 28) {
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
			if (i == 4 || i == 24) {
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

	public static void create3DisksRaid6Labels() {

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

	public static void create4DisksRaid6Labels() {

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

	public static void create5DisksRaid6Labels() {

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
