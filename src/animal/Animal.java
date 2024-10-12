package animal;

public class Animal {
    // 名前を格納するフィールドと年齢を格納するフィールドを定義
    // 変数名は自由 カプセル化
    private String name;
    private int age;
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    
    public Animal() {
    }
    
    public Animal(String name,int age) {
        this.name = name;
        this.age = age;
    }
    
    public void say() {
        System.out.println(this.name + "です。" + this.age + "歳です。");
    }
    

}
