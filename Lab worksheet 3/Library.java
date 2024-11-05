import java.util.ArrayList;

public class Library {
    ArrayList<BorrowableItems> borrowableItemsList = new ArrayList<>();

    public void addLibraryItem (BorrowableItems borrowableItems){
        borrowableItemsList.add(borrowableItems);
    }

    public void checkoutLibraryItems(String title){
        int bookStutas = 1;
        for (BorrowableItems i: borrowableItemsList){
            if (i instanceof Books){
                if (((Books) i ).getTitle().equals(title) && ((Books) i ).isAvailable()){
                    ((Books) i ).setAvailable(false);
                    System.out.println(title + " book is checkout.\n");
                    return;
                }else if (!(((Books) i ).isAvailable())) {
                    System.out.println(title + " is already borrowed\n");
                    return;
                }else{
                    bookStutas = 0;
                }
            }
        }
        System.out.println((bookStutas == 0 ) ? title + " is not in this library\n" : "");
    }

    public void listAllAvailableItem(){
        for (BorrowableItems i: borrowableItemsList){
            if (i instanceof Books){
                if (((Books) i ).isAvailable()){
                    System.out.println(((Books) i ).getTitle());
                }
            }
        }
    }
    public  void displayLibraryInfo (){
        int count = 0;
        for (BorrowableItems i: borrowableItemsList){
            if (i instanceof Books){
                if (((Books) i ).isAvailable()){
                    count++;
                }
            }
        }
        System.out.println("FCT Library\nNumber of available books : " + count );
    }
    public void allDetailsAboutBook() {
        System.out.println("All details\n");
        for (BorrowableItems book : borrowableItemsList) {
            book.displayInfo();
            System.out.println();
        }
    }
}
