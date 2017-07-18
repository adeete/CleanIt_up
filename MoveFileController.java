
package Files;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class MoveFileController {
    MoveFileModel m1;
    MoveFiles v1;
    MoveFileController(MoveFileModel model,MoveFiles view)
    {
        this.m1=model;
        this.v1=view;
        this.v1.addMoveFileListener(new FileMoveListener());
    }
     class FileMoveListener implements ActionListener{
         
        @Override
        public void actionPerformed(ActionEvent e) {

             int j=v1.askPermissionAgain();
             if(j==javax.swing.JOptionPane.YES_OPTION)
             {
                String fileName;

                fileName=v1.getFolderName();
                
                try {
                    m1.listFilesForFolder(new File("C:\\Users\\RakeshS\\" +fileName));
                } catch (IOException ex) {
                    Logger.getLogger(MoveFileController.class.getName()).log(Level.SEVERE, null, ex);
                }
                 
        

    }}

}
}
