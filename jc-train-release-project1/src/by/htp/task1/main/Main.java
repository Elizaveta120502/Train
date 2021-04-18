package by.htp.task1.main;

import by.htp.task1.entity.Train;
import by.htp.task1.logic.TrainLogic;
import by.htp.task1.presentation.TrainPresentation;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int numberoftrain = 0;
		Scanner sc = new Scanner(System.in);

		Train train1 = new Train("Minsk", 1024, 25);
		Train train2 = new Train("London", 865, 12);
		Train train3 = new Train("Berlin", 785, 25);
		Train train4 = new Train("Baranovichi", 145, 10);
		Train train5 = new Train("Paris", 1202, 16);

		Train[] mass = new Train[] { train1, train2, train3, train4, train5 };

		TrainLogic logic = new TrainLogic();
		TrainPresentation view = new TrainPresentation();
		logic.TrainNumberSort(mass);
		view.PresentationSort(mass);

		System.out.println("Enter train number: ");
		numberoftrain = sc.nextInt();
		logic.CheckTrain(mass, numberoftrain);
		
		System.out.println();
		logic.CityOfTrain(mass);
		view.PresentationSort(mass);

	}

}
