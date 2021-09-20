import reflect.ISkill;
import abstraction.hero.Camile;
import abstraction.hero.Diana;
import abstraction.hero.Irelia;
import reflect.HeroFactory;

import java.util.Scanner;

public class Main {
//    public static void main(String[] args) {
//        String name = Main.getPlayerInput();
//        switch (name){
//            case "Diana":
//                Diana diana = new Diana();
//                diana.r();
//            case "Irelia":
//                Irelia irelia = new Irelia();
//                irelia.r();
//            case "Camile":
//                Camile camile = new Camile();
//                camile.r();
//        }
//    }
//    public static void main(String[] args) throws Exception {
//        // 单纯的interface可以统一方法调用，但不能统一对象的实例化
//
//        // 面向对象：1.实例化对象（除了new的部分，还有set的部分）
//        //         2.调用方法，完成业务逻辑
//
//        // 只有一段代码中没有new的出现，才能保持代码的相对稳定，才能实现OCP原则
//        // （开闭原则，允许调用者进行扩展，但不允许调用者修改源代码）
//
//        // 如果说我们希望一段代码相对的稳定，这段代码就不能负责对象的实例化
//        // 但是对象的实例化是不可能消除的，因此，我们需要将对象的实例化过程转移到某一个第三方对象之中
//
//
//        String name = Main.getPlayerInput();
//        ISkill iSkill;
//        switch (name){
//            case "Diana":
//                iSkill = new Diana();
//                break;
//            case "Irelia":
//                iSkill = new Irelia();
//                break;
//            case "Camile":
//                iSkill = new Camile();
//                break;
//            default:
//                throw new Exception();
//        }
//        iSkill.r();
//    }
    public static void main(String[] args) throws Exception {
        // 代码总是会存在不稳定的部分（HeroFactory），因此我们需要将不稳定的代码隔离
        // 由于用户的输入是变化的，我们需要考虑所有的变化情况，因此每增加一个英雄，都需要调整HeroFactory
        // 也就是说，如果我们将HeroFactory变化的部分也变成固定的（不需要再加任何英雄了），那么就十分稳定了。
        String name = Main.getPlayerInput();
        ISkill iSkill = HeroFactory.getHero(name);
        iSkill.r();
    }
    
    private static String getPlayerInput(){
        System.out.println("Enter a Hero's Name");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        return name;
    }
}
