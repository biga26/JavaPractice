package aaa;

import java.awt.*;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class UpcastingDowncasting {

    public static void main(String[] args) {

        List<Integer> l = new Stack<>();
        l.addAll(Arrays.asList(1,2,3,4,5));

        System.out.println(l);

        ((Stack)l).pop(); // down casting
        System.out.println(l);


        /*
        WebDriver, TakeScreenSHot, JavaScriptExecuter ==>  RemoteWebDriver ==> ChromeDriver, FireFoxDriver ...

        WebDriver driver = new ChromeDriver();
        (chrome)driver.takeScreenShot()

        */





    }
}
