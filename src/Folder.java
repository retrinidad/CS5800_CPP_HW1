import java.util.ArrayList;

public class Folder {
    private String FolderName;
    private ArrayList<Folder> FolderArray = new ArrayList<Folder>();
    private ArrayList<File> FileArray = new ArrayList<File>();

    Folder(String FolderName){
        this.FolderName = FolderName;
    }

    public String getFolderName() {
        return FolderName;
    }

    public void setFolderName(String FolderName) {
        this.FolderName = FolderName;
    }

    public void AddNewFolder(String NewFolderName){
        Folder NewFolder = new Folder(NewFolderName);
        FolderArray.add(NewFolder);
    }

    public void AddNewFolder(Folder NewFolder){
        FolderArray.add(NewFolder);
    }

    public void AddNewFile(String NewFileName){
        File NewFile = new File(NewFileName);
        FileArray.add(NewFile);
    }

    public void Print(){
        for(int i = 0; i < FolderArray.size(); i++){
            System.out.println("Folder Name: " + FolderArray.get(i).getFolderName());
            if(!FolderArray.get(i).FolderArray.isEmpty()){
                FolderArray.get(i).Print();
            }
        }
        for(int i = 0; i < FileArray.size(); i++){
            System.out.print("File Name: ");
            FileArray.get(i).PrintFileName();
        }
    }

    public void Delete(Folder Selection){
        Selection.FolderArray.clear();
        Selection.FileArray.clear();
        this.FolderArray.remove(Selection);
    }
}
