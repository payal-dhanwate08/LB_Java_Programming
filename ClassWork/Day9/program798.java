import java.util.*;

class program798
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Marks[] = new int[5];

        System.out.println("Enter Marks :");

        int i = 0;
        int iSum = 0;
        boolean Pass = true;
        boolean Invalid = false;

        for(i = 0; i < Marks.length;i++)
        {
            Marks[i] = sobj.nextInt();
            if(Marks[i] < 35)
            {
                Pass = false;
            }
            if(Marks[i] < 0 || Marks[i] > 100)
            {
                Invalid = true;
            }
            iSum = iSum + Marks[i];
        }
        
        if(Invalid == true)
        {
            System.out.println("Invalid Marks");
            return;
        }

        if(Pass == false)
        {
            System.out.println("Result: fail");
            return;
        }

        float Average = ((float)iSum / (float)5);

        System.out.println("Average Marks :"+Average);
        if(Average >= 75.0f)
        {
            System.out.println("Finel Result: Destinction");
        }
        else if(Average >= 60.0f)
        {
            System.out.println("Finel Result: First class");
        }
        else if(Average >= 50.0f)
        {
            System.out.println("Finel Result: Second class");
        }
        else if(Average < 50.0f)
        {
            System.out.println("Finel Result: Pass");
        }

        sobj.close();

    }
}