package BasicOfOOP.Task1;

public class FileUser extends Directory
{
    String fileName;

    public FileUser()
    {
        super();
        this.fileName = "Default.txt";
        System.out.println("FileUser");
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
}
