package v001;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;
 
 
public class PowerCrisis_UVa151 {
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		
		
		while(true)
		{
			int N = sc.nextInt();
			if(N == 0)
				break;
			ll: for(int m = 1; true; ++m)
			{
				boolean[] vis = new boolean[N];
				vis[0] = true;
				int idx = 1, cnt = N - 1;
				while(cnt-- > 0)
				{
					int p = m;
					while(vis[idx] || --p > 0)
						idx = (idx + 1) % N;
					if(idx == 12 && cnt != 0)
						continue ll;
					vis[idx] = true;
					idx = (idx + 1) % N;
				}
				out.println(m);
				break;
			}
		}
		out.flush();
		out.close();
	}
	
	static class Scanner 
	{
		StringTokenizer st;
		BufferedReader br;
 
		public Scanner(InputStream s){	br = new BufferedReader(new InputStreamReader(s));}
	 
		public String next() throws IOException 
		{
			while (st == null || !st.hasMoreTokens()) 
				st = new StringTokenizer(br.readLine());
			return st.nextToken();
		}
 
		public int nextInt() throws IOException {return Integer.parseInt(next());}
 
		public long nextLong() throws IOException {return Long.parseLong(next());}
 
		public String nextLine() throws IOException {return br.readLine();}
 
		public double nextDouble() throws IOException { return Double.parseDouble(next()); }
 
		public boolean ready() throws IOException {return br.ready();} 
	}
} 