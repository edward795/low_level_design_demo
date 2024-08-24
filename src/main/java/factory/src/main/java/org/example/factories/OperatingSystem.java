package org.example.factories;

public abstract class OperatingSystem{
    private String version;
    private String architrecture;

    public OperatingSystem(String version, String architrecture) {
        this.version = version;
        this.architrecture = architrecture;
    }

    public String getVersion() {
        return version;
    }

    public String getArchitrecture() {
        return architrecture;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public void setArchitrecture(String architrecture) {
        this.architrecture = architrecture;
    }

    public abstract void changeDir(String dir);
    public abstract void removeDir(String dir);
}