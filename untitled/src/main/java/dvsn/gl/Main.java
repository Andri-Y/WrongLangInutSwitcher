package dvsn.gl;

import com.github.kwhat.jnativehook.GlobalScreen;
import com.github.kwhat.jnativehook.NativeHookException;
import dvsn.gl.system.OperationSystem;
import dvsn.gl.system.listeners.keyboard.GlobalKeyListener;

public class Main {
    public static void main(String[] args) {
        OperationSystem currentOS = OperationSystem.getInstance();
        try {
            GlobalScreen.registerNativeHook();
        } catch (NativeHookException ex) {
            System.err.println("There was a problem registering the native hook.");
            System.err.println(ex.getMessage());

            System.exit(1);
        }

        GlobalScreen.addNativeKeyListener(new GlobalKeyListener());
    }
}