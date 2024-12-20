//written by SiyoungPark
public class UserTester {
    public static void main(String[] args) {
        /*
        // Create instances of RegularUser and AdminUser
        RegularUser regularUser = new RegularUser("john_doe", "password123");
        AdminUser adminUser = new AdminUser("admin_user", "adminPass");
    
        // Outputs initial user info
        System.out.println("Regular User: " + regularUser.getUsername());
        System.out.println("Admin User: " + adminUser.getUsername());
        
        // Test booking tickets for RegularUser
        testBooking(regularUser, 3);  // Regular user tries to book 3 tickets
        testBooking(regularUser, 6);  // Regular user tries to book more than maxBookings

        // Test booking tickets for AdminUser (should be able to book unlimited tickets)
        testBooking(adminUser, 10);   // Admin user books 10 tickets
        testBooking(adminUser, 50);   // Admin user books 50 tickets (unlimited)

        // Test canceling tickets for RegularUser
        testCancelBooking(regularUser, 2); // Regular user cancels 2 tickets

        // Test canceling tickets for AdminUser
        testCancelBooking(adminUser, 5); // Admin user cancels 5 tickets

        // Test if users can book
        testCanBook(regularUser);
        testCanBook(adminUser);
    }

    // Method to test booking functionality
    private static void testBooking(User user, int seats) {
        System.out.println("\nBooking " + seats + " tickets for " + user.getUsername());
        try {
            // Assume a Movie instance exists, e.g., a movie titled "The Matrix"
            Movie movie = new Movie("The Matrix", "Wachowski", "Sci-Fi", 100); // Create a movie instance
            user.bookTicket(movie, seats); // Attempt to book tickets
        } catch (MovieNotAvailableException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Method to test canceling booking functionality
    private static void testCancelBooking(User user, int seats) {
        System.out.println("\nCanceling " + seats + " tickets for " + user.getUsername());
        // Assume a Movie instance exists (same movie for simplicity)
        Movie movie = new Movie("The Matrix", "Wachowski", "Sci-Fi", 100); // Create a movie instance
        user.cancelBooking(movie, seats); // Attempt to cancel tickets
    }

    // Method to test the canBook method
    private static void testCanBook(User user) {
        if (user.canBook()) {
            System.out.println(user.getUsername() + " can book more tickets.");
        } else {
            System.out.println(user.getUsername() + " has reached their booking limit.");
        }
        */
    }
    
}