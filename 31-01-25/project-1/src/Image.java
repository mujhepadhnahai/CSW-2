
public class Image {
        int imgW;
        int imgH;
        int cc;
        
        Image(){}
        Image(int w,int h,int c){
        	imgW = w;
        	imgH = h;
        	cc = c;
        }
		public int getImgW() {
			return imgW;
		}
		public void setImgW(int imgW) {
			this.imgW = imgW;
		}
		public int getImgH() {
			return imgH;
		}
		public void setImgH(int imgH) {
			this.imgH = imgH;
		}
		public int getCc() {
			return cc;
		}
		public void setCc(int cc) {
			this.cc = cc;
		}
		void print(){
			System.out.println("Image info");
			System.out.println("image width: "+imgW);
			System.out.println("image width: "+imgH);
			System.out.println("image width: "+cc);
			System.out.println("=====================");

		}
}
