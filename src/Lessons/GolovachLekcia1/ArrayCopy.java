package GolovachLekcia1;

import java.util.Arrays;

public class ArrayCopy
{
    public static void main(String[] args) {
        int[] data = {10,13,43,54,65,32};

        System.arraycopy(data,1,data,2,2);

        System.out.println(Arrays.toString(data));
    }
}
