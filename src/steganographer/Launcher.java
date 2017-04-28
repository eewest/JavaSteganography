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
        Steganographer test = new BadTextSteganographer();
        String imgPath = "/home/eewest/Desktop/StegFiles/source.png";
        String msgPath = "/home/eewest/Desktop/StegFiles/message.txt";
        String stegPath = "/home/eewest/Desktop/StegFiles/stegImage.png";
        //test.ApplySteganography(imgPath, msgPath);
        test.ReadStegImage(stegPath);
    }
}
