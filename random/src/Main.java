import org.redfx.strange.algorithm.Classic;

public class Main {

    public static void main (String[] args) {
    	int numBits = 16;
    	StringBuffer sb = new StringBuffer();
    	
    	for (int i =0; i<numBits; i++) {
    		if(Classic.randomBit() >0)
    		{
    			//System.out.println(1);
    			sb.append("1");
    		}else {
    			sb.append("0");
    		}
    	}
    	//System.out.println(sb);
    	
    	//convert to decimal
    	String bitString = sb.toString();
    	int sum = 0;
    	for(int i = 0; i < bitString.length(); i++) {
    		if (bitString.charAt(i) == '1') {
    			sum += Math.pow(2, i);
    		}
    	}
    	System.out.println(sb.reverse());
    	System.out.println(sum);
    	System.out.println(Integer.toHexString(sum));
//        System.out.println("Using high-level Strange API to generate random bits");
//        System.out.println("----------------------------------------------------");
//        int randomBit = Classic.randomBit();
//        System.out.println("Generate one random bit, which can be 0 or 1. Result = "+randomBit);
//        int cntZero = 0;
//        int cntOne = 0;
//        for (int i = 0; i < 10000; i++) {
//            if (Classic.randomBit() > 0) {
//                cntOne ++;
//            } else {
//                cntZero ++;
//            }
//        }
//        System.out.println("Generated 10000 random bits, "+cntZero+" of them were 0, and "+cntOne+" were 1.");
    }
}
