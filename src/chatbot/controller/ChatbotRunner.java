package chatbot.controller;

/**
 * Starts the applications.
 * Accesses ChatbotAppController to get the information to start the program.
 *
 */
public class ChatbotRunner
{

	public static void main(String [] args)
	{
		ChatbotAppController chatbotController = new ChatbotAppController();
		chatbotController.start();
	}
}
