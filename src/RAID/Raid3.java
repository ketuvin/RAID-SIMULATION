package RAID;

import java.awt.Dimension;
import java.awt.Toolkit;

import RAID.Raid;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

public class Raid3 {

	private static Pane pane = Raid.pane;
	private static Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	@SuppressWarnings("unused")
	private static int screenWidth = (int) screenSize.getWidth();
	private static int screenHeight = (int) screenSize.getHeight();

	public static void createThreeDisks() {

		double yIncrement = 0;
		for (int i = 0; i < 256; i++) {
			Rectangles rect = new Rectangles();
			rect.setIndex(i);
			i++;
			rect.setLayoutX(300);
			rect.setLayoutY(63 + yIncrement);
			rect.setWidth(100);
			rect.setHeight(3.5);
			rect.setFill(Color.WHITE);
			rect.setStroke(Color.BLACK);
			rect.setStrokeWidth(1);
			yIncrement += 3.5;
			Raid.raid0.add(rect);
			pane.getChildren().add(rect);

		}

		double y2Increment = 0;
		for (int i = 1; i < 256; i++) {
			Rectangles rect = new Rectangles();
			rect.setIndex(i);
			i++;
			rect.setLayoutX(500);
			rect.setLayoutY(63 + y2Increment);
			rect.setWidth(100);
			rect.setHeight(3.5);
			rect.setFill(Color.WHITE);
			rect.setStroke(Color.BLACK);
			rect.setStrokeWidth(1);
			y2Increment += 3.5;
			Raid.raid0.add(rect);
			pane.getChildren().add(rect);
		}
		// ONE DEDICATED PARITY DISK
		double y3Increment = 0;
		for (int i = 0; i < 128; i++) {
			Rectangles rect = new Rectangles();
			rect.setIndex(i);
			rect.setLayoutX(700);
			rect.setLayoutY(63 + y3Increment);
			rect.setWidth(100);
			rect.setHeight(3.5);
			rect.setFill(Color.rgb(191, 191, 191));
			rect.setStroke(Color.BLACK);
			rect.setStrokeWidth(1);
			y3Increment += 3.5;
			pane.getChildren().add(rect);
		}
	}

	public static void createFourDisks() {

		double yIncrement = 0;
		for (int i = 0; i < 384; i++) {
			Rectangles rect = new Rectangles();
			rect.setIndex(i);
			i += 2;
			rect.setLayoutX(300);
			rect.setLayoutY(63 + yIncrement);
			rect.setWidth(100);
			rect.setHeight(3.5);
			rect.setFill(Color.WHITE);
			rect.setStroke(Color.BLACK);
			rect.setStrokeWidth(1);
			yIncrement += 3.5;
			Raid.raid0.add(rect);
			pane.getChildren().add(rect);

		}

		double y2Increment = 0;
		for (int i = 1; i < 384; i++) {
			Rectangles rect = new Rectangles();
			rect.setIndex(i);
			i += 2;
			rect.setLayoutX(450);
			rect.setLayoutY(63 + y2Increment);
			rect.setWidth(100);
			rect.setHeight(3.5);
			rect.setFill(Color.WHITE);
			rect.setStroke(Color.BLACK);
			rect.setStrokeWidth(1);
			y2Increment += 3.5;
			Raid.raid0.add(rect);
			pane.getChildren().add(rect);
		}

		double y3Increment = 0;
		for (int i = 2; i < 384; i++) {
			Rectangles rect = new Rectangles();
			rect.setIndex(i);
			i += 2;
			rect.setLayoutX(600);
			rect.setLayoutY(63 + y3Increment);
			rect.setWidth(100);
			rect.setHeight(3.5);
			rect.setFill(Color.WHITE);
			rect.setStroke(Color.BLACK);
			rect.setStrokeWidth(1);
			y3Increment += 3.5;
			Raid.raid0.add(rect);
			pane.getChildren().add(rect);
		}
		// ONE DEDICATED PARITY DISK
		double y4Increment = 0;
		for (int i = 0; i < 128; i++) {
			Rectangles rect = new Rectangles();
			rect.setIndex(i);
			rect.setLayoutX(750);
			rect.setLayoutY(63 + y4Increment);
			rect.setWidth(100);
			rect.setHeight(3.5);
			rect.setFill(Color.rgb(191, 191, 191));
			rect.setStroke(Color.BLACK);
			rect.setStrokeWidth(1);
			y4Increment += 3.5;
			pane.getChildren().add(rect);
		}
	}

	public static void createFiveDisks() {

		double yIncrement = 0;
		for (int i = 0; i < 512; i++) {
			Rectangles rect = new Rectangles();
			rect.setIndex(i);
			i += 3;
			rect.setLayoutX(300);
			rect.setLayoutY(63 + yIncrement);
			rect.setWidth(100);
			rect.setHeight(3.5);
			rect.setFill(Color.WHITE);
			rect.setStroke(Color.BLACK);
			rect.setStrokeWidth(1);
			yIncrement += 3.5;
			Raid.raid0.add(rect);
			pane.getChildren().add(rect);

		}

		double y2Increment = 0;
		for (int i = 1; i < 512; i++) {
			Rectangles rect = new Rectangles();
			rect.setIndex(i);
			i += 3;
			rect.setLayoutX(450);
			rect.setLayoutY(63 + y2Increment);
			rect.setWidth(100);
			rect.setHeight(3.5);
			rect.setFill(Color.WHITE);
			rect.setStroke(Color.BLACK);
			rect.setStrokeWidth(1);
			y2Increment += 3.5;
			Raid.raid0.add(rect);
			pane.getChildren().add(rect);
		}

		double y3Increment = 0;
		for (int i = 2; i < 512; i++) {
			Rectangles rect = new Rectangles();
			rect.setIndex(i);
			i += 3;
			rect.setLayoutX(600);
			rect.setLayoutY(63 + y3Increment);
			rect.setWidth(100);
			rect.setHeight(3.5);
			rect.setFill(Color.WHITE);
			rect.setStroke(Color.BLACK);
			rect.setStrokeWidth(1);
			y3Increment += 3.5;
			Raid.raid0.add(rect);
			pane.getChildren().add(rect);
		}

		double y4Increment = 0;
		for (int i = 3; i < 512; i++) {
			Rectangles rect = new Rectangles();
			rect.setIndex(i);
			i += 3;
			rect.setLayoutX(750);
			rect.setLayoutY(63 + y4Increment);
			rect.setWidth(100);
			rect.setHeight(3.5);
			rect.setFill(Color.WHITE);
			rect.setStroke(Color.BLACK);
			rect.setStrokeWidth(1);
			y4Increment += 3.5;
			Raid.raid0.add(rect);
			pane.getChildren().add(rect);
		}
		// ONE DEDICATED PARITY DISK
		double y5Increment = 0;
		for (int i = 0; i < 128; i++) {
			Rectangles rect = new Rectangles();
			rect.setIndex(i);
			rect.setLayoutX(900);
			rect.setLayoutY(63 + y5Increment);
			rect.setWidth(100);
			rect.setHeight(3.5);
			rect.setFill(Color.rgb(191, 191, 191));
			rect.setStroke(Color.BLACK);
			rect.setStrokeWidth(1);
			y5Increment += 3.5;
			pane.getChildren().add(rect);
		}
	}

	public static void create3DisksRaid3Labels() {

		Text1 physicalDisk = new Text1();
		Text1 physicalDisk1 = new Text1();
		Text1 parityDisk = new Text1();

		physicalDisk.setText("DISK 1");
		physicalDisk1.setText("DISK 2");
		parityDisk.setText("Parity DISK 3");

		physicalDisk.setLayoutX(337);
		physicalDisk.setLayoutY(screenHeight - 60);
		physicalDisk1.setLayoutX(535);
		physicalDisk1.setLayoutY(screenHeight - 60);
		parityDisk.setLayoutX(717);
		parityDisk.setLayoutY(screenHeight - 60);

		pane.getChildren().addAll(physicalDisk, physicalDisk1, parityDisk);
	}

	public static void create4DisksRaid3Labels() {

		Text1 physicalDisk = new Text1();
		Text1 physicalDisk1 = new Text1();
		Text1 physicalDisk2 = new Text1();
		Text1 parityDisk = new Text1();

		physicalDisk.setText("DISK 1");
		physicalDisk1.setText("DISK 2");
		physicalDisk2.setText("DISK 3");
		parityDisk.setText("Parity DISK 4");

		physicalDisk.setLayoutX(335);
		physicalDisk.setLayoutY(screenHeight - 60);
		physicalDisk1.setLayoutX(485);
		physicalDisk1.setLayoutY(screenHeight - 60);
		physicalDisk2.setLayoutX(635);
		physicalDisk2.setLayoutY(screenHeight - 60);
		parityDisk.setLayoutX(770);
		parityDisk.setLayoutY(screenHeight - 60);

		pane.getChildren().addAll(physicalDisk, physicalDisk1, physicalDisk2, parityDisk);
	}

	public static void create5DisksRaid3Labels() {

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
		physicalDisk.setLayoutY(screenHeight - 60);
		physicalDisk1.setLayoutX(485);
		physicalDisk1.setLayoutY(screenHeight - 60);
		physicalDisk2.setLayoutX(635);
		physicalDisk2.setLayoutY(screenHeight - 60);
		physicalDisk3.setLayoutX(785);
		physicalDisk3.setLayoutY(screenHeight - 60);
		parityDisk.setLayoutX(915);
		parityDisk.setLayoutY(screenHeight - 60);

		pane.getChildren().addAll(physicalDisk, physicalDisk1, physicalDisk2, physicalDisk3, parityDisk);
	}

}
