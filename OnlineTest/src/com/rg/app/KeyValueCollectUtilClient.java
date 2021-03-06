package com.rg.app;

import java.util.Scanner;
public class KeyValueCollectUtilClient {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final String CREATE="CREATE";
		final String UPDATE="UPDATE";
		final String DELETE="DELETE";
		final String GET="GET";
		final String GETALL="GETALL";
		final String QUIT="QUIT";
		
		String inputCommand;
		System.out.println("Enter valid Command from Given command List: ");
		
		inputCommand = sc.next();
		
		do {
			switch (inputCommand) {
			case CREATE:
				try {
					String k = sc.next();
					sc.next();
					String v = sc.next();
					DataMapUtil.create(k, v);
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}

				break;
				
			case UPDATE:
				try {
					String k = sc.next();
					sc.next();
					String v = sc.next();
					if (DataMapUtil.search(k) == true) {

						DataMapUtil.update(k, v);
					} else {
						System.out.println("Key :" + k+ "not found");
					}

				} catch (Exception e) {
					System.out.println(e.getMessage());
				}

				break;

			case DELETE:

				try {
					DataMapUtil.delete(sc.next());
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				break;
			case
			GET:

				try {
					String k = sc.next();

					if (DataMapUtil.search(k) == true) {

						System.out.println(DataMapUtil.getValue(k));
					} else {
						System.out.println("Key :" +k+ " not found");
					}
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}

				break;
			case
			GETALL:

				DataMapUtil.getAll();

				break;
			
			default:
				System.out.println("Inavlid input please input any one string from given list \n ");
				break;
			}

			inputCommand = sc.next();
		} while (!inputCommand.equals(QUIT));
	}
}
