class Neon_number {
    public static boolean isPalindrome(int x) {
        int check = 0,sum = 0,temp,n;
        temp = x;
        while(temp != 0) {
            n = temp % 10;
            check = (sum*10)+n;
            temp /= 10;  
        }
        temp = x;
        if(check == temp) {
           return true;
        }else {
            return false;
        }
        
        
    }
     public static void main(String[] args) {
        boolean palin = isPalindrome(121);
        System.out.println(palin);
        
    }
   
}