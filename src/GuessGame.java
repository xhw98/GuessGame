import java.util.Calendar;
import java.util.Calendar;

/**
 * Created by admin on 2017/3/28.
 */
public class GuessGame {
    Player p1;
    Player p2;
    Player p3;//用三个实例变量分别表示3个Player对象
     void startGame() {
        p1 = new Player();//创建Player对象
        p2 = new Player();
        p3 = new Player();
        int guessp1 = 0;//申明三个对象存储猜测的数字
        int guessp2 = 0;
        int guessp3 = 0;

        boolean p1isright = false;//声明三个对象判断是否猜中
        boolean p2isright = false;
        boolean p3isright = false;

        int targetnumber = (int) (Math.random() * 10);//产生谜底数字
        System.out.println("i think of a number between 0 and 9");

        while (true)
        {
            System.out.println("Number to guess is " + targetnumber);

            p1.guess();
            p2.guess();
            p3.guess();

            guessp1 = p1.number;
            guessp2 = p2.number;
            guessp3 = p3.number;

            guessp1 = p1.number;
            System.out.println("Player one guessed " + guessp1);

            guessp2 = p2.number;
            System.out.println("Player two guessed " + guessp2);

            guessp3 = p3.number;
            System.out.println("Player three guessed " + guessp3);

            if (p1isright || p2isright || p3isright){

                System.out.println("We have a winner !");
                System.out.println("p1 is right ?" + p1isright);
                System.out.println("p2 is right ？" + p2isright);
                System.out.println("p3 is right ?" + p3isright);
                System.out.println("Game is over !");
                break;//游戏结束终止循环
            }
            else{
                //都没猜中，继续下去
                System.out.println("We will continue ");
            }//if else 结束
        }//循环结束

    }//方法结束

}//类结束
 class Player {
    int number = 0 ;//要猜的数字

    void guess() {
        number = (int) (Math.random() * 10);//Player 猜测
        System.out.println("I'm guessing  number is " + number);
    }
}
 class Gamelauncher {
  public  static void main (String args[]){

        GuessGame game = new GuessGame();
        game.startGame();
    }
}


