package run;

import java.util.Arrays;

public class ArrayObject_exercise5 {

	public static void main(String[] args) {

		int[][] Matrix = new int[20][10];

		for (int i = 0; i < Matrix.length; i++) {
			for (int j = 0; j < Matrix[i].length; j++) {

				int num = (int) (Math.random() * 100);

				Matrix[i][j] = num;

			}

//			System.out.println(Arrays.toString(Matrix[i]));
		}
		String[] studentName = { "Itamar", "Vered", "Doron", "Roy", "Idan", "Yakir", "Ohad", "Niv", "Omri", "Kobi",
				"Maor", "Ofir", "Tomer", "Hen", "Ronit", "Noam", "Oded", "Hadar", "Ela" };
		int classSumAvg = 0;
		for (int i = 0; i < studentName.length; i++) {
			System.out.println(studentName[i]);
			System.out.println(Arrays.toString(Matrix[i]));

			int sum = 0;
			for (int grade : Matrix[i]) {
				sum += grade;

			}
			int avg = sum / Matrix[i].length;
			System.out.println(avg);
			classSumAvg += avg;

		}

		int classAvg = classSumAvg / studentName.length;
		System.out.printf("Class AVG: %d", classAvg);

	}

}

//
//		System.out.println(Arrays.toString(studentName));