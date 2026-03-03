import java.util.*;

class program818
{
    public static boolean CheckStrong(int iNo)
    {
        int iTemp = 0,iSum = 0,iDigit = 0;

        iTemp = iNo;
                       // 0, 1,2,3,4,  5,  6,   7,  8,    9
        int FactArr[] = {1,1,2,6,24,120,720,5040,40320,362880};

        while(iNo != 0)
        {
            iDigit = iNo % 10;
           
            iSum = iSum + FactArr[iDigit];

            iNo = iNo / 10;
        }
       
        return (iSum == iTemp);
    }
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iNo = 0;
        boolean bRet = false;

        System.out.println("Enter number :");
        iNo = sobj.nextInt();

        bRet = CheckStrong(iNo);

        if(bRet)
        {
            System.out.println(iNo + " is Strong number");
        }
        else
        {
            System.out.println(iNo + " is not a Strong number");
        }
        sobj.close();

        

        
    }
}