package Interface;


public class CD implements RatailItem, Displayable {
    double price;
    String title;
    String artist;


    public CD() {
    }

    public CD (double price, String title, String artist) {
        this.price = price;
        this.title = title;
        this.artist = artist;
    }


    public double getItemPrice() {
        return price;
    }

    public double setTitel ( ) {
        return 0;
    }


    public void setTitle (String title) {
        this.title = title;
    }


    public void display ( ) {
        System.out.println("Stor: "+ storeName+ "\ntitle: " + title + "\nprice: " + price + "\nArtist: " + artist);
    }
}
