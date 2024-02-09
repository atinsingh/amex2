package io.pragra.learning;

public class Main {

    public static void main(String[] args) {
      DatabaseManager manager = new MySqlManager("1.0");
      manager.executeInsert();

    }
}
