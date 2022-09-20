import java.util.LinkedList;
import java.util.Queue;

public class QUEU {

    public static void main(String[] args) {
        Queue<String> Friends = new LinkedList<>();

        // Adds elements to the queue
        Friends.add("Winny");
        Friends.add("Jap");
        Friends.add("Tristan");
        Friends.add("Luis");
        Friends.add("Andrei");

        // Display all elements of the queue.
        System.out.println(Friends);

        // Removes the element at the front of the queue
        Friends.remove(Friends);

        // Returns the number of elements in the queue.
        System.out.println(Friends.size());

        // Shows the element at the front of the queue
        System.out.println(Friends.peek());

        // Display all elements of the queue.
        System.out.println(Friends);


        Queue<String> FriendsList = new LinkedList<>();

        // Adds elements to the queue
        FriendsList.add("Marianne");
        FriendsList.add("Richael");
        FriendsList.add("Angelo");
        FriendsList.add("Florence");
        FriendsList.add("Rizjake");

        // Display all elements of the queue.
        System.out.println( FriendsList);

        // Removes the element at the front of the queue
        FriendsList.remove( FriendsList);

        // Returns the number of elements in the queue.
        System.out.println(FriendsList.size());

        // Shows the element at the front of the queue
        System.out.println(FriendsList.peek());

        // Display all elements of the queue.
        System.out.println(FriendsList);
    }
}
