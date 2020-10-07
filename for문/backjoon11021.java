package for문;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class backjoon11021 {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int num = Integer.parseInt(br.readLine());
		for (int i = 0; i < num; i++) {
			String a[] = br.readLine().split(" ");
			bw.write("Case #" + (i + 1) + ": " + (Integer.parseInt(a[0]) + Integer.parseInt(a[1])) + "\n");
		}
		bw.flush();
		bw.close();
	}
}
