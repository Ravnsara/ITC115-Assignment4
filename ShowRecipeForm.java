package com.crome.RecipeBook;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/*
 * This form takes in a Recipe object
 * through its constructor and 
 * displays its contents
 */

public class ShowRecipeForm {
	
	//Recipe recipe;
	
	private JFrame frame;
	private JPanel panel;
	private JLabel recipeLabel;
	private JScrollPane scrollPane;
	private JList<String> list;
	private JTextArea directionsTextArea;
	private JButton buttonClose;
	
	
	public ShowRecipeForm(Recipe r){
		//recipe=r;
		createFrame(r);
	}

	private void createFrame(Recipe r){
		frame = new JFrame();
		frame.setBounds(200,200,250,500);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setTitle("Recipe");
		frame.add(createPanel(r));
		frame.setVisible(true);
	}
	
	private JPanel createPanel(Recipe r){
		panel = new JPanel();
		panel.setLayout(new GridLayout(4,1));
		
		recipeLabel=new JLabel(r.getRecipeName());
		list=new JList<String>();
		scrollPane = new JScrollPane(list);
		fillScrollPane(r);
		directionsTextArea=new JTextArea();
		directionsTextArea.setLineWrap(true);
		directionsTextArea.setText(r.getInstructions());
		buttonClose= new JButton("Close");
		buttonClose.addActionListener (new CloseListener());
		panel.add(recipeLabel);
		panel.add(scrollPane);
		panel.add(directionsTextArea);
		panel.add(buttonClose);
		return panel;
		
		
	}
	
	private void fillScrollPane(Recipe r){
		ArrayList<Item>items=r.getItems();
		//set the default model for the list object
		//our list will contain Strings
		DefaultListModel<String> model = new DefaultListModel<String>();
		//loop through the arrayList
		for(Item i : items){
			//add the item names to the list
			model.addElement(i.getRecipeName());
		}
		list.setModel(model);
	}

	private class CloseListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			frame.dispose();
			
		}
		
	}
}
