package org.example.factories;

public class LinuxOperatingSystem extends OperatingSystem{
    public LinuxOperatingSystem(String version, String architrecture) {
        super(version, architrecture);
    }

    @Override
    public void changeDir(String dir) {

    }

    @Override
    public void removeDir(String dir) {

    }
}
