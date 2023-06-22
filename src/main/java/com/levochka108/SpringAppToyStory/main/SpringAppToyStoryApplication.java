package com.levochka108.SpringAppToyStory.main;

import com.levochka108.SpringAppToyStory.model.Toy;
import com.levochka108.SpringAppToyStory.service.ToyStory;
import com.levochka108.SpringAppToyStory.util.FileWriterUtil;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class SpringAppToyStoryApplication {

	public static void main(String[] args) throws IOException {

		ToyStory toyStory = new ToyStory();

		Toy toy1 = new Toy(1,"Конструктор",2);
		Toy toy2 = new Toy(2,"Робот",2);
		Toy toy3 = new Toy(2,"Кукла",6);

		toyStory.addToy(toy1);
		toyStory.addToy(toy2);
		toyStory.addToy(toy3);

		FileWriterUtil fileWriterUtil = new FileWriterUtil("output.txt");

		for (int i = 0; i<10; i++){
			Toy randomToy = toyStory.getRandomToy();
			String result;
			if (randomToy != null){
				result = "Случайная игрушка: " + randomToy.getId();
			}else {
				result = "Магазин игрушек пуст.";
			}
			fileWriterUtil.writerToFile(result);
		}

	}

}
