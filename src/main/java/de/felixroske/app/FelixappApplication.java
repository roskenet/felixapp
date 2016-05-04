package de.felixroske.app;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.felixroske.jfxsupport.AbstractJavaFxApplicationSupport;

@SpringBootApplication
public class FelixappApplication extends AbstractJavaFxApplicationSupport {

	public static void main(String[] args) {
		launchApp(FelixappApplication.class, MainView.class, args);
	}
}
