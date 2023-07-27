package projekat;

import java.util.Random;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import java.awt.*;
import java.net.URL;

public class Program  {
	
	static String myGender;
	static String isWorking;
	static String isStuding;
	static String myJob = null;
	static String myProfession = null;
	
	public static void main(String[]args) {
		
		/*
		 * UIManager is used to modify JOptionPane
		 */
		UIManager.put("OptionPane.messageFont", new Font("Arial", Font.BOLD, 16));
		boolean music = true;
		boolean music1 = true;
		
		// Titles for JOptionPane
		
		String titl = "Project X"; 
		String titl2 = "Question"; 
		String titl3 = "Error!";
	    String titl5 = "Question";
		String titl4 = "Error!";   
		
		String currentUsersHomeDir = System.getProperty("user.home"); // A way to get user's home directory from any PC.
		musicStuff musicObject =  new musicStuff(); // Calling the musicStuff class
		
		JOptionPane.showMessageDialog(null, "Quick Note: Clicking the cancel button or 'X' at the top right corner will effectively terminate this program!",titl,0);
		
		while(music1 == true) {
			String music123 = JOptionPane.showInputDialog(null,"Welcome! Before we begin, do you want music to accompany you? Y/N",titl5,3);
			
		Pattern musicWorking = Pattern.compile("Y|N|y|n"); // Regex pattern
		
		if(!musicWorking.matcher(music123).matches()) {
			JOptionPane.showMessageDialog(null, "Please type only Y/N",titl4,0);
			continue;
		}
		music1 = false;
		
		if(music123.equalsIgnoreCase("Y")) {
			while(music == true) {
				
		    String music231 = JOptionPane.showInputDialog(null,"What type do you wish to play? Please type with numbers from 1 to 4. (Relaxing, Dramatic, Atmospheric, Beethoven)",titl5,3);
		    Pattern WorkingMusic = Pattern.compile("1|2|3|4");
		    
		    if(!WorkingMusic.matcher(music231).matches()) { // Checking the pattern if it doesn't match
				JOptionPane.showMessageDialog(null,"Please select the correct numbers!",titl4,0);
				continue;	// Loop the question until the pattern matches
		    } 
		    String workingMusic = music231; // Assinging the JOptionPane object to another object
		    
		    if(workingMusic.equalsIgnoreCase("1")) {
		    	
		    	/*	String filepath = currentUsersHomeDir + File.separator + "Desktop\\Quizz program\\Music Files\\Beethoven.wav"; 
				 * 
				 * This would be the old method of finding the music files. We are using here currentUsersHomeDir + File.separator to find user.home
				 * on any PC. Useful for testing. In reality, we picked URL method with class.getResource as it's much easier implementation and no
				 * need to worry about language of the user's OS or file location.
				 */	
		    	URL filepath = Program.class.getResource("..\\MusicFiles\\Relaxing.wav");
		    	musicObject.setURL(filepath);
		    	musicObject.play();
		    	music = false;

			} else if(workingMusic.equalsIgnoreCase("2")) {
				
				URL filepath = Program.class.getResource("..\\MusicFiles\\Dramatic.wav");
		    	musicObject.setURL(filepath);
		    	musicObject.play();
		    	music = false;

			} else if(workingMusic.equalsIgnoreCase("3")) {
			
				URL filepath = Program.class.getResource("..\\MusicFiles\\Atmospheric.wav");
		    	musicObject.setURL(filepath);
		    	musicObject.play();
		    	music = false;

			} else if(workingMusic.equalsIgnoreCase("4")) {
				
				URL filepath = Program.class.getResource("..\\MusicFiles\\Beethoven.wav");
		    	musicObject.setURL(filepath);
		    	musicObject.play();
		    	music = false;

			}
			
		  }		
			
		}
	}
		// Here images are final and we used getImage() with getScaledInstance() methods for scaling the pictures.
		
		final ImageIcon icon = new ImageIcon(Program.class.getResource("..\\Images\\Welcome.jpg"));
		Image image0 = icon.getImage().getScaledInstance(500, 300, Image.SCALE_SMOOTH);
		final ImageIcon icon1 = new ImageIcon(Program.class.getResource("..\\Images\\Tree.jpg"));
		Image image1 = icon1.getImage().getScaledInstance(500, 300, Image.SCALE_SMOOTH);
		final ImageIcon icon2 = new ImageIcon(Program.class.getResource("..\\Images\\RiverAtDawn.jpg"));
		Image image2 = icon2.getImage().getScaledInstance(400, 400, Image.SCALE_SMOOTH);
		final ImageIcon icon3 = new ImageIcon(Program.class.getResource("..\\Images\\Dissatisfied.jpg"));
		Image image3 = icon3.getImage().getScaledInstance(400, 400, Image.SCALE_SMOOTH);
		final ImageIcon icon4 = new ImageIcon(Program.class.getResource("..\\Images\\Depression.jpg"));
		Image image4 = icon4.getImage().getScaledInstance(400, 400, Image.SCALE_SMOOTH);
		final ImageIcon icon6 = new ImageIcon(Program.class.getResource("..\\Images\\Anger.jpg"));
		Image image6 = icon6.getImage().getScaledInstance(400, 400, Image.SCALE_SMOOTH);
		final ImageIcon icon7 = new ImageIcon(Program.class.getResource("..\\Images\\Question.png"));
		Image image7 = icon7.getImage().getScaledInstance(300, 300, Image.SCALE_SMOOTH);
		final ImageIcon icon8 = new ImageIcon(Program.class.getResource("..\\Images\\Happy.jpg"));
		Image image8 = icon8.getImage().getScaledInstance(400, 400, Image.SCALE_SMOOTH);
		final ImageIcon icon9 = new ImageIcon(Program.class.getResource("..\\Images\\Tired.jpg"));
		Image image9 = icon9.getImage().getScaledInstance(400, 400, Image.SCALE_SMOOTH);
		final ImageIcon icon10 = new ImageIcon(Program.class.getResource("..\\Images\\Rose.jpg"));
		Image image10 = icon10.getImage().getScaledInstance(300, 300, Image.SCALE_SMOOTH);
		final ImageIcon icon11 = new ImageIcon(Program.class.getResource("..\\Images\\NotReady.jpg"));
		Image image11 = icon11.getImage().getScaledInstance(600, 400, Image.SCALE_SMOOTH);
		final ImageIcon icon12 = new ImageIcon(Program.class.getResource("..\\Images\\Random.jpg"));
		Image image12 = icon12.getImage().getScaledInstance(600, 400, Image.SCALE_SMOOTH);
		final ImageIcon icon13 = new ImageIcon(Program.class.getResource("..\\Images\\Metric.jpg"));
		Image image13 = icon13.getImage().getScaledInstance(500, 500, Image.SCALE_SMOOTH);
		final ImageIcon icon14 = new ImageIcon(Program.class.getResource("..\\Images\\Chernobyl.jpg"));
		Image image14 = icon14.getImage().getScaledInstance(500, 500, Image.SCALE_SMOOTH);
		final ImageIcon icon15 = new ImageIcon(Program.class.getResource("..\\Images\\Toyota.jpg"));
		Image image15 = icon15.getImage().getScaledInstance(500, 400, Image.SCALE_SMOOTH);
		final ImageIcon icon16 = new ImageIcon(Program.class.getResource("..\\Images\\Mediteran.jpg"));
		Image image16 = icon16.getImage().getScaledInstance(500, 500, Image.SCALE_SMOOTH);
		final ImageIcon icon17 = new ImageIcon(Program.class.getResource("..\\Images\\Paris.jpg"));
		Image image17 = icon17.getImage().getScaledInstance(500, 500, Image.SCALE_SMOOTH);
		final ImageIcon icon18 = new ImageIcon(Program.class.getResource("..\\Images\\London.jpg"));
		Image image18 = icon18.getImage().getScaledInstance(500, 500, Image.SCALE_SMOOTH);
		final ImageIcon icon19 = new ImageIcon(Program.class.getResource("..\\Images\\EU.jpg"));
		Image image19 = icon19.getImage().getScaledInstance(500, 500, Image.SCALE_SMOOTH);
		final ImageIcon icon20 = new ImageIcon(Program.class.getResource("..\\Images\\Question_1.jpg"));
		Image image20 = icon20.getImage().getScaledInstance(500, 500, Image.SCALE_SMOOTH);
		final ImageIcon icon21 = new ImageIcon(Program.class.getResource("..\\Images\\Log.png"));
		Image image21 = icon21.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
		final ImageIcon icon22 = new ImageIcon(Program.class.getResource("..\\Images\\Danube.jpg"));
		Image image22 = icon22.getImage().getScaledInstance(500, 500, Image.SCALE_SMOOTH);
		final ImageIcon icon23 = new ImageIcon(Program.class.getResource("..\\Images\\Cyprus.jpg"));
		Image image23 = icon23.getImage().getScaledInstance(500, 500, Image.SCALE_SMOOTH);
		final ImageIcon icon24 = new ImageIcon(Program.class.getResource("..\\Images\\Victory.jpg"));
		Image image24 = icon24.getImage().getScaledInstance(600, 600, Image.SCALE_SMOOTH);
		final ImageIcon icon25 = new ImageIcon(Program.class.getResource("..\\Images\\Defeat.png"));
		Image image25 = icon25.getImage().getScaledInstance(600, 600, Image.SCALE_SMOOTH);
		
		int[] oznake = {1,2,3,4,5,6}; // Used with Random() class
		
		Random random = new Random(); 
		
		int ukupnoTacnih = 0; // Amount of positive answers
		int numberOfAge = 0;
		int ukupnoNetacnih = 0; // Amount of wrong answers
		boolean myName = true;
		boolean ages = true;
		
		while(myName == true) {
			String name = JOptionPane.showInputDialog(null,"Welcome! Please enter your name:",titl, JOptionPane.PLAIN_MESSAGE,new ImageIcon(image0), null,"").toString();
			Pattern NAME = Pattern.compile("[a-zA-Z ]+");
		if(!NAME.matcher(name).matches()) {
			JOptionPane.showMessageDialog(null,"Please use only letters!",titl3,0);
			continue;
		} else {
			myName = false;
		}
		while(ages == true) {
				
			String  ageInput = JOptionPane.showInputDialog(null,"Welcome" + " " + name +"!" + " " + "What is your age?",titl2,3);
			Pattern AGE = Pattern.compile("[1-9][0-9]*");
		if(!AGE.matcher(ageInput).matches()) {
			JOptionPane.showMessageDialog(null,"Please enter only numbers!",titl3,0);
			continue;
		}
		int age = Integer.parseInt(ageInput);
		
		if(age <= 28) {
			ages = false;
			numberOfAge=age;
			JOptionPane.showMessageDialog(null,String.format("You're still pretty young!" + " " + "Your age:" + " " + age,titl,2));      
		} else if(age >= 29 && age <= 40) {
			ages = false;
			numberOfAge=age;
			JOptionPane.showMessageDialog(null,String.format("The best years of your life!" + " " + "Your age:"+ " "+ age,titl,2));
		} else if(age >= 41 && age <= 90) {
			ages = false;
			numberOfAge=age;
			JOptionPane.showMessageDialog(null,String.format("You aren't old, remember that!" + " " + "Your age:" + " "+ age,titl,2));
		 } else if(age >= 91) {
			 JOptionPane.showMessageDialog(null,String.format("You are serious? Type it again..." + " " + "Your age:" + " "+ age,titl,2));
			 continue;
		 }
		
		}
		
		boolean mfgender = true;
		
		while(mfgender == true) {
			String rsgender =	JOptionPane.showInputDialog(null,"What is your gender? Male/Female",titl2,3);
			Pattern WorkingGender = Pattern.compile("Male|Female", Pattern.CASE_INSENSITIVE);
		if(!WorkingGender.matcher(rsgender).matches()) {
			JOptionPane.showMessageDialog(null,"Please type only Male/Female!",titl3,0);
			continue;
		}
		
		String gender = rsgender;
		
		if(gender.equalsIgnoreCase("Male")) {
			mfgender = false;
		} else if(gender.equalsIgnoreCase("Female")) {
		    mfgender = false;    
		}
			
		boolean mask1 = true;
		
		while(mask1 == true) {
		
			String  workInput = JOptionPane.showInputDialog(null,"Are you a Student or a Worker?",titl2,JOptionPane.PLAIN_MESSAGE,new ImageIcon(image1), null,"").toString();
			Pattern WorkingStudying = Pattern.compile("Student|Worker", Pattern.CASE_INSENSITIVE);
			if(!WorkingStudying.matcher(workInput).matches()) {
				JOptionPane.showMessageDialog(null,"Please type only Student or Worker!",titl3,0);
				continue;
			}
			
			String workingStuding = workInput;
		
		if(workingStuding.equalsIgnoreCase("Student")) {
				
			isStuding = "Student";
			mask1 = false; 
			boolean whatmestudy = true;
			
			do {
			String whatStudy =	JOptionPane.showInputDialog(null,"What are you studying at the moment?",titl2,3);
			myProfession = whatStudy; 
			Pattern whatStudying = Pattern.compile("[a-zA-Z ]+");
			
			if(!whatStudying.matcher(whatStudy).matches()) {
				JOptionPane.showMessageDialog(null,"Please use only letters!");
				continue;
			} else {
				
				JOptionPane.showMessageDialog(null,String.format("You're Studying:" + " " + whatStudy + "," + " " + "That's really cool!"));
				whatmestudy = false;
			}
					
			}
			while(whatmestudy==true);
		}
			
		else if(workingStuding.equalsIgnoreCase("Worker")) {
			isWorking = "Worker";
			mask1 = false;
			boolean whatmeworking = true;
			
			do {
			String whatWorking = JOptionPane.showInputDialog(null,"What is your job?", titl2,3);
			myJob = whatWorking;
			Pattern whatisWorking = Pattern.compile("[a-zA-Z ]+");
			
			if(!whatisWorking.matcher(whatWorking).matches()) {
				JOptionPane.showMessageDialog(null,"Please use only letters!");
				continue;
			} else {
				JOptionPane.showMessageDialog(null, String.format("Your job is:" + " " + whatWorking +"," + " " +"Do you really enjoy it?"));
			    whatmeworking = false;		
			}
			
			}
			while(whatmeworking == true);
		}
			
		boolean countrys = true;
		while(countrys == true) {
			String country = JOptionPane.showInputDialog(null,"In which country you were born?",titl2,3);
			Pattern workingCountry = Pattern.compile("[a-zA-Z ]+");
		
		if(!workingCountry.matcher(country).matches()) {
			JOptionPane.showMessageDialog(null,"Please use only letters!");
			continue;
		} else {
			countrys = false;
		}

		boolean citys = true;
		while(citys == true) {
			String city = JOptionPane.showInputDialog(null,"In which city do you reside now?",titl2,3);
			Pattern workingCity = Pattern.compile("[a-zA-Z ]+");
		
		if(!workingCity.matcher(city).matches()) {
			JOptionPane.showMessageDialog(null,"Please use only letters!");
			continue;
		} else {
			citys = false;
		}
		
		boolean feelings = true;
		while(feelings == true) {
			String todayFeeling = JOptionPane.showInputDialog(null,"How are you feeling today? (Satisfied, Dissatisfied, Happy, Depression, Angry, Tired)",titl2,JOptionPane.PLAIN_MESSAGE,new ImageIcon(image7), null,"").toString();
			Pattern feelingToday = Pattern.compile("Satisfied|Dissatisfied|Happy|Depression|Angry|Tired",Pattern.CASE_INSENSITIVE);
		
		if(!feelingToday.matcher(todayFeeling).matches()) {
			JOptionPane.showMessageDialog(null,"Please type only from the selected categories! (Satisfied, Dissatisfied, Happy, Depression, Angry, Tired)",titl3,0);
			continue;	
		}
	
		String feeling = todayFeeling;
		if(feeling.equalsIgnoreCase("Satisfied")) {
			feelings = false;
			JOptionPane.showMessageDialog(null,"You are satisfied with how you spent your precious day." + " " + "You are leaning more towards success!\n" + "As a person, you are very respectful among the others.\n",titl,2,new ImageIcon(image2));
		
		} else if(feeling.equalsIgnoreCase("Dissatisfied")) {
			feelings = false;
			JOptionPane.showMessageDialog(null,"Dissatisfied with your current progress, you felt as if you could do things better." + " " + "Your soul is upset and you are constantly overthinking\n" + "Do not push yourself and start to look in the bright way!\n",titl,2,new ImageIcon(image3));
		
		} else if(feeling.equalsIgnoreCase("Happy")) {
			feelings = false;
			JOptionPane.showMessageDialog(null,"Happiness!\n" + "Today nothing can make your mood go down.\n" + "You know you did minor things right and that alone is enough for you to stay happy!\n",titl,2,new ImageIcon(image8));
		
		} else if(feeling.equalsIgnoreCase("Depression")) {
			feelings = false;
			JOptionPane.showMessageDialog(null,"All of a sudden, something comes into your head.\n" + "It feels like a black cloud wrapping around your head." + "Hopefully a sun will shine once again upon your soul.\n",titl,2,new ImageIcon(image4));
		
		} else if(feeling.equalsIgnoreCase("Angry")) {
			feelings = false;
			JOptionPane.showMessageDialog(null,"This is how we all felt at some point of our lives.!\n" + "Anger can come from various things.\n" + "You may have been betrayed by someone lately, your plans didn't go well or a person tackled with your emotions?\n",titl,2,new ImageIcon(image6));
		
		} else if(feeling.equalsIgnoreCase("Tired")) {
			feelings = false;
			JOptionPane.showMessageDialog(null,"Too much work and you feel tired already.\n" + "A good and nice sleep will be your best bet!\n" + "One must always remember to go to sleep at the correct time. The balance is very important!\n",titl,2,new ImageIcon(image9));
		}
			
		JOptionPane.showMessageDialog(null,"Thank you for answering these questions, the quiz will start soon!",titl,JOptionPane.PLAIN_MESSAGE,new ImageIcon(image10));
		int i = 0;
		while(i == 0) {
			String Tanswer = JOptionPane.showInputDialog(null,"Are you ready to begin? Y/N?",titl2,2);
		
			Pattern ANSWER = Pattern.compile("Y|N|y|n");
			
			if(!ANSWER.matcher(Tanswer).matches()) {
				JOptionPane.showMessageDialog(null,"Please type only Y/N!");
				continue;	
			}
			String answer = Tanswer;
		
		if(answer.equalsIgnoreCase("Y")) {
			i = 6;
			JOptionPane.showMessageDialog(null, "Good luck!",titl,1);
		} else if(answer.equalsIgnoreCase("N")) {
			
		    JOptionPane.showMessageDialog(null,"It seems you aren't ready to do this Quiz today?\n" + "That is okay, the program will terminate now. Have a nice day!\n",titl,1,new ImageIcon(image11));
			i = 20;
		    break;
		} 
		
        do {
        	JOptionPane.showMessageDialog(null,"The first question is randomly selected (there are 6 of them)!" + " " + "Good luck" +" " + name + "!",titl,JOptionPane.PLAIN_MESSAGE,new ImageIcon(image12));
        	// Picking a random number from zero to six using the random class.
        	int select = random.nextInt(oznake.length);
	    if(select == 0) {
	    	String R1 = JOptionPane.showInputDialog(null,"if (x*x)-(x/x) = 8\n" + "Then x is ?\n",titl2,1);
	    	Pattern r1 = Pattern.compile("[a-zA-Z]+"); //3
	    	Pattern rrr1 = Pattern.compile("[0-9&&[^3]]*");
	    	Pattern rrrr1 = Pattern.compile("[a-zA-Z]+[0-9]*");
	    	Pattern rrrrr1 = Pattern.compile("[0-9]*[a-zA-Z]+");
	    	Pattern rr1 = Pattern.compile("3");
	    	if(r1.matcher(R1).matches()) {
				JOptionPane.showMessageDialog(null,"False !",titl3,0);
				ukupnoNetacnih++;
				i = 8;
				break;
				
	    	} else if (rrr1.matcher(R1).matches()) {
	    		JOptionPane.showMessageDialog(null,"False !",titl3,0);
				ukupnoNetacnih++;
				i = 8;
				break;
				
	    	} else if (rrrr1.matcher(R1).matches()) {
	    		JOptionPane.showMessageDialog(null,"False !",titl3,0);
				ukupnoNetacnih++;
				i = 8;
				break;
				
	    	} else if (rrrrr1.matcher(R1).matches()) {
	    		JOptionPane.showMessageDialog(null,"False !",titl3,0);
				ukupnoNetacnih++;
				i = 8;
				break;
				
	    	} else if (rr1.matcher(R1).matches());
	    	
	    	int question1 = Integer.parseInt(R1);
	    	if(question1 == 3) {
	    		ukupnoTacnih++;
	    		JOptionPane.showMessageDialog(null,"Correct !",titl,1);
	    		i = 8;
	    	}
	    }
	    if(select == 1) {
	    	String R2=JOptionPane.showInputDialog(null,"The biggest country by territory in the world is?",titl2,1);
	    	Pattern r2 = Pattern.compile("[1-9][0-9]*");
	    	Pattern rr2 = Pattern.compile("Russia|RUSSIA|russia", Pattern.CASE_INSENSITIVE);
	    	Pattern rrr2 = Pattern.compile("^(?!Russia|RUSSIA|russia).*$");
	    	if(r2.matcher(R2).matches()) {
	    		JOptionPane.showMessageDialog(null,"False !",titl3,0);
	    		ukupnoNetacnih++;
	    		i = 8;
	    		break;
	    		
	    	} else if (rrr2.matcher(R2).matches()) {
	    		JOptionPane.showMessageDialog(null,"False !",titl3,0);
	    		ukupnoNetacnih++;
	    		i = 8;
	    		break;
	    		
	    	} else if (rr2.matcher(R2).matches());
	    	
	    	String question2 = R2;
	    	if(question2.equalsIgnoreCase("Russia")) {
	    		ukupnoTacnih++;
	    		JOptionPane.showMessageDialog(null,"Correct !",titl,1);
	    		i = 8;
	    	}
	    }
	    if(select == 2) {
	    	String R3=JOptionPane.showInputDialog(null,"What is the capital city of Greece?",titl2,1);
	    	Pattern r3 = Pattern.compile("[1-9][0-9]*");
	    	Pattern rr3 = Pattern.compile("Athens|ATHENS|athens", Pattern.CASE_INSENSITIVE);
	    	Pattern rrr3 = Pattern.compile("^(?!Athens|ATHENS|athens).*$");
	    	if(r3.matcher(R3).matches()) {
	    		JOptionPane.showMessageDialog(null,"False !",titl3,0);
	    		ukupnoNetacnih++;
	    		i = 8;
	    		break;
	    		
	    	}else if (rrr3.matcher(R3).matches()) {
	    		JOptionPane.showMessageDialog(null,"False !",titl3,0);
	    		ukupnoNetacnih++;
	    		i = 8;
	    		break;
	    		
	    	} else if (rr3.matcher(R3).matches());
	   
	    	String question3 = R3;
	    	if(question3.equalsIgnoreCase("Athens")) {
	    		ukupnoTacnih++;
	    		JOptionPane.showMessageDialog(null,"Correct !",titl,1);
	    		i = 8;
	    		break;
	    	}
	    }
	    if(select == 3) {
	    	String s1 = JOptionPane.showInputDialog(null,"How many teeth does a Human adult have?",titl2,1);
	    	Pattern S1 = Pattern.compile("[a-zA-Z]+");
	    	Pattern S2 = Pattern.compile("32");
	    	Pattern SS2 = Pattern.compile("[0-9&&[^32]]*");
	    	Pattern SSS2 = Pattern.compile("[a-zA-Z]+[0-9]*");
	    	Pattern SSSS2 = Pattern.compile("[0-9]*[a-zA-Z]+");
	    	if(S1.matcher(s1).matches()) {
	    		JOptionPane.showMessageDialog(null,"False !",titl3,0);
	    		ukupnoNetacnih++;
	    		i = 8;
	    		break;
	    		
	    	} else if (SS2.matcher(s1).matches()) {
	    		JOptionPane.showMessageDialog(null,"False !",titl3,0);
	    		ukupnoNetacnih++;
	    		i = 8;
	    		break;
	    		
	    	} else if (SSS2.matcher(s1).matches()) {
	    		JOptionPane.showMessageDialog(null,"False !",titl3,0);
	    		ukupnoNetacnih++;
	    		i = 8;
	    		break;
	    		
	    	} else if (SSSS2.matcher(s1).matches()) {
	    		JOptionPane.showMessageDialog(null,"False !",titl3,0);
	    		ukupnoNetacnih++;
	    		i = 8;
	    		break;
	    		
	    	} else if (S2.matcher(s1).matches());
	    		
	    	int question4 = Integer.parseInt(s1);
		    if(question4 == 32) {
			    ukupnoTacnih++;
			    JOptionPane.showMessageDialog(null,"Correct !",titl,1);
			    i = 8;
		    }
		    
	    }
        if(select == 4) {
        	String R4 = JOptionPane.showInputDialog(null,"Which country is more populated?\n" + "Serbia or Denmark?\n",titl2,1);
        	Pattern r4 = Pattern.compile("[1-9][0-9]*");
        	Pattern rr4 = Pattern.compile("SERBIA|Serbia|serbia", Pattern.CASE_INSENSITIVE);
        	Pattern rrr4 = Pattern.compile("^(?!SERBIA|Serbia|serbia).*$");
	    	if(r4.matcher(R4).matches()) {
	    		JOptionPane.showMessageDialog(null,"False !",titl3,0);
	    		ukupnoNetacnih++;
	    		i = 8;
	    		break;
	    		
        } else if (rrr4.matcher(R4).matches()) {
        	JOptionPane.showMessageDialog(null,"False !",titl3,0);
    		ukupnoNetacnih++;
    		i = 8;
    		break;
    		
        } else if (rr4.matcher(R4).matches());
	    	
	    String question5 = R4;
	    if(question5.equalsIgnoreCase("Serbia")) {
		    ukupnoTacnih++;
		    JOptionPane.showMessageDialog(null,"Correct !",titl,1);
		    i = 8;
	      }
	    
       }
	    if(select == 5) {
	    	String R5 = JOptionPane.showInputDialog(null,"25*2-8-100 = ?",titl2,1);
	    	Pattern r5 = Pattern.compile("[a-zA-Z]+");
	    	Pattern rrr5 = Pattern.compile("[0-9&&[^-58]]*");
	    	Pattern rrrr5 = Pattern.compile("[a-zA-Z]+[0-9]*");
	    	Pattern rrrrr5 = Pattern.compile("[0-9]*[a-zA-Z]+");
	    	Pattern rr5 = Pattern.compile("-58");
	    if(r5.matcher(R5).matches()) {
	    		JOptionPane.showMessageDialog(null,"False !",titl3,0);
	    		ukupnoNetacnih++;
	    		i = 8;
	    		break;
	    		
	    } else if (rrr5.matcher(R5).matches()) {
    		JOptionPane.showMessageDialog(null,"False !",titl3,0);
    		ukupnoNetacnih++;
    		i = 8;
    		break;
    		
	    } else if (rrrr5.matcher(R5).matches()) {
    		JOptionPane.showMessageDialog(null,"False !",titl3,0);
    		ukupnoNetacnih++;
    		i = 8;
    		break;
    		
	    } else if (rrrrr5.matcher(R5).matches()){
    		JOptionPane.showMessageDialog(null,"False !",titl3,0);
    		ukupnoNetacnih++;
    		i = 8;
    		break;
    		
	    } else if(rr5.matcher(R5).matches());
	    	
	    int question6 = Integer.parseInt(R5);
	    if(question6 == -58) {
	    	ukupnoTacnih++;
		    JOptionPane.showMessageDialog(null,"Correct !",titl,1);
		    i = 8;
	     }
	   
	    }
	    
       }
        while(i == 6);
        
        int y = 0;
        
        do {
        	String s2 = JOptionPane.showInputDialog(null,"If 1kHz = 0.001MHz , then 1MHz equals ____ kHz ?",titl2,1);
        	Pattern S2 = Pattern.compile("[a-zA-Z]+");
        	Pattern Y5 = Pattern.compile("[0-9&&[^1000]]*");
        	Pattern YY5 = Pattern.compile("[a-zA-Z]+[0-9]*");
        	Pattern YYY5 = Pattern.compile("[0-9]*[a-zA-Z]+");
        	Pattern SS2 = Pattern.compile("1000");
		
    	if(S2.matcher(s2).matches()) {
    		JOptionPane.showMessageDialog(null,"False !",titl3,0);
    		ukupnoNetacnih++;
    		y = 10;
    		break;
    		
    	} else if (Y5.matcher(s2).matches()) {
    		JOptionPane.showMessageDialog(null,"False !",titl3,0);
    		ukupnoNetacnih++;
    		y = 10;
    		break;
    		
    	} else if (YY5.matcher(s2).matches()) {
    		JOptionPane.showMessageDialog(null,"False !",titl3,0);
    		ukupnoNetacnih++;
    		y = 10;
    		break;
    		
    	} else if (YYY5.matcher(s2).matches()) {
    		JOptionPane.showMessageDialog(null,"False !",titl3,0);
    		ukupnoNetacnih++;
    		y = 10;
    		break;
    	}
    	
    	else if (SS2.matcher(s2).matches());
    	
    	int questionS2 = Integer.parseInt(s2);
		if(questionS2 == 1000) {
			ukupnoTacnih++;
			JOptionPane.showMessageDialog(null,"Correct !",titl,1);
			y = 10;
		 }
        }
        while(y == 20);
		
		boolean works=true;
		
		do {
			String number = (JOptionPane.showInputDialog(null,"Pick a number from 0-10",titl2,1));
			works = true; 
			Pattern r10 = Pattern.compile("[a-zA-Z]+");
	    	Pattern xx10 = Pattern.compile("[a-zA-Z]+[0-9]*");
	    	Pattern xxx10 = Pattern.compile("[0-9]*[a-zA-Z]+");
	    if(r10.matcher(number).matches()) {
	    		JOptionPane.showMessageDialog(null,"Please pick a number from range 0-10!",titl3,0);
	    		continue;
	    		
	    } else if (xx10.matcher(number).matches()) {
	    		JOptionPane.showMessageDialog(null,"Please pick a number from range 0-10!",titl3,0);
	    		continue;
	    		
	    } else if (xxx10.matcher(number).matches()) {
	    		JOptionPane.showMessageDialog(null,"Please pick a number from range 0-10!",titl3,0);
	    		continue;
	    		
	    }
	    int NUMBER1 = Integer.parseInt(number);
		switch(NUMBER1) {
			case 0: String s3 = JOptionPane.showInputDialog(null,"City on the picture is?",titl2,JOptionPane.PLAIN_MESSAGE,new ImageIcon(image18),null,"").toString();
			Pattern S3 = Pattern.compile("LONDON|London|london", Pattern.CASE_INSENSITIVE);
			Pattern SS3 = Pattern.compile("[1-9][0-9]*"); 
			Pattern SSS3 = Pattern.compile("^(?!LONDON|London|london).*$");
    	if(!S3.matcher(s3).matches()) {
    		JOptionPane.showMessageDialog(null,"False !",titl3,0);
    		ukupnoNetacnih++;
    		works = false;
			break;
			
    	} else if (SS3.matcher(s3).matches()) {
    		JOptionPane.showMessageDialog(null,"False !",titl3,0);
    		ukupnoNetacnih++;
    		works = false;
			break;
			
    	} else if (SSS3.matcher(s3).matches()) {
    		JOptionPane.showMessageDialog(null,"False !",titl3,0);
    		ukupnoNetacnih++;
    		works = false;
			break;
    	} 
    	if(s3.equalsIgnoreCase("London")) {
			ukupnoTacnih++;
			JOptionPane.showMessageDialog(null,"Correct !",titl,1);
			works = false;
			break;
		}
		case 1: String s4 = JOptionPane.showInputDialog(null,"What city is this?",titl2,JOptionPane.PLAIN_MESSAGE,new ImageIcon(image17),null,"").toString();
			Pattern S4 = Pattern.compile("PARIS|Paris|paris", Pattern.CASE_INSENSITIVE);
			Pattern SS4 = Pattern.compile("[1-9][0-9]*"); 
			Pattern SSS4 = Pattern.compile("^(?!PARIS|Paris|paris).*$");
    	if(!S4.matcher(s4).matches()) {
    		JOptionPane.showMessageDialog(null,"False !",titl3,0);
    		ukupnoNetacnih++;
    		works = false;
			break;
    	} else if (SS4.matcher(s4).matches()) {
    		JOptionPane.showMessageDialog(null,"False !",titl3,0);
    		ukupnoNetacnih++;
    		works = false;
			break;
    	} else if (SSS4.matcher(s4).matches()) {
    		JOptionPane.showMessageDialog(null,"False !",titl3,0);
    		ukupnoNetacnih++;
    		works = false;
			break;
    	} 
    	if(s4.equalsIgnoreCase("Paris")) {
			ukupnoTacnih++;
			JOptionPane.showMessageDialog(null,"Correct !",titl,1);
			works = false;
			break;
			 
		}
		case 2: String s5 = JOptionPane.showInputDialog(null,"Nuclear disaster that happened in 1986. year , was located near which city?",titl2,JOptionPane.PLAIN_MESSAGE,new ImageIcon(image14),null,"").toString();
			Pattern S5 = Pattern.compile("Chernobyl|CHERNOBYL|chernobyl", Pattern.CASE_INSENSITIVE);
			Pattern SS5 = Pattern.compile("[1-9][0-9]*"); 
			Pattern SSS5 = Pattern.compile("^(?!Chernobyl|CHERNOBYL|chernobyl).*$");
    	if(!S5.matcher(s5).matches()) {
    		JOptionPane.showMessageDialog(null,"False !",titl3,0);
    		ukupnoNetacnih++;
    		works = false;
			break;
    	} else if (SS5.matcher(s5).matches()) {
    		JOptionPane.showMessageDialog(null,"False !",titl3,0);
    		ukupnoNetacnih++;
    		works = false;
			break;
    	} else if (SSS5.matcher(s5).matches()) {
    		JOptionPane.showMessageDialog(null,"False !",titl3,0);
    		ukupnoNetacnih++;
    		works = false;
			break;
    	} 
    	if(s5.equalsIgnoreCase("Chernobyl")) {
			ukupnoTacnih++;
			JOptionPane.showMessageDialog(null,"Correct !",titl,1);
			works = false;
			break;	 
		}
		case 3: String s6 = JOptionPane.showInputDialog(null,"The primary unit of length in the metric system is?",titl2,JOptionPane.PLAIN_MESSAGE,new ImageIcon(image13),null,"").toString();
			Pattern S6 = Pattern.compile("METER|Meter|meter",Pattern.CASE_INSENSITIVE);
			Pattern SS6 = Pattern.compile("[1-9][0-9]*"); 
			Pattern SSS6 = Pattern.compile("^(?!METER|Meter|meter).*$");
    	if(!S6.matcher(s6).matches()) {
    		JOptionPane.showMessageDialog(null,"False !",titl3,0);
    		ukupnoNetacnih++;
    		works = false;
			break;
			
    	} else if (SS6.matcher(s6).matches()) {
    		JOptionPane.showMessageDialog(null,"False !",titl3,0);
    		ukupnoNetacnih++;
    		works = false;
			break;
			
    	} else if (SSS6.matcher(s6).matches()) {
    		JOptionPane.showMessageDialog(null,"False !",titl3,0);
    		ukupnoNetacnih++;
    		works = false;
			break;
    	} 
    	
    	if(s6.equalsIgnoreCase("Meter")) {
		   ukupnoTacnih++;
		   JOptionPane.showMessageDialog(null,"Correct !",titl,1);
		   works = false;
		   break;
		   
		}
		case 4: String s7 = JOptionPane.showInputDialog(null,"The sea on the picture is?",titl2,JOptionPane.PLAIN_MESSAGE,new ImageIcon(image16),null,"").toString();
			Pattern S7 = Pattern.compile("mediterranean|Mediterranean|MEDITERRANEAN",Pattern.CASE_INSENSITIVE);
			Pattern SS7 = Pattern.compile("[1-9][0-9]*"); 
			Pattern SSS7 = Pattern.compile("^(?!mediterranean|Mediterranean|MEDITERRANEAN).*$");
    	if(!S7.matcher(s7).matches()) {
    		JOptionPane.showMessageDialog(null,"False !",titl3,0);
    		ukupnoNetacnih++;
    		works = false;
			break;
			
    	} else if (SS7.matcher(s7).matches()) {
    		JOptionPane.showMessageDialog(null,"False !",titl3,0);
    		ukupnoNetacnih++;
    		works = false;
			break;
			
    	} else if (SSS7.matcher(s7).matches()) {
    		JOptionPane.showMessageDialog(null,"False !",titl3,0);
    		ukupnoNetacnih++;
    		works = false;
			break;
			
    	} 
    	if(s7.equalsIgnoreCase("Mediterranean")) {
			ukupnoTacnih++;
			JOptionPane.showMessageDialog(null,"Correct !",titl,1);
			works = false;
			break;
			
		}
		case 5: String s8 = JOptionPane.showInputDialog(null,"The main currency of European Union is?",titl2,JOptionPane.PLAIN_MESSAGE,new ImageIcon(image19),null,"").toString();
			Pattern S8 = Pattern.compile("EURO|Euro|euro",Pattern.CASE_INSENSITIVE);
			Pattern SS8 = Pattern.compile("[1-9][0-9]*"); 
			Pattern SSS8 = Pattern.compile("^(?!EURO|Euro|euro).*$");
    	if(!S8.matcher(s8).matches()) {
    		JOptionPane.showMessageDialog(null,"False !",titl3,0);
    		ukupnoNetacnih++;
    		works = false;
			break;
			
    	} else if (SS8.matcher(s8).matches()) {
    		JOptionPane.showMessageDialog(null,"False !",titl3,0);
    		ukupnoNetacnih++;
    		works = false;
			break;
			
    	} else if (SSS8.matcher(s8).matches()) {
    		JOptionPane.showMessageDialog(null,"False !",titl3,0);
    		ukupnoNetacnih++;
    		works = false;
			break;
			
    	}
		if(s8.equalsIgnoreCase("Euro")) {
	    	ukupnoTacnih++;
			JOptionPane.showMessageDialog(null,"Correct !",titl,1);
			works = false;
			break;
			
	    }
		case 6: String s9 = JOptionPane.showInputDialog(null,"Car on the picture is manufactured by?",titl2,JOptionPane.PLAIN_MESSAGE,new ImageIcon(image15),null,"").toString();
			Pattern S9 = Pattern.compile("Toyota|toyota|TOYOTA",Pattern.CASE_INSENSITIVE);
			Pattern SS9 = Pattern.compile("[1-9][0-9]*"); 
			Pattern SSS9 = Pattern.compile("^(?!Toyota|toyota|TOYOTA).*$");
    	if(!S9.matcher(s9).matches()) {
    		JOptionPane.showMessageDialog(null,"False !",titl3,0);
    		ukupnoNetacnih++;
    		works = false;
			break;
			
    	} else if (SS9.matcher(s9).matches()) {
    		JOptionPane.showMessageDialog(null,"False !",titl3,0);
    		ukupnoNetacnih++;
    		works = false;
			break;
			
    	} else if (SSS9.matcher(s9).matches()) {
    		JOptionPane.showMessageDialog(null,"False !",titl3,0);
    		ukupnoNetacnih++;
    		works = false;
			break;
			
    	}
		if(s9.equalsIgnoreCase("Toyota")) {
			ukupnoTacnih++;
			JOptionPane.showMessageDialog(null,"Correct !",titl,1);
			works = false;
			break;	
			
		}
		case 7: String s10 = JOptionPane.showInputDialog(null,"10% is equal to: 0.1, 0.01 , 0.001, 0,5. ?",titl2,JOptionPane.PLAIN_MESSAGE,new ImageIcon(image20),null,"").toString();
			Pattern S10 = Pattern.compile("0.1");
			Pattern SS10 = Pattern.compile("[a-zA-Z]+");
			Pattern SSS10 = Pattern.compile("[0-9&&[^0.1]]*");
			Pattern SSSS10 = Pattern.compile("[a-zA-Z]+[0-9]*");
			Pattern SSSSS10 = Pattern.compile("[0-9]*[a-zA-Z]+");	
    	if(!S10.matcher(s10).matches()) {
    		JOptionPane.showMessageDialog(null,"False !",titl3,0);
    		ukupnoNetacnih++;
    		works = false;
			break;
			
    	} else if (SS10.matcher(s10).matches()) {
    		JOptionPane.showMessageDialog(null,"False !",titl3,0);
    		ukupnoNetacnih++;
    		works = false;
			break;
			
    	} else if (SSS10.matcher(s10).matches()) {
    		JOptionPane.showMessageDialog(null,"False !",titl3,0);
    		ukupnoNetacnih++;
    		works = false;
			break;
			
    	} else if (SSSS10.matcher(s10).matches()) {
    		JOptionPane.showMessageDialog(null,"False !",titl3,0);
    		ukupnoNetacnih++;
    		works = false;
			break;
			
    	} else if (SSSSS10.matcher(s10).matches()) {
    		JOptionPane.showMessageDialog(null,"False !",titl3,0);
    		ukupnoNetacnih++;
    		works = false;
			break;
			
    	}
    	double ss10 = Double.parseDouble(s10);
		if(ss10 == 0.1) {
			ukupnoTacnih++;
			JOptionPane.showMessageDialog(null,"Correct !",titl,1);
			works = false;
			break;	
			
		}
		case 8: String s11 = JOptionPane.showInputDialog(null,"(See the picture)\n" + "Logarithm of 0 is: undefined, 0, 10, b?\n",titl2,JOptionPane.PLAIN_MESSAGE,new ImageIcon(image21),null,"").toString();
			Pattern S11 = Pattern.compile("undefined|UNDEFINED|Undefined", Pattern.CASE_INSENSITIVE);
			Pattern SS11 = Pattern.compile("[1-9][0-9]*"); 
			Pattern SSS11 = Pattern.compile("^(?!undefined|UNDEFINED|Undefined).*$");
    	if(!S11.matcher(s11).matches()) {
    		JOptionPane.showMessageDialog(null,"False !",titl3,0);
    		ukupnoNetacnih++;
    		works = false;
			break;
			
    	} else if (SS11.matcher(s11).matches()) {
    		JOptionPane.showMessageDialog(null,"False !",titl3,0);
    		ukupnoNetacnih++;
    		works = false;
			break;
			
    	} else if (SSS11.matcher(s11).matches()) {
    		JOptionPane.showMessageDialog(null,"False !",titl3,0);
    		ukupnoNetacnih++;
    		works = false;
			break;
			
    	} 
    	if(s11.equalsIgnoreCase("Undefined")) {
			ukupnoTacnih++;
			JOptionPane.showMessageDialog(null,"Correct !",titl,1);
			works = false;
			break; 
			
		}
		case 9: String s12 = JOptionPane.showInputDialog(null,"The second longest river in Europe is?",titl2,JOptionPane.PLAIN_MESSAGE,new ImageIcon(image22),null,"").toString();
			Pattern S12 = Pattern.compile("Danube|DANUBE|danube", Pattern.CASE_INSENSITIVE);
			Pattern SS12 = Pattern.compile("[1-9][0-9]*"); 
			Pattern SSS12 = Pattern.compile("^(?!Danube|DANUBE|danube).*$");
    	if(!S12.matcher(s12).matches()) {
    		JOptionPane.showMessageDialog(null,"False !",titl3,0);
    		ukupnoNetacnih++;
    		works = false;
			break;
			
    	} else if (SS12.matcher(s12).matches()) {
    		JOptionPane.showMessageDialog(null,"False !",titl3,0);
    		ukupnoNetacnih++;
    		works = false;
			break;
			
    	} else if (SSS12.matcher(s12).matches()) {
    		JOptionPane.showMessageDialog(null,"False !",titl3,0);
    		ukupnoNetacnih++;
    		works = false;
			break;
			
    	}
		if(s12.equalsIgnoreCase("Danube")) {
			ukupnoTacnih++;
			JOptionPane.showMessageDialog(null,"Correct !",titl,1);
			works = false;
			break;	
			
		}
		case 10: String s13 = JOptionPane.showInputDialog(null,"Does Cyprus belong to Europe or Asia?",titl2,JOptionPane.PLAIN_MESSAGE,new ImageIcon(image23),null,"").toString();
			Pattern S13 = Pattern.compile("Europe|EUROPE|europe", Pattern.CASE_INSENSITIVE);
			Pattern SS13 = Pattern.compile("[1-9][0-9]*"); 
			Pattern SSS13 = Pattern.compile("^(?!Europe|EUROPE|europe).*$");
    	if(!S13.matcher(s13).matches()) {
    		JOptionPane.showMessageDialog(null,"False !",titl3,0);
    		ukupnoNetacnih++;
    		works = false;
			break;
			
    	} else if (SS13.matcher(s13).matches()) {
    		JOptionPane.showMessageDialog(null,"False !",titl3,0);
    		ukupnoNetacnih++;
    		works = false;
			break;
			
    	} else if (SSS13.matcher(s13).matches()) {
    		JOptionPane.showMessageDialog(null,"False !",titl3,0);
    		ukupnoNetacnih++;
    		works = false;
			break;
			
    	}
		if(s13.equalsIgnoreCase("Europe")) {
			ukupnoTacnih++;
			JOptionPane.showMessageDialog(null,"Correct !",titl,1);
			works = false;
			break;	
			
		}
		default: 
			JOptionPane.showMessageDialog(null,"You didn't pick any of the correct numbers! Please type again!",titl,JOptionPane.ERROR_MESSAGE);
		continue;
		 }
		}
		
		while(works == true);
		i = 10;
		mfgender = false;
		mask1 = false;
		countrys = false;
		citys = false;
		myName = false;
	
		/*
		 * The end status that will be displayed on the users screen. Based on the answers.
		 */
		if(ukupnoTacnih >= 3 && workingStuding.equalsIgnoreCase("Student")) {
			JOptionPane.showMessageDialog(null,"Congratulations! You made it to the end and answered all questions correctly!\n" + "You are a champion!\n"+ "Name:"+" "+capitalize(name)+"\nAge:"+" "+numberOfAge+"\nGender:"+" "+capitalize(rsgender)+"\nType:"+" "+capitalize(workInput)+"\nStudying:"+" "+capitalize(myProfession)+"\nCountry:"+" "+capitalize(country)+"\nCity:"+" "+capitalize(city)+"\nEmotion:"+" "+capitalize(todayFeeling)+"\nCorrect Answers:"+" "+ukupnoTacnih+"\nFalse Answers:"+" "+ukupnoNetacnih+"\n "  ,titl,JOptionPane.PLAIN_MESSAGE,new ImageIcon(image24));
		
		} else if(ukupnoTacnih >= 3 && workingStuding.equalsIgnoreCase("Worker")) {
			JOptionPane.showMessageDialog(null,"Congratulations! You made it to the end and answered all questions correctly!\n" + "You are a champion!\n" + "Name:"+" "+capitalize(name)+"\nAge:"+" "+numberOfAge+"\nGender:"+" "+capitalize(rsgender)+"\nType:"+" "+capitalize(workInput)+"\nJob:"+" "+capitalize(myJob)+"\nCountry:"+" "+capitalize(country)+"\nCity:"+" "+capitalize(city)+"\nEmotion:"+" "+capitalize(todayFeeling)+"\nCorrect Answers:"+" "+ukupnoTacnih+"\nFalse Answers:"+" "+ukupnoNetacnih+"\n "  ,titl,JOptionPane.PLAIN_MESSAGE,new ImageIcon(image24));
			
		} else if(ukupnoTacnih < 3 && workingStuding.equalsIgnoreCase("Student")) {
			JOptionPane.showMessageDialog(null,"You came to an end\nand unfortunately you haven't been able to answer correctly on all questions.\n" + "Nevertheless, you can always try again.\n" + "Name:"+" "+capitalize(name)+"\nAge:"+" "+numberOfAge+"\nGender:"+" "+capitalize(rsgender)+"\nType:"+" "+capitalize(workInput)+"\nStudying:"+" "+capitalize(myProfession)+"\nCountry:"+" "+capitalize(country)+"\nCity:"+" "+capitalize(city)+"\nEmotion:"+" "+capitalize(todayFeeling)+"\nCorrect Answers:"+" "+ukupnoTacnih+"\nFalse Answers:"+" "+ukupnoNetacnih+"\n "  ,titl,JOptionPane.PLAIN_MESSAGE,new ImageIcon(image25));
					
		} else if(ukupnoTacnih < 3 && workingStuding.equalsIgnoreCase("Worker")) {
			JOptionPane.showMessageDialog(null,"You came to an end\nand unfortunately you haven't been able to answer correctly on all questions.\n" + "Nevertheless, you can always try again.\n" + "Name:"+" "+capitalize(name)+"\nAge:"+" "+numberOfAge+"\nGender:"+" "+capitalize(rsgender)+"\nType:"+" "+capitalize(workInput)+"\nJob:"+" "+capitalize(myJob)+"\nCountry:"+" "+capitalize(country)+"\nCity:"+" "+capitalize(city)+"\nEmotion:"+" "+capitalize(todayFeeling)+"\nCorrect Answers:"+" "+ukupnoTacnih+"\nFalse Answers:"+" "+ukupnoNetacnih+"\n "  ,titl,JOptionPane.PLAIN_MESSAGE,new ImageIcon(image25));
		}
			  }	
		    }
		  }
	    }	
	  }
    }		
  }
}
	
	// Method to capitalize the starting letter of each word

	public static String capitalize(String str) {
	    if(str == null) return str;
	    /*
	     * Explanation: method substring(0, 1) is stating that it should start from the beginning and end after 1st one.
	     * Then we extend with toUpperCase() and we add str.substring(1) which again tells the method to start after 1st character.
	     * Example: "stefan" will be converted with: substring(0 = _s (beginning before the first char), 1 = s).toUpperCase() + str.substring(1 = tefan) = "Stefan".
	     */
	    return str.substring(0, 1).toUpperCase() + str.substring(1); 
	}
}


		
	

	

