/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexam_versiona_extensioncode;

import java.util.Scanner;

/**
 *
 * @author simar
 */
public class TestUserprofile {
   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to UserProfile Creator!");
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Choose your favorite genre:");
        System.out.println("1. Adventure");
        System.out.println("2. Fantasy");
        System.out.println("3. Sci-Fi");
        System.out.println("4. Horror");
        System.out.print("Enter the number corresponding to your favorite genre: ");
        int choice = scanner.nextInt();

        String favoriteGenre;
        switch (choice) {
            case 1:
                favoriteGenre = "Adventure";
                break;
            case 2:
                favoriteGenre = "Fantasy";
                break;
            case 3:
                favoriteGenre = "Sci-Fi";
                break;
            case 4:
                favoriteGenre = "Horror";
                break;
            default:
                System.out.println("Invalid choice. Defaulting to Adventure.");
                favoriteGenre = "Adventure";
        }

        UserProfile userProfile = new UserProfile(name, favoriteGenre);
        System.out.println("UserProfile created successfully!");
        System.out.println("UserID: " + userProfile.getUserID());
        System.out.println("Favorite Genre: " + userProfile.getGenre());
    }
}
