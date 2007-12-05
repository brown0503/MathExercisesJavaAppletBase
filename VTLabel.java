/**
 * 
 */
package applets.Abbildungen_I60_Part1_UrbildFGrafik;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;

import javax.swing.JLabel;


public class VTLabel extends VisualThing {

	public VTLabel(String text, int stepX, int stepY, String fontName) {
		this.text = text;
		this.stepX = stepX;
		this.stepY = stepY;
		this.fontName = fontName;
	}

	public VTLabel(String text, int stepX, int stepY) {
		this.text = text;
		this.stepX = stepX;
		this.stepY = stepY;
	}

	public VTLabel(String name, String text, int stepX, int stepY) {
		this.text = text;
		this.name = name;
		this.stepX = stepX;
		this.stepY = stepY;
	}

	private int stepX, stepY;
	private String name = null;
	private String text;
	private String fontName = "";
	private Color color = Color.black;
	private JLabel label = null;

	public void setText(String text) {
		this.text = text;
		if(label != null)
			label.setText(text);
	}
	
	public String getText() {
		return text;
	}
	
	public void setFontName(String fontName) {
		this.fontName = fontName;
		if(label != null)
			label.setFont(new Font(fontName, 0, 12));
	}
	
	public String getFontName() {
		return fontName;
	}

	public Color getColor() {
		if(label != null)
			return label.getForeground();
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
		if(label != null)
			label.setForeground(color);
	}
	
	public Component getComponent() {
		if (label == null) {
			label = new JLabel();
			if (name != null)
				label.setName(name);
			label.setText(text);
			label.setFont(new Font(fontName, 0, 12));
			label.setForeground(color);
			label.setOpaque(false);
			//label.setBackground(Color.cyan);
		}
		return label;
	}

	public int getHeight() {
		getComponent();
		return label.getFontMetrics(label.getFont()).getHeight();
	}

	public int getWidth() {
		getComponent();
		return label.getFontMetrics(label.getFont()).stringWidth(text);
	}
	
	public int getStepX() {
		return stepX;
	}
	
	public int getStepY() {
		return stepY;
	}

	public void setStepX(int v) {
		stepX = v;
	}

	public void setStepY(int v) {
		stepY = v;
	}

	public String getDebugStringExtra() {
		return ",\"" + text + "\"";
	}

}