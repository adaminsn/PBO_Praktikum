import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class fileCreator{
    public void creatFile(){
        String directoryPath = "D:/ngoding adam/Java/Pratikum 5/pertemuan5_07720";
        String fileName = "Biodata.txt";
        String fileContent = "Membuat file menggunakan java";

        try {
            File file = new File(directoryPath, fileName);
            if(file.createNewFile()){
                System.out.println("File" + fileName + " Berhasil dibuat di folder" + directoryPath);
                try (FileWriter writer = new FileWriter(file)) {
                    writer.write(fileContent);
                    System.out.println("File Berhasil diisi.");
                }
            }else {
                System.out.println("File sudah ada: " + fileName );
            }
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat membuat file");
            e.printStackTrace();
        }
    }
}


public class Main {
    public static void main(String[] args) {
        fileCreator FileCreator = new fileCreator();
        FileCreator.creatFile();
    }
}