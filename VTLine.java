/**
 * 
 */
package applets.Abbildungen_I63_Part1_UrbildX2;

public class VTLine extends VTLabel {

	public VTLine(int stepX, int stepY, int width) {
		super("", stepX, stepY, "Courier");
		while(getWidth() < width) {
			this.setText(getText() + "—");
		}
	}

	public static int height = 10;
	
	public void setFontName(String fontName) {
		// ignore this for VTLine
	}
	
	public int getHeight() {
		return height;
	}
	
}