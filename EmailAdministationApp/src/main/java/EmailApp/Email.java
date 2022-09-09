package EmailApp;

import java.util.Scanner;

public class Email
{
        //instance variables
        private String firstName;
        private String lastName;
        private String defaultPassword;
        private int mailboxCapacity = 500;

        private String department;
        private String email;
        private String alternateEmail;
        private final int DEFAULT_PASSWORD_LENGTH = 9;
        private final String COMPANY_NAME = "techelevator.com";


        //Constructor
        public Email(String firstName, String lastName)
        {
                this.firstName = firstName;
                this.lastName = lastName;
//                System.out.println("Email CREATED: " + this.firstName + " " + lastName);

                this.department = setDepartment();                                               //Call method asking for department(return department)
                System.out.println("DEPARTMENT: " + this.department);

                //Call Method for random password
                this.defaultPassword = randomPassword(DEFAULT_PASSWORD_LENGTH);
                System.out.println("Your password is " + this.defaultPassword);

                //Email
                email = lastName.toLowerCase() + "." + firstName.toLowerCase() + "@" + department.toLowerCase().replaceAll("\\s+","") + "." + COMPANY_NAME;
//                System.out.println("Your new EMAIL is: " + email);
        }


        //Methods
                //Ask for department
        private String setDepartment()
        {
                System.out.printf("%s%n %20s%n %30s%n %38s%n %44s%n %41s%n %38s%n %45s%n %s%n", "DEPARTMENTS",
                        "1 for Accounting",
                        "2 for Customer Service",
                        "3 for Software Development",
                        "4 for Research & Development",
                        "5 for Human Resources",
                        "6 for Security",
                        "0 for MISCELLANEOUS",
                        "Enter Department Code...");

                Scanner departmentInput = new Scanner(System.in);
                int departmentChoice = departmentInput.nextInt();

                if (departmentChoice == 1)
                        return "Accounting";
                else if (departmentChoice == 2)
                        return "Customer Service";
                else if (departmentChoice == 3)
                        return "Software Development";
                else if (departmentChoice == 4)
                        return "Research & Development";
                else if (departmentChoice == 5)
                        return "Human Resources";
                else if (departmentChoice == 6)
                        return "Security";
                else return "MISCELLANEOUS";
        }

                //Generate random password
        private String randomPassword(int length)
        {
                String passwordPossibilityChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ#$%&?!<>";
                char[] password = new char[length];

                for(int i = 0; i < length; i++)
                {
                       int randomValue = (int)(Math.random() * passwordPossibilityChars.length());
                       password[i] = passwordPossibilityChars.charAt(randomValue);
                }
                return new String(password);
        }

        //password checker

        public String showInformation()
        {
                return "NAME (First, Last): " + firstName + " " + lastName +
                        "\nCompany EMAIL: " + email +
                        "\nMailbox CAPACITY: " + mailboxCapacity + "mb";
        }


        //Setters
                //Set mailbox capacity
        public void setMailboxCapacity(int capacity)
        {
                this.mailboxCapacity = capacity;
        }

                //Set alternate email
        public void setAlternateEmail(String altEmail)
        {
                this.alternateEmail = altEmail;
        }

                //Change the password
        public void changePassword(String defaultPassword)
        {
                this.defaultPassword = defaultPassword;
        }

        //Getters
        public int getMailboxCapacity()
        {
                return mailboxCapacity;
        }

        public String getAlternateEmail()
        {
                return alternateEmail;
        }
        public String getDefaultPassword()
        {
                return defaultPassword;
        }

}
