package _03_Switch_Statement_Practice;

import java.net.URI;

import javax.swing.JOptionPane;

public class CustomButtonOptionPanes {
public static void main(String[] args) {
	CustomButtonOptionPanes memes = new CustomButtonOptionPanes();
}
	public CustomButtonOptionPanes() {
		String[] options = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

		int input = JOptionPane.showOptionDialog(null, "Choose a day of the week", "Custom Buttons", 0, -1, null,
				options, 0);

		String choice = options[input];
		playStuff(choice);
		//use a switch statement to do something cool for each option
		
		
	}
	 void playStuff(String choice) {
		switch(choice) {
		case "Sunday": 
			showSunday();
			break;
		case "Monday": 
			showMonday();
			break;
		case "Tuesday": 
			showTuesday();
			break;
		case"Wednesday":
			 showWednesday();
			 break;
		case"Thursday":
			showThursday() ;
			break;
		case"Friday":
			showFriday();
			break;
		case"Saturday":
			showSaturday();
			break;
		default: 
			System.out.println("Something went wrong :(");
		
		}
	}
	 void showSunday() {
	     playVideo("https://www.youtube.com/watch?v=KQetemT1sWc");
	}

	void showMonday() {
	     playVideo("https://www.youtube.com/watch?v=SsmVgoXDq2w");
	}

	void showTuesday() {
	     playVideo("https://www.youtube.com/watch?v=CY8a4uh_PdI");
	}
	void showWednesday() {
	     playVideo("https://www.youtube.com/watch?v=PE8GlPpuLuY");
	}
	void showThursday() {
	     playVideo("https://www.youtube.com/watch?v=3IxkRXHfslQ");
	}
	void showFriday() {
	     playVideo("https://www.youtube.com/watch?v=qFoEBIfVj9M");
	}
	void showSaturday() {
	     playVideo("https://www.youtube.com/watch?v=KLrZmDIh8_0");
	}

	void playVideo(String videoID) {
	     
	     // Workaround for Linux because "Desktop.getDesktop().browse()" doesn't
	     //work on some Linux implementations
	     try {
	     if (System.getProperty("os.name").toLowerCase().contains("linux")) {
	     if (Runtime.getRuntime().exec(new String[] {
	      "which", "xdg- open" }).getInputStream().read() != -1) {
	     Runtime.getRuntime().exec(new String[] { "xdg-open", videoID });
	     }
	     } else {
	          URI uri = new URI(videoID);
	          java.awt.Desktop.getDesktop().browse(uri);
	     }      } catch (Exception e) {
	          e.printStackTrace();
	     }
	}

}
