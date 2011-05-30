package jp.ccube;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

public class Screen02 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        //Notificationクリック時に開くURL
        Uri uri = Uri.parse("http://www.google.com/");
        
        //Notificationクリック時のPendingIntentを生成
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        PendingIntent pi = PendingIntent.getActivity(this, 0, intent, 0);
        
        //NotificationManagerインスタンス
        NotificationManager nManager = (NotificationManager)getSystemService(Context.NOTIFICATION_SERVICE);
        
        //Notificationインスタンス生成
        Notification notification = new Notification();
        
        //フラグをセット
        notification.flags = Notification.FLAG_AUTO_CANCEL;
        //アイコンセット
        notification.icon = R.drawable.icon;
        //通知メッセージ
        notification.tickerText = "メッセージ";
        
        //Notificationバーを開いたときに表示する内容
        notification.setLatestEventInfo(this, "タイトル", "細かいこと", pi);
        
        //Notificationを通知
        nManager.notify(1, notification);
	}
}
