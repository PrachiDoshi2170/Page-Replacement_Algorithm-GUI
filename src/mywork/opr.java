package mywork;
import java.io.*;
import java.util.*;

public class opr {

	public static void main(String[] args)throws IOException {

		
			
				int ptr = 0, hit = 0, fault = 0;
				boolean isFull = false;
				int buff[];
				int rfr[];
				int layout[][];
				Scanner s = new Scanner(System.in);
				System.out.println("Please enter the number of frames: ");
				int frames = s.nextInt();
				System.out.println("Please enter the length of the reference string: ");
				int str_len = s.nextInt();
				rfr = new int[str_len];
				layout = new int[str_len][frames];
				buff = new int[frames];
				for (int j = 0; j < frames; j++) {
					buff[j] = -1;
				}
				System.out.println("Please enter the reference string: ");
				for (int i = 0; i < str_len; i++) {
					rfr[i] = s.nextInt();
				}
				System.out.println();
				for (int i = 0; i < str_len; i++) {
					int temp = -1;
					for (int j = 0; j < frames; j++) {
						if (buff[j] == rfr[i]) {
							temp = j;
							hit++;
							break;
						}
					}
					if (temp == -1) {
						if (isFull) {
							int ind[] = new int[frames];
							boolean ind_temp[] = new boolean[frames];
							for (int j = i + 1; j < str_len; j++) {
								for (int k = 0; k < frames; k++) {
									if ((rfr[j] == buff[k]) && (ind_temp[k] == false)) {
										ind[k] = j;
										ind_temp[k] = true;
										break;
									}
								}
							}
							int mx = ind[0];
							ptr = 0;
							if (mx == 0) {
								mx = 200;
							}
							for (int j = 0; j < frames; j++) {
								if (ind[j] == 0) {
									ind[j] = 200;
								}
								if (ind[j] > mx) {
									mx = ind[j];
									ptr = j;
								}
							}
						}
						buff[ptr] = rfr[i];
						fault++;
						if (!isFull) {
							ptr++;
							if (ptr == frames) {
								ptr = 0;
								isFull = true;
							}
						}
					}
					for (int j = 0; j < frames; j++) {
						layout[i][j] = buff[j];
					}
				}
				for (int i = 0; i < frames; i++) {
					for (int j = 0; j < str_len; j++) {
						System.out.printf("%3d ", layout[j][i]);
					}
					System.out.println();
				}
				System.out.println("\nThe total number of hits are " + hit);
				System.out.println("The hit ratio is " + (float) ((float) hit / str_len));
				System.out.println("The total number of faults are " + fault);
			}

		

	}


