/*
 *  MathExercisesJavaAppletBase
 * 
 * by Albert Zeyer / developed for Lehrstuhl A für Mathematik at the RWTH Aachen University
 * code under GPLv3+
 */
package applets.Termumformungen$in$der$Technik_08_Ethanolloesungen;

class OTRawString extends OTEntity {
	String content = "";
	OTRawString() {}
	OTRawString(String s) { if(s == null) throw new AssertionError("string must be non-null"); content = s; }
	@Override public String toString() { return OperatorTree.debugOperatorTreeDump ? ("{" + content + "}") : content; }
	public int compareTo(OTEntity o) {
		if(o instanceof OTRawString) return content.compareTo(((OTRawString) o).content);
		return -1;
	}
	Object getContent() { return content; }
	static Utils.Function<OTRawString,String> toStringConverter() {
		return new Utils.Function<OTRawString,String>() {
			public String eval(OTRawString obj) {
				return obj.content;
			}
		};
	}
}
