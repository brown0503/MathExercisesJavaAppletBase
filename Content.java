package applets.AnalytischeGeometrieundLA_Ebene_StuetzNormRichtung;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Collection;
import java.util.Random;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Content {

	Applet applet;
	PGraph3D graph;
	
	public Content(Applet applet) {
		this.applet = applet;		
	}
	
	public void init() {
		applet.setSize(436, 581);
	}

	void postinit() {}
	void next(int i) {}
	
	protected String Round(double x) {
		return "" + (Math.round(x * 10) / 10.0);
	}
	
	protected PGraph.Point randomChoiceFrom(Collection<PGraph.Point> points) {
		PGraph.Point[] ar = points.toArray(new PGraph.Point[0]);
		int i = new Random().nextInt(ar.length);
		return ar[i];
	}
		
	public void run() {
		graph = new PGraph3D(applet, 400, 400);		
		graph.addBaseAxes();
		
		PGraph3D.Plane plane = new PGraph3D.Plane(new PGraph3D.Float(5f), new PGraph3D.Vector3D(1,1,1), Color.red);
		graph.objects.add(plane);
		PGraph3D.Point pt = graph.new MoveablePointOnPlane(plane.basePoint(), plane, Color.blue);
		graph.objects.add(pt);
		PGraph3D.Line line = new PGraph3D.Line(pt.dynPoint(), pt.dynPoint().diff( new PGraph3D.Vector3D(5, 0, 0) ), Color.green);
		graph.objects.add(line);
		PGraph3D.Point pt2 = graph.new MoveablePointOnLine(new PGraph3D.Vector3D(5, 0, 0), line, Color.blue);
		graph.objects.add(pt2);
		
		applet.vtmeta.setExtern(new VisualThing[] {
				new VTImage("graph", 10, 5, graph.W, graph.H, graph)
		});	
	}
	
}
