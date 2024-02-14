public class File {
    private String FileName;

    File(String FileName){
        this.FileName = FileName;
    }
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    public String getFileName() {
        return FileName;
    }

    public void PrintFileName(){
        System.out.println(getFileName());
    }
}
