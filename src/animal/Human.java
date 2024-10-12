package animal;

public class Human extends Animal implements Thinkable {
    //　趣味の情報を保管するフィールドの定義(変数名自由、カプセル化)
    private String hobby;
    
    // getter
    public String getHobby() {
        return hobby;
    }
    
    // setter
    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
    
    
    // 引数ありのコンストラクタ
    // 引数の名前は自由　名前と年齢はスーパークラスを利用
    public Human(String name, int age, String hobby) {
        super(name,age);
        this.hobby = hobby;
    }
    
    // thinkメソッド
    @Override
    public void think() {
        System.out.println("私は" + this.getHobby() + "について考えています。");
    }
    

}
