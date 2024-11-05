public class LibrarySystem {
        public static void main(String[] args) {
            Books book1 = new Books("Seena Maragatham", "Sujatha Thilaka", "9789553023975", true);
            Books book2 = new Books("Nuramakadya Bauthika Nuladanayakshanamaala","Seynamasasekaka","9789553548721", true);
            Books book3 = new Books("Island of a Thousand Mirrors", "Nayomi Munaweera", "9781616953623", true);

            Library FCTLibrary = new Library();
            FCTLibrary.addLibraryItem(book1);
            FCTLibrary.addLibraryItem(book2);
            FCTLibrary.addLibraryItem(book3);

            FCTLibrary.displayLibraryInfo();
            System.out.println();

            FCTLibrary.listAllAvailableItem();
            System.out.println();

            FCTLibrary.checkoutLibraryItems("Island of a Thousand Mirrors");

            FCTLibrary.displayLibraryInfo();
            System.out.println();

            FCTLibrary.listAllAvailableItem();
            System.out.println();

            FCTLibrary.allDetailsAboutBook();
        }
}
