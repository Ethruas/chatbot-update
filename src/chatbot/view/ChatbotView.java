package chatbot.view;

import javax.swing.JOptionPane;

import chatbot.controller.ChatbotAppController;
/**
 * This allows ChatbotView to access the ChatbotAppController
 */
public class ChatbotView
{
	private ChatbotAppController baseController;
	
	public ChatbotView(ChatbotAppController baseController)
	{
		this.baseController = baseController;
	}

	/**
	 * Displays the supplied String parameter to the user via popup and returns the users response to the controller.
	 * @param input The supplied text to be displayed.
	 * @return output; the computer's response to the controller.
	 */
	
	public void displayChatbotsations(String input)
	{
		String output = "";
		
		output = JOptionPane.showInputDialog(null, input );
		
	}

	
	/**
	 * Displays the supplied input via a popup window.
	 * @param input The text to be displayed.
	 */
	
	public void displayInformation(String input)
	{
		JOptionPane.showMessageDialog(null, input);
	}
	/**
	 * Displays conversations between Chatbot and the user.
	 * @param message what the user enters into the text field
	 * @return null or no value
	 */
	public String displayChatbotConversations(String message)
	{
		// TODO Auto-generated method stub
		return null;
	}
}
