/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Jack Clayton
 */

package midtermexam_versiona_extensioncode;

import java.util.Scanner;

public class TestUserProfile {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.println("Choose your favorite genre from the list: ");
        String[] genres = {"Comedy", "Drama", "Action", "Mystery"};
        for (int i = 0; i < genres.length; i++) {
            System.out.println((i + 1) + ". " + genres[i]);
        }
        int choice = input.nextInt();
        String genre = genres[choice - 1];

        UserProfile userProfile = new UserProfile(name, genre);
        System.out.println("Your user profile was created.");
    }

}
