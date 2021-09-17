package com.epam.jdi.light.common;

import com.epam.jdi.light.settings.WebSettings;

import static com.jdiai.tools.ReflectionUtils.isClass;
import static com.jdiai.tools.StringUtils.LINE_BREAK;
import static com.jdiai.tools.StringUtils.format;

/**
 * Created by Roman_Iovlev on 3/19/2018.
 */
public class Exceptions {
    public static RuntimeException exception(String msg, Object... args) {
        String message = args.length == 0 ? msg : format(msg, args);
        WebSettings.logger.debug("ERROR: " + message);
        return new RuntimeException(LINE_BREAK + message);
    }

    public static RuntimeException exception(Throwable ex, String msg, Object... args) {
        String message = args.length == 0 ? msg : format(msg, args);
        String exMsg = ex.getMessage();
        if (exMsg == null)
            exMsg = ex.getCause().getMessage();
        WebSettings.logger.debug("ERROR: " + message + ". Exception: " + exMsg);
        final Class<?> exceptionClass = ex.getClass();
        if (isClass(AssertionError.class, exceptionClass))
            throw new AssertionError(message, ex);
        else if (isClass(exceptionClass, UnsupportedOperationException.class)) {
            return new UnsupportedOperationException(message, ex);
        }
        return new RuntimeException(message, ex);
    }
}
