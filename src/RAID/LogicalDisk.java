package RAID;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.List;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

public class LogicalDisk {

	private static Pane pane = Raid.pane;
	private static Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	@SuppressWarnings("unused")
	private static int screenWidth = (int) screenSize.getWidth();
	private static int screenHeight = (int) screenSize.getHeight();

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static List<Rectangles1> logicalDisk = new ArrayList();

	public static void sixtyFourBytes() {

		double xIncrement = 0, yIncrement = 0, incrementValue = 12, layoutX = 30, layoutY = 95;
		int index = 0;

		for (int i = 1; i <= 64; i++) {
			yIncrement += incrementValue;
			xIncrement = 0;

			Rectangles1 rect = new Rectangles1();
			logicalDisk.add(rect);
			rect.setFill(Color.rgb(0, 128, 192));
			rect.setStroke(Color.BLACK);
			rect.setStrokeWidth(1);
			rect.setId("logical");
			rect.setWidth(100);
			rect.setHeight(12);
			rect.setLayoutX(layoutX + xIncrement);
			rect.setLayoutY(layoutY + yIncrement);
			rect.setIndex(index);

			index++;
			xIncrement += incrementValue;
			pane.getChildren().add(rect);

		}

	}

	public static void oneTwoEightBytes() {

		double xIncrement = 0, yIncrement = 0, incrementValue = 6, layoutX = 30, layoutY = 101;
		int index = 0;

		for (int i = 1; i <= 128; i++) {
			yIncrement += incrementValue;
			xIncrement = 0;

			Rectangles1 rect = new Rectangles1();
			logicalDisk.add(rect);
			rect.setFill(Color.rgb(0, 128, 192));
			rect.setStroke(Color.BLACK);
			rect.setStrokeWidth(1);
			rect.setId("logical");
			rect.setWidth(100);
			rect.setHeight(6);
			rect.setLayoutX(layoutX + xIncrement);
			rect.setLayoutY(layoutY + yIncrement);
			rect.setIndex(index);

			index++;
			xIncrement += incrementValue;
			pane.getChildren().add(rect);

		}

	}

	public static void twentyBlocks() {

		double xIncrement = 0, yIncrement = 0, incrementValue = 40, layoutX = 30, layoutY = 80;
		int index = 0;

		for (int i = 1; i <= 20; i++) {
			yIncrement += incrementValue;
			xIncrement = 0;

			Rectangles1 rect = new Rectangles1();
			logicalDisk.add(rect);
			rect.setFill(Color.rgb(0, 128, 192));
			rect.setStroke(Color.BLACK);
			rect.setStrokeWidth(1);
			rect.setId("logical");
			rect.setWidth(100);
			rect.setHeight(40);
			rect.setLayoutX(layoutX + xIncrement);
			rect.setLayoutY(layoutY + yIncrement);
			rect.setIndex(index);

			index++;
			xIncrement += incrementValue;
			pane.getChildren().add(rect);

		}

	}

	public static void fourtyBlocks() {

		double xIncrement = 0, yIncrement = 0, incrementValue = 20, layoutX = 30, layoutY = 100;
		int index = 0;

		for (int i = 1; i <= 40; i++) {
			yIncrement += incrementValue;
			xIncrement = 0;

			Rectangles1 rect = new Rectangles1();
			logicalDisk.add(rect);
			rect.setFill(Color.rgb(0, 128, 192));
			rect.setStroke(Color.BLACK);
			rect.setStrokeWidth(1);
			rect.setId("logical");
			rect.setWidth(100);
			rect.setHeight(20);
			rect.setLayoutX(layoutX + xIncrement);
			rect.setLayoutY(layoutY + yIncrement);
			rect.setIndex(index);

			index++;
			xIncrement += incrementValue;
			pane.getChildren().add(rect);

		}

	}

	public static void oneTwoEightBits() {

		double xIncrement = 0, yIncrement = 0, incrementValue = 3.5, layoutX = 30, layoutY = 60;
		int index = 0;

		for (int i = 1; i <= 128; i++) {
			yIncrement += incrementValue;
			xIncrement = 0;

			Rectangles1 rect = new Rectangles1();
			logicalDisk.add(rect);
			rect.setFill(Color.rgb(0, 128, 192));
			rect.setStroke(Color.BLACK);
			rect.setStrokeWidth(1);
			rect.setId("logical");
			rect.setWidth(100);
			rect.setHeight(3.5);
			rect.setLayoutX(layoutX + xIncrement);
			rect.setLayoutY(layoutY + yIncrement);
			rect.setIndex(index);

			index++;
			xIncrement += incrementValue;
			pane.getChildren().add(rect);

		}

	}

	public static void twoFiveSixBits() {

		double xIncrement = 0, yIncrement = 0, incrementValue = 1.75, layoutX = 30, layoutY = 63;
		int index = 0;

		for (int i = 1; i <= 256; i++) {
			yIncrement += incrementValue;
			xIncrement = 0;

			Rectangles1 rect = new Rectangles1();
			logicalDisk.add(rect);
			rect.setFill(Color.rgb(0, 128, 192));
			rect.setStroke(Color.BLACK);
			rect.setStrokeWidth(1);
			rect.setId("logical");
			rect.setWidth(100);
			rect.setHeight(1.75);
			rect.setLayoutX(layoutX + xIncrement);
			rect.setLayoutY(layoutY + yIncrement);
			rect.setIndex(index);

			index++;
			xIncrement += incrementValue;
			pane.getChildren().add(rect);

		}

	}

	public static void Raid5tenBlocksfor3Disks() {

		double xIncrement = 0, yIncrement = 0, incrementValue = 40, layoutX = 30, layoutY = 40;
		int index = 0;

		for (int i = 1; i <= 10; i++) {
			yIncrement += incrementValue;
			xIncrement = 0;

			Rectangles1 rect = new Rectangles1();
			if (i == 3) {
				logicalDisk.add(rect);
				rect.setFill(Color.rgb(0, 128, 192));
				rect.setStroke(Color.BLACK);
				rect.setStrokeWidth(1);
				rect.setId("logical");
				rect.setWidth(100);
				rect.setHeight(40);
				rect.setLayoutX(layoutX + xIncrement);
				rect.setLayoutY(layoutY + yIncrement);
				index++;
				rect.setIndex(index);
			} else if (i == 4 || i == 9 || i == 10) {
				logicalDisk.add(rect);
				rect.setFill(Color.rgb(0, 128, 192));
				rect.setStroke(Color.BLACK);
				rect.setStrokeWidth(1);
				rect.setId("logical");
				rect.setWidth(100);
				rect.setHeight(40);
				rect.setLayoutX(layoutX + xIncrement);
				rect.setLayoutY(layoutY + yIncrement);
				index += 2;
				rect.setIndex(index);
			} else if (i == 5) {
				logicalDisk.add(rect);
				rect.setFill(Color.rgb(0, 128, 192));
				rect.setStroke(Color.BLACK);
				rect.setStrokeWidth(1);
				rect.setId("logical");
				rect.setWidth(100);
				rect.setHeight(40);
				rect.setLayoutX(layoutX + xIncrement);
				rect.setLayoutY(layoutY + yIncrement);
				index += 2;
				rect.setIndex(index);
				index++;
			} else {
				logicalDisk.add(rect);
				rect.setFill(Color.rgb(0, 128, 192));
				rect.setStroke(Color.BLACK);
				rect.setStrokeWidth(1);
				rect.setId("logical");
				rect.setWidth(100);
				rect.setHeight(40);
				rect.setLayoutX(layoutX + xIncrement);
				rect.setLayoutY(layoutY + yIncrement);
				rect.setIndex(index);
				index++;
			}

			xIncrement += incrementValue;
			pane.getChildren().add(rect);

		}

	}

	public static void Raid5twentyBlocksfor3Disks() {

		double xIncrement = 0, yIncrement = 0, incrementValue = 20, layoutX = 30, layoutY = 60;
		int index = 0;

		for (int i = 1; i <= 20; i++) {
			yIncrement += incrementValue;
			xIncrement = 0;

			Rectangles1 rect = new Rectangles1();
			if (i == 3) {
				logicalDisk.add(rect);
				rect.setFill(Color.rgb(0, 128, 192));
				rect.setStroke(Color.BLACK);
				rect.setStrokeWidth(1);
				rect.setId("logical");
				rect.setWidth(100);
				rect.setHeight(20);
				rect.setLayoutX(layoutX + xIncrement);
				rect.setLayoutY(layoutY + yIncrement);
				index++;
				rect.setIndex(index);
			} else if (i == 4 || i == 9 || i == 10 || i == 15 || i == 16) {
				logicalDisk.add(rect);
				rect.setFill(Color.rgb(0, 128, 192));
				rect.setStroke(Color.BLACK);
				rect.setStrokeWidth(1);
				rect.setId("logical");
				rect.setWidth(100);
				rect.setHeight(20);
				rect.setLayoutX(layoutX + xIncrement);
				rect.setLayoutY(layoutY + yIncrement);
				index += 2;
				rect.setIndex(index);
			} else if (i == 5 || i == 11 || i == 17) {
				logicalDisk.add(rect);
				rect.setFill(Color.rgb(0, 128, 192));
				rect.setStroke(Color.BLACK);
				rect.setStrokeWidth(1);
				rect.setId("logical");
				rect.setWidth(100);
				rect.setHeight(20);
				rect.setLayoutX(layoutX + xIncrement);
				rect.setLayoutY(layoutY + yIncrement);
				index += 2;
				rect.setIndex(index);
				index++;
			} else {
				logicalDisk.add(rect);
				rect.setFill(Color.rgb(0, 128, 192));
				rect.setStroke(Color.BLACK);
				rect.setStrokeWidth(1);
				rect.setId("logical");
				rect.setWidth(100);
				rect.setHeight(20);
				rect.setLayoutX(layoutX + xIncrement);
				rect.setLayoutY(layoutY + yIncrement);
				rect.setIndex(index);
				index++;
			}

			xIncrement += incrementValue;
			pane.getChildren().add(rect);

		}
	}

	public static void Raid5tenBlocksfor4Disks() {

		double xIncrement = 0, yIncrement = 0, incrementValue = 40, layoutX = 30, layoutY = 40;
		int index = 0;

		for (int i = 1; i <= 10; i++) {
			yIncrement += incrementValue;
			xIncrement = 0;

			Rectangles1 rect = new Rectangles1();
			if (i == 4 || i == 6 || i == 8 || i == 10) {
				logicalDisk.add(rect);
				rect.setFill(Color.rgb(0, 128, 192));
				rect.setStroke(Color.BLACK);
				rect.setStrokeWidth(1);
				rect.setId("logical");
				rect.setWidth(100);
				rect.setHeight(40);
				rect.setLayoutX(layoutX + xIncrement);
				rect.setLayoutY(layoutY + yIncrement);
				index++;
				rect.setIndex(index);
				index++;
			} else {
				logicalDisk.add(rect);
				rect.setFill(Color.rgb(0, 128, 192));
				rect.setStroke(Color.BLACK);
				rect.setStrokeWidth(1);
				rect.setId("logical");
				rect.setWidth(100);
				rect.setHeight(40);
				rect.setLayoutX(layoutX + xIncrement);
				rect.setLayoutY(layoutY + yIncrement);
				rect.setIndex(index);
				index++;
			}

			xIncrement += incrementValue;
			pane.getChildren().add(rect);

		}

	}

	public static void Raid5twentyBlocksfor4Disks() {

		double xIncrement = 0, yIncrement = 0, incrementValue = 20, layoutX = 30, layoutY = 60;
		int index = 0;

		for (int i = 1; i <= 20; i++) {
			yIncrement += incrementValue;
			xIncrement = 0;

			Rectangles1 rect = new Rectangles1();
			if (i == 4 || i == 6 || i == 8 || i == 10 || i == 16 || i == 18 || i == 20) {
				logicalDisk.add(rect);
				rect.setFill(Color.rgb(0, 128, 192));
				rect.setStroke(Color.BLACK);
				rect.setStrokeWidth(1);
				rect.setId("logical");
				rect.setWidth(100);
				rect.setHeight(20);
				rect.setLayoutX(layoutX + xIncrement);
				rect.setLayoutY(layoutY + yIncrement);
				index++;
				rect.setIndex(index);
				index++;
			} else {
				logicalDisk.add(rect);
				rect.setFill(Color.rgb(0, 128, 192));
				rect.setStroke(Color.BLACK);
				rect.setStrokeWidth(1);
				rect.setId("logical");
				rect.setWidth(100);
				rect.setHeight(20);
				rect.setLayoutX(layoutX + xIncrement);
				rect.setLayoutY(layoutY + yIncrement);
				rect.setIndex(index);
				index++;
			}

			xIncrement += incrementValue;
			pane.getChildren().add(rect);

		}
	}

	public static void Raid5tenBlocksfor5Disks() {

		double xIncrement = 0, yIncrement = 0, incrementValue = 40, layoutX = 30, layoutY = 40;
		int index = 0;

		for (int i = 1; i <= 10; i++) {
			yIncrement += incrementValue;
			xIncrement = 0;

			Rectangles1 rect = new Rectangles1();
			if (i == 5 || i == 7 || i == 9) {
				logicalDisk.add(rect);
				rect.setFill(Color.rgb(0, 128, 192));
				rect.setStroke(Color.BLACK);
				rect.setStrokeWidth(1);
				rect.setId("logical");
				rect.setWidth(100);
				rect.setHeight(40);
				rect.setLayoutX(layoutX + xIncrement);
				rect.setLayoutY(layoutY + yIncrement);
				index++;
				rect.setIndex(index);
				index++;
			} else {
				logicalDisk.add(rect);
				rect.setFill(Color.rgb(0, 128, 192));
				rect.setStroke(Color.BLACK);
				rect.setStrokeWidth(1);
				rect.setId("logical");
				rect.setWidth(100);
				rect.setHeight(40);
				rect.setLayoutX(layoutX + xIncrement);
				rect.setLayoutY(layoutY + yIncrement);
				rect.setIndex(index);
				index++;
			}

			xIncrement += incrementValue;
			pane.getChildren().add(rect);

		}

	}

	public static void Raid5twentyBlocksfor5Disks() {

		double xIncrement = 0, yIncrement = 0, incrementValue = 20, layoutX = 30, layoutY = 60;
		int index = 0;

		for (int i = 1; i <= 20; i++) {
			yIncrement += incrementValue;
			xIncrement = 0;

			Rectangles1 rect = new Rectangles1();
			if (i == 5 || i == 7 || i == 9 || i == 16 || i == 18) {
				logicalDisk.add(rect);
				rect.setFill(Color.rgb(0, 128, 192));
				rect.setStroke(Color.BLACK);
				rect.setStrokeWidth(1);
				rect.setId("logical");
				rect.setWidth(100);
				rect.setHeight(20);
				rect.setLayoutX(layoutX + xIncrement);
				rect.setLayoutY(layoutY + yIncrement);
				index++;
				rect.setIndex(index);
				index++;
			} else {
				logicalDisk.add(rect);
				rect.setFill(Color.rgb(0, 128, 192));
				rect.setStroke(Color.BLACK);
				rect.setStrokeWidth(1);
				rect.setId("logical");
				rect.setWidth(100);
				rect.setHeight(20);
				rect.setLayoutX(layoutX + xIncrement);
				rect.setLayoutY(layoutY + yIncrement);
				rect.setIndex(index);
				index++;
			}

			xIncrement += incrementValue;
			pane.getChildren().add(rect);

		}
	}

	public static void Raid6tenBlocksfor3Disks() {

		double xIncrement = 0, yIncrement = 0, incrementValue = 40, layoutX = 30, layoutY = 40;
		int index = 0;

		for (int i = 1; i <= 10; i++) {
			yIncrement += incrementValue;
			xIncrement = 0;

			Rectangles1 rect = new Rectangles1();
			if (i == 2 || i == 3 || i == 5 || i == 6 || i == 8 || i == 9) {
				logicalDisk.add(rect);
				rect.setFill(Color.rgb(0, 128, 192));
				rect.setStroke(Color.BLACK);
				rect.setStrokeWidth(1);
				rect.setId("logical");
				rect.setWidth(100);
				rect.setHeight(40);
				rect.setLayoutX(layoutX + xIncrement);
				rect.setLayoutY(layoutY + yIncrement);
				index += 4;
				rect.setIndex(index);
				index++;
			} else {
				logicalDisk.add(rect);
				rect.setFill(Color.rgb(0, 128, 192));
				rect.setStroke(Color.BLACK);
				rect.setStrokeWidth(1);
				rect.setId("logical");
				rect.setWidth(100);
				rect.setHeight(40);
				rect.setLayoutX(layoutX + xIncrement);
				rect.setLayoutY(layoutY + yIncrement);
				rect.setIndex(index);
				index++;
			}

			xIncrement += incrementValue;
			pane.getChildren().add(rect);

		}

	}

	public static void Raid6twentyBlocksfor3Disks() {

		double xIncrement = 0, yIncrement = 0, incrementValue = 20, layoutX = 30, layoutY = 60;
		int index = 0;

		for (int i = 1; i <= 20; i++) {
			yIncrement += incrementValue;
			xIncrement = 0;

			Rectangles1 rect = new Rectangles1();
			if (i == 2 || i == 3 || i == 5 || i == 6 || i == 8 || i == 9 || i == 11 || i == 12 || i == 14 || i == 15
					|| i == 17 || i == 18 || i == 20) {
				logicalDisk.add(rect);
				rect.setFill(Color.rgb(0, 128, 192));
				rect.setStroke(Color.BLACK);
				rect.setStrokeWidth(1);
				rect.setId("logical");
				rect.setWidth(100);
				rect.setHeight(20);
				rect.setLayoutX(layoutX + xIncrement);
				rect.setLayoutY(layoutY + yIncrement);
				index += 3;
				rect.setIndex(index);
				index++;
			} else {
				logicalDisk.add(rect);
				rect.setFill(Color.rgb(0, 128, 192));
				rect.setStroke(Color.BLACK);
				rect.setStrokeWidth(1);
				rect.setId("logical");
				rect.setWidth(100);
				rect.setHeight(20);
				rect.setLayoutX(layoutX + xIncrement);
				rect.setLayoutY(layoutY + yIncrement);
				rect.setIndex(index);
				index++;
			}

			xIncrement += incrementValue;
			pane.getChildren().add(rect);

		}
	}

	public static void Raid6tenBlocksfor4Disks() {

		double xIncrement = 0, yIncrement = 0, incrementValue = 40, layoutX = 30, layoutY = 40;
		int index = 0;

		for (int i = 1; i <= 10; i++) {
			yIncrement += incrementValue;
			xIncrement = 0;

			Rectangles1 rect = new Rectangles1();
			if (i == 3 || i == 7 || i == 5 || i == 9 || i == 10) {
				logicalDisk.add(rect);
				rect.setFill(Color.rgb(0, 128, 192));
				rect.setStroke(Color.BLACK);
				rect.setStrokeWidth(1);
				rect.setId("logical");
				rect.setWidth(100);
				rect.setHeight(40);
				rect.setLayoutX(layoutX + xIncrement);
				rect.setLayoutY(layoutY + yIncrement);
				index += 2;
				rect.setIndex(index);
				index++;
			} else {
				logicalDisk.add(rect);
				rect.setFill(Color.rgb(0, 128, 192));
				rect.setStroke(Color.BLACK);
				rect.setStrokeWidth(1);
				rect.setId("logical");
				rect.setWidth(100);
				rect.setHeight(40);
				rect.setLayoutX(layoutX + xIncrement);
				rect.setLayoutY(layoutY + yIncrement);
				rect.setIndex(index);
				index++;
			}

			xIncrement += incrementValue;
			pane.getChildren().add(rect);

		}

	}

	public static void Raid6twentyBlocksfor4Disks() {

		double xIncrement = 0, yIncrement = 0, incrementValue = 20, layoutX = 30, layoutY = 60;
		int index = 0;

		for (int i = 1; i <= 20; i++) {
			yIncrement += incrementValue;
			xIncrement = 0;

			Rectangles1 rect = new Rectangles1();
			if (i == 3 || i == 7 || i == 5 || i == 9 || i == 10 || i == 11 || i == 15 || i == 16) {
				logicalDisk.add(rect);
				rect.setFill(Color.rgb(0, 128, 192));
				rect.setStroke(Color.BLACK);
				rect.setStrokeWidth(1);
				rect.setId("logical");
				rect.setWidth(100);
				rect.setHeight(20);
				rect.setLayoutX(layoutX + xIncrement);
				rect.setLayoutY(layoutY + yIncrement);
				index += 2;
				rect.setIndex(index);
				index++;
			} else {
				logicalDisk.add(rect);
				rect.setFill(Color.rgb(0, 128, 192));
				rect.setStroke(Color.BLACK);
				rect.setStrokeWidth(1);
				rect.setId("logical");
				rect.setWidth(100);
				rect.setHeight(20);
				rect.setLayoutX(layoutX + xIncrement);
				rect.setLayoutY(layoutY + yIncrement);
				rect.setIndex(index);
				index++;
			}

			xIncrement += incrementValue;
			pane.getChildren().add(rect);

		}
	}

	public static void Raid6tenBlocksfor5Disks() {

		double xIncrement = 0, yIncrement = 0, incrementValue = 40, layoutX = 30, layoutY = 40;
		int index = 0;

		for (int i = 1; i <= 10; i++) {
			yIncrement += incrementValue;
			xIncrement = 0;

			Rectangles1 rect = new Rectangles1();
			if (i == 4 || i == 6 || i == 8 || i == 10) {
				logicalDisk.add(rect);
				rect.setFill(Color.rgb(0, 128, 192));
				rect.setStroke(Color.BLACK);
				rect.setStrokeWidth(1);
				rect.setId("logical");
				rect.setWidth(100);
				rect.setHeight(40);
				rect.setLayoutX(layoutX + xIncrement);
				rect.setLayoutY(layoutY + yIncrement);
				index += 2;
				rect.setIndex(index);
				index++;
			} else {
				logicalDisk.add(rect);
				rect.setFill(Color.rgb(0, 128, 192));
				rect.setStroke(Color.BLACK);
				rect.setStrokeWidth(1);
				rect.setId("logical");
				rect.setWidth(100);
				rect.setHeight(40);
				rect.setLayoutX(layoutX + xIncrement);
				rect.setLayoutY(layoutY + yIncrement);
				rect.setIndex(index);
				index++;
			}

			xIncrement += incrementValue;
			pane.getChildren().add(rect);

		}

	}

	public static void Raid6twentyBlocksfor5Disks() {

		double xIncrement = 0, yIncrement = 0, incrementValue = 20, layoutX = 30, layoutY = 60;
		int index = 0;

		for (int i = 1; i <= 20; i++) {
			yIncrement += incrementValue;
			xIncrement = 0;

			Rectangles1 rect = new Rectangles1();
			if (i == 4 || i == 6 || i == 8 || i == 10 || i == 16 || i == 18 || i == 20) {
				logicalDisk.add(rect);
				rect.setFill(Color.rgb(0, 128, 192));
				rect.setStroke(Color.BLACK);
				rect.setStrokeWidth(1);
				rect.setId("logical");
				rect.setWidth(100);
				rect.setHeight(20);
				rect.setLayoutX(layoutX + xIncrement);
				rect.setLayoutY(layoutY + yIncrement);
				index += 2;
				rect.setIndex(index);
				index++;
			} else {
				logicalDisk.add(rect);
				rect.setFill(Color.rgb(0, 128, 192));
				rect.setStroke(Color.BLACK);
				rect.setStrokeWidth(1);
				rect.setId("logical");
				rect.setWidth(100);
				rect.setHeight(20);
				rect.setLayoutX(layoutX + xIncrement);
				rect.setLayoutY(layoutY + yIncrement);
				rect.setIndex(index);
				index++;
			}

			xIncrement += incrementValue;
			pane.getChildren().add(rect);

		}
	}

	public static void createTwentyBlocksLogicalLabels() {

		Text2 logicalDisk = new Text2();
		Text2 logicalDescription = new Text2();

		logicalDisk.setText("Logical Disk");
		logicalDisk.setLayoutX(45);
		logicalDisk.setLayoutY(screenHeight - 135);

		logicalDescription.setText("(20 BLOCKS = 1024 BYTES)");
		logicalDescription.setLayoutX(11);
		logicalDescription.setLayoutY(screenHeight - 115);

		pane.getChildren().addAll(logicalDisk, logicalDescription);
	}

	public static void createFourtyBlocksLogicalLabels() {

		Text2 logicalDisk = new Text2();
		Text2 logicalDescription = new Text2();

		logicalDisk.setText("Logical Disk");
		logicalDisk.setLayoutX(45);
		logicalDisk.setLayoutY(screenHeight - 135);

		logicalDescription.setText("(40 BLOCKS = 2048 BYTES)");
		logicalDescription.setLayoutX(11);
		logicalDescription.setLayoutY(screenHeight - 115);

		pane.getChildren().addAll(logicalDisk, logicalDescription);

	}
	
	public static void createSixtyFourBytesLogicalLabels() {

		Text2 logicalDisk = new Text2();
		Text2 logicalDescription = new Text2();

		logicalDisk.setText("Logical Disk");
		logicalDisk.setLayoutX(45);
		logicalDisk.setLayoutY(screenHeight - 175);

		logicalDescription.setText("(64 BYTES = 512 BITS)");
		logicalDescription.setLayoutX(11);
		logicalDescription.setLayoutY(screenHeight - 155);

		pane.getChildren().addAll(logicalDisk, logicalDescription);

	}
	
	public static void createOneTwoEightBytesLogicalLabels() {

		Text2 logicalDisk = new Text2();
		Text2 logicalDescription = new Text2();

		logicalDisk.setText("Logical Disk");
		logicalDisk.setLayoutX(45);
		logicalDisk.setLayoutY(screenHeight - 175);

		logicalDescription.setText("(128 BYTES = 1024 BITS)");
		logicalDescription.setLayoutX(11);
		logicalDescription.setLayoutY(screenHeight - 155);

		pane.getChildren().addAll(logicalDisk, logicalDescription);
	}
	
	public static void createOneTwoEightBitsLogicalLabels() {

		Text2 logicalDisk = new Text2();
		Text2 logicalDescription = new Text2();

		logicalDisk.setText("Logical Disk");
		logicalDisk.setLayoutX(45);
		logicalDisk.setLayoutY(screenHeight - 175);

		logicalDescription.setText("(128 BITS = 16 BYTES)");
		logicalDescription.setLayoutX(11);
		logicalDescription.setLayoutY(screenHeight - 155);

		pane.getChildren().addAll(logicalDisk, logicalDescription);

	}
	
	public static void createTwoFiveSixBitsLogicalLabels() {

		Text2 logicalDisk = new Text2();
		Text2 logicalDescription = new Text2();

		logicalDisk.setText("Logical Disk");
		logicalDisk.setLayoutX(45);
		logicalDisk.setLayoutY(screenHeight - 175);

		logicalDescription.setText("(256 BITS = 32 BYTES)");
		logicalDescription.setLayoutX(11);
		logicalDescription.setLayoutY(screenHeight - 155);

		pane.getChildren().addAll(logicalDisk, logicalDescription);
	}

}
