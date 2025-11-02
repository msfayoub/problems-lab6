package problem3;

import java.util.Scanner;

public class Test {
    private static int readInt(Scanner sc, String prompt) {
        System.out.print(prompt);
        while (true) {
            String line = sc.nextLine().trim();
            try { return Integer.parseInt(line); }
            catch (NumberFormatException e) { System.out.print("Entrez un entier: "); }
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Library library = new Library(10);
        library.add(new Book("Samarcande", "Amin MAALOUF", 400));
        library.add(new Novel("The 48", "Mathew", 1000, 100));

        int choice;
        do {
            System.out.println("\n=== Menu ===");
            System.out.println("1) Ajouter (Document / Book / Novel)");
            System.out.println("2) Afficher tous les documents");
            System.out.println("3) Supprimer (par ref)");
            System.out.println("4) Afficher les auteurs");
            System.out.println("5) Rechercher (par ref)");
            System.out.println("0) Quitter");
            choice = readInt(sc, "Votre choix: ");

            switch (choice) {
                case 1 -> {
                    System.out.println("Type: 1=Document  2=Book  3=Novel");
                    int t = readInt(sc, "Type: ");
                    System.out.print("Titre: ");
                    String title = sc.nextLine();

                    if (t == 1) {
                        Document d = new Document(title);
                        System.out.println(library.add(d) ? "Ajouté." : "Bibliothèque pleine.");
                    } else if (t == 2) {
                        System.out.print("Auteur: ");
                        String author = sc.nextLine();
                        int pages = readInt(sc, "Pages: ");
                        Book b = new Book(title, author, pages);
                        System.out.println(library.add(b) ? "Ajouté." : "Bibliothèque pleine.");
                    } else if (t == 3) {
                        System.out.print("Auteur: ");
                        String author = sc.nextLine();
                        int pages = readInt(sc, "Pages: ");
                        int chapters = readInt(sc, "Chapitres: ");
                        Novel n = new Novel(title, author, pages, chapters);
                        System.out.println(library.add(n) ? "Ajouté." : "Bibliothèque pleine.");
                    } else {
                        System.out.println("Type inconnu.");
                    }
                }
                case 2 -> library.displayDocuments();
                case 3 -> {
                    int ref = readInt(sc, "Ref à supprimer: ");
                    Document d = library.document(ref);
                    if (d == null) System.out.println("Aucun document avec ref " + ref);
                    else library.delete(d);
                }
                case 4 -> library.displayAuthors();
                case 5 -> {
                    int ref = readInt(sc, "Ref à chercher: ");
                    Document d = library.document(ref);
                    System.out.println(d == null ? "Introuvable." : "Trouvé: " + d);
                }
                case 0 -> System.out.println("Au revoir !");
                default -> System.out.println("Choix invalide.");
            }
        } while (choice != 0);

        sc.close();
    }
}
