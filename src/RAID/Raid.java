package RAID;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.List;
import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Raid extends Application {

	public static Pane pane;
	Scene scene;

	private static Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	private static int screenWidth = (int) screenSize.getWidth();
	private static int screenHeight = (int) screenSize.getHeight();

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static List<Rectangles> raid0 = new ArrayList();

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static List<Rectangles> raid1 = new ArrayList();

	@Override
	public void start(Stage primaryStage) {

		pane = new Pane();

		Menus.Menu();
		createRAIDLabel();

		scene = new Scene(pane);
		scene.getStylesheets().add("/RAID/Style.css");
		primaryStage.setScene(scene);
		primaryStage.setMaximized(true);
		primaryStage.setTitle("RAID - Redundant Array of Independent Disk");

		primaryStage.show();

	}

	public static void RAID0() {
		pane.getChildren().clear();
		raid0.clear();
		LogicalDisk.logicalDisk.clear();
		Play.arrMove.clear();

		createRAID0Label();

		Menus.Menu();
		Menus.CreateBlockLogicalMenu();
		Menus.CreateRaid0DiskMenu();

		Play.createRaid0PlayButton();

	}

	public static void RAID1() {
		pane.getChildren().clear();
		raid0.clear();
		raid1.clear();
		LogicalDisk.logicalDisk.clear();
		Play.arrMove.clear();

		Menus.Menu();
		Menus.CreateByteLogicalMenu();
		Menus.CreateRaid1DiskMenu();

		Play.createRaid1PlayButton();

		createRAID1Label();
	}

	public static void RAID2() {
		pane.getChildren().clear();
		raid0.clear();
		raid1.clear();
		LogicalDisk.logicalDisk.clear();
		Play.arrMove.clear();

		Menus.Menu();
		Menus.CreateBitLogicalMenu();
		Menus.CreateRaid2DiskMenu();

		Play.createRaid2PlayButton();

		createRAID2Label();
	}

	public static void RAID3() {
		pane.getChildren().clear();
		raid0.clear();
		raid1.clear();
		LogicalDisk.logicalDisk.clear();
		Play.arrMove.clear();

		Menus.Menu();
		Menus.CreateByteLogicalMenu();
		Menus.CreateRaid3DiskMenu();

		Play.createRaid3PlayButton();

		createRAID3Label();
	}

	public static void RAID4() {
		pane.getChildren().clear();

		raid0.clear();
		raid1.clear();
		LogicalDisk.logicalDisk.clear();
		Play.arrMove.clear();

		Menus.Menu();
		Menus.CreateBlockLogicalMenu();
		Menus.CreateRaid4DiskMenu();

		Play.createRaid4PlayButton();

		createRAID4Label();
	}

	public static void RAID5() {
		pane.getChildren().clear();

		raid0.clear();
		raid1.clear();
		LogicalDisk.logicalDisk.clear();
		Play.arrMove.clear();

		Menus.Menu();
		Menus.CreateRaid5BlockLogicalMenu();
		Menus.CreateRaid5DiskMenu();

		Play.createRaid5PlayButton();

		createRAID5Label();
	}

	public static void RAID6() {
		pane.getChildren().clear();

		raid0.clear();
		raid1.clear();
		LogicalDisk.logicalDisk.clear();
		Play.arrMove.clear();

		Menus.Menu();
		Menus.CreateRaid6BlockLogicalMenu();
		Menus.CreateRaid6DiskMenu();

		Play.createRaid6PlayButton();

		createRAID6Label();
	}

	public static Rectangles findIndex(int index) {
		for (int i = 0; i < raid0.size(); i++) {
			if (raid0.get(i).getIndex() == index) {
				return raid0.get(i);
			}
		}
		return null;
	}

	public static Rectangles findIndex2(int index) {
		for (int i = 0; i < raid1.size(); i++) {
			if (raid1.get(i).getIndex() == index) {
				return raid1.get(i);
			}
		}
		return null;
	}

	public static void deleteDisk() {
		List<Rectangles> toBeDeleted = new ArrayList<Rectangles>();
		for (Node temp : pane.getChildren()) {
			if (temp instanceof Rectangles) {
				Rectangles rect = (Rectangles) temp;
				toBeDeleted.add(rect);
			}
		}
		for (Rectangles rect : toBeDeleted) {

			pane.getChildren().remove(rect);
		}
	}

	public static void deleteLogical() {
		List<Rectangles1> toBeDeleted = new ArrayList<Rectangles1>();
		for (Node temp : pane.getChildren()) {
			if (temp instanceof Rectangles1) {
				Rectangles1 rect = (Rectangles1) temp;
				toBeDeleted.add(rect);
			}
		}
		for (Rectangles1 rect : toBeDeleted) {

			pane.getChildren().remove(rect);
		}
	}

	public static void deleteLogicalText() {
		@SuppressWarnings({ "unchecked", "rawtypes" })
		List<Node> toBeDeleted = new ArrayList();
		for (Node temp : pane.getChildren()) {
			if (temp instanceof Text2) {
				toBeDeleted.add(temp);
			}
		}
		for (Node text : toBeDeleted) {

			pane.getChildren().remove(text);
		}
	}

	public static void deleteDiskText() {
		@SuppressWarnings({ "unchecked", "rawtypes" })
		List<Node> toBeDeleted = new ArrayList();
		for (Node temp : pane.getChildren()) {
			if (temp instanceof Text1) {
				toBeDeleted.add(temp);
			}
		}
		for (Node text : toBeDeleted) {

			pane.getChildren().remove(text);
		}
	}

	public static void createRAIDLabel() {
		final Text text = new Text();
		text.setFill(Color.RED);
		text.setStrokeWidth(5);
		text.setText("WELCOME TO RAID SIMULATION");
		text.setLayoutX(screenWidth - 1280);
		text.setLayoutY(screenHeight - 550);
		text.setFont(Font.font(STYLESHEET_CASPIAN));
		text.setStyle("-fx-font: 40 Broadway;");

		pane.getChildren().add(text);
		}
	
		public static void createRAID0Label() {
			final Text text = new Text();
			text.setFill(Color.RED);
			text.setStrokeWidth(5);
			text.setText("RAID 0 - STRIPING");
		text.setLayoutX(850);
		text.setLayoutY(30);
		text.setFont(Font.font(STYLESHEET_CASPIAN));
		text.setStyle("-fx-font: 20 Arial;");

		pane.getChildren().add(text);
	}

	public static void createRAID1Label() {
		final Text text = new Text();
		text.setFill(Color.RED);
		text.setStrokeWidth(5);
		text.setText("RAID 1 - MIRRORING");
		text.setLayoutX(820);
		text.setLayoutY(30);
		text.setFont(Font.font(STYLESHEET_CASPIAN));
		text.setStyle("-fx-font: 20 Arial;");

		pane.getChildren().add(text);
	}

	public static void createRAID2Label() {
		final Text text = new Text();
		final Text text1 = new Text();
		text.setFill(Color.RED);
		text1.setFill(Color.BLACK);
		text.setStrokeWidth(5);
		text1.setStrokeWidth(5);
		text.setText("RAID 2 - BIT LEVEL STRIPPING");
		text1.setText("WITH ERROR-CORRECTION DISK");
		text.setLayoutX(800);
		text.setLayoutY(25);
		text1.setLayoutX(840);
		text1.setLayoutY(45);
		text.setFont(Font.font(STYLESHEET_CASPIAN));
		text.setStyle("-fx-font: 20 Arial;");
		text1.setFont(Font.font(STYLESHEET_CASPIAN));
		text1.setStyle("-fx-font: 13 Arial;");

		pane.getChildren().addAll(text,text1);
	}

	public static void createRAID3Label() {
		final Text text = new Text();
		final Text text1 = new Text();
		text.setFill(Color.RED);
		text1.setFill(Color.BLACK);
		text.setStrokeWidth(5);
		text1.setStrokeWidth(5);
		text.setText("RAID 3 - BYTE LEVEL STRIPPING");
		text1.setText("WITH A DEDICATED PARITY DISK");
		text.setLayoutX(780);
		text.setLayoutY(25);
		text1.setLayoutX(830);
		text1.setLayoutY(45);
		text.setFont(Font.font(STYLESHEET_CASPIAN));
		text.setStyle("-fx-font: 20 Arial;");
		text1.setFont(Font.font(STYLESHEET_CASPIAN));
		text1.setStyle("-fx-font: 13 Arial;");

		pane.getChildren().addAll(text,text1);
	}

	public static void createRAID4Label() {
		final Text text = new Text();
		final Text text1 = new Text();
		text.setFill(Color.RED);
		text1.setFill(Color.BLACK);
		text.setStrokeWidth(5);
		text1.setStrokeWidth(5);
		text.setText("RAID 4 - BLOCK LEVEL STRIPPING");
		text1.setText("WITH A DEDICATED PARITY DISK");
		text.setLayoutX(780);
		text.setLayoutY(25);
		text1.setLayoutX(830);
		text1.setLayoutY(45);
		text.setFont(Font.font(STYLESHEET_CASPIAN));
		text.setStyle("-fx-font: 20 Arial;");
		text1.setFont(Font.font(STYLESHEET_CASPIAN));
		text1.setStyle("-fx-font: 13 Arial;");

		pane.getChildren().addAll(text,text1);
	}

	public static void createRAID5Label() {
		final Text text = new Text();
		final Text text1 = new Text();
		text.setFill(Color.RED);
		text1.setFill(Color.BLACK);
		text.setStrokeWidth(5);
		text1.setStrokeWidth(5);
		text.setText("RAID 5 - BLOCK LEVEL STRIPPING");
		text1.setText("WITH PARITY DATA DISTRIBUTED ACROSS ALL MEMBER DISKS");
		text.setLayoutX(780);
		text.setLayoutY(25);
		text1.setLayoutX(775);
		text1.setLayoutY(42);
		text.setFont(Font.font(STYLESHEET_CASPIAN));
		text.setStyle("-fx-font: 20 Arial;");
		text1.setFont(Font.font(STYLESHEET_CASPIAN));
		text1.setStyle("-fx-font: 11 Arial;");

		pane.getChildren().addAll(text,text1);
	}

	public static void createRAID6Label() {
		final Text text = new Text();
		final Text text1 = new Text();
		text.setFill(Color.RED);
		text1.setFill(Color.BLACK);
		text.setStrokeWidth(5);
		text1.setStrokeWidth(5);
		text.setText("RAID 6 - BLOCK LEVEL STRIPPING");
		text1.setText("WITH TWO PARITY DATA DISTRIBUTED ACROSS ALL MEMBER DISKS");
		text.setLayoutX(780);
		text.setLayoutY(25);
		text1.setLayoutX(765);
		text1.setLayoutY(42);
		text.setFont(Font.font(STYLESHEET_CASPIAN));
		text.setStyle("-fx-font: 20 Arial;");
		text1.setFont(Font.font(STYLESHEET_CASPIAN));
		text1.setStyle("-fx-font: 11 Arial;");

		pane.getChildren().addAll(text,text1);
	}

	public static void main(String[] args) {
		launch(args);
	}

	public static int getScreenHeight() {
		return screenHeight;
	}

	public static void setScreenHeight(int screenHeight) {
		Raid.screenHeight = screenHeight;
	}

}
