package dvsn.gl.system;

import dvsn.gl.system.io.FileSystem;

public class OperationSystem implements OperationSystemSelector {
    private static final OperationSystem instance;
    private static String OS_TYPE;
    private static FileSystem fileSystem;

    static {
        try {
            instance = new OperationSystem();
        } catch (Exception e) {
            throw new RuntimeException("Exception on OS init");
        }
    }

    private OperationSystem() {
    }

    public static OperationSystem getInstance() {
        return instance;
    }

    public static String getOsType() {
        return OS_TYPE;
    }

    public static void setOsType(String osType) {
        OS_TYPE = osType;
    }
}
