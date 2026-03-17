package beans;

public class SBU {
   private int sbuId;
   private String sbuName;
   private String SbuHead;
   public int getSbuId() {
	return sbuId;
   }
   public void setSbuId(int sbuId) {
	this.sbuId = sbuId;
   }
   public String getSbuName() {
	return sbuName;
   }
   public void setSbuName(String sbuName) {
	this.sbuName = sbuName;
   }
   public String getSbuHead() {
	return SbuHead;
   }
   public void setSbuHead(String sbuHead) {
	SbuHead = sbuHead;
   }
   @Override
   public String toString() {
	return "SBU [sbuId=" + sbuId + ", sbuName=" + sbuName + ", SbuHead=" + SbuHead + "]";
   }
   
   
}
