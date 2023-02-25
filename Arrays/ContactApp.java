import java.util.Scanner;

class Contact {
    long[] no;
    String[] name;
    Scanner s = new Scanner(System.in);

    Contact(long[] a1, String[] a2) {
        no = new long[a1.length];
        name = new String[a2.length];
        for (int i = 0; i < a1.length; i++) {
            no[i] = a1[i];
            name[i] = a2[i];
        }
    }

    int menu() {
        System.out.println("\nOperations: ");
        System.out.println("1. Display all contacts");
        System.out.println("2. Search a contact");
        System.out.println("3. Add a new contact");
        System.out.println("4. Update a contact");
        System.out.println("5. Delete a contact");
        System.out.println("0: Exit");
        System.out.print("\nEnter Your Choice: ");
        int Choice = s.nextInt();

        return Choice;
    }

    void Display() {
        System.out.println("\nNumber: \tName:");
        for (int i = 0; i < no.length; i++) {
            System.out.println(no[i] + " \t" + name[i]);
        }
    }

    void Search() {
        System.out.println("\nEnter No. You want to Search:");
        long searchno = s.nextInt();
        for (int i = 0; i < no.length; i++) {
            if (searchno == no[i]) {
                System.out.println("Number: " + no[i] + "\tName: " + name[i]);
                break;
            } else if (i == (no.length - 1)) {
                System.out.println("\nNot found");
            }
        }
    }

    void Add() {
        System.out.println("\nEnter No. You want to add: ");
        long newno = s.nextInt();

        System.out.println("\nEnter Name: ");
        String newname = s.next();

        long[] tempno = new long[no.length + 1];
        String[] tempname = new String[name.length + 1];

        for (int i = 0; i <= no.length; i++) {
            if (i < no.length) {
                tempno[i] = no[i];
                tempname[i] = name[i];
            } else if (i == no.length) {
                tempno[i] = newno;
                tempname[i] = newname;
            }
        }
        no = new long[tempno.length];
        name = new String[tempname.length];

        for (int i = 0; i < tempno.length; i++) {
            no[i] = tempno[i];
            name[i] = tempname[i];
        }
    }

    void Update() {
        System.out.println("Enter No. You want to update: ");
        long tempno = s.nextInt();
        for (int i = 0; i < no.length; i++) {
            if (tempno == no[i]) {
                System.out.println("Enter New No.: ");
                long newno = s.nextInt();
                System.out.println("Enter New Name.: ");
                String newname = s.next();
                no[i] = newno;
                name[i] = newname;
                break;
            } else if (i == (no.length - 1)) {
                System.out.println("\nNot found");
            }
        }
    }

    void delete() {
        System.out.println("Enter No. You want to delete: ");
        long tempno = s.nextInt();
        for (int i = 0; i < no.length; i++) {
            if (tempno == no[i]) {
                int index = i;
                long[] tempnum = new long[no.length - 1];
                String[] tempname = new String[name.length - 1];

                for (int x = 0; x < no.length; x++) {
                    if (x == index) {
                        continue;
                    } else if (x < index) {
                        tempnum[x] = no[x];
                        tempname[x] = name[x];
                    } else if (x > index) {
                        tempnum[x - 1] = no[x];
                        tempname[x - 1] = name[x];
                    }
                }

                no = new long[tempnum.length];
                name = new String[tempname.length];

                for (int x = 0; x < tempnum.length; x++) {
                    no[x] = tempnum[x];
                    name[x] = tempname[x];
                }
                break;
            }
        }
    }
}

class ContactApp {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            long[] nums = { 1, 2, 3, 4 };
            String[] Names = { "a", "b", "c", "d" };
            Contact c = new Contact(nums, Names);
            int Choice = 0;

            do {
                Choice = c.menu();
                switch (Choice) {
                    case 1:
                        c.Display();
                        break;
                    case 2:
                        c.Search();
                        break;
                    case 3:
                        c.Add();
                        break;
                    case 4:
                        c.Update();
                        break;
                    case 5:
                        c.delete();
                        break;
                    default:
                        System.out.println("\nInvalid Choice");
                }
                System.out.print("\nPress 1 to continue \n      0 to exit \n\nChoice:");
                Choice = s.nextInt();
            } while (Choice != 0);
        }
    }
}