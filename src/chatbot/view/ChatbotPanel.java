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

public class ChatbotPanel extends JPanel
{
	private ChatbotAppController baseController;
	
	private JButton sampleButton;
	private JTextField sampleField;
	private JTextArea chatArea;
	private JScrollPane chatPane;
	private SpringLayout baseLayout;
	
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
	
	private void setupScrollPane()
	{
		chatArea.setLineWrap(true);
		chatArea.setWrapStyleWord(true);
		chatArea.setEditable(false);
	}
	
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

	public void displayTextToUser(String input)
	{
		chatArea.append("\n" + input);
	}
}