package chatbot.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import chatbot.controller.ChatbotAppController;
/**
 * ChatbotPanel can use everything within JPanel
 */
public class ChatbotPanel extends JPanel
{
	/**
	 * ChatbotPanel can use ChatbotAppController.
	 */
	private ChatbotAppController baseController;
	/**
	 * The parts that will be within the Chatbot Frame are established.
	 */
	private JButton sampleButton;
	private JTextField sampleField;
	private JTextArea chatArea;
	private JScrollPane chatPane;
	private SpringLayout baseLayout;
	/**
	 * The various properties of the ChatbotPanel have been established.
	 * The baseController is confirmed, a sample button has been placed, a sample field
	 * has been established, as well as an area to type chats and a continued pane 
	 * to hold it. An base layout has also been established and setups for ScrollPane,
	 * Panel, Layout, Listeners have been placed.
	 * @param baseController ChatbotPanel's link to the ChatbotAppController and it's properties.
	 */
	public ChatbotPanel(ChatbotAppController baseController)
	
	{
		this.baseController = baseController;
		sampleButton = new JButton("click on me please :D");
		sampleField = new JTextField(25);
		chatArea = new JTextArea(5, 25);
		chatPane = new JScrollPane(chatArea);
		
		baseLayout = new SpringLayout();
		
		setupScrollPane();
		setupPanel();
		setupLayout();
		setupListeners();
	}
	/**
	 * This allows for the text entry space to expand if the text is longer than the
	 * initial line.
	 */
	private void setupScrollPane()
	{
		chatArea.setLineWrap(true);
		chatArea.setWrapStyleWord(true);
		chatArea.setEditable(false);
	}
	/**
	 * The background color, base layount, button, and field have been placed into the program.
	 */
	private void setupPanel()
	{
		this.setBackground(Color.MAGENTA);
		this.setLayout(baseLayout);
		
		this.add(sampleButton);
		this.add(sampleField);
	}

	private void setupLayout()
	{
		
	}
	/**
	 * When a person has enter text into the text field and pressed the sample button,
	 * the computer processes that information and creates a response.
	 */
	private void setupListeners()
	{
		sampleButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				String userTypedText = sampleField.getText();
				String chatbotResponse = baseController.sendTextToChatBot(userTypedText);
				displayTextToUser(userTypedText);
				displayTextToUser(chatbotResponse);
				sampleField.setText("");
			}
		});
		
	}
	/**
	 * This allows the program to displayed the input entered in by the user.
	 * @param input what the user enters into the program.
	 */
	public void displayTextToUser(String input)
	{
		chatArea.append("\n" + input);
	}
}