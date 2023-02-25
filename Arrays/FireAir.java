import java.util.Scanner;

class App {
    String[] songs;
    Scanner s = new Scanner(System.in);

    App(String[] s) {
        songs = new String[s.length];
        for (int i = 0; i < s.length; i++) {
            songs[i] = s[i];
        }
    }

    void display() {
        for (int i = 0; i < songs.length; i++) {
            System.out.print("\n" + (i + 1) + ". " + songs[i]);
        }
    }

    void Add() {
        System.out.println("\nEnter New Song: ");
        String newsong = s.nextLine();

        String[] temp = new String[songs.length + 1];

        for (int i = 0; i <= songs.length; i++) {
            if (i < songs.length) {
                temp[i] = songs[i];
            } else if (i == songs.length) {
                temp[i] = newsong;
            }
        }

        songs = new String[temp.length];

        for (int i = 0; i < temp.length; i++) {
            songs[i] = temp[i];
        }
    }

    void delete() {
        System.out.println("\nEnter Song No. You want to delete (Starting from 1): ");
        int songindex = s.nextInt();
        songindex--;

        String[] temp = new String[songs.length - 1];

        if (songindex > -1 && songindex < songs.length) {
            for (int i = 0; i < songs.length; i++) {
                int index = i;

                if (i == songindex) {
                    continue;
                } else if (i < songindex) {
                    temp[i] = songs[i];
                } else if (i > songindex) {
                    temp[i - 1] = songs[i];
                }
            }
            songs = new String[temp.length];

            for (int i = 0; i < temp.length; i++) {
                songs[i] = temp[i];
            }
        } else {
            System.out.println("Invalid");
        }
    }

    void Search() {
        System.out.println("\nEnter Song You want to Search:");
        String songname = s.nextLine();
        for (int i = 0; i < songs.length; i++) {
            if (songname.equals(songs[i])) {
                System.out.println("Number: " + (i + 1) + "\tName: " + songs[i]);
                break;
            } else if (i == (songs.length - 1)) {
                System.out.println("\nNot found");
            }
        }
    }

    void Update() {
        System.out.println("Enter Song No. You want to update: ");
        int songindex = s.nextInt();
        for (int i = 0; i < songs.length; i++) {
            if (i < songs.length) {
                System.out.println("Enter New Name.: ");
                String newname = s.nextLine();
                songs[i] = newname;
                break;
            } else if (i == (songs.length - 1)) {
                System.out.println("\nNot found");
            }
        }
    }
}

public class FireAir {
    public static void main(String[] args) {
        String[] songs = { "A", "B", "C" };
        App SongsApp = new App(songs);

        SongsApp.display();
        SongsApp.Add();
        SongsApp.Update();
        SongsApp.Search();
    }
}