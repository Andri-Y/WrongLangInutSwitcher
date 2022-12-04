package dvsn.gl.system.io;

public class FileSystem implements FileSystemCreator {

    public static final Log LOG = Log.getInstance();
    private static final FileSystem instance;

    static {
        try {
            instance = new FileSystem();
        } catch (Exception e) {
            throw new RuntimeException("Exception on OS init");
        }
    }

    private FileSystem() {
    }

    public static FileSystem getInstance() {
        return instance;
    }

}
