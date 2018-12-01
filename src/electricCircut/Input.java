package electricCircut;

import java.awt.Color;
import java.awt.Graphics;


public class Input extends Gate{

	int state = 0; //0 nie ustawiony, 1 - wysoki -1 = niski
	
	public Input(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
		
		addOutput(new ElectricNode(this, x+getR(), y, 5));
	}

	@Override
	public void addInput(ElectricNode input) {
		//funkcja nie moze nic robic, inputy nie maja wejsc
	}

	@Override
	public void drawMe(Graphics g) {
	
		if(state == 1) 
			g.setColor(new Color(0,255,0));
		else if(state == -1)
			g.setColor(new Color(0,0,255));
		else
			g.setColor(new Color(200,200,200));
		
		
		g.fillRect(getX()-getR(), getY()-getR(), 2*getR(), 2*getR());

		g.setColor(new Color(0,0,0));
		g.drawRect(getX()-getR(), getY()-getR(), 2*getR(), 2*getR());
		
	}
	
	
}