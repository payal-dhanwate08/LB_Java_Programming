class Logic
{
    void PrintTable(int num)
    {
       int iCnt = 0;
       int iTable = 0;
       for(iCnt = 1 ; iCnt<=10 ; iCnt++)
       {
          iTable = num*iCnt;
          System.out.println(iTable+" \n");
           
       }
        
    }
}



class program1_5


{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.PrintTable(5);

    }
}