public class DevanshuBhiya {

    public static void main(String[] args) {
        
    }


    public static boolean fun(int n) {
        if(n < 11) return false;
        if(n > 1099) {
            return true;
        }
        for(int i = 0; i < 10; i++) {
            if(n%11 == 0) {
                return true;
            }
            n -= 111;
            if(n < 0) {
                return false;
            }
        }
        return false;
    }
    
}
