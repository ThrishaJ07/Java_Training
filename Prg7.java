
public class Prg7{
    public static void main(String[] args)
    {
        int[] nums = new int[] {1,2,3};
        try{
            int numFromNegativeIndex = nums[-1];
            int numFromGreaterIndex = nums[4];
            int numFromLengthIndex = nums[3];
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("ArrayIndexOutOfBoundsException caught");
            e.printStackTrace();
        }
    }
}