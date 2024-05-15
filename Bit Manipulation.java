class Solution {
    static void bitManipulation(int num, int i) {
        // code here
        int mask=1<<(i-1);
        if((num&mask)!=0){
            System.out.print(1+" ");
        }else{
            System.out.print(0+" ");
        }
        System.out.print((num|mask) +" ");
        mask=~(mask);
        System.out.print(num&mask);
    }
}
