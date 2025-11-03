class Logic
{
    void CheckLeapYear(int num)
    {
        if(num%4==0)
        {
            System.out.println(num+" is a Leap year");
        }
        else
        {
            System.out.println(num+" is not a Leap year");
        }
   
    }
}

class program1_1
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.CheckLeapYear(2024);
    }
}