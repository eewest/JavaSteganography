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
        Steganographer test = new TextSteganographer();
        String imgPath = "C:\\Users\\Eric West\\Desktop\\Steg Files\\test\\source.png";
        String msgPath = "C:\\Users\\Eric West\\Desktop\\Steg Files\\test\\message.txt";
        String stegPath = "C:\\Users\\Eric West\\Desktop\\Steg Files\\test\\stegImage.png";
        test.ApplySteganography(imgPath, msgPath);
        test.ReadStegImage(stegPath);
    }
}
