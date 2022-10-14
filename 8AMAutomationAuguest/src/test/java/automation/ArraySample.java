package automation;

public class ArraySample {

    public static void main(String[] args) {

        int [] s = {45,89,12,0}; //0,1,2,3  //size is fixed

        System.out.println(s.length);

        for(int i=0;i<s.length;i++)  //condition
        {
            System.out.println(s[i]);
        }

        //HasNext

        for(int output:s){
            System.out.println(output);
        }
        String[] d ={"learn","more"};

        for (String j:d){
            System.out.println(j);
        }

       int [] p = new int[2];
        p[0] = 12;
        p[1] = 45;

        int []j = {12,45}; //2

        j[2]= 7;









    }
}
