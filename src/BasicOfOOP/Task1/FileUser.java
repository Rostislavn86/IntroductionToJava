package BasicOfOOP.Task1;

import java.util.Objects;

public class FileUser extends Directory
{
    String fileName;

    public FileUser()
    {
        super();
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName)
    {
        this.fileName = fileName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FileUser fileUser = (FileUser) o;
        return Objects.equals(fileName, fileUser.fileName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fileName);
    }
}


