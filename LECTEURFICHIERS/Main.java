import java.io.File;
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.PrintWriter;

public class Main{
  public static void main(String[] args){;
    Lecteur lecteur = new LecteurTXT("fichier.txt");
    //lecteur.lire();
    lecteur.palindrome();

  }
}
