
package Files;


public class MoveFilesMain {
    public static void main(String args[])
    {
        MoveFiles view = new MoveFiles();
        MoveFileModel model = new MoveFileModel();
        MoveFileController controller = new MoveFileController(model,view);
        view.setVisible(true);
    }
}
