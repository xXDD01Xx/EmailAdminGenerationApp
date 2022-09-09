package EmailApp;

import java.util.Scanner;

public class EmailApp
{
    public static void main(String[] args)
    {
        Scanner nameInput = new Scanner(System.in);

        while(true)
        {
            System.out.printf("%s%n %20s%n %s%n",
                    "*****************************************",
                    "WELCOME To The Email Administration App",
                    "***************************************");


            System.out.println("Please enter your first name: ");
            String firstNameInput = nameInput.nextLine();

            System.out.println("Please enter your last name: ");
            String lastNameInput = nameInput.nextLine();

            Email newEmail = new Email(firstNameInput, lastNameInput);

            System.out.println(newEmail.showInformation());

            System.out.println("Would you like to output this information to a txt file? [Y / N]");
            String outputToText = nameInput.nextLine();

            if(outputToText.equalsIgnoreCase("Y"))
            {
                try
                {

                } catch (Exception e)
                {
                    throw new RuntimeException(e);
                }
            }
            else
                continue;

            System.out.println("Would you like to create another? [Y / N]");
            String runAgainInput = nameInput.nextLine();

            int numberOfEmails = 0;

            if(runAgainInput.equalsIgnoreCase("Y"))
            {
                // TODO: change Mailbox capacity to Email System Capacity; create 2 variables for the fullCapacity
//                numberOfEmails++;
//
//                newEmail.setMailboxCapacity();
//                continue;
            }
            else
            break;
        }
    }
}
