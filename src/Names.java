import javax.naming.Name;
import java.util.Arrays;

public class Names {
    private String firstName;
    private String middleName;
    private String lastName;


    public Names(String fullName) {
        String[] nameParts = fullName.split(" ");
        if (nameParts.length == 1) {
            firstName = nameParts[0];
            middleName = " ";
            lastName = " ";
        } else if (nameParts.length == 2) {
            firstName = nameParts[0];
            middleName = " ";
            lastName = nameParts[1];
        } else {
            firstName = nameParts[0];
            middleName = " ";
            for (int i = 1; i < nameParts.length - 1; i++) {
                middleName += middleName.trim();
                lastName = nameParts[nameParts.length - 1];
            }
        }
    }
        public String toString() {
            if (middleName.isEmpty()) {
                return firstName + " " + lastName;
            } else {
                return firstName + " " + middleName + " " + lastName;
            }
        }
        public String getFirstName() {
            return firstName;
        }

        public String getMiddleName() {
            return middleName;
        }

        public String getLastName() {
            return lastName;
        }
    }
