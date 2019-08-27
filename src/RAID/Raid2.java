package RAID;

import java.awt.Dimension;
import java.awt.Toolkit;

import RAID.Raid;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

public class Raid2 {

	private static Pane pane = Raid.pane;
	private static Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	@SuppressWarnings("unused")
	private static int screenWidth = (int) screenSize.getWidth();
	private static int screenHeight = (int) screenSize.getHeight();

	public static void createThreeDisks() {

		double yIncrement = 0;
		for (int i = 0; i < 512; i++) {
			Rectangles rect = new Rectangles();
			rect.setIndex(i);
			i++;
			rect.setLayoutX(300);
			rect.setLayoutY(63 + yIncrement);
			rect.setWidth(100);
			rect.setHeight(1.75);
			rect.setFill(Color.WHITE);
			rect.setStroke(Color.BLACK);
			rect.setStrokeWidth(0.75);
			yIncrement += 1.75;
			Raid.raid0.add(rect);
			pane.getChildren().add(rect);

		}

		double y2Increment = 0;
		for (int i = 1; i < 512; i++) {
			Rectangles rect = new Rectangles();
			rect.setIndex(i);
			i++;
			rect.setLayoutX(500);
			rect.setLayoutY(63 + y2Increment);
			rect.setWidth(100);
			rect.setHeight(1.75);
			rect.setFill(Color.WHITE);
			rect.setStroke(Color.BLACK);
			rect.setStrokeWidth(0.75);
			y2Increment += 1.75;
			Raid.raid0.add(rect);
			pane.getChildren().add(rect);
		}
		// PARITY DISK
		double y3Increment = 0;
		for (int i = 0; i < 256; i++) {
			Rectangles rect = new Rectangles();
			rect.setIndex(i);
			rect.setLayoutX(700);
			rect.setLayoutY(63 + y3Increment);
			rect.setWidth(100);
			rect.setHeight(1.75);
			rect.setFill(Color.rgb(191, 191, 191));
			rect.setStroke(Color.BLACK);
			rect.setStrokeWidth(1);
			y3Increment += 1.75;
			pane.getChildren().add(rect);
		}
	}

	public static void createFiveDisks() {

		double yIncrement = 0;
		for (int i = 0; i < 768; i++) {
			Rectangles rect = new Rectangles();
			rect.setIndex(i);
			i += 2;
			rect.setLayoutX(300);
			rect.setLayoutY(63 + yIncrement);
			rect.setWidth(100);
			rect.setHeight(1.75);
			rect.setFill(Color.WHITE);
			rect.setStroke(Color.BLACK);
			rect.setStrokeWidth(0.75);
			yIncrement += 1.75;
			Raid.raid0.add(rect);
			pane.getChildren().add(rect);

		}

		double y2Increment = 0;
		for (int i = 1; i < 768; i++) {
			Rectangles rect = new Rectangles();
			rect.setIndex(i);
			i += 2;
			rect.setLayoutX(450);
			rect.setLayoutY(63 + y2Increment);
			rect.setWidth(100);
			rect.setHeight(1.75);
			rect.setFill(Color.WHITE);
			rect.setStroke(Color.BLACK);
			rect.setStrokeWidth(0.75);
			y2Increment += 1.75;
			Raid.raid0.add(rect);
			pane.getChildren().add(rect);
		}

		double y3Increment = 0;
		for (int i = 2; i < 768; i++) {
			Rectangles rect = new Rectangles();
			rect.setIndex(i);
			i += 2;
			rect.setLayoutX(600);
			rect.setLayoutY(63 + y3Increment);
			rect.setWidth(100);
			rect.setHeight(1.75);
			rect.setFill(Color.WHITE);
			rect.setStroke(Color.BLACK);
			rect.setStrokeWidth(0.75);
			y3Increment += 1.75;
			Raid.raid0.add(rect);
			pane.getChildren().add(rect);
		}
		// PARITY DISKS
		double y4Increment = 0;
		for (int i = 0; i < 256; i++) {
			Rectangles rect = new Rectangles();
			rect.setIndex(i);
			rect.setLayoutX(750);
			rect.setLayoutY(63 + y4Increment);
			rect.setWidth(100);
			rect.setHeight(1.75);
			rect.setFill(Color.rgb(191, 191, 191));
			rect.setStroke(Color.BLACK);
			rect.setStrokeWidth(1);
			y4Increment += 1.75;
			pane.getChildren().add(rect);
		}

		double y5Increment = 0;
		for (int i = 0; i < 256; i++) {
			Rectangles rect = new Rectangles();
			rect.setIndex(i);
			rect.setLayoutX(900);
			rect.setLayoutY(63 + y5Increment);
			rect.setWidth(100);
			rect.setHeight(1.75);
			rect.setFill(Color.rgb(191, 191, 191));
			rect.setStroke(Color.BLACK);
			rect.setStrokeWidth(1);
			y5Increment += 1.75;
			pane.getChildren().add(rect);
		}
	}

	public static void createSevenDisks() {

		double yIncrement = 0;
		for (int i = 0; i < 1024; i++) {
			Rectangles rect = new Rectangles();
			rect.setIndex(i);
			i += 3;
			rect.setLayoutX(250);
			rect.setLayoutY(63 + yIncrement);
			rect.setWidth(100);
			rect.setHeight(1.75);
			rect.setFill(Color.WHITE);
			rect.setStroke(Color.BLACK);
			rect.setStrokeWidth(0.75);
			yIncrement += 1.75;
			Raid.raid0.add(rect);
			pane.getChildren().add(rect);

		}

		double y2Increment = 0;
		for (int i = 1; i < 1024; i++) {
			Rectangles rect = new Rectangles();
			rect.setIndex(i);
			i += 3;
			rect.setLayoutX(360);
			rect.setLayoutY(63 + y2Increment);
			rect.setWidth(100);
			rect.setHeight(1.75);
			rect.setFill(Color.WHITE);
			rect.setStroke(Color.BLACK);
			rect.setStrokeWidth(0.75);
			y2Increment += 1.75;
			Raid.raid0.add(rect);
			pane.getChildren().add(rect);
		}

		double y3Increment = 0;
		for (int i = 2; i < 1024; i++) {
			Rectangles rect = new Rectangles();
			rect.setIndex(i);
			i += 3;
			rect.setLayoutX(470);
			rect.setLayoutY(63 + y3Increment);
			rect.setWidth(100);
			rect.setHeight(1.75);
			rect.setFill(Color.WHITE);
			rect.setStroke(Color.BLACK);
			rect.setStrokeWidth(0.75);
			y3Increment += 1.75;
			Raid.raid0.add(rect);
			pane.getChildren().add(rect);

		}

		double y4Increment = 0;
		for (int i = 3; i < 1024; i++) {
			Rectangles rect = new Rectangles();
			rect.setIndex(i);
			i += 3;
			rect.setLayoutX(580);
			rect.setLayoutY(63 + y4Increment);
			rect.setWidth(100);
			rect.setHeight(1.75);
			rect.setFill(Color.WHITE);
			rect.setStroke(Color.BLACK);
			rect.setStrokeWidth(0.75);
			y4Increment += 1.75;
			Raid.raid0.add(rect);
			pane.getChildren().add(rect);

		}
		// PARITY DISKS
		double y5Increment = 0;
		for (int i = 0; i < 256; i++) {
			Rectangles rect = new Rectangles();
			rect.setIndex(i);
			rect.setLayoutX(690);
			rect.setLayoutY(63 + y5Increment);
			rect.setWidth(100);
			rect.setHeight(1.75);
			rect.setFill(Color.rgb(191, 191, 191));
			rect.setStroke(Color.BLACK);
			rect.setStrokeWidth(1);
			y5Increment += 1.75;
			pane.getChildren().add(rect);
		}

		double y6Increment = 0;
		for (int i = 0; i < 256; i++) {
			Rectangles rect = new Rectangles();
			rect.setIndex(i);
			rect.setLayoutX(800);
			rect.setLayoutY(63 + y6Increment);
			rect.setWidth(100);
			rect.setHeight(1.75);
			rect.setFill(Color.rgb(191, 191, 191));
			rect.setStroke(Color.BLACK);
			rect.setStrokeWidth(1);
			y6Increment += 1.75;
			pane.getChildren().add(rect);

		}

		double y7Increment = 0;
		for (int i = 0; i < 256; i++) {
			Rectangles rect = new Rectangles();
			rect.setIndex(i);
			rect.setLayoutX(910);
			rect.setLayoutY(63 + y7Increment);
			rect.setWidth(100);
			rect.setHeight(1.75);
			rect.setFill(Color.rgb(191, 191, 191));
			rect.setStroke(Color.BLACK);
			rect.setStrokeWidth(1);
			y7Increment += 1.75;
			pane.getChildren().add(rect);

		}
	}

	public static void create3DisksRaid2Labels() {

		Text1 physicalDisk = new Text1();
		Text1 physicalDisk1 = new Text1();
		Text1 parityDisk = new Text1();
		Text1 description = new Text1();

		physicalDisk.setText("DISK 1");
		physicalDisk1.setText("DISK 2");
		parityDisk.setText("Parity DISK 3");
		description.setText("(Error-Correction Disk)");

		physicalDisk.setLayoutX(337);
		physicalDisk.setLayoutY(screenHeight - 60);
		physicalDisk1.setLayoutX(535);
		physicalDisk1.setLayoutY(screenHeight - 60);
		parityDisk.setLayoutX(717);
		parityDisk.setLayoutY(screenHeight - 70);
		description.setLayoutX(695);
		description.setLayoutY(screenHeight - 55);

		pane.getChildren().addAll(physicalDisk, physicalDisk1, parityDisk, description);
	}

	public static void create5DisksRaid2Labels() {

		Text1 physicalDisk = new Text1();
		Text1 physicalDisk1 = new Text1();
		Text1 physicalDisk2 = new Text1();
		Text1 parityDisk = new Text1();
		Text1 parityDisk1 = new Text1();
		Text1 description = new Text1();

		physicalDisk.setText("DISK 1");
		physicalDisk1.setText("DISK 2");
		physicalDisk2.setText("DISK 3");
		parityDisk.setText("Parity DISK 4");
		parityDisk1.setText("Parity DISK 5");
		description.setText("(Error-Correction Disks)");

		physicalDisk.setLayoutX(340);
		physicalDisk.setLayoutY(screenHeight - 60);
		physicalDisk1.setLayoutX(485);
		physicalDisk1.setLayoutY(screenHeight - 60);
		physicalDisk2.setLayoutX(635);
		physicalDisk2.setLayoutY(screenHeight - 60);
		parityDisk.setLayoutX(765);
		parityDisk.setLayoutY(screenHeight - 70);
		parityDisk1.setLayoutX(915);
		parityDisk1.setLayoutY(screenHeight - 70);
		description.setLayoutX(810);
		description.setLayoutY(screenHeight - 55);

		pane.getChildren().addAll(physicalDisk, physicalDisk1, physicalDisk2, parityDisk, parityDisk1, description);
	}

	public static void create7DisksRaid2Labels() {

		Text1 physicalDisk = new Text1();
		Text1 physicalDisk1 = new Text1();
		Text1 physicalDisk2 = new Text1();
		Text1 physicalDisk3 = new Text1();
		Text1 parityDisk = new Text1();
		Text1 parityDisk1 = new Text1();
		Text1 parityDisk2 = new Text1();
		Text1 description = new Text1();

		physicalDisk.setText("DISK 1");
		physicalDisk1.setText("DISK 2");
		physicalDisk2.setText("DISK 3");
		physicalDisk3.setText("DISK 4");
		parityDisk.setText("Parity DISK 5");
		parityDisk1.setText("Parity DISK 6");
		parityDisk2.setText("Parity DISK 7");
		description.setText("(Error-Correction Disks)");

		physicalDisk.setLayoutX(285);
		physicalDisk.setLayoutY(screenHeight - 60);
		physicalDisk1.setLayoutX(395);
		physicalDisk1.setLayoutY(screenHeight - 60);
		physicalDisk2.setLayoutX(505);
		physicalDisk2.setLayoutY(screenHeight - 60);
		physicalDisk3.setLayoutX(615);
		physicalDisk3.setLayoutY(screenHeight - 60);
		parityDisk.setLayoutX(710);
		parityDisk.setLayoutY(screenHeight - 70);
		parityDisk1.setLayoutX(820);
		parityDisk1.setLayoutY(screenHeight - 70);
		parityDisk2.setLayoutX(930);
		parityDisk2.setLayoutY(screenHeight - 70);
		description.setLayoutX(790);
		description.setLayoutY(screenHeight - 55);

		pane.getChildren().addAll(physicalDisk, physicalDisk1, physicalDisk2, physicalDisk3, parityDisk, parityDisk1,
				parityDisk2, description);
	}

}
