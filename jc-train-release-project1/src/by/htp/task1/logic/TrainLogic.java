package by.htp.task1.logic;

import by.htp.task1.entity.Train;


public class TrainLogic {

	public void TrainNumberSort(Train[] mass) {

		for (int i = 0; i < mass.length; i++) {
			for (int j = i + 1; j < mass.length; j++) {
				int key;
				if (mass[j].getTrainnumber() < mass[i].getTrainnumber()) {
					key = mass[i].trainnumber;
					mass[i].trainnumber = mass[j].trainnumber;
					mass[j].trainnumber = key;
				}
			}

		}
	}

	public void CheckTrain(Train[] mass, int numberoftrain) {
		for (int i = 0; i < mass.length; i++) {
			if (numberoftrain == mass[i].trainnumber) {
				System.out.println(mass[i]);
			}

		}

	}

	public void CityOfTrain(Train[] mass) {

		for (int i = 1; i < mass.length; i++) {
			for (int j = i + 1; j < mass.length; j++) {

				int pointer1 = mass[i].city.length();
				int pointer2 = mass[j].city.length();

				if (pointer1 > pointer2) {
					Train key;

					key = mass[i];
					mass[i] = mass[j];
					mass[j] = key;

				}

			}

		}
	}
}
