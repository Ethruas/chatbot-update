package chatbot.view;

import javax.swing.JFrame;

import chatbot.controller.ChatbotAppController;
/**
 * ChatbotFrame is allowed to use everything in JFrame
 */
public class ChatbotFrame extends JFrame
{
	/**
	 * Chatbot's frame and how to start it up is established.
	 */
	private ChatbotPanel basePanel;
	
	public ChatbotFrame(ChatbotAppController baseController)
	{
		basePanel = new ChatbotPanel(baseController);
		setupFrame();
	}
	/**
	 * The size and the properties of Chatbot's frame.
	 */
	private void setupFrame()
	{
		this.setContentPane(basePanel);
		this.setSize(400, 400);
		this.setResizable(false);
		this.setVisible(true);
	}
}
