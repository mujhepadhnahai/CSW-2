
import java.util.*;

public class RemoveDuplicateEmails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> emailList = new LinkedList<>();

        System.out.println("Enter email addresses ");
        String email;
        while (true) {
            email = scanner.nextLine();
            if (email.equalsIgnoreCase("exist")) {
                break;
            }
            emailList.add(email);
        }
        scanner.close();

        Set<String> uniqueEmails = removeDuplicatesIgnoringLocalPart(emailList);

        System.out.println("\nUnique email addresses (considering only the domain):");
        for (String uniqueEmail : uniqueEmails) {
            System.out.println(uniqueEmail);
        }
    }

    public static Set<String> removeDuplicatesIgnoringLocalPart(List<String> emails) {
        Set<String> uniqueEmails = new LinkedHashSet<>();
        Set<String> seenDomains = new LinkedHashSet<>();

        for (String email : emails) {
            int atIndex = email.indexOf('@');
            if (atIndex != -1) {
                String domainPart = email.substring(atIndex);
                if (seenDomains.add(domainPart)) {
                    uniqueEmails.add(email);
                }
            } else {
                
                uniqueEmails.add(email);
                seenDomains.add(email); 
            }
        }
        return uniqueEmails;
    }
}