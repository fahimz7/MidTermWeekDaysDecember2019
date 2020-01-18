package problemandsolutions;

public class SearchElementOfArray {
    // By using the sequential search algorithm,
    // write a Java program to search for an element of an integer array of 10 elements.


    public static void main(String[] args) {

        int[] arr={23,2,8,56,80,23,4,5,6,10};
    //searching by using the sequential search technique
        int pos=seqsearch(arr,5, arr.length);
        if(pos!=-1)
            System.out.println(" The values is found in position "+ pos+" of the Array");
    }
    public static int seqsearch(int[] dataset,int target,int n){
        int found=0;
        int i;
        int pos=-1;
        for(i=0;i<n && found!=1;i++)
            if(target==dataset[i]){pos=i;found=1;}

        return pos;
    }

}









