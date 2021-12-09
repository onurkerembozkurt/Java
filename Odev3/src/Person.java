
public class Person implements IVerify{
private int tcNo;
private String ad;
private String soyAd;
private int dogumYili;
public Person(int tcNo, String ad, String soyAd, int dogumYili) {
	this.tcNo=tcNo;
	this.ad=ad;
	this.soyAd=soyAd;
	this.dogumYili=dogumYili;
	
}
public int gettcNo() {
	return tcNo;
	
			
}

public void guncelleTcNo(int tcNo) {
	this.tcNo = tcNo;
}
public String getAd() {
	return ad;
}
public void guncelleAd(String ad) {
	this.ad = ad;
}
public String getSoyAd() {
	return soyAd;
}
public void guncelleSoyAd(String soyAd) {
	this.soyAd = soyAd;
}

public void guncelleDogumYili(int dogumYili) {
	this.dogumYili = dogumYili;
}
@Override
public void bilgiDogrulama() {
	// TODO Auto-generated method stub
	System.out.println(tcNo);
	System.out.println(ad);
	System.out.println(soyAd);
	System.out.println(dogumYili);
	System.out.println("E devlet dogrulamasý yapýldý");
	
}




	
}
