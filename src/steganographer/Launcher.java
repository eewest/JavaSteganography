/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package steganographer;

/**
 *
 * @author Eric
 */
public class Launcher {
    public static void main(String[] args) {
        Steganographer test = new PictureSteganographer();
        String imgPath = "C:\\Users\\Eric West\\Desktop\\Steg Files\\demo4\\source.png";
        String msgPath = "C:\\Users\\Eric West\\Desktop\\Steg Files\\demo4\\hide.png";
        String stegPath = "C:\\Users\\Eric West\\Desktop\\Steg Files\\demo4\\stegImage.png";
        test.ApplySteganography(imgPath, msgPath);
        //test.ReadStegImage(stegPath);
    }
}
