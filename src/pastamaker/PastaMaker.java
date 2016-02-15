
package pastamaker;

/**
 *
 * @author jeff Bryan
 * CMIS 242 
 * Discussion 5
 */

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class PastaMaker extends JFrame implements ActionListener{

static final int WIDTH = 500, HEIGHT = 400;
static final String title="Bob's automated Pasta Orders";
private JButton order;
private JRadioButton macaroni, linguini, shell;
private JCheckBox sausage,pepperoni,meatballs,mozzarella,feta,paprika,basil,parmesan;
private JLabel nameLabel,pastaLabel,sauceLabel,toppingLabel;
private JTextField nameField;
private ButtonGroup group;

public PastaMaker(){
super(title); 
setSize(WIDTH, HEIGHT); 
setLocationRelativeTo(null); 
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
setLayout(new GridBagLayout());
GridBagConstraints arrange= new GridBagConstraints();

//Buttons
order = new JButton("Order!");

//Radio Buttons
macaroni= new JRadioButton("Macaroni", true);
linguini= new JRadioButton("Linguini", false);
shell = new JRadioButton("Shells", false);

//Check box
sausage= new JCheckBox("Sausage");
pepperoni= new JCheckBox("pepperoni");
meatballs= new JCheckBox("meatballs");
mozzarella= new JCheckBox("Mozzarela");
feta= new JCheckBox("Feta");
paprika= new JCheckBox("paprika");
basil= new JCheckBox("Basil");
parmesan= new JCheckBox("Parmesan");

//Groups
group = new ButtonGroup();
group.add(macaroni);
group.add(linguini);
group.add(shell);


//Label
nameLabel = new JLabel("Name:");
pastaLabel = new JLabel("Pasta:");
toppingLabel = new JLabel("Toppings:");

//textfield
nameField = new JTextField(10);


//arrangement
arrange.insets=new Insets(8,8,8,8);
arrange.gridx=0;
arrange.gridy=0;
add(nameLabel,arrange);
arrange.gridx=1;
arrange.gridy=0;
add(nameField,arrange);
arrange.gridx=0;
arrange.gridy=2;
add(pastaLabel,arrange);
arrange.gridx=1;
arrange.gridy=2;
add(macaroni,arrange);
arrange.gridx=2;
arrange.gridy=2;
add(linguini,arrange);
arrange.gridx=3;
arrange.gridy=2;
add(shell,arrange);
arrange.gridx=0;
arrange.gridy=5;
add(toppingLabel,arrange);
arrange.gridx=0;
arrange.gridy=6;
add(sausage,arrange);
arrange.gridx=1;
arrange.gridy=6;
add(pepperoni,arrange);
arrange.gridx=2;
arrange.gridy=6;
add(meatballs,arrange);
arrange.gridx=0;
arrange.gridy=6;
add(mozzarella,arrange);
arrange.gridx=1;
arrange.gridy=7;
add(feta,arrange);
arrange.gridx=2;
arrange.gridy=7;
add(paprika,arrange);
arrange.gridx=0;
arrange.gridy=7;
add(basil,arrange);
arrange.gridx=1;
arrange.gridy=8;
add(parmesan,arrange);
arrange.gridx=1;
arrange.gridy=9;
add(order,arrange);

//handler
nameField.addActionListener(this);
macaroni.addActionListener(this);
linguini.addActionListener(this);
shell.addActionListener(this);
sausage.addActionListener(this);
pepperoni.addActionListener(this);
meatballs.addActionListener(this);
mozzarella.addActionListener(this);
feta.addActionListener(this);
paprika.addActionListener(this);
basil.addActionListener(this);
parmesan.addActionListener(this);
order.addActionListener(this);

}
public void display() {
setVisible(true);
}
@Override
public void actionPerformed(ActionEvent event){

if(event.getSource()==order){
String info="\nName: "+nameField.getText()+"\n";

if(macaroni.isSelected()){
info=info+"Pasta: Macaroni\nToppings:\n";
}
if(linguini.isSelected()){
info=info+"Pasta: Linguini\nToppings:\n";
}
if(shell.isSelected()){
info=info+"Gender: Shells\nToppings:\n";
}
if(sausage.isSelected()){
info=info+"~Sausage\n";
}
if(pepperoni.isSelected()){
info=info+"~Pepperoni\n";
}
if(meatballs.isSelected()){
info=info+"~Meat Balls\n";
}
if(mozzarella.isSelected()){
info=info+"~Mozzarella\n";
}
if(feta.isSelected()){
info=info+"~Feta\n";
}
if(paprika.isSelected()){
info=info+"~Paprika\n";
}
if(basil.isSelected()){
info=info+"~Basil\n";
}
if(parmesan.isSelected()){
info=info+"~Parmesan\n";
}
JOptionPane.showMessageDialog(null,String.format("Thank you for ordering!"+info, event.getActionCommand()));

}

}

public static void main(String[] args) {
PastaMaker test = new PastaMaker();
test.display();
}

}