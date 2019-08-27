package RAID;

import java.awt.Dimension;
import java.awt.Toolkit;

import RAID.Raid;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

public class Raid0 {

	private static Pane pane = Raid.pane;
	private static Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	@SuppressWarnings("unused")
	private static int screenWidth = (int) screenSize.getWidth();
	private static int screenHeight = (int) screenSize.getHeight();

	public static void createTwoDisks() {

		int yIncrement = 0;
		for (int i = 0; i < 60; i++) {
			Rectangles rect = new Rectangles();
			rect.setIndex(i);
			i++;
			rect.setLayoutX(800);
			rect.setLayoutY(150 + yIncrement);
			rect.setWidth(100);
			rect.setHeight(20);
			rect.setFill(Color.WHITE);
			rect.setStroke(Color.BLACK);
			rect.setStrokeWidth(2);
			yIncrement += 20;
			Raid.raid0.add(rect);
			pane.getChildren().add(rect);

		}

		int y2Increment = 0;
		for (int i = 1; i < 60; i++) {
			Rectangles rect = new Rectangles();
			rect.setIndex(i);
			i++;
			rect.setLayoutX(1000);
			rect.setLayoutY(150 + y2Increment);
			rect.setWidth(100);
			rect.setHeight(20);
			rect.setFill(Color.WHITE);
			rect.setStroke(Color.BLACK);
			rect.setStrokeWidth(2);
			y2Increment += 20;
			Raid.raid0.add(rect);
			pane.getChildren().add(rect);
		}
	}

	public static void createThreeDisks() {

		int yIncrement = 0;
		for (int i = 0; i < 90; i++) {
			Rectangles rect = new Rectangles();
			rect.setIndex(i);
			i += 2;
			rect.setLayoutX(700);
			rect.setLayoutY(150 + yIncrement);
			rect.setWidth(100);
			rect.setHeight(20);
			rect.setFill(Color.WHITE);
			rect.setStroke(Color.BLACK);
			rect.setStrokeWidth(2);
			yIncrement += 20;
			Raid.raid0.add(rect);
			pane.getChildren().add(rect);

		}

		int y2Increment = 0;
		for (int i = 1; i < 90; i++) {
			Rectangles rect = new Rectangles();
			rect.setIndex(i);
			i += 2;
			rect.setLayoutX(900);
			rect.setLayoutY(150 + y2Increment);
			rect.setWidth(100);
			rect.setHeight(20);
			rect.setFill(Color.WHITE);
			rect.setStroke(Color.BLACK);
			rect.setStrokeWidth(2);
			y2Increment += 20;
			Raid.raid0.add(rect);
			pane.getChildren().add(rect);
		}

		int y3Increment = 0;
		for (int i = 2; i < 90; i++) {
			Rectangles rect = new Rectangles();
			rect.setIndex(i);
			i += 2;
			rect.setLayoutX(1100);
			rect.setLayoutY(150 + y3Increment);
			rect.setWidth(100);
			rect.setHeight(20);
			rect.setFill(Color.WHITE);
			rect.setStroke(Color.BLACK);
			rect.setStrokeWidth(2);
			y3Increment += 20;
			Raid.raid0.add(rect);
			pane.getChildren().add(rect);
		}
	}

	public static void createFourDisks() {

		int yIncrement = 0;
		for (int i = 0; i < 120; i++) {
			Rectangles rect = new Rectangles();
			rect.setIndex(i);
			i += 3;
			rect.setLayoutX(600);
			rect.setLayoutY(150 + yIncrement);
			rect.setWidth(100);
			rect.setHeight(20);
			rect.setFill(Color.WHITE);
			rect.setStroke(Color.BLACK);
			rect.setStrokeWidth(2);
			yIncrement += 20;
			Raid.raid0.add(rect);
			pane.getChildren().add(rect);

		}

		int y2Increment = 0;
		for (int i = 1; i < 120; i++) {
			Rectangles rect = new Rectangles();
			rect.setIndex(i);
			i += 3;
			rect.setLayoutX(800);
			rect.setLayoutY(150 + y2Increment);
			rect.setWidth(100);
			rect.setHeight(20);
			rect.setFill(Color.WHITE);
			rect.setStroke(Color.BLACK);
			rect.setStrokeWidth(2);
			y2Increment += 20;
			Raid.raid0.add(rect);
			pane.getChildren().add(rect);
		}

		int y3Increment = 0;
		for (int i = 2; i < 120; i++) {
			Rectangles rect = new Rectangles();
			rect.setIndex(i);
			i += 3;
			rect.setLayoutX(1000);
			rect.setLayoutY(150 + y3Increment);
			rect.setWidth(100);
			rect.setHeight(20);
			rect.setFill(Color.WHITE);
			rect.setStroke(Color.BLACK);
			rect.setStrokeWidth(2);
			y3Increment += 20;
			Raid.raid0.add(rect);
			pane.getChildren().add(rect);
		}

		int y4Increment = 0;
		for (int i = 3; i < 120; i++) {
			Rectangles rect = new Rectangles();
			rect.setIndex(i);
			i += 3;
			rect.setLayoutX(1200);
			rect.setLayoutY(150 + y4Increment);
			rect.setWidth(100);
			rect.setHeight(20);
			rect.setFill(Color.WHITE);
			rect.setStroke(Color.BLACK);
			rect.setStrokeWidth(2);
			y4Increment += 20;
			Raid.raid0.add(rect);
			pane.getChildren().add(rect);
		}
	}

	public static void create2DisksRaid0Labels() {

		Text1 physicalDisk = new Text1();
		Text1 physicalDisk1 = new Text1();

		physicalDisk.setText("DISK 1");
		physicalDisk1.setText("DISK 2");

		physicalDisk.setLayoutX(830);
		physicalDisk.setLayoutY(screenHeight - 300);
		physicalDisk1.setLayoutX(1035);
		physicalDisk1.setLayoutY(screenHeight - 300);

		pane.getChildren().addAll(physicalDisk, physicalDisk1);
	}

	public static void create3DisksRaid0Labels() {

		Text1 physicalDisk = new Text1();
		Text1 physicalDisk1 = new Text1();
		Text1 physicalDisk2 = new Text1();

		physicalDisk.setText("DISK 1");
		physicalDisk1.setText("DISK 2");
		physicalDisk2.setText("DISK 3");

		physicalDisk.setLayoutX(730);
		physicalDisk.setLayoutY(screenHeight - 300);
		physicalDisk1.setLayoutX(935);
		physicalDisk1.setLayoutY(screenHeight - 300);
		physicalDisk2.setLayoutX(1135);
		physicalDisk2.setLayoutY(screenHeight - 300);

		pane.getChildren().addAll(physicalDisk, physicalDisk1, physicalDisk2);
	}

	public static void create4DisksRaid0Labels() {

		Text1 physicalDisk = new Text1();
		Text1 physicalDisk1 = new Text1();
		Text1 physicalDisk2 = new Text1();
		Text1 physicalDisk3 = new Text1();

		physicalDisk.setText("DISK 1");
		physicalDisk1.setText("DISK 2");
		physicalDisk2.setText("DISK 3");
		physicalDisk3.setText("DISK 4");

		physicalDisk.setLayoutX(630);
		physicalDisk.setLayoutY(screenHeight - 300);
		physicalDisk1.setLayoutX(830);
		physicalDisk1.setLayoutY(screenHeight - 300);
		physicalDisk2.setLayoutX(1030);
		physicalDisk2.setLayoutY(screenHeight - 300);
		physicalDisk3.setLayoutX(1230);
		physicalDisk3.setLayoutY(screenHeight - 300);

		pane.getChildren().addAll(physicalDisk, physicalDisk1, physicalDisk2, physicalDisk3);
	}
}
