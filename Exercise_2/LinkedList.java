import java.util.LinkedList;

class Main {
    public static void main(String[] args) {

        // Create your own music playlist by creating a LinkedList object
        LinkedList<String> Playlist = new LinkedList<>();

        // Add 5 new songs to your Playlist using the add() method
        Playlist.add("Favorie Crime");
        Playlist.add("Love Someone");
        Playlist.add("enough for you");
        Playlist.add("All I want");
        Playlist.add("All to well");

        // Add a new song at the front of the Playlist using the addFirst() method
        Playlist.addFirst("Enchanted");

        // Add a new song at the end of the Playlist using the addLast() method
        Playlist.addLast("Always be my baby");

        // Display the song at the front of the Playlist using the combination of and get() method and the println() method
        System.out.println(Playlist.get(0));

        // Replace the last song using the set() method
        Playlist.set(6, "The only exception");

        // Remove the first song using the remove() method
        Playlist.remove(0);

        // Display all songs in your Playlist using the println method
       
       System.out.println("My updated playlist: " + Playlist);
    }
}
