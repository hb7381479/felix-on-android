package org.bbs.felix.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.Menu;
import android.view.MenuItem;

/**
 *  keep method consistency with {@link Activity}
 * @author luoqii
 *
 */
public class ActivityAgent{
	
	protected FragmentActivity mHostActivity;

	// life-cycle
	protected void onCreate(Bundle savedInstanceState) {
	}
		protected void onResume() {
	}
	protected void onPause() {
	}
	protected void onDestroy() {
		mHostActivity = null;
	}
	public void setContentView(int layoutResID){
		mHostActivity.setContentView(layoutResID);
	}
	
	// option menu.
	public boolean onCreateOptionsMenu(Menu menu){
		return false;
	}
	public boolean onOptionsItemSelected(MenuItem item){
        return false;
	}
	public boolean onPrepareOptionsMenu(Menu menu){
		return mHostActivity.onPrepareOptionsMenu(menu);
	}

	// start activity
	public void startActivityFromFragment(Fragment fragment, Intent intent,
			int requestCode) {
		mHostActivity.startActivityFromFragment(fragment, intent, requestCode);
	}
	public void startActivity(Intent intent) {
		mHostActivity.startActivity(intent);
	}
	public void startActivity(Intent intent, Bundle options) {
		mHostActivity.startActivity(intent, options);
	}
	public boolean startActivityIfNeeded(Intent intent, int requestCode) {
		return mHostActivity.startActivityIfNeeded(intent, requestCode);
	}
	public boolean startActivityIfNeeded(Intent intent, int requestCode,
			Bundle options) {
		return mHostActivity.startActivityIfNeeded(intent, requestCode, options);
	}
	public void startActivityFromChild(Activity child, Intent intent,
			int requestCode) {
		mHostActivity.startActivityFromChild(child, intent, requestCode);
	}
	public void startActivityFromChild(Activity child, Intent intent,
			int requestCode, Bundle options) {
		mHostActivity.startActivityFromChild(child, intent, requestCode, options);
	}
	public void startActivityFromFragment(android.app.Fragment fragment,
			Intent intent, int requestCode) {
		mHostActivity.startActivityFromFragment(fragment, intent, requestCode);
	}
	public void startActivityFromFragment(android.app.Fragment fragment,
			Intent intent, int requestCode, Bundle options) {
		mHostActivity.startActivityFromFragment(fragment, intent, requestCode, options);
	}
	public void startActivityForResult(Intent intent, int requestCode) {
		mHostActivity.startActivityForResult(intent, requestCode);
	}
	
	// activity result.
	public void onActivityResult(int arg0, int arg1, Intent arg2) {
		
	}
	
	
	
}