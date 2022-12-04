package dvsn.gl.system.info;

import dvsn.gl.system.io.FileSystem;

public class OperationSystem {
    private static final OperationSystem instance;

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

    private static String OS_TYPE;

    private static FileSystem fileSystem;


    public static String getOsType() {
        return OS_TYPE;
    }

    public static void setOsType(String osType) {
        OS_TYPE = osType;
    }
}
