package arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Reader {
    static BufferedReader reader;
    static StringTokenizer tokenizer;
     
    /** call this method to initialize reader for InputStream */
    static void initialize(InputStream input) {
    	reader = new BufferedReader(new InputStreamReader(input) );
    	tokenizer = new StringTokenizer("");
    }
     

	public static Long nextLong() throws IOException{
		return Long.parseLong( next() );
	}


	/** get next word */
    static String next() throws IOException {
    	while ( ! tokenizer.hasMoreTokens() ) {
    		tokenizer = new StringTokenizer(reader.readLine() );
    	}
    	return tokenizer.nextToken();
    }
     
    static int nextInt() throws IOException {
    	return Integer.parseInt( next() );
    }
     
    static double nextDouble() throws IOException {
    	return Double.parseDouble( next() );
    }
}
