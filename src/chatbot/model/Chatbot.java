package chatbot.model;

import java.util.ArrayList;

public class Chatbot
{
	/**
	 * A tool used by the chatbot to respond to the user by receiving information such as
	 * name and age and incorporating it into the response (with the help of some later code)
	 */
	private Chatbot myUser;
	/**
	 * The string contains the program name.
	 */
	private String name;
	/**
	 * The current number of chats the Chatbot has participated in.
	 */
	private int numberOfChats;
	/**
	 * A list of String values pertaining the memeList
	 */
	private ArrayList<String> memeList;
	
	/**
	 * A list of String values pertaining the userInputList
	 */
	private ArrayList<String> userInputList;
	/**
	 * The programmer specified content area. Used in the contentChecker(String
	 * input) method.
	 */
	private String contentArea;

	/**
	 * Create a Chatbot object with a specified name. Initializes the total chats
	 * to 0. The word locomotive has been placed in the contentArea. 
	 * Creates and fills the userInputList.
	 * Creates and fills the memeList.
	 * @param name
	 */
	public Chatbot(String name)
	{
		this.name = name;
		numberOfChats = 0;
		contentArea = "locomotive";
		userInputList = new ArrayList<String>();
		memeList = new ArrayList<String>();
		// this. mean talk to the current class
	}

	/**
	 * Get the number of Chats.
	 * @return numberOfChats
	 */
	public int getNumberOfChats()
	{
		return numberOfChats;
	}
	/**
	 * Get the name of the Chatbot.
	 * @return name
	 */
	public void setName(String name)
	{
		this.name = name;
	}
	/**
	 * Adds to the total number of chats as they occur in the program.
	 */
	public void incrementChats()
	{
		numberOfChats++;
	}

	/**
	 * Fills the contents of the memeList with internet memes.
	 */
	private void fillTheMemeList()
	{
		memeList.add("y u mad bro");
		memeList.add("doh!");
		memeList.add("Whatever doesn't kill you... Will hopefully try again");
		memeList.add("one does not simply");
	}

	/**
	 * Processed the supplied text from the user to provide a message from the
	 * Chatbot.
	 * 
	 * @param userText
	 *            The user supplied text.
	 * @param randomTopic 
	 * @return What the Chatbot says because of the supplied input.
	 */
	
	public String processText(String userText, String randomTopic)
	{
		String processedText = "";
		incrementChats();
		
		int randomChoice = (int) (Math.random() * 7);
		if(userText !=null)
		
		if (numberOfChats >10)
		{
			//youWillneed to use some if's or a switch
			//Save userText to the chatUser's appropriate field
			if(numberOfChats == 0)
			{
				myUser.setName(userText);
				processedText = "Hello " + myUser.getName() + " what is your age?";
			}
			else if(numberOfChats == 1)
			{
				int age = Integer.parseInt(userText);
				myUser.setAge(age);
				processedText = myUser.getName() + ", you are really " + myUser.getAge() +" years old?";
				processedText += "\nWhat is your favorite movie?";
			}
			if (stringLengthChecker(userText))
			{
				processedText = "Long message";
			}
			else
			{
				processedText = "Short message";
			}
		}
		else if (randomChoice == 1)
		{
			//use contentChecker here
			if (contentChecker(userText))
			{
				processedText = "This has trains in it. Yay.";
			}
			else
			{
				processedText = "This doesn't have trains in it.";
			}
		}
		else
		{
			if(memeChecker(userText))
			{
				processedText = "hey, you found a meme:" + userText;
				processedText += " isn't that cool.";
			}
			else
			{
				processedText = "Boring, that wasn't a meme.";
			}
		}
		else if (randomChoice == 3)
		{
			//User based talking
			
		}
		else if (randomChoice == 4)
		{
			//userInput list add
			userInputList.add(0, userText);
			 randomTopic = "Thanks for the input, " + myUser.getName();
		}
		else if (randomChoice == 5)
		{
			String userInput = null;
			if(userInputChecker(userInput))
			{
				randomTopic = "Yikes you knew what you said before!!!";
			}
		}
		else
		{
			//userInputChecker
			if (userInputChecker(userText));
			{
				processedText = "This matches";
			}
			
			{
				processedText = "This does not match.";
			}
		}
		incrementChats();
		return processedText;
	}
	/**
	 * the String that has the person's age is returned 
	 * @return null or no value
	 */
	private String getAge()
	{
		// TODO Auto-generated method stub
		return null;
	}
	/**
	 *sets the age to an integer but returns no value. 
	 * @param age
	 */
	private void setAge(int age)
	{
		// TODO Auto-generated method stub
		
	}
 /**
  * Checks to see if the userInputList matches the input and creates a loop until it does
  * @param input
  * @return
  */
	private boolean userInputChecker(String input)
	{
		boolean matchesInput = false;
		
		if(userInputList.size() > 0)
		{
			for(int loopCount = 0; loopCount < userInputList.size(); loopCount++)
			{
				if(input.equalsIgnoreCase(userInputList.get(loopCount)))
				{
					matchesInput = true;
					userInputList.remove(loopCount);
					loopCount--;
				}
			}
		}
		
		return matchesInput;
	}
	/**
	 * Checks the length of the String input
	 * @param input
	 * @return
	 */
	private boolean stringLengthChecker(String input)
	{
		boolean isShort = false;

		if (input.length()<10)
		{
			isShort = true;
		}

		return isShort;
	}
	/**
	 * This checks to see if any of the content contains the word trains. 
	 * @param input
	 * @return
	 */
	private boolean contentChecker(String input)
	{
		boolean aboutTrains = false;
		
		if (input.contains(contentArea))
		{
			aboutTrains = true;
		}
	
		return aboutTrains;
	}

	
	/**
	 * Checks for the input "au revoir" to
	 * 
	 * @param name
	 *            The new name for the Chatbot.
	 * @return
	 */
	private boolean memeChecker(String currentText)
	{
		boolean isAMeme = false;

		for (String currentMeme : memeList)
		{
			isAMeme = true;
		}

		return isAMeme;
	}

	/**
	 * Checks for the input "au revior" to close the app.
	 * 
	 * @param input
	 * @return
	 */
	public boolean quitChecker(String input)

	
	{
		boolean okToQuit = false;

		if (input != null && input.equals("au revoir"))
		{
			okToQuit = true;
		}

		return okToQuit;
	}

	/**
	 * Checks to see if the name of the chatbot is contained within the String supplied by the user.
	 * @param currentInput The user supplied String.
	 * @return Whether the name is inside or not.
	 */
	private boolean chatbotNameChecker(String currentInput)
	{
		boolean hasNameInString = false;
		
		if(currentInput.indexOf(this.getName()) > -1)
		{
			hasNameInString = true;
		}
		
		return hasNameInString;
		
	}
	/**
	 * Checks to see what the name of the conversation will be.
	 * @param currentInput The user supplied String.
	 * @return What the name of the conversation is.
	 */
	private String chatbotNameConversation(String currentInput)
	{
		String nameConversation = "This is what you typed after my name: ";
		
		nameConversation += currentInput.substring(currentInput.indexOf(this.getName()), + this.getName().length());
		
		
		return nameConversation;
	}
	/**
	 * Decides what to do without a conversation that doesn't have a name.
	 * @param currentInput The user supplied String.
	 * @return An unnamed conversation.
	 */
	private String noNameCoversation(String currentInput)
	{
		String notNamed = "";
		
		int smallRandom = (int) (Math.random() * currentInput.length()/ 2);
		int largerRandom = (int) (smallRandom + (Math.random() * (currentInput.length()/2) +1));
		
		notNamed = "You didn't say my name so here is a special phrase: " + currentInput.substring(smallRandom, largerRandom);
		
		return notNamed;
	}
	/**
	 * This String gets the name of the program.
	 * @return null or no value
	 */
	private String getName()
	{
		// TODO Auto-generated method stub
		return null;
	}
	/**
	 * This processes the text from String userInput.
	 * @return null or no value
	 */
	public String processText(String userInput)
	{
		// TODO Auto-generated method stub
		return null;
	}
	/**
	 * This processes the text.
	 * @return null or no value
	 */
	public String processText()
	{
		// TODO Auto-generated method stub
		return null;
	}
}
