/**
 * 
 */
package applets.AnalytischeGeometrieundLA_Ebene_StuetzNormRichtung;







public class VTLine extends VTLabel {

	public VTLine(int stepX, int stepY, int width) {
		super("", stepX, stepY, "monospace");
		while(getWidth() < width) {
			this.setText(getText() + "―");
		}
	}

	public static int height = 10;
	
	public int getHeight() {
		return height;
	}
	
}
