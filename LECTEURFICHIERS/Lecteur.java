import java.io.File;
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.PrintWriter;

public interface Lecteur{

  public abstract void lire();
  public abstract void lireInverse();
  public abstract void palindrome();
}
