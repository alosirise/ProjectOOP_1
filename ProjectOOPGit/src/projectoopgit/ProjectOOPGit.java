package projectoopgit;
import java.util.*;
        interface press{
        public void press();
        }
        interface user{
        public void user();
        }

class Main{
    public static void main(String[] args) {
        registerUser a = new registerUser();
        a.press();
    }
}