package dvsn.gl.system.io;

public class FileSystem extends AbstractFileSystem {

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

    public static final Log LOG = Log.getInstance();

}
