import java.io.File;
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.PrintWriter;

public class LecteurTXT implements Lecteur {
  private String fichier;

  public LecteurTXT(String fichier){
    this.fichier = fichier;
  }

  public void lire(){
    try{
      InputStream flux = new FileInputStream(this.fichier);
      InputStreamReader lecture = new InputStreamReader(flux);
      BufferedReader buff= new BufferedReader(lecture);
      String ligne;
      while ((ligne=buff.readLine())!=null){
       System.out.println(ligne);
      }
      buff.close();
    }
    catch (Exception e){
      System.out.println(e.toString());
    }
  }
  public void lireInverse(){
    try{
      InputStream flux = new FileInputStream(this.fichier);
      InputStreamReader lecture = new InputStreamReader(flux);
      BufferedReader buff= new BufferedReader(lecture);
      String ligne;
      StringBuilder sb = new StringBuilder();
      while ((ligne=buff.readLine())!=null){
        for(int i = ligne.length() - 1; i >= 0; i--)
        {
            sb.append(ligne.charAt(i));
        }
       System.out.println(sb);
      }
      buff.close();
    }
    catch (Exception e){
      System.out.println(e.toString());
    }
  }

  public void palindrome(){
    this.lire();
    this.lireInverse();
  }
}
