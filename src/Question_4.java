public class Question_4 {
    public static void main(String[] args){
        Folder php_demo1 = new Folder("php_demo1");
        Folder SourceFiles = new Folder("Source Files");
        Folder phalcon = new Folder("phalcon");
        Folder app = new Folder("app");
        Folder cache = new Folder("cache");
        Folder publicFolder = new Folder("publicFolder");

        app.AddNewFolder("config");
        app.AddNewFolder("controllers");
        app.AddNewFolder("library");
        app.AddNewFolder("migrations");
        app.AddNewFolder("models");
        app.AddNewFolder("views");
        SourceFiles.AddNewFolder(phalcon);
        SourceFiles.AddNewFolder(app);
        SourceFiles.AddNewFolder(cache);
        SourceFiles.AddNewFolder(publicFolder);

        php_demo1.AddNewFolder(SourceFiles);
        php_demo1.AddNewFolder("Include Path");
        php_demo1.AddNewFolder("Remote Files");

        SourceFiles.AddNewFile("htaccess");
        SourceFiles.AddNewFile("htrouter.php");
        SourceFiles.AddNewFile("index.html");

        System.out.println("Printing out php_demo1 folder contents...");
        php_demo1.Print();

        System.out.println();

        System.out.println("Deleting app folder and its contents. New folder structure will also print...");
        SourceFiles.Delete(app);
        php_demo1.Print();

        System.out.println();

        System.out.println("Deleting publicFolder and its contents. New folder structure will also print...");
        SourceFiles.Delete(publicFolder);
        php_demo1.Print();
    }
}
