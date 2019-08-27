package RAID;

import java.awt.Dimension;
import java.awt.Toolkit;

import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;

import javafx.scene.layout.Pane;

public class Menus extends Menu {

	private static Pane pane = Raid.pane;
	private static Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	private static int screenWidth = (int) screenSize.getWidth();
	public static int choice = 0;
	public static int choice1 = 0;

	public static void Menu() {

		final Menu menu1 = new Menu("Type of RAID");
		MenuBar menuBar = new MenuBar();
		menuBar.getMenus().add(menu1);
		menuBar.setLayoutX(screenWidth - 150);

		MenuItem menu12 = new MenuItem("RAID 0");
		menu1.getItems().add(menu12);
		menu12.setOnAction(e -> Raid.RAID0());

		MenuItem menu13 = new MenuItem("RAID 1");
		menu1.getItems().add(menu13);
		menu13.setOnAction(e -> Raid.RAID1());

		MenuItem menu14 = new MenuItem("RAID 2");
		menu1.getItems().add(menu14);
		menu14.setOnAction(e -> Raid.RAID2());

		MenuItem menu15 = new MenuItem("RAID 3");
		menu1.getItems().add(menu15);
		menu15.setOnAction(e -> Raid.RAID3());

		MenuItem menu16 = new MenuItem("RAID 4");
		menu1.getItems().add(menu16);
		menu16.setOnAction(e -> Raid.RAID4());

		MenuItem menu17 = new MenuItem("RAID 5");
		menu1.getItems().add(menu17);
		menu17.setOnAction(e -> Raid.RAID5());

		MenuItem menu18 = new MenuItem("RAID 6");
		menu1.getItems().add(menu18);
		menu18.setOnAction(e -> Raid.RAID6());

		pane.getChildren().add(menuBar);
	}

	public static void CreateBlockLogicalMenu() {
		final Menu menu1 = new Menu("Size of Logical Disk");
		MenuBar menuBar = new MenuBar();
		menuBar.getMenus().add(menu1);
		menuBar.setLayoutX(140);

		MenuItem menu12 = new MenuItem("20 BLOCKS");
		menu1.getItems().add(menu12);
		menu12.setOnAction(e -> {
			Raid.deleteLogical();
			Raid.deleteDisk();
			Raid.deleteLogicalText();
			Raid.deleteDiskText();
			LogicalDisk.logicalDisk.clear();
			LogicalDisk.twentyBlocks();
			LogicalDisk.createTwentyBlocksLogicalLabels();

		});

		MenuItem menu13 = new MenuItem("40 BLOCKS");
		menu1.getItems().add(menu13);
		menu13.setOnAction(e -> {
			Raid.deleteLogical();
			Raid.deleteDisk();
			Raid.deleteLogicalText();
			Raid.deleteDiskText();
			LogicalDisk.logicalDisk.clear();
			LogicalDisk.fourtyBlocks();
			LogicalDisk.createFourtyBlocksLogicalLabels();
		});

		pane.getChildren().add(menuBar);
	}

	public static void CreateRaid5BlockLogicalMenu() {
		final Menu menu1 = new Menu("Size of Logical Disk");
		MenuBar menuBar = new MenuBar();
		menuBar.getMenus().add(menu1);
		menuBar.setLayoutX(140);

		MenuItem menu12 = new MenuItem("10 BLOCKS");
		menu1.getItems().add(menu12);
		menu12.setOnAction(e -> {
			Raid.deleteLogical();
			Raid.deleteDisk();
			Raid.deleteLogicalText();
			Raid.deleteDiskText();
			LogicalDisk.logicalDisk.clear();
			LogicalDisk.Raid5tenBlocksfor3Disks();
			LogicalDisk.createTwentyBlocksLogicalLabels();

			choice = 1;
		});

		MenuItem menu13 = new MenuItem("20 BLOCKS");
		menu1.getItems().add(menu13);
		menu13.setOnAction(e -> {
			Raid.deleteLogical();
			Raid.deleteDisk();
			Raid.deleteLogicalText();
			Raid.deleteDiskText();
			LogicalDisk.logicalDisk.clear();
			LogicalDisk.Raid5twentyBlocksfor3Disks();
			LogicalDisk.createFourtyBlocksLogicalLabels();

			choice = 2;
		});

		pane.getChildren().add(menuBar);
	}

	public static void CreateRaid6BlockLogicalMenu() {
		final Menu menu1 = new Menu("Size of Logical Disk");
		MenuBar menuBar = new MenuBar();
		menuBar.getMenus().add(menu1);
		menuBar.setLayoutX(140);

		MenuItem menu12 = new MenuItem("10 BLOCKS");
		menu1.getItems().add(menu12);
		menu12.setOnAction(e -> {
			Raid.deleteLogical();
			Raid.deleteDisk();
			Raid.deleteLogicalText();
			Raid.deleteDiskText();
			LogicalDisk.logicalDisk.clear();
			LogicalDisk.Raid6tenBlocksfor3Disks();
			LogicalDisk.createTwentyBlocksLogicalLabels();

			choice = 1;
		});

		MenuItem menu13 = new MenuItem("20 BLOCKS");
		menu1.getItems().add(menu13);
		menu13.setOnAction(e -> {
			Raid.deleteLogical();
			Raid.deleteDisk();
			Raid.deleteLogicalText();
			Raid.deleteDiskText();
			LogicalDisk.logicalDisk.clear();
			LogicalDisk.Raid6twentyBlocksfor3Disks();
			LogicalDisk.createFourtyBlocksLogicalLabels();

			choice = 2;
		});

		pane.getChildren().add(menuBar);
	}

	public static void CreateByteLogicalMenu() {
		final Menu menu1 = new Menu("Size of Logical Disk");
		MenuBar menuBar = new MenuBar();
		menuBar.getMenus().add(menu1);
		menuBar.setLayoutX(140);

		MenuItem menu12 = new MenuItem("64 BYTES");
		menu1.getItems().add(menu12);
		menu12.setOnAction(e -> {
			Raid.deleteLogical();
			Raid.deleteDisk();
			Raid.deleteLogicalText();
			Raid.deleteDiskText();
			LogicalDisk.logicalDisk.clear();
			LogicalDisk.sixtyFourBytes();
			LogicalDisk.createSixtyFourBytesLogicalLabels();

		});

		MenuItem menu13 = new MenuItem("128 BYTES");
		menu1.getItems().add(menu13);
		menu13.setOnAction(e -> {
			Raid.deleteLogical();
			Raid.deleteDisk();
			Raid.deleteLogicalText();
			Raid.deleteDiskText();
			LogicalDisk.logicalDisk.clear();
			LogicalDisk.oneTwoEightBytes();
			LogicalDisk.createOneTwoEightBytesLogicalLabels();
		});

		pane.getChildren().add(menuBar);
	}

	public static void CreateBitLogicalMenu() {
		final Menu menu1 = new Menu("Size of Logical Disk");
		MenuBar menuBar = new MenuBar();
		menuBar.getMenus().add(menu1);
		menuBar.setLayoutX(140);

		MenuItem menu12 = new MenuItem("128 BITS");
		menu1.getItems().add(menu12);
		menu12.setOnAction(e -> {
			Raid.deleteLogical();
			Raid.deleteDisk();
			Raid.deleteLogicalText();
			Raid.deleteDiskText();
			LogicalDisk.logicalDisk.clear();
			LogicalDisk.oneTwoEightBits();
			LogicalDisk.createOneTwoEightBitsLogicalLabels();

		});

		MenuItem menu13 = new MenuItem("256 BITS");
		menu1.getItems().add(menu13);
		menu13.setOnAction(e -> {
			Raid.deleteLogical();
			Raid.deleteDisk();
			Raid.deleteLogicalText();
			Raid.deleteDiskText();
			LogicalDisk.logicalDisk.clear();
			LogicalDisk.twoFiveSixBits();
			LogicalDisk.createTwoFiveSixBitsLogicalLabels();
		});

		pane.getChildren().add(menuBar);
	}

	public static void CreateRaid0DiskMenu() {
		final Menu menu1 = new Menu("Number of Disk");
		MenuBar menuBar = new MenuBar();
		menuBar.getMenus().add(menu1);
		menuBar.setLayoutX(screenWidth - 350);

		MenuItem menu13 = new MenuItem("2 DISKS");
		menu1.getItems().add(menu13);
		menu13.setOnAction(e -> {
			Raid.deleteDisk();
			Raid.deleteDiskText();
			Raid.raid0.clear();
			Raid.raid1.clear();
			Play.arrMove.clear();
			Raid0.createTwoDisks();
			Raid0.create2DisksRaid0Labels();
		});

		MenuItem menu14 = new MenuItem("3 DISKS");
		menu1.getItems().add(menu14);
		menu14.setOnAction(e -> {
			Raid.deleteDisk();
			Raid.deleteDiskText();
			Raid.raid0.clear();
			Raid.raid1.clear();
			Play.arrMove.clear();
			Raid0.createThreeDisks();
			Raid0.create3DisksRaid0Labels();
		});

		MenuItem menu15 = new MenuItem("4 DISKS");
		menu1.getItems().add(menu15);
		menu15.setOnAction(e -> {
			Raid.deleteDisk();
			Raid.deleteDiskText();
			Raid.raid0.clear();
			Raid.raid1.clear();
			Play.arrMove.clear();
			Raid0.createFourDisks();
			Raid0.create4DisksRaid0Labels();
		});

		pane.getChildren().add(menuBar);
	}

	public static void CreateRaid1DiskMenu() {
		final Menu menu1 = new Menu("Number of Disk");
		MenuBar menuBar = new MenuBar();
		menuBar.getMenus().add(menu1);
		menuBar.setLayoutX(screenWidth - 350);

		MenuItem menu12 = new MenuItem("2 DISKS");
		menu1.getItems().add(menu12);
		menu12.setOnAction(e -> {
			Raid.deleteDisk();
			Raid.deleteDiskText();
			Raid.raid0.clear();
			Raid.raid1.clear();
			Play.arrMove.clear();
			Raid1.createTwoDisks();
			Raid1.create2DisksRaid1Labels();
		});

		MenuItem menu13 = new MenuItem("4 DISKS");
		menu1.getItems().add(menu13);
		menu13.setOnAction(e -> {
			Raid.deleteDisk();
			Raid.deleteDiskText();
			Raid.raid0.clear();
			Raid.raid1.clear();
			Play.arrMove.clear();
			Raid1.createFourDisks();
			Raid1.create4DisksRaid1Labels();
		});

		MenuItem menu14 = new MenuItem("6 DISKS");
		menu1.getItems().add(menu14);
		menu14.setOnAction(e -> {
			Raid.deleteDisk();
			Raid.deleteDiskText();
			Raid.raid0.clear();
			Raid.raid1.clear();
			Play.arrMove.clear();
			Raid1.createSixDisks();
			Raid1.create6DisksRaid1Labels();
		});
		pane.getChildren().add(menuBar);
	}

	public static void CreateRaid2DiskMenu() {
		final Menu menu1 = new Menu("Number of Disk");
		MenuBar menuBar = new MenuBar();
		menuBar.getMenus().add(menu1);
		menuBar.setLayoutX(screenWidth - 350);

		MenuItem menu12 = new MenuItem("3 DISKS");
		menu1.getItems().add(menu12);
		menu12.setOnAction(e -> {
			Raid.deleteDisk();
			Raid.deleteDiskText();
			Raid.raid0.clear();
			Raid.raid1.clear();
			Play.arrMove.clear();
			Raid2.createThreeDisks();
			Raid2.create3DisksRaid2Labels();
		});

		MenuItem menu13 = new MenuItem("5 DISKS");
		menu1.getItems().add(menu13);
		menu13.setOnAction(e -> {
			Raid.deleteDisk();
			Raid.deleteDiskText();
			Raid.raid0.clear();
			Raid.raid1.clear();
			Play.arrMove.clear();
			Raid2.createFiveDisks();
			Raid2.create5DisksRaid2Labels();
		});

		MenuItem menu14 = new MenuItem("7 DISKS");
		menu1.getItems().add(menu14);
		menu14.setOnAction(e -> {
			Raid.deleteDisk();
			Raid.deleteDiskText();
			Raid.raid0.clear();
			Raid.raid1.clear();
			Play.arrMove.clear();
			Raid2.createSevenDisks();
			Raid2.create7DisksRaid2Labels();
		});
		pane.getChildren().add(menuBar);
	}

	public static void CreateRaid3DiskMenu() {
		final Menu menu1 = new Menu("Number of Disk");
		MenuBar menuBar = new MenuBar();
		menuBar.getMenus().add(menu1);
		menuBar.setLayoutX(screenWidth - 350);

		MenuItem menu12 = new MenuItem("3 DISKS");
		menu1.getItems().add(menu12);
		menu12.setOnAction(e -> {
			Raid.deleteDisk();
			Raid.deleteDiskText();
			Raid.raid0.clear();
			Raid.raid1.clear();
			Play.arrMove.clear();
			Raid3.createThreeDisks();
			Raid3.create3DisksRaid3Labels();
		});

		MenuItem menu13 = new MenuItem("4 DISKS");
		menu1.getItems().add(menu13);
		menu13.setOnAction(e -> {
			Raid.deleteDisk();
			Raid.deleteDiskText();
			Raid.raid0.clear();
			Raid.raid1.clear();
			Play.arrMove.clear();
			Raid3.createFourDisks();
			Raid3.create4DisksRaid3Labels();
		});

		MenuItem menu14 = new MenuItem("5 DISKS");
		menu1.getItems().add(menu14);
		menu14.setOnAction(e -> {
			Raid.deleteDisk();
			Raid.deleteDiskText();
			Raid.raid0.clear();
			Raid.raid1.clear();
			Play.arrMove.clear();
			Raid3.createFiveDisks();
			Raid3.create5DisksRaid3Labels();
		});
		pane.getChildren().add(menuBar);
	}

	public static void CreateRaid4DiskMenu() {
		final Menu menu1 = new Menu("Number of Disk");
		MenuBar menuBar = new MenuBar();
		menuBar.getMenus().add(menu1);
		menuBar.setLayoutX(screenWidth - 350);

		MenuItem menu12 = new MenuItem("3 DISKS");
		menu1.getItems().add(menu12);
		menu12.setOnAction(e -> {
			Raid.deleteDisk();
			Raid.deleteDiskText();
			Raid.raid0.clear();
			Raid.raid1.clear();
			Play.arrMove.clear();
			Raid4.createThreeDisks();
			Raid4.create3DisksRaid4Labels();
		});

		MenuItem menu13 = new MenuItem("4 DISKS");
		menu1.getItems().add(menu13);
		menu13.setOnAction(e -> {
			Raid.deleteDisk();
			Raid.deleteDiskText();
			Raid.raid0.clear();
			Raid.raid1.clear();
			Play.arrMove.clear();
			Raid4.createFourDisks();
			Raid4.create4DisksRaid4Labels();
		});

		MenuItem menu14 = new MenuItem("5 DISKS");
		menu1.getItems().add(menu14);
		menu14.setOnAction(e -> {
			Raid.deleteDisk();
			Raid.deleteDiskText();
			Raid.raid0.clear();
			Raid.raid1.clear();
			Play.arrMove.clear();
			Raid4.createFiveDisks();
			Raid4.create5DisksRaid4Labels();
		});
		pane.getChildren().add(menuBar);
	}

	public static void CreateRaid5DiskMenu() {
		final Menu menu1 = new Menu("Number of Disk");
		MenuBar menuBar = new MenuBar();
		menuBar.getMenus().add(menu1);
		menuBar.setLayoutX(screenWidth - 350);

		MenuItem menu12 = new MenuItem("3 DISKS");
		menu1.getItems().add(menu12);
		menu12.setOnAction(e -> {
			Raid.deleteDisk();
			Raid.deleteDiskText();
			Raid.raid0.clear();
			Raid.raid1.clear();
			Play.arrMove.clear();
			if (choice == 1) {
				Raid5.createThreeDisksForTenBlocks();
			} else {
				Raid5.createThreeDisksForTwentyBlocks();
			}

			choice1 = 0;
			Raid5.create3DisksRaid5Labels();
		});

		MenuItem menu13 = new MenuItem("4 DISKS");
		menu1.getItems().add(menu13);
		menu13.setOnAction(e -> {
			Raid.deleteDisk();
			Raid.deleteDiskText();
			Raid.raid0.clear();
			Raid.raid1.clear();
			Play.arrMove.clear();
			if (choice == 1) {
				Raid5.createFourDisksForTenBlocks();
			} else {
				Raid5.createFourDisksForTwentyBlocks();
			}
			choice1 = 1;
			Raid5.create4DisksRaid5Labels();
		});

		MenuItem menu14 = new MenuItem("5 DISKS");
		menu1.getItems().add(menu14);
		menu14.setOnAction(e -> {
			Raid.deleteDisk();
			Raid.deleteDiskText();
			Raid.raid0.clear();
			Raid.raid1.clear();
			Play.arrMove.clear();
			if (choice == 1) {
				Raid5.createFiveDisksForTenBlocks();
			} else {
				Raid5.createFiveDisksForTwentyBlocks();
			}
			choice1 = 2;
			Raid5.create5DisksRaid5Labels();
		});
		pane.getChildren().add(menuBar);
	}

	public static void CreateRaid6DiskMenu() {
		final Menu menu1 = new Menu("Number of Disk");
		MenuBar menuBar = new MenuBar();
		menuBar.getMenus().add(menu1);
		menuBar.setLayoutX(screenWidth - 350);

		MenuItem menu12 = new MenuItem("3 DISKS");
		menu1.getItems().add(menu12);
		menu12.setOnAction(e -> {
			Raid.deleteDisk();
			Raid.deleteDiskText();
			Raid.raid0.clear();
			Raid.raid1.clear();
			Play.arrMove.clear();
			if (choice == 1) {
				Raid6.createThreeDisksForTenBlocks();
			} else {
				Raid6.createThreeDisksForTwentyBlocks();
			}

			choice1 = 0;
			Raid6.create3DisksRaid6Labels();
		});

		MenuItem menu13 = new MenuItem("4 DISKS");
		menu1.getItems().add(menu13);
		menu13.setOnAction(e -> {
			Raid.deleteDisk();
			Raid.deleteDiskText();
			Raid.raid0.clear();
			Raid.raid1.clear();
			Play.arrMove.clear();
			if (choice == 1) {
				Raid6.createFourDisksForTenBlocks();
			} else {
				Raid6.createFourDisksForTwentyBlocks();
			}
			choice1 = 1;
			Raid6.create4DisksRaid6Labels();
		});

		MenuItem menu14 = new MenuItem("5 DISKS");
		menu1.getItems().add(menu14);
		menu14.setOnAction(e -> {
			Raid.deleteDisk();
			Raid.deleteDiskText();
			Raid.raid0.clear();
			Raid.raid1.clear();
			Play.arrMove.clear();
			if (choice == 1) {
				Raid6.createFiveDisksForTenBlocks();
			} else {
				Raid6.createFiveDisksForTwentyBlocks();
			}
			choice1 = 2;
			Raid6.create5DisksRaid6Labels();
		});
		pane.getChildren().add(menuBar);
	}

}
