package DesignPatterns.structural.C_CompositePattern.FileSystem;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem {
    String directoryName;
    List<FileSystem> listOfContents;

    public Directory(String directoryName) {
        this.directoryName = directoryName;
        listOfContents =  new ArrayList<>();
    }

    @Override
    public void ls() {
        System.out.println("Directory " + directoryName);
        for (FileSystem contentList : listOfContents) {
            contentList.ls();
        }
    }
    public void add(FileSystem fileSystem) {
        listOfContents.add(fileSystem);
    }
}
