package com.coppertine.tafe;

    


import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.RandomAccessFile;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;

/**
 *
 * @author Coppertine
 */

public final class InfoLibrary {

    /**
     * Private constructor used to specify a utility class is used.
     */
    private InfoLibrary() { }

    /**
     * Reads specified file as string to return as a list of strings per line.
     * @param fileName Directory to specified file string.
     * @return ArrayList
     * @throws IllegalArgumentException If string is empty
     * or parses errors into program.
     * @throws IOException when file parses an error when turning into string.
     * @see ArrayList
     * @see FileReader
     */
    public static ArrayList<String>
        readFile(final String fileName) throws IOException {
        if (!new File(fileName).exists()) {
            return null;
        }

        ArrayList<String> list = new ArrayList<String>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            String line = "";
            while ((line = br.readLine()) != null) {
                list.add(line);
            }
            br.close();
        } catch (IOException e) {
            throw e;
        }
        return list;
    }

    /**
     * Writes all lines to specified file and can override files if found.
     * @param fileName string to the directory of file.
     * @param backup if a .bak file should be created
     * in the same directory with the old file if the file is replaced.
     * @param list ArrayList of all strings to be written to file.
     * @throws IOException if issues are found with writing file.
     * @see Files
     * @see PrintWriter
     */
    public static void writeFile(
            final String fileName, final Boolean backup,
            final ArrayList<String> list) throws IOException {
        try {

            if (Files.exists(Paths.get(fileName)) && backup) {
                Files.copy(
                        new FileInputStream(fileName),
                        Paths.get(fileName.substring(
                                0,
                                fileName.lastIndexOf(".")) + ".bak"),
                        StandardCopyOption.REPLACE_EXISTING);
                Files.setAttribute(
                        Paths.get(
                                fileName.substring(
                                        0,
                                        fileName.lastIndexOf(".")) + ".bak"),
                        "dos:hidden", true);
            } else {
                    new File(fileName).createNewFile();
            }

            PrintWriter out = new PrintWriter(new FileWriter(fileName));

            for (String line : list) {
                out.println(line);
            }
            out.close();
        } catch (IOException e) {
            throw e;
        }
    }
    
    public static void WriteRAF(String fileName, String input) throws IOException
    {
        try
        {
            RandomAccessFile raf = new RandomAccessFile(fileName, "rw");
            raf.writeUTF(input);
            raf.close();
            
        } catch (IOException e) {
            throw e;
        }
    }
    
    public static String ReadRAF(String fileName, int input)
    {
        String str = "";
        try
        {
            RandomAccessFile raf = new RandomAccessFile(fileName, "rw");
            raf.seek(input);
            str = raf.readUTF();
            raf.close();
            
        } catch (Exception e)
        {
            System.out.println(e.toString());
        }
        
        return str;

    }
    
    public static String CSVFormat(String[] input)
    {
        return String.join(",", input);
    }
    
    public static double getBrightness(javafx.scene.paint.Color c) {
        return Math.sqrt(
        c.getRed() * c.getRed() * .241 +
        c.getGreen() * c.getGreen() * .691 +
         c.getBlue() * c.getBlue() * .068) * 255;
    }
    

    /* Using GeeksforGeeks Method */
    public static String[] GetStringArray(ArrayList<String> arr) 
    { 
  
        // declaration and initialise String Array 
        String str[] = new String[arr.size()]; 
  
        // ArrayList to Array Conversion 
        for (int j = 0; j < arr.size(); j++) { 
  
            // Assign each value to String array 
            str[j] = arr.get(j); 
        } 
  
        return str; 
    } 

    
}
