package chatbot.controller;

import java.awt.Component;

import javax.swing.JOptionPane;

import chatbot.model.Chatbot;
import chatbot.view.ChatbotFrame;
import chatbot.view.ChatbotPanel;
import chatbot.view.ChatbotView;
/**
 * Application Controller for the Chatbot String
 * @author teat7438
 *
 */
public class ChatbotAppController
{	/**
	 * The GUI view for the application.
	 */
	private ChatbotView appView;
	/**
	 * The ChatBot Model instance.
	 */
	private Chatbot notSoCleverBot;
	/**
	 * The message that appears on screen when Chatbot has been opened.
	 */
	private String startMessage;
	/**
	 * The message that appears on screen when Chatbot is closing.
	 */
	private String endMessage;
	
	/**
	 * Establishes the Chatbot View.
	 */
	private ChatbotFrame baseFrame;
	/**
	 * Creates a ChabotAppController and initializes the associated View and Model Objects
	 */
	
	public ChatbotAppController()
	{
		appView = new ChatbotView(this);
		notSoCleverBot = new Chatbot("Mr. not so clever");
		baseFrame = new ChatbotFrame(this);
	}
	
	
	/**
	 * Allows other objects access to the notSoCleverbot
	 * @return The Chatbot for this app.
	 */
	public Chatbot getNotSocleverBot()
	{
		return notSoCleverBot;
	}
	/**
	 * Starts the Chatbot Application. It establishes the program frame, what is in it,
	 * and shows the user a start up message.
	 */
	
	public void start()
	{
		ChatbotPanel myAppPanel = (ChatbotPanel)baseFrame.getContentPane();
		myAppPanel.displayTextToUser(startMessage);
		
		//((ChatbotPanel) baseFrame.getContentPane()).displayTextToUser(startMessage);
		
			String message = notSoCleverBot.processText();
			message = appView.displayChatbotConversations(message);
		
			
	}
	/**
	 * When a user "talks" to chatbot, it responds back
	 * @param userInput what the user enters into the text field to "talk" to the chatbot.
	 * @return respondText, in which the computers responds back to the user, is (along with it's value) returned.
	 */
	public String sendTextToChatBot(String userInput)
	{
		String respondText = "";
		
		respondText = notSoCleverBot.processText(userInput);
		
		return respondText;
	}
	
	/**
	 * Quits the Chatbot application with a message to the user that the application is closing.
	 */
	private void quit()
	{
		appView.displayInformation("goodbye cruel user :(");
		System.exit(0);
	}
	/**
	 * the component of getBaseFrame returns a null value
	 * @return null or return no value
	 */
	public Component getBaseFrame()
	{
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * the String sendTextToChatBot1 returns a null value
	 * @param userTypedText text that the users types
	 * @return null or return no value
	 */
	public String sendTextToChatBot1(String userTypedText)
	{
		// TODO Auto-generated method stub
		return null;
	}



	
}
