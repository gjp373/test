
public class Test {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ


		Person taro=new Person();
		taro.name="山田太郎";
		taro.age=20;
		System.out.println(taro.name);
		System.out.println(taro.age);



		Person jiro=new Person();
		jiro.name="木村次郎";
		jiro.age=18;
		System.out.println(jiro.name);
		System.out.println(jiro.age);


		Person hanako=new Person();
		hanako.name="鈴木花子";
		hanako.age=16;
		System.out.println(hanako.name);
		System.out.println(hanako.age);

		Person saburou=new Person("saburou");
		saburou.age=0;
		System.out.println(saburou.name);
		System.out.println(saburou.age);

        Person nanashi=new Person(25);
        nanashi.name="名前なし";
        System.out.println(nanashi.name);
        System.out.println(nanashi.age);

        Person yumiko=new Person(17,"yumiko");
        System.out.println(yumiko.name);
        System.out.println(yumiko.age);
	}

}
