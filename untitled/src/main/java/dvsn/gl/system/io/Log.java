package dvsn.gl.system.io;

class Log implements LogCreator {
    private static final Log instance;

    static {
        try {
            instance = new Log();
        } catch (Exception e) {
            throw new RuntimeException("Exception on OS init");
        }
    }

    private Log() {
    }

    public static Log getInstance() {
        return instance;
    }
}
