package RAID;

import java.awt.Dimension;
import java.awt.Toolkit;

import RAID.Raid;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

public class Raid1 {

	private static Pane pane = Raid.pane;
	private static Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	@SuppressWarnings("unused")
	private static int screenWidth = (int) screenSize.getWidth();
	private static int screenHeight = (int) screenSize.getHeight();

	public static void createTwoDisks() {

		double yIncrement = 0;
		for (int i = 0; i < 128; i++) {
			Rectangles rect = new Rectangles();
			rect.setIndex(i);
			rect.setLayoutX(800);
			rect.setLayoutY(120 + yIncrement);
			rect.setWidth(100);
			rect.setHeight(6);
			rect.setFill(Color.WHITE);
			rect.setStroke(Color.BLACK);
			rect.setStrokeWidth(1);
			yIncrement += 6;
			Raid.raid0.add(rect);
			pane.getChildren().add(rect);

		}

		double y2Increment = 0;
		for (int i = 0; i < 128; i++) {
			Rectangles rect = new Rectangles();
			rect.setIndex(i);
			rect.setLayoutX(1000);
			rect.setLayoutY(120 + y2Increment);
			rect.setWidth(100);
			rect.setHeight(6);
			rect.setFill(Color.rgb(191, 191, 191));
			rect.setStroke(Color.BLACK);
			rect.setStrokeWidth(1);
			y2Increment += 6;
			Raid.raid1.add(rect);
			pane.getChildren().add(rect);
		}

	}

	public static void createFourDisks() {

		double yIncrement = 0;
		for (int i = 0; i < 256; i++) {
			Rectangles rect = new Rectangles();
			rect.setIndex(i);
			i++;
			rect.setLayoutX(600);
			rect.setLayoutY(120 + yIncrement);
			rect.setWidth(100);
			rect.setHeight(6);
			rect.setFill(Color.WHITE);
			rect.setStroke(Color.BLACK);
			rect.setStrokeWidth(1);
			yIncrement += 6;
			Raid.raid0.add(rect);
			pane.getChildren().add(rect);

		}

		double y2Increment = 0;
		for (int i = 1; i < 256; i++) {
			Rectangles rect = new Rectangles();
			rect.setIndex(i);
			i++;
			rect.setLayoutX(800);
			rect.setLayoutY(120 + y2Increment);
			rect.setWidth(100);
			rect.setHeight(6);
			rect.setFill(Color.WHITE);
			rect.setStroke(Color.BLACK);
			rect.setStrokeWidth(1);
			y2Increment += 6;
			Raid.raid0.add(rect);
			pane.getChildren().add(rect);
		}
		// Mirror DISKS
		double y3Increment = 0;
		for (int i = 0; i < 256; i++) {
			Rectangles rect = new Rectangles();
			rect.setIndex(i);
			i++;
			rect.setLayoutX(1000);
			rect.setLayoutY(120 + y3Increment);
			rect.setWidth(100);
			rect.setHeight(6);
			rect.setFill(Color.rgb(191, 191, 191));
			rect.setStroke(Color.BLACK);
			rect.setStrokeWidth(1);
			y3Increment += 6;
			Raid.raid1.add(rect);
			pane.getChildren().add(rect);

		}

		double y4Increment = 0;
		for (int i = 1; i < 256; i++) {
			Rectangles rect = new Rectangles();
			rect.setIndex(i);
			i++;
			rect.setLayoutX(1200);
			rect.setLayoutY(120 + y4Increment);
			rect.setWidth(100);
			rect.setHeight(6);
			rect.setFill(Color.rgb(191, 191, 191));
			rect.setStroke(Color.BLACK);
			rect.setStrokeWidth(1);
			y4Increment += 6;
			Raid.raid1.add(rect);
			pane.getChildren().add(rect);
		}

	}

	public static void createSixDisks() {

		double yIncrement = 0;
		for (int i = 0; i < 384; i++) {
			Rectangles rect = new Rectangles();
			rect.setIndex(i);
			i += 2;
			rect.setLayoutX(400);
			rect.setLayoutY(120 + yIncrement);
			rect.setWidth(100);
			rect.setHeight(6);
			rect.setFill(Color.WHITE);
			rect.setStroke(Color.BLACK);
			rect.setStrokeWidth(1);
			yIncrement += 6;
			Raid.raid0.add(rect);
			pane.getChildren().add(rect);

		}

		double y2Increment = 0;
		for (int i = 1; i < 384; i++) {
			Rectangles rect = new Rectangles();
			rect.setIndex(i);
			i += 2;
			rect.setLayoutX(600);
			rect.setLayoutY(120 + y2Increment);
			rect.setWidth(100);
			rect.setHeight(6);
			rect.setFill(Color.WHITE);
			rect.setStroke(Color.BLACK);
			rect.setStrokeWidth(1);
			y2Increment += 6;
			Raid.raid0.add(rect);
			pane.getChildren().add(rect);
		}

		double y3Increment = 0;
		for (int i = 2; i < 384; i++) {
			Rectangles rect = new Rectangles();
			rect.setIndex(i);
			i += 2;
			rect.setLayoutX(800);
			rect.setLayoutY(120 + y3Increment);
			rect.setWidth(100);
			rect.setHeight(6);
			rect.setFill(Color.WHITE);
			rect.setStroke(Color.BLACK);
			rect.setStrokeWidth(1);
			y3Increment += 6;
			Raid.raid0.add(rect);
			pane.getChildren().add(rect);

		}
		// MIRROR DISKS
		double y4Increment = 0;
		for (int i = 0; i < 384; i++) {
			Rectangles rect = new Rectangles();
			rect.setIndex(i);
			i += 2;
			rect.setLayoutX(1000);
			rect.setLayoutY(120 + y4Increment);
			rect.setWidth(100);
			rect.setHeight(6);
			rect.setFill(Color.rgb(191, 191, 191));
			rect.setStroke(Color.BLACK);
			rect.setStrokeWidth(1);
			y4Increment += 6;
			Raid.raid1.add(rect);
			pane.getChildren().add(rect);

		}

		double y5Increment = 0;
		for (int i = 1; i < 384; i++) {
			Rectangles rect = new Rectangles();
			rect.setIndex(i);
			i += 2;
			rect.setLayoutX(1200);
			rect.setLayoutY(120 + y5Increment);
			rect.setWidth(100);
			rect.setHeight(6);
			rect.setFill(Color.rgb(191, 191, 191));
			rect.setStroke(Color.BLACK);
			rect.setStrokeWidth(1);
			y5Increment += 6;
			Raid.raid1.add(rect);
			pane.getChildren().add(rect);
		}

		double y6Increment = 0;
		for (int i = 2; i < 384; i++) {
			Rectangles rect = new Rectangles();
			rect.setIndex(i);
			i += 2;
			rect.setLayoutX(1400);
			rect.setLayoutY(120 + y6Increment);
			rect.setWidth(100);
			rect.setHeight(6);
			rect.setFill(Color.rgb(191, 191, 191));
			rect.setStroke(Color.BLACK);
			rect.setStrokeWidth(1);
			y6Increment += 6;
			Raid.raid1.add(rect);
			pane.getChildren().add(rect);

		}
	}

	public static void create2DisksRaid1Labels() {

		Text1 physicalDisk = new Text1();
		Text1 mirrorDisk = new Text1();

		physicalDisk.setText("DISK 1");
		mirrorDisk.setText("Mirror DISK 2");

		physicalDisk.setLayoutX(830);
		physicalDisk.setLayoutY(screenHeight - 160);
		mirrorDisk.setLayoutX(1007);
		mirrorDisk.setLayoutY(screenHeight - 160);

		pane.getChildren().addAll(physicalDisk, mirrorDisk);
	}

	public static void create4DisksRaid1Labels() {

		Text1 physicalDisk = new Text1();
		Text1 physicalDisk1 = new Text1();
		Text1 mirrorDisk = new Text1();
		Text1 mirrorDisk1 = new Text1();

		physicalDisk.setText("DISK 1");
		physicalDisk1.setText("DISK 2");
		mirrorDisk.setText("Mirror DISK 3");
		mirrorDisk1.setText("Mirror DISK 4");

		physicalDisk.setLayoutX(630);
		physicalDisk.setLayoutY(screenHeight - 160);
		physicalDisk1.setLayoutX(830);
		physicalDisk1.setLayoutY(screenHeight - 160);
		mirrorDisk.setLayoutX(1007);
		mirrorDisk.setLayoutY(screenHeight - 160);
		mirrorDisk1.setLayoutX(1207);
		mirrorDisk1.setLayoutY(screenHeight - 160);

		pane.getChildren().addAll(physicalDisk, physicalDisk1, mirrorDisk, mirrorDisk1);
	}

	public static void create6DisksRaid1Labels() {

		Text1 physicalDisk = new Text1();
		Text1 physicalDisk1 = new Text1();
		Text1 physicalDisk2 = new Text1();
		Text1 mirrorDisk = new Text1();
		Text1 mirrorDisk1 = new Text1();
		Text1 mirrorDisk2 = new Text1();

		physicalDisk.setText("DISK 1");
		physicalDisk1.setText("DISK 2");
		physicalDisk2.setText("DISK 3");
		mirrorDisk.setText("Mirror DISK 4");
		mirrorDisk1.setText("Mirror DISK 5");
		mirrorDisk2.setText("Mirror DISK 6");

		physicalDisk.setLayoutX(430);
		physicalDisk.setLayoutY(screenHeight - 160);
		physicalDisk1.setLayoutX(630);
		physicalDisk1.setLayoutY(screenHeight - 160);
		physicalDisk2.setLayoutX(830);
		physicalDisk2.setLayoutY(screenHeight - 160);
		mirrorDisk.setLayoutX(1007);
		mirrorDisk.setLayoutY(screenHeight - 160);
		mirrorDisk1.setLayoutX(1207);
		mirrorDisk1.setLayoutY(screenHeight - 160);
		mirrorDisk2.setLayoutX(1407);
		mirrorDisk2.setLayoutY(screenHeight - 160);

		pane.getChildren().addAll(physicalDisk, physicalDisk1, physicalDisk2, mirrorDisk, mirrorDisk1, mirrorDisk2);
	}

}
