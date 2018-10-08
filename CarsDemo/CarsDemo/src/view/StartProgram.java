package view;

import java.util.List;
import java.util.Scanner;

import controller.CarsDemoHelper;
import model.CarsDemo;

public class StartProgram {

		static Scanner in = new Scanner(System.in);
		static CarsDemoHelper lih = new CarsDemoHelper();

		private static void addAnItem() {
			// TODO Auto-generated method stub
			System.out.print("Enter a make: ");
			String make = in.nextLine();
			System.out.print("Enter a model: ");
			String model = in.nextLine();
			System.out.print("Enter a year: ");
			int year = in.nextInt();
			CarsDemo toAdd = new CarsDemo(make, model, year);
			lih.Insertitem(toAdd);

		}

		private static void deleteAnItem() {
			// TODO Auto-generated method stub
			System.out.print("Enter the MAKE to delete: ");
			String  make = in.nextLine();
			System.out.print("Enter the model to delete: ");
			String model = in.nextLine();
			System.out.print("Enter the year	 to delete: ");
			int year = in.nextInt();
			CarsDemo toDel = new CarsDemo(make, model, year);
			lih.Deleteitem(toDel);
		}

		private static void editAnItem() {
			// TODO Auto-generated method stub
			System.out.println("How would you like to search? ");
			System.out.println("1 : Search by Make");
			System.out.println("2 : Search by Model");
			int searchBy = in.nextInt();
			in.nextLine();
			/*List<ListItem> foundItems;
			if (searchBy == 1) {
				System.out.print("Enter the vehicle name: ");
				String make = in.nextLine();
				
			} else {
				System.out.print("Enter the item: ");
				String model = in.nextLine();
				

			}

			if (!foundItems.isEmpty()) {
				System.out.println("Found Results.");
				for (ListItem l : foundItems) {
					System.out.println(l.getId() + " : " + l.toString());
				}
				System.out.print("Which ID to edit: ");
				int idToEdit = in.nextInt();

				ListItem toEdit = lih.searchForItemById(idToEdit);
				System.out.println("Retrieved " + toEdit.getItem() + " from " + toEdit.getStore());
				System.out.println("1 : Update Store");
				System.out.println("2 : Update Item");
				int update = in.nextInt();
				in.nextLine();

				if (update == 1) {
					System.out.print("New Store: ");
					String make = in.nextLine();
					toEdit.setStore(newStore);
				} else if (update == 2) {
					System.out.print("New Item: ");
					String model = in.nextLine();
					toEdit.setItem(newItem);
				}

				lih.updateItem(toEdit);

			} else {
				System.out.println("---- No results found");
			}
*/
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			runMenu();

		}

		public static void runMenu() {
			boolean goAgain = true;
			System.out.println("--- Welcome to our awesome shopping list! ---");
			while (goAgain) {
				System.out.println("*  Select an item:");
				System.out.println("*  1 -- Add an vehicle");
//				System.out.println("*  2 -- Edit an vehicle");
				System.out.println("*  2 -- Delete an vehicle");
				System.out.println("*  3 -- View the vehicle list"
						+ "list");
				System.out.println("*  4 -- Exit the awesome program");
				System.out.print("*  Your selection: ");
				int selection = in.nextInt();
				in.nextLine();

				if (selection == 1) {
					addAnItem();
//				} else if (selection == 2) {
//					editAnItem();
				} else if (selection == 2) {
					deleteAnItem();
				} else if (selection == 3) {
					viewTheList();
//				} else if (selection == 4) {
//					viewTheList();
				} else {
					//lih.cleanUp();
					System.out.println("   Goodbye!   ");
					goAgain = false;
				}

			}

		}

		private static void viewTheList() {
			
			List<CarsDemo> list = lih.ViewList();
			  for(CarsDemo cd : list) {
				  System.out.println(cd.toString());
			  }

		}

	}
