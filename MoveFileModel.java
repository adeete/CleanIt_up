


package Files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.List;


public class MoveFileModel {
        public void listFilesForFolder(final java.io.File folder) throws FileNotFoundException, IOException {
        for (final java.io.File fileEntry : folder.listFiles()) {
            if (fileEntry.isDirectory()) {
                String loc = fileEntry.getAbsolutePath();
                File folder3 = new File(loc);
                File[] listofFiles = folder3.listFiles();
               if (listofFiles!=null && listofFiles.length == 0) {
                    
                    System.out.println("Folder Name :: " + folder3.getAbsolutePath() + " is deleted.");
                    folder3.delete();
                }
            }
        }
        List<java.io.File> files = new ArrayList();
        List<java.io.File> files1 = new ArrayList();
        List<java.io.File> files2 = new ArrayList();
        List<java.io.File> files3 = new ArrayList();
        List<java.io.File> files4 = new ArrayList();
        List<java.io.File> files5 = new ArrayList();
        List<java.io.File> files6 = new ArrayList();
        List<java.io.File> files7 = new ArrayList();
        List<java.io.File> files8 = new ArrayList();
        List<java.io.File> files9 = new ArrayList();
        List<java.io.File> files10 = new ArrayList();
        List<java.io.File> files11 = new ArrayList();
        List<java.io.File> files12 = new ArrayList();
        List<java.io.File> files13 = new ArrayList();
        List<java.io.File> files14 = new ArrayList();
        List<java.io.File> files15 = new ArrayList();
        for (final java.io.File fileEntry : folder.listFiles()) {
            if (fileEntry.getName().contains(".mp3")) {
                files.add(fileEntry);
            }
             if (fileEntry.getName().contains(".iso")) {
                files14.add(fileEntry);
            }
             if (fileEntry.getName().contains(".sql")) {
                files15.add(fileEntry);
            }
            if (fileEntry.getName().contains(".mp4")) {
                files11.add(fileEntry);
            }
            if (fileEntry.getName().contains(".pdf") || fileEntry.getName().contains(".psd")) {
                files1.add(fileEntry);
            }
            if (fileEntry.getName().contains(".jpg")  || fileEntry.getName().contains(".png") || fileEntry.getName().contains(".jpeg")) {
                files2.add(fileEntry);
            }
            if (fileEntry.getName().contains(".EXE") || fileEntry.getName().contains(".exe")) {
                files3.add(fileEntry);
            }
            if (fileEntry.getName().contains(".zip") || fileEntry.getName().contains(".gz")) {
                files4.add(fileEntry);
            }
            if (fileEntry.getName().contains(".txt") || fileEntry.getName().contains(".doc") || fileEntry.getName().contains(".docx")) {
                files5.add(fileEntry);
            }
            if (fileEntry.getName().contains(".pptx") || fileEntry.getName().contains(".ppt")) {
                files6.add(fileEntry);
            }
            if (fileEntry.getName().contains(".htm") || fileEntry.getName().contains(".html")) {
                files7.add(fileEntry);
            }
            if (fileEntry.getName().contains(".ppk") || fileEntry.getName().contains(".pem") || fileEntry.getName().contains(".msi")) {
                files8.add(fileEntry);
            }
            if (fileEntry.getName().contains(".jar") || fileEntry.getName().contains(".rar")) {
                files9.add(fileEntry);
                
            }
            if (fileEntry.getName().contains(".xls")) {
                files10.add(fileEntry);
            }
            if (fileEntry.getName().contains(".css") || fileEntry.getName().contains(".woff")) {
                files12.add(fileEntry);
            }
            if (fileEntry.getName().contains("fmovies")) {
                files13.add(fileEntry);
            }
        }
       /* Boolean l = new java.io.File("C:\\Users\\RakeshS\\" + folder.getName() + "\\pdf_files").mkdir();
        Boolean w = new java.io.File("C:\\Users\\RakeshS\\" + folder.getName() + "\\exe_files").mkdir();
        Boolean q = new java.io.File("C:\\Users\\RakeshS\\" + folder.getName() + "\\zip_files").mkdir();
        Boolean v = new java.io.File("C:\\Users\\RakeshS\\" + folder.getName() + "\\text_files").mkdir();
        Boolean a = new java.io.File("C:\\Users\\RakeshS\\" + folder.getName() + "\\ppt_files").mkdir();
        Boolean s = new java.io.File("C:\\Users\\RakeshS\\" + folder.getName() + "\\html_files").mkdir();
        Boolean j = new java.io.File("C:\\Users\\RakeshS\\" + folder.getName() + "\\putty_files").mkdir();
        Boolean ja = new java.io.File("C:\\Users\\RakeshS\\" + folder.getName() + "\\jar_files").mkdir();
        Boolean xls = new java.io.File("C:\\Users\\RakeshS\\" + folder.getName() + "\\Excel_files").mkdir();*/
        
        Boolean xls = new java.io.File("C:\\Users\\RakeshS\\Downloads\\iso").mkdir();
        Boolean sq = new java.io.File("C:\\Users\\RakeshS\\Downloads\\sql_files").mkdir();
        for (java.io.File file : files) {
            Path p = Paths.get("C:\\Users\\RakeshS\\Music\\" + file.getName());
            Files.copy(file.toPath(), p, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("copied " + file.getPath() + " to " + p);
            Files.delete(file.toPath());
        }
        for (java.io.File file : files14) {
            Path p = Paths.get("C:\\Users\\RakeshS\\Downloads\\iso\\" + file.getName());
            Files.copy(file.toPath(), p, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("copied " + file.getPath() + " to " + p);
            Files.delete(file.toPath());
        }
        for (java.io.File file : files15) {
            Path p = Paths.get("C:\\Users\\RakeshS\\Downloads\\sql_files\\" + file.getName());
            Files.copy(file.toPath(), p, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("copied " + file.getPath() + " to " + p);
            Files.delete(file.toPath());
        }
        for (java.io.File file : files11) {
            Path p = Paths.get("C:\\Users\\RakeshS\\Videos\\" + file.getName());
            Files.copy(file.toPath(), p, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("copied " + file.getPath() + " to " + p);
            Files.delete(file.toPath());
        }
        for (java.io.File file : files1) {
            Path p = Paths.get("C:\\Users\\RakeshS\\Downloads\\pdf_files\\" + file.getName());
            Files.copy(file.toPath(), p, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("copied " + file.getPath() + " to " + p);
            Files.delete(file.toPath());
        }
        for (java.io.File file : files2) {
            Path p = Paths.get("C:\\Users\\RakeshS\\Pictures\\" + file.getName());
            Files.copy(file.toPath(), p, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("copied " + file.getPath() + " to " + p);
            Files.delete(file.toPath());
        }
        for (java.io.File file : files3) {
            Path p = Paths.get("C:\\Users\\RakeshS\\Downloads\\exe_files\\" + file.getName());
            Files.copy(file.toPath(), p, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("copied " + file.getPath() + " to " + p);
            Files.delete(file.toPath());
        }
        for (java.io.File file : files4) {
            Path p = Paths.get("C:\\Users\\RakeshS\\Downloads\\zip_files\\" + file.getName());
            Files.copy(file.toPath(), p, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("copied " + file.getPath() + " to " + p);
            Files.delete(file.toPath());
        }
        for (java.io.File file : files5) {
            Path p = Paths.get("C:\\Users\\RakeshS\\Downloads\\text_files\\" + file.getName());
            Files.copy(file.toPath(), p, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("copied " + file.getPath() + " to " + p);
            Files.delete(file.toPath());
        }
        for (java.io.File file : files6) {
            Path p = Paths.get("C:\\Users\\RakeshS\\Downloads\\ppt_files\\" + file.getName());
            Files.copy(file.toPath(), p, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("copied " + file.getPath() + " to " + p);
            Files.delete(file.toPath());
        }
        for (java.io.File file : files7) {
            Path p = Paths.get("C:\\Users\\RakeshS\\Downloads\\html_files\\" + file.getName());
            Files.copy(file.toPath(), p, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("copied " + file.getPath() + " to " + p);
            Files.delete(file.toPath());
        }
        for (java.io.File file : files8) {
            Path p = Paths.get("C:\\Users\\RakeshS\\Downloads\\putty_files\\" + file.getName());
            Files.copy(file.toPath(), p, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("copied " + file.getPath() + " to " + p);
            Files.delete(file.toPath());
        }
        for (java.io.File file : files9) {
            Path p = Paths.get("C:\\Users\\RakeshS\\Downloads\\jar_files\\" + file.getName());
            Files.copy(file.toPath(), p, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("copied " + file.getPath() + " to " + p);
            Files.delete(file.toPath());
        }
        for (java.io.File file : files10) {
            Path p = Paths.get("C:\\Users\\RakeshS\\Downloads\\Excel_files\\" + file.getName());
            Files.copy(file.toPath(), p, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("copied " + file.getPath() + " to " + p);
            Files.delete(file.toPath());
        }
        for (java.io.File file : files12) {
            Path p = Paths.get("C:\\Users\\RakeshS\\Downloads\\css\\" + file.getName());
            Files.copy(file.toPath(), p, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("copied " + file.getPath() + " to " + p);
            Files.delete(file.toPath());
        }
        for (java.io.File file : files13) {
            Path p = Paths.get("C:\\Users\\RakeshS\\Videos\\movies\\" + file.getName());
            Files.copy(file.toPath(), p, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("copied " + file.getPath() + " to " + p);
            Files.delete(file.toPath());
        }
    }
}
