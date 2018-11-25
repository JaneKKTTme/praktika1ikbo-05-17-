import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Example extends JFrame
{
	final static boolean shouldFill = true;
    final static boolean shouldWeightX = true;
    final static boolean RIGHT_TO_LEFT = false;
	
	JButton but1 = new JButton("AC Milan");
	JButton but2 = new JButton("Real Madrid");
	
	JTextField jt1 = new JTextField("0 X 0");
	JTextField jt2 = new JTextField("N/A");
	JTextField jt3 = new JTextField("DRAW");
	Font font = new Font("Times New Roman", Font.PLAIN, 12);
	int AM = 0, RM = 0;
	Example()
	{
		super("Example Application");
		if (RIGHT_TO_LEFT) 
		{
            setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        }
		setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		if (shouldFill) 
		{
			c.fill = GridBagConstraints.HORIZONTAL;
		}
		setSize(500, 250);
		
		if (shouldWeightX) 
		{
			c.weightx = 20.0;
		}
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 0;
		add(but1, c);
		c.fill = GridBagConstraints.HORIZONTAL;
		c.weightx = 20.0;
		c.gridx = 1;
		c.gridy = 0;
		add(but2, c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.ipady = 40;      
		c.weightx = 0.5;
		c.gridwidth = 0;
		c.gridx = 0;
		c.gridy = 1;
		add(new JLabel("Result: "), c);
		c.gridx = 1;
		add(jt1, c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.ipady = 40;      
		c.weightx = 0.5;
		c.gridwidth = 1;
		c.gridx = 0;
		c.gridy = 2;
		add(new JLabel("Last Scorer: "), c);
		c.gridx = 1;
		add(jt2, c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.ipady = 40;      
		c.weightx = 0.5;
		c.gridwidth = 1;
		c.gridx = 0;
		c.gridy = 3;
		add(new Label("Winner: "), c);
		c.gridx = 1;
		add(jt3, c);
		
		but1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				try
				{
					AM++;
					jt1.setText(AM + " X " + RM);
					jt2.setText("AC Milan");
					if (AM > RM)
						jt3.setText("AC Milan");
					else if (AM < RM)
						jt3.setText("Real Madrid");
					else
						jt3.setText("None");
				}
				catch(Exception e)
				{
					JOptionPane.showMessageDialog(null, "Error!","alert" , JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		
		but2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				try
				{
					RM++;
					jt1.setText(AM + " X " + RM);
					jt2.setText("Real Madrid");
					if (AM > RM)
						jt3.setText("AC Milan");
					else if (AM < RM)
						jt3.setText("Real Madrid");
					else
						jt3.setText("None");
				}
				catch(Exception e)
				{
					JOptionPane.showMessageDialog(null, "Error!","alert" , JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		
		setVisible(true);
	}
	
	public static void main(String[] args)
	{
		new Example();
	}
}
