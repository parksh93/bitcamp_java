package silver;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class KeyLoger {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuffer sb = new StringBuffer();
		Deque<Character> keys = new LinkedList<>();

		int cnt = Integer.parseInt(br.readLine());

		for (int i = 0; i < cnt; i++) {
			int cntOpen = 0;
			int cntClose = 0;
			String key = br.readLine();

			for (int j = key.length()-1; j >0 ; j--) {
				keys.add(key.charAt(j));
			}
			
			Iterator<Character> itor = keys.iterator();
			while(itor.hasNext()) {
				if (itor.next() == '-') {
					keys.poll();
					keys.poll();
				}else if (itor.next() == '<') {
					if (keys.peek() != '<') {
						
					}
					keys.poll();
					
				}
			}

		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}
}
