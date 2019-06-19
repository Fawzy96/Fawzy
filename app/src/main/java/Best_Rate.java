import java.util.Arrays;
import java.util.Collections;

public class Best_Rate {



    public static void main(String[] args)
    {
        int[] Rate={3,2,4,5};

        String[] companyName=new String[4];
        companyName[0]="United Sun Moving Service";
        companyName[1]="Remov Relocation Server";
        companyName[2]="TNT";
        companyName[3]="Organic";

        Arrays.sort(new int[][]{Rate},Collections.reverseOrder());

    }

}
