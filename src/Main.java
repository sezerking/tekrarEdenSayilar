import java.util.Arrays;

public class Main {
    static boolean isFind(int[] arr, int value){
        for (int i : arr){
            if (i==value){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] list={3,7,3,3,2,2,4,4,10,10,9,10,211,1,33,9,1};
        int[] dup=new int[list.length];
        int startIndex=0;
        for (int i=0;i<list.length;i++){
            for (int j=0;j<list.length;j++){
                if ((i!=j) && (list[i]==list[j])){
                    if (list[i] % 2 == 0) {

                        if (!isFind(dup,list[i])){
                            dup[startIndex++]=list[i];
                        }
                        break;
                    }
                }
            }
        }

        for (int value: dup){
            if (value!=0){
                System.out.println(value);
            }
        }
    }
}
