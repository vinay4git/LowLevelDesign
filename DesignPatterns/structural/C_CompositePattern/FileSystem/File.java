package DesignPatterns.structural.C_CompositePattern.FileSystem;

public class File implements FileSystem {
    private String fileName;

    public File(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void ls() {
        System.out.println("FileName " + fileName);
    }
}
