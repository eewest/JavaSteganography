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
        Steganographer test = new LSBSteganographer();
        String imgPath = "/home/eewest/Pictures/grumpycat.png";
        String msgPath = "/home/eewest/Documents/message.txt";
        String stegPath = "/home/eewest/Pictures/stegImage1.png";
        test.ApplySteganography(imgPath, msgPath, "stegImage1");
        test.ReadStegImage(stegPath);
    }
}
