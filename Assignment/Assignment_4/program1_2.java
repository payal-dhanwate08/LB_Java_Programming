class Logic
{
    void DisplayGrade(int Marks)
    {
        if(Marks >=90)
        {
            System.out.println("Grade : A+");
        }
        else if(Marks >=75)
        {
            System.out.println("Grade : A");
        }
        else if(Marks >=60)
        {
            System.out.println("Grade : B");
        }
        else if(Marks >=50)
        {
            System.out.println("Grade : C");
        }
        else if(Marks >=35)
        {
            System.out.println("Grade : Pass");
        }
        else
        {
            System.out.println("Grade : Fail");

        }
    }
}

class program1_2
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.DisplayGrade(82);
    }
}