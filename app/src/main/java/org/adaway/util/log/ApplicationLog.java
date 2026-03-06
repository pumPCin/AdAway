package org.adaway.util.log;

import android.app.Application;
import android.content.Context;
import android.content.pm.ApplicationInfo;

import com.topjohnwu.superuser.Shell;

import org.adaway.helper.PreferenceHelper;

/**
 * This class is an utility class that configures the application log.
 *
 * @author Bruce BUJON (bruce.bujon(at)gmail(dot)com)
 */
public final class ApplicationLog {
    /**
     * Private constructor.
     */
    private ApplicationLog() {

    }

    /**
     * Initialize application logging.
     *
     * @param application The application instance.
     */
    public static void init(Application application) {
            Shell.enableVerboseLogging = false;
    }

    private static boolean isApplicationDebuggable(Context context) {
        return false;
    }
}
