package Question7;

public class Database {
    private static int numOfConnections = 0;
    public static void connect() {
        // Code to establish a new connection
        numOfConnections++;
        System.out.println("Number of active connections: " + numOfConnections);
    }
    public static void closeConnection() {
        // Code to close the connection
        numOfConnections--;
        System.out.println("Number of active connections: " + numOfConnections);
    }

    public static void main(String[] args) {
        connect();
        connect();
        closeConnection();
        closeConnection();
    }
}