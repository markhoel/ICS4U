package test2;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import javax.swing.JFrame;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

public class MyScreen extends JFrame {

	public MyScreen() {
		this.setSize(400,300);
		this.setTitle("Angry Birds");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		MyScreen screen = new MyScreen();
		
		MyCanvas.soundEffect("stuff2/storm.wav");
		
		MyCanvas canvas = new MyCanvas(screen.getWidth(),screen.getHeight()); // use second constructor
		screen.getContentPane().add(canvas);
	}

}
