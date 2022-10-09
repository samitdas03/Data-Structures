package string;

public class ghj {

    public static void main(String[] args) {
        
        System.out.println(0x80000000);
        System.out.println(Integer.toBinaryString(-2147483648));
        System.out.println(Integer.toBinaryString(0));
        System.out.println(Math.abs(-2147483647));
    }


    public static long binaryString(int l) {
	    if(l % 2 == 1) {
	        return -1;
	    }
	    StringBuilder sb = new StringBuilder("");
	    for(int i = 0; i < l/2; i++) {
	        sb.append("10");
	    }
	    return Long.parseLong(sb.toString());
	}
    



    // if(x == 0 && grid[i][0] >= 0) {
    //     countNegative += grid[i].length-1;
    // } else if(x == 0 && grid[i][0] < 0){
    //     countNegative += grid[i].length;
    // } else if(x != grid[i].length-1) {
    //     countNegative += grid[i].length - x - 1;
    // }
    
}
