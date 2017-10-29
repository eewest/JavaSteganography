/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package steganographer;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.imageio.ImageWriter;

/**
 *
 * @author eewest
 */
public class AppedSteg extends Steganographer{

    @Override
    protected void write(byte[] data, BufferedImage destination) {
        throw new UnsupportedOperationException("Not supported for this operation."); //To change body of generated methods, choose Tools | Templates.
        
    }
    
    protected void write(byte[] data, byte[] destination) {
        //create a new byte array to contain the bytes of data from message and
        //the image. The +2 is for the new lines added to the end and beginning 
        // of the data byte array
        byte[] allData = new byte[data.length + destination.length + 2];
        
        System.arraycopy(data, 0, allData, 0, data.length);
        
    }

    @Override
    protected byte[] read(BufferedImage stegImage) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void ApplySteganography(String imageFilePath, String dataFilePath) {
        if(imageFilePath != null && dataFilePath != null){
            try {
                byte[] source = Files.readAllBytes(new File(imageFilePath).toPath());
                byte[] data = Files.readAllBytes(new File(dataFilePath).toPath());
                write(data, source);
                String saveTo = imageFilePath.substring(0, imageFilePath.lastIndexOf(File.separatorChar));
                SaveImage(saveTo, source);
            } catch (IOException ex) {
                Logger.getLogger(LSBSteganographer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public void ReadStegImage(String filepath) {
        if(filepath != null ){
            BufferedImage source = LoadImage_Copy(filepath);
            byte[] messageData = read(source);
            String message = new String(messageData);
            System.out.println(message);
        }
    }
    
    
    protected boolean SaveImage(String filepath, byte[] stegImage){
        try {
            File f = new File(path + File.separatorChar + "stegImage.png");
            //write bytes to a file
            Files.write(f.toPath(), stegImage);
            return true;
        } catch (IOException ex) {
            Logger.getLogger(Steganographer.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
