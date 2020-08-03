package BasicOfOOP.Task1;

public class Directory
{
    String diretoryNameDefault;

    public Directory()
    {
        this.diretoryNameDefault = "D:\\Epam_Task\\IntroductionToJava\\src\\BasicOfOOP\\Task1";
        System.out.println("Directory");
    }

    public String getDiretoryNameDefault() {
        return diretoryNameDefault;
    }

    public void setDiretoryNameDefault(String diretoryNameDefault) {
        this.diretoryNameDefault = diretoryNameDefault;
    }
}
