public class BitManip {
    public static void main(String[] args) {
        //add two binary strings and return a bin string
        String a="101";
        String ab="11";
        int x=Integer.parseInt(a,2)+Integer.parseInt(ab,2);
        System.out.println(Integer.toBinaryString(x));
        
        //count number of 1 bits
        int y=11,count=0;
        while(y!=0){
            if((y&1)==1)
                count++;
            y=y>>1;    
        }
        System.out.println(count);

        //single unique number
        int[] nums={1,2,2,3,4,3,4,1,6};
        int sol=0;
        for(int num:nums){
            sol^=num;
        }
        System.out.println(sol);

    }
}
