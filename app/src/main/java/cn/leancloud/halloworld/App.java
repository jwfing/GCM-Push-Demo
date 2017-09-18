package cn.leancloud.halloworld;

import android.app.Application;

import com.avos.avoscloud.AVOSCloud;
import com.avos.avoscloud.AVInstallation;

/**
 * Created by fengjunwen on 2017/9/18.
 */

public class App extends Application {
  @Override
  public void onCreate() {
    super.onCreate();
    AVOSCloud.setGcmOpen(true);
    AVOSCloud.useAVCloudUS();
    AVOSCloud.setDebugLogEnabled(true);
    AVOSCloud.setLogLevel(AVOSCloud.LOG_LEVEL_VERBOSE);
    AVOSCloud.initialize(this, "l8j5lm8c9f9d2l90213i00wsdhhljbrwrn6g0apptblu7l90", "b3uyj9cmk84s5t9n6z1rqs9pvf2azofgacy9bfigmiehhheg");
    AVInstallation.getCurrentInstallation().saveInBackground();
    System.out.println(AVInstallation.getCurrentInstallation().getInstallationId());
  }
}
