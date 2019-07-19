package Baitap;

import java.util.Scanner;

public class Inputandoutput {
	private String name;
	private String id;
	private int age;
	private float s1;
	private float s2;
	private float s3;
	private int credit1;
	private int credit2;
	private int credit3;
	private String idclass;
	public Inputandoutput(String name, String id, int age, int s1, int s2, int s3, int credit1, int credit2,
			int credit3, String idclass) {
		super();
		this.name = name;
		this.id = id;
		this.age = age;
		this.s1 = s1;
		this.s2 = s2;
		this.s3 = s3;
		this.credit1 = credit1;
		this.credit2 = credit2;
		this.credit3 = credit3;
		this.idclass = idclass;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public float getS1() {
		return s1;
	}
	public void setS1(int s1) {
		this.s1 = s1;
	}
	public float getS2() {
		return s2;
	}
	public void setS2(int s2) {
		this.s2 = s2;
	}
	public float getS3() {
		return s3;
	}
	public void setS3(int s3) {
		this.s3 = s3;
	}
	public int getCredit1() {
		return credit1;
	}
	public void setCredit1(int credit1) {
		this.credit1 = credit1;
	}
	public int getCredit2() {
		return credit2;
	}
	public void setCredit2(int credit2) {
		this.credit2 = credit2;
	}
	public int getCredit3() {
		return credit3;
	}
	public void setCredit3(int credit3) {
		this.credit3 = credit3;
	}
	public String getIdclass() {
		return idclass;
	}
	public void setIdclass(String idclass) {
		this.idclass = idclass;
	}
	public Inputandoutput() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void Input() {
		Scanner in=new Scanner(System.in) ;       
		name=in.nextLine() ;
		id=in.nextLine() ;
		age=in.nextInt() ;
		s1=in.nextFloat();
		s2=in.nextFloat() ;
		s3=in.nextFloat() ;
		credit1=in.nextInt() ;
		credit2=in.nextInt() ;
		credit3=in.nextInt() ;
		in.nextLine() ;
		idclass=in.nextLine(); 
	}
	public float averagescore() {
		float AS=(s1*credit1+s2*credit2+s3*credit3)/(credit1+credit2+credit3) ;
		return AS ;
	}
	public void output(float AS) {
		System.out.println(name);
		System.out.println(id);
		System.out.println(age);
		System.out.println(s1 +" "+ credit1);
		System.out.println(s2 +" "+ credit2) ;
		System.out.println(s3 + " "+credit3);
		System.out.println(idclass);
		System.out.println(AS);
		if(AS<4)
			System.out.println("Yeu");
		if(AS>=4 && AS<6)
			System.out.println("Trung Binh");
		if(AS>=6 && AS<8)
			System.out.println("Kha");
		if(AS>=8)
			System.out.println("Gioi");
	}

}
