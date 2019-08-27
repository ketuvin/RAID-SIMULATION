package RAID;

import java.util.ArrayList;
import java.util.List;

import javafx.animation.SequentialTransition;
import javafx.animation.Timeline;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

public class Play {

	private static Pane pane = Raid.pane;
	public static Button button;

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static List<Rectangles> arrMove = new ArrayList();

	public static void createRaid0PlayButton() {
		button = new Button("Play");
		button.setLayoutX(20);
		pane.getChildren().add(button);

		button.setOnAction(e -> {
			Raid0Action();

		});

	}

	public static void createRaid1PlayButton() {
		button = new Button("Play");
		button.setLayoutX(20);
		pane.getChildren().add(button);

		button.setOnAction(e -> {
			Raid1Action();

		});

	}

	public static void createRaid2PlayButton() {
		button = new Button("Play");
		button.setLayoutX(20);
		pane.getChildren().add(button);

		button.setOnAction(e -> {
			Raid2Action();

		});

	}

	public static void createRaid3PlayButton() {
		button = new Button("Play");
		button.setLayoutX(20);
		pane.getChildren().add(button);

		button.setOnAction(e -> {
			Raid3Action();

		});

	}

	public static void createRaid4PlayButton() {
		button = new Button("Play");
		button.setLayoutX(20);
		pane.getChildren().add(button);

		button.setOnAction(e -> {
			Raid4Action();

		});

	}

	public static void createRaid5PlayButton() {
		button = new Button("Play");
		button.setLayoutX(20);
		pane.getChildren().add(button);

		button.setOnAction(e -> {
			if (Menus.choice == 1) {
				if (Menus.choice1 == 1) {
					Raid.deleteLogical();
					LogicalDisk.logicalDisk.clear();
					LogicalDisk.Raid5tenBlocksfor4Disks();
					Raid5Action4Disks();
				} else if (Menus.choice1 == 2) {
					Raid.deleteLogical();
					LogicalDisk.logicalDisk.clear();
					LogicalDisk.Raid5tenBlocksfor5Disks();
					Raid5Action5Disks();
				} else {
					Raid5Action3Disks();
				}
			} else if (Menus.choice == 2) {
				if (Menus.choice1 == 1) {
					Raid.deleteLogical();
					LogicalDisk.logicalDisk.clear();
					LogicalDisk.Raid5twentyBlocksfor4Disks();
					Raid5Action4Disks();
				} else if (Menus.choice1 == 2) {
					Raid.deleteLogical();
					LogicalDisk.logicalDisk.clear();
					LogicalDisk.Raid5twentyBlocksfor5Disks();
					Raid5Action5Disks();
				} else {
					Raid5Action3Disks();
				}
			}
		});

	}

	public static void createRaid6PlayButton() {
		button = new Button("Play");
		button.setLayoutX(20);
		pane.getChildren().add(button);

		button.setOnAction(e -> {
			if (Menus.choice == 1) {
				if (Menus.choice1 == 1) {
					Raid.deleteLogical();
					LogicalDisk.logicalDisk.clear();
					LogicalDisk.Raid6tenBlocksfor4Disks();
					Raid6Action4Disks();
				} else if (Menus.choice1 == 2) {
					Raid.deleteLogical();
					LogicalDisk.logicalDisk.clear();
					LogicalDisk.Raid6tenBlocksfor5Disks();
					Raid6Action5Disks();
				} else {
					Raid6Action3Disks();
				}
			} else if (Menus.choice == 2) {
				if (Menus.choice1 == 1) {
					Raid.deleteLogical();
					LogicalDisk.logicalDisk.clear();
					LogicalDisk.Raid6twentyBlocksfor4Disks();
					Raid6Action4Disks();
				} else if (Menus.choice1 == 2) {
					Raid.deleteLogical();
					LogicalDisk.logicalDisk.clear();
					LogicalDisk.Raid6twentyBlocksfor5Disks();
					Raid6Action5Disks();
				} else {
					Raid6Action3Disks();
				}
			}
		});

	}

	public static void Raid0Action() {
		SequentialTransition st = new SequentialTransition();
		for (int i = 0; i < LogicalDisk.logicalDisk.size(); i++) {
			Rectangles1 rekt = LogicalDisk.logicalDisk.get(i);
			Rectangles toMove = new Rectangles();
			toMove.setFill(Color.rgb(0, 128, 192));
			toMove.setStroke(Color.BLACK);
			toMove.setStrokeWidth(1);
			toMove.setWidth(rekt.getWidth());
			arrMove.add(toMove);

			toMove.setHeight(rekt.getHeight());
			toMove.setLayoutX(rekt.getLayoutX());
			toMove.setLayoutY(rekt.getLayoutY());

			pane.getChildren().add(toMove);
			Rectangles destination = Raid.findIndex(i);
			Timeline animate = toMove.moveTo(destination.getLayoutX(), destination.getLayoutY(), 20, 100, 4);
			st.getChildren().addAll(animate);

		}
		st.setRate(10);
		st.play();

	}

	public static void Raid1Action() {
		SequentialTransition st = new SequentialTransition();

		for (int i = 0; i < LogicalDisk.logicalDisk.size(); i++) {
			Rectangles1 rekt = LogicalDisk.logicalDisk.get(i);
			Rectangles toMove = new Rectangles();
			toMove.setFill(Color.rgb(0, 128, 192));
			toMove.setStroke(Color.BLACK);
			toMove.setStrokeWidth(1);
			toMove.setWidth(rekt.getWidth());
			arrMove.add(toMove);

			toMove.setHeight(rekt.getHeight());
			toMove.setLayoutX(rekt.getLayoutX());
			toMove.setLayoutY(rekt.getLayoutY());

			Rectangles toMove2 = new Rectangles();
			toMove2.setFill(Color.rgb(0, 128, 192));
			toMove2.setStroke(Color.BLACK);
			toMove2.setStrokeWidth(1);
			toMove2.setWidth(rekt.getWidth());
			arrMove.add(toMove2);

			toMove2.setHeight(rekt.getHeight());
			toMove2.setLayoutX(rekt.getLayoutX());
			toMove2.setLayoutY(rekt.getLayoutY());

			pane.getChildren().addAll(toMove, toMove2);
			Rectangles destination = Raid.findIndex(i);
			Rectangles destination2 = Raid.findIndex2(i);
			Timeline animate = toMove.moveTo(destination.getLayoutX(), destination.getLayoutY(), 3.5, 100, 4);
			Timeline animate2 = toMove2.moveTo(destination2.getLayoutX(), destination2.getLayoutY(), 3.5, 100, 4);

			st.getChildren().addAll(animate, animate2);

		}
		st.setRate(10);
		st.play();

	}

	public static void Raid2Action() {
		SequentialTransition st = new SequentialTransition();
		for (int i = 0; i < LogicalDisk.logicalDisk.size(); i++) {
			Rectangles1 rekt = LogicalDisk.logicalDisk.get(i);
			Rectangles toMove = new Rectangles();
			toMove.setFill(Color.rgb(0, 128, 192));
			toMove.setStroke(Color.BLACK);
			toMove.setStrokeWidth(1);
			toMove.setWidth(rekt.getWidth());
			arrMove.add(toMove);

			toMove.setHeight(rekt.getHeight());
			toMove.setLayoutX(rekt.getLayoutX());
			toMove.setLayoutY(rekt.getLayoutY());

			pane.getChildren().add(toMove);
			Rectangles destination = Raid.findIndex(i);
			Timeline animate = toMove.moveTo(destination.getLayoutX(), destination.getLayoutY(), 1.75, 100, 4);
			st.getChildren().addAll(animate);

		}
		st.setRate(10);
		st.play();

	}

	public static void Raid3Action() {
		SequentialTransition st = new SequentialTransition();
		for (int i = 0; i < LogicalDisk.logicalDisk.size(); i++) {
			Rectangles1 rekt = LogicalDisk.logicalDisk.get(i);
			Rectangles toMove = new Rectangles();
			toMove.setFill(Color.rgb(0, 128, 192));
			toMove.setStroke(Color.BLACK);
			toMove.setStrokeWidth(1);
			toMove.setWidth(rekt.getWidth());
			arrMove.add(toMove);

			toMove.setHeight(rekt.getHeight());
			toMove.setLayoutX(rekt.getLayoutX());
			toMove.setLayoutY(rekt.getLayoutY());

			pane.getChildren().add(toMove);
			Rectangles destination = Raid.findIndex(i);
			Timeline animate = toMove.moveTo(destination.getLayoutX(), destination.getLayoutY(), 3.5, 100, 4);
			st.getChildren().addAll(animate);

		}
		st.setRate(10);
		st.play();

	}

	public static void Raid4Action() {
		SequentialTransition st = new SequentialTransition();
		for (int i = 0; i < LogicalDisk.logicalDisk.size(); i++) {
			Rectangles1 rekt = LogicalDisk.logicalDisk.get(i);
			Rectangles toMove = new Rectangles();
			toMove.setFill(Color.rgb(0, 128, 192));
			toMove.setStroke(Color.BLACK);
			toMove.setStrokeWidth(1);
			toMove.setWidth(rekt.getWidth());
			arrMove.add(toMove);

			toMove.setHeight(rekt.getHeight());
			toMove.setLayoutX(rekt.getLayoutX());
			toMove.setLayoutY(rekt.getLayoutY());

			pane.getChildren().add(toMove);
			Rectangles destination = Raid.findIndex(i);
			Timeline animate = toMove.moveTo(destination.getLayoutX(), destination.getLayoutY(), 20, 100, 4);
			st.getChildren().addAll(animate);

		}
		st.setRate(10);
		st.play();

	}

	public static void Raid5Action3Disks() {
		SequentialTransition st = new SequentialTransition();
		int index = 0;
		for (int i = 0; i < LogicalDisk.logicalDisk.size(); i++) {
			if (index == 2 || index == 4 || index == 6 || index == 11 || index == 13 || index == 15 || index == 20
					|| index == 22 || index == 24) {
				index++;
				Rectangles1 rekt = LogicalDisk.logicalDisk.get(i);
				Rectangles toMove = new Rectangles();
				toMove.setFill(Color.rgb(0, 128, 192));
				toMove.setStroke(Color.BLACK);
				toMove.setStrokeWidth(1);
				toMove.setWidth(rekt.getWidth());
				arrMove.add(toMove);

				toMove.setHeight(rekt.getHeight());
				toMove.setLayoutX(rekt.getLayoutX());
				toMove.setLayoutY(rekt.getLayoutY());

				pane.getChildren().add(toMove);
				Rectangles destination = Raid.findIndex(index);
				Timeline animate = toMove.moveTo(destination.getLayoutX(), destination.getLayoutY(), 20, 100, 4);
				st.getChildren().addAll(animate);
				index++;
			} else {
				Rectangles1 rekt = LogicalDisk.logicalDisk.get(i);
				Rectangles toMove = new Rectangles();
				toMove.setFill(Color.rgb(0, 128, 192));
				toMove.setStroke(Color.BLACK);
				toMove.setStrokeWidth(1);
				toMove.setWidth(rekt.getWidth());
				arrMove.add(toMove);

				toMove.setHeight(rekt.getHeight());
				toMove.setLayoutX(rekt.getLayoutX());
				toMove.setLayoutY(rekt.getLayoutY());

				pane.getChildren().add(toMove);
				Rectangles destination = Raid.findIndex(index);
				Timeline animate = toMove.moveTo(destination.getLayoutX(), destination.getLayoutY(), 20, 100, 4);
				st.getChildren().addAll(animate);
				index++;
			}

		}
		st.setRate(10);
		st.play();

	}

	public static void Raid5Action4Disks() {
		SequentialTransition st = new SequentialTransition();
		int index = 0;
		for (int i = 0; i < LogicalDisk.logicalDisk.size(); i++) {
			if (index == 3 || index == 6 || index == 9 || index == 12 || index == 19 || index == 22 || index == 25) {
				index++;
				Rectangles1 rekt = LogicalDisk.logicalDisk.get(i);
				Rectangles toMove = new Rectangles();
				toMove.setFill(Color.rgb(0, 128, 192));
				toMove.setStroke(Color.BLACK);
				toMove.setStrokeWidth(1);
				toMove.setWidth(rekt.getWidth());
				arrMove.add(toMove);

				toMove.setHeight(rekt.getHeight());
				toMove.setLayoutX(rekt.getLayoutX());
				toMove.setLayoutY(rekt.getLayoutY());

				pane.getChildren().add(toMove);
				Rectangles destination = Raid.findIndex(index);
				Timeline animate = toMove.moveTo(destination.getLayoutX(), destination.getLayoutY(), 20, 100, 4);
				st.getChildren().addAll(animate);
				index++;
			} else {
				Rectangles1 rekt = LogicalDisk.logicalDisk.get(i);
				Rectangles toMove = new Rectangles();
				toMove.setFill(Color.rgb(0, 128, 192));
				toMove.setStroke(Color.BLACK);
				toMove.setStrokeWidth(1);
				toMove.setWidth(rekt.getWidth());
				arrMove.add(toMove);

				toMove.setHeight(rekt.getHeight());
				toMove.setLayoutX(rekt.getLayoutX());
				toMove.setLayoutY(rekt.getLayoutY());

				pane.getChildren().add(toMove);
				Rectangles destination = Raid.findIndex(index);
				Timeline animate = toMove.moveTo(destination.getLayoutX(), destination.getLayoutY(), 20, 100, 4);
				st.getChildren().addAll(animate);
				index++;
			}

		}
		st.setRate(10);
		st.play();

	}

	public static void Raid5Action5Disks() {
		SequentialTransition st = new SequentialTransition();
		int index = 0;
		for (int i = 0; i < LogicalDisk.logicalDisk.size(); i++) {
			if (index == 4 || index == 10 || index == 10 || index == 18 || index == 21) {
				index++;
				Rectangles1 rekt = LogicalDisk.logicalDisk.get(i);
				Rectangles toMove = new Rectangles();
				toMove.setFill(Color.rgb(0, 128, 192));
				toMove.setStroke(Color.BLACK);
				toMove.setStrokeWidth(1);
				toMove.setWidth(rekt.getWidth());
				arrMove.add(toMove);

				toMove.setHeight(rekt.getHeight());
				toMove.setLayoutX(rekt.getLayoutX());
				toMove.setLayoutY(rekt.getLayoutY());

				pane.getChildren().add(toMove);
				Rectangles destination = Raid.findIndex(index);
				Timeline animate = toMove.moveTo(destination.getLayoutX(), destination.getLayoutY(), 20, 100, 4);
				st.getChildren().addAll(animate);
				index++;
			} else {
				Rectangles1 rekt = LogicalDisk.logicalDisk.get(i);
				Rectangles toMove = new Rectangles();
				toMove.setFill(Color.rgb(0, 128, 192));
				toMove.setStroke(Color.BLACK);
				toMove.setStrokeWidth(1);
				toMove.setWidth(rekt.getWidth());
				arrMove.add(toMove);

				toMove.setHeight(rekt.getHeight());
				toMove.setLayoutX(rekt.getLayoutX());
				toMove.setLayoutY(rekt.getLayoutY());

				pane.getChildren().add(toMove);
				Rectangles destination = Raid.findIndex(index);
				Timeline animate = toMove.moveTo(destination.getLayoutX(), destination.getLayoutY(), 20, 100, 4);
				st.getChildren().addAll(animate);
				index++;
			}

		}
		st.setRate(10);
		st.play();

	}

	public static void Raid6Action3Disks() {
		SequentialTransition st = new SequentialTransition();
		int index = 0;
		for (int i = 0; i < LogicalDisk.logicalDisk.size(); i++) {
			if (index == 1 || index == 5 || index == 10 || index == 14 || index == 19 || index == 23 || index == 28
					|| index == 32 || index == 37 || index == 41 || index == 46 || index == 50 || index == 55) {
				index += 3;
				Rectangles1 rekt = LogicalDisk.logicalDisk.get(i);
				Rectangles toMove = new Rectangles();
				toMove.setFill(Color.rgb(0, 128, 192));
				toMove.setStroke(Color.BLACK);
				toMove.setStrokeWidth(1);
				toMove.setWidth(rekt.getWidth());
				arrMove.add(toMove);

				toMove.setHeight(rekt.getHeight());
				toMove.setLayoutX(rekt.getLayoutX());
				toMove.setLayoutY(rekt.getLayoutY());

				pane.getChildren().add(toMove);
				Rectangles destination = Raid.findIndex(index);
				Timeline animate = toMove.moveTo(destination.getLayoutX(), destination.getLayoutY(), 20, 100, 4);
				st.getChildren().addAll(animate);
				index++;
			} else {
				Rectangles1 rekt = LogicalDisk.logicalDisk.get(i);
				Rectangles toMove = new Rectangles();
				toMove.setFill(Color.rgb(0, 128, 192));
				toMove.setStroke(Color.BLACK);
				toMove.setStrokeWidth(1);
				toMove.setWidth(rekt.getWidth());
				arrMove.add(toMove);

				toMove.setHeight(rekt.getHeight());
				toMove.setLayoutX(rekt.getLayoutX());
				toMove.setLayoutY(rekt.getLayoutY());

				pane.getChildren().add(toMove);
				Rectangles destination = Raid.findIndex(index);
				Timeline animate = toMove.moveTo(destination.getLayoutX(), destination.getLayoutY(), 20, 100, 4);
				st.getChildren().addAll(animate);
				index++;
			}

		}
		st.setRate(10);
		st.play();

	}

	public static void Raid6Action4Disks() {
		SequentialTransition st = new SequentialTransition();
		int index = 0;
		for (int i = 0; i < LogicalDisk.logicalDisk.size(); i++) {
			if (index == 2 || index == 5 || index == 8 || index == 14 || index == 17 || index == 20 || index == 26
					|| index == 29 || index == 32) {
				index += 2;
				Rectangles1 rekt = LogicalDisk.logicalDisk.get(i);
				Rectangles toMove = new Rectangles();
				toMove.setFill(Color.rgb(0, 128, 192));
				toMove.setStroke(Color.BLACK);
				toMove.setStrokeWidth(1);
				toMove.setWidth(rekt.getWidth());
				arrMove.add(toMove);

				toMove.setHeight(rekt.getHeight());
				toMove.setLayoutX(rekt.getLayoutX());
				toMove.setLayoutY(rekt.getLayoutY());

				pane.getChildren().add(toMove);
				Rectangles destination = Raid.findIndex(index);
				Timeline animate = toMove.moveTo(destination.getLayoutX(), destination.getLayoutY(), 20, 100, 4);
				st.getChildren().addAll(animate);
				index++;
			} else {
				Rectangles1 rekt = LogicalDisk.logicalDisk.get(i);
				Rectangles toMove = new Rectangles();
				toMove.setFill(Color.rgb(0, 128, 192));
				toMove.setStroke(Color.BLACK);
				toMove.setStrokeWidth(1);
				toMove.setWidth(rekt.getWidth());
				arrMove.add(toMove);

				toMove.setHeight(rekt.getHeight());
				toMove.setLayoutX(rekt.getLayoutX());
				toMove.setLayoutY(rekt.getLayoutY());

				pane.getChildren().add(toMove);
				Rectangles destination = Raid.findIndex(index);
				Timeline animate = toMove.moveTo(destination.getLayoutX(), destination.getLayoutY(), 20, 100, 4);
				st.getChildren().addAll(animate);
				index++;
			}

		}
		st.setRate(10);
		st.play();

	}

	public static void Raid6Action5Disks() {
		SequentialTransition st = new SequentialTransition();
		int index = 0;
		for (int i = 0; i < LogicalDisk.logicalDisk.size(); i++) {
			if (index == 3 || index == 10 || index == 11 || index == 15 || index == 23 || index == 27 || index == 31) {
				index += 2;
				Rectangles1 rekt = LogicalDisk.logicalDisk.get(i);
				Rectangles toMove = new Rectangles();
				toMove.setFill(Color.rgb(0, 128, 192));
				toMove.setStroke(Color.BLACK);
				toMove.setStrokeWidth(1);
				toMove.setWidth(rekt.getWidth());
				arrMove.add(toMove);

				toMove.setHeight(rekt.getHeight());
				toMove.setLayoutX(rekt.getLayoutX());
				toMove.setLayoutY(rekt.getLayoutY());

				pane.getChildren().add(toMove);
				Rectangles destination = Raid.findIndex(index);
				Timeline animate = toMove.moveTo(destination.getLayoutX(), destination.getLayoutY(), 20, 100, 4);
				st.getChildren().addAll(animate);
				index++;
			} else {
				Rectangles1 rekt = LogicalDisk.logicalDisk.get(i);
				Rectangles toMove = new Rectangles();
				toMove.setFill(Color.rgb(0, 128, 192));
				toMove.setStroke(Color.BLACK);
				toMove.setStrokeWidth(1);
				toMove.setWidth(rekt.getWidth());
				arrMove.add(toMove);

				toMove.setHeight(rekt.getHeight());
				toMove.setLayoutX(rekt.getLayoutX());
				toMove.setLayoutY(rekt.getLayoutY());

				pane.getChildren().add(toMove);
				Rectangles destination = Raid.findIndex(index);
				Timeline animate = toMove.moveTo(destination.getLayoutX(), destination.getLayoutY(), 20, 100, 4);
				st.getChildren().addAll(animate);
				index++;
			}

		}
		st.setRate(10);
		st.play();

	}
}
