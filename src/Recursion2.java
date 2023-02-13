class RecTest{
    int values[];

    void arr(int n){
        values = new int[n];
    }

    void printArray(int i){
        if(i==0){
            return;
        }
        printArray(i-1);
        System.out.println("["+(i-1)+"] = "+values[i-1]);
    }
}

public class Recursion2 {
    public static void main(String args[]){
        RecTest ob = new RecTest();
        ob.arr(10);
        for(int i=0;i<10;i++){
            ob.values[i] = i;
        }

        ob.printArray(10);
    }
}
