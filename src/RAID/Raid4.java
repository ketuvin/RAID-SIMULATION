package RAID;

import java.awt.Dimension;
import java.awt.Toolkit;

import RAID.Raid;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

public class Raid4 {

	private static Pane pane = Raid.pane;
	private static Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	@SuppressWarnings("unused")
	private static int screenWidth = (int) screenSize.getWidth();
	private static int screenHeight = (int) screenSize.getHeight();

	public static void createThreeDisks() {

		int yIncrement = 0;
		for (int i = 0; i < 40; i++) {
			Rectangles rect = new Rectangles();
			rect.setIndex(i);
			i++;
			rect.setLayoutX(300);
			rect.setLayoutY(80 + yIncrement);
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
		for (int i = 1; i < 40; i++) {
			Rectangles rect = new Rectangles();
			rect.setIndex(i);
			i++;
			rect.setLayoutX(500);
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
		// ONE DEDICATED PARITY DISK
		int y3Increment = 0;
		for (int i = 0; i < 20; i++) {
			Rectangles rect = new Rectangles();
			rect.setIndex(i);
			rect.setLayoutX(700);
			rect.setLayoutY(80 + y3Increment);
			rect.setWidth(100);
			rect.setHeight(20);
			rect.setFill(Color.rgb(191, 191, 191));
			rect.setStroke(Color.BLACK);
			rect.setStrokeWidth(2);
			y3Increment += 20;
			pane.getChildren().add(rect);
		}
	}

	public static void createFourDisks() {

		double yIncrement = 0;
		for (int i = 0; i < 60; i++) {
			Rectangles rect = new Rectangles();
			rect.setIndex(i);
			i += 2;
			rect.setLayoutX(300);
			rect.setLayoutY(80 + yIncrement);
			rect.setWidth(100);
			rect.setHeight(20);
			rect.setFill(Color.WHITE);
			rect.setStroke(Color.BLACK);
			rect.setStrokeWidth(1);
			yIncrement += 20;
			Raid.raid0.add(rect);
			pane.getChildren().add(rect);

		}

		double y2Increment = 0;
		for (int i = 1; i < 60; i++) {
			Rectangles rect = new Rectangles();
			rect.setIndex(i);
			i += 2;
			rect.setLayoutX(450);
			rect.setLayoutY(80 + y2Increment);
			rect.setWidth(100);
			rect.setHeight(20);
			rect.setFill(Color.WHITE);
			rect.setStroke(Color.BLACK);
			rect.setStrokeWidth(1);
			y2Increment += 20;
			Raid.raid0.add(rect);
			pane.getChildren().add(rect);
		}

		double y3Increment = 0;
		for (int i = 2; i < 60; i++) {
			Rectangles rect = new Rectangles();
			rect.setIndex(i);
			i += 2;
			rect.setLayoutX(600);
			rect.setLayoutY(80 + y3Increment);
			rect.setWidth(100);
			rect.setHeight(20);
			rect.setFill(Color.WHITE);
			rect.setStroke(Color.BLACK);
			rect.setStrokeWidth(1);
			y3Increment += 20;
			Raid.raid0.add(rect);
			pane.getChildren().add(rect);
		}
		// ONE DEDICATED PARITY DISK
		double y4Increment = 0;
		for (int i = 0; i < 20; i++) {
			Rectangles rect = new Rectangles();
			rect.setIndex(i);
			rect.setLayoutX(750);
			rect.setLayoutY(80 + y4Increment);
			rect.setWidth(100);
			rect.setHeight(20);
			rect.setFill(Color.rgb(191, 191, 191));
			rect.setStroke(Color.BLACK);
			rect.setStrokeWidth(1);
			y4Increment += 20;
			pane.getChildren().add(rect);
		}
	}

	public static void createFiveDisks() {

		double yIncrement = 0;
		for (int i = 0; i < 80; i++) {
			Rectangles rect = new Rectangles();
			rect.setIndex(i);
			i += 3;
			rect.setLayoutX(300);
			rect.setLayoutY(80 + yIncrement);
			rect.setWidth(100);
			rect.setHeight(20);
			rect.setFill(Color.WHITE);
			rect.setStroke(Color.BLACK);
			rect.setStrokeWidth(1);
			yIncrement += 20;
			Raid.raid0.add(rect);
			pane.getChildren().add(rect);

		}

		double y2Increment = 0;
		for (int i = 1; i < 80; i++) {
			Rectangles rect = new Rectangles();
			rect.setIndex(i);
			i += 3;
			rect.setLayoutX(450);
			rect.setLayoutY(80 + y2Increment);
			rect.setWidth(100);
			rect.setHeight(20);
			rect.setFill(Color.WHITE);
			rect.setStroke(Color.BLACK);
			rect.setStrokeWidth(1);
			y2Increment += 20;
			Raid.raid0.add(rect);
			pane.getChildren().add(rect);
		}

		double y3Increment = 0;
		for (int i = 2; i < 80; i++) {
			Rectangles rect = new Rectangles();
			rect.setIndex(i);
			i += 3;
			rect.setLayoutX(600);
			rect.setLayoutY(80 + y3Increment);
			rect.setWidth(100);
			rect.setHeight(20);
			rect.setFill(Color.WHITE);
			rect.setStroke(Color.BLACK);
			rect.setStrokeWidth(1);
			y3Increment += 20;
			Raid.raid0.add(rect);
			pane.getChildren().add(rect);
		}

		double y4Increment = 0;
		for (int i = 3; i < 80; i++) {
			Rectangles rect = new Rectangles();
			rect.setIndex(i);
			i += 3;
			rect.setLayoutX(750);
			rect.setLayoutY(80 + y4Increment);
			rect.setWidth(100);
			rect.setHeight(20);
			rect.setFill(Color.WHITE);
			rect.setStroke(Color.BLACK);
			rect.setStrokeWidth(1);
			y4Increment += 20;
			Raid.raid0.add(rect);
			pane.getChildren().add(rect);
		}
		// ONE DEDICATED PARITY DISK
		double y5Increment = 0;
		for (int i = 0; i < 20; i++) {
			Rectangles rect = new Rectangles();
			rect.setIndex(i);
			rect.setLayoutX(900);
			rect.setLayoutY(80 + y5Increment);
			rect.setWidth(100);
			rect.setHeight(20);
			rect.setFill(Color.rgb(191, 191, 191));
			rect.setStroke(Color.BLACK);
			rect.setStrokeWidth(1);
			y5Increment += 20;
			pane.getChildren().add(rect);
		}
	}

	public static void create3DisksRaid4Labels() {

		Text1 physicalDisk = new Text1();
		Text1 physicalDisk1 = new Text1();
		Text1 parityDisk = new Text1();

		physicalDisk.setText("DISK 1");
		physicalDisk1.setText("DISK 2");
		parityDisk.setText("Parity DISK 3");

		physicalDisk.setLayoutX(337);
		physicalDisk.setLayoutY(screenHeight - 95);
		physicalDisk1.setLayoutX(535);
		physicalDisk1.setLayoutY(screenHeight - 95);
		parityDisk.setLayoutX(717);
		parityDisk.setLayoutY(screenHeight - 95);

		pane.getChildren().addAll(physicalDisk, physicalDisk1, parityDisk);
	}

	public static void create4DisksRaid4Labels() {

		Text1 physicalDisk = new Text1();
		Text1 physicalDisk1 = new Text1();
		Text1 physicalDisk2 = new Text1();
		Text1 parityDisk = new Text1();

		physicalDisk.setText("DISK 1");
		physicalDisk1.setText("DISK 2");
		physicalDisk2.setText("DISK 3");
		parityDisk.setText("Parity DISK 4");

		physicalDisk.setLayoutX(335);
		physicalDisk.setLayoutY(screenHeight - 95);
		physicalDisk1.setLayoutX(485);
		physicalDisk1.setLayoutY(screenHeight - 95);
		physicalDisk2.setLayoutX(635);
		physicalDisk2.setLayoutY(screenHeight - 95);
		parityDisk.setLayoutX(770);
		parityDisk.setLayoutY(screenHeight - 95);

		pane.getChildren().addAll(physicalDisk, physicalDisk1, physicalDisk2, parityDisk);
	}

	public static void create5DisksRaid4Labels() {

		Text1 physicalDisk = new Text1();
		Text1 physicalDisk1 = new Text1();
		Text1 physicalDisk2 = new Text1();
		Text1 physicalDisk3 = new Text1();
		Text1 parityDisk = new Text1();

		physicalDisk.setText("DISK 1");
		physicalDisk1.setText("DISK 2");
		physicalDisk2.setText("DISK 3");
		physicalDisk3.setText("DISK 4");
		parityDisk.setText("Parity DISK 5");

		physicalDisk.setLayoutX(340);
		physicalDisk.setLayoutY(screenHeight - 95);
		physicalDisk1.setLayoutX(485);
		physicalDisk1.setLayoutY(screenHeight - 95);
		physicalDisk2.setLayoutX(635);
		physicalDisk2.setLayoutY(screenHeight - 95);
		physicalDisk3.setLayoutX(785);
		physicalDisk3.setLayoutY(screenHeight - 95);
		parityDisk.setLayoutX(915);
		parityDisk.setLayoutY(screenHeight - 95);

		pane.getChildren().addAll(physicalDisk, physicalDisk1, physicalDisk2, physicalDisk3, parityDisk);
	}

}
