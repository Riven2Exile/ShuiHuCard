package com.shuihucard;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//import cn.domob.ads.sample.BannerAd;
//import cn.domob.ads.sample.DomobSampleActivity;
import cn.domob.android.ads.DomobAdEventListener;
import cn.domob.android.ads.DomobAdView;
import cn.domob.android.ads.DomobAdManager.ErrorCode;
import cn.domob.android.ads.DomobUpdater;


import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.content.res.AssetManager.AssetInputStream;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.SimpleAdapter;

/*
  	����һ���б�ؼ�
 */


public class MainActivity extends Activity {

	/**** ���غ��� *****/
	public native void TestLog();
	
	public native byte[] JniGetByteArr(int nSize);
	
	public static native int getOffset(int nIndex);
	public static native int getBmpSize(int nIndex);
	
	public static native void DecodeBmp(byte[] byteBmp); 
	
	
	/******* ��Ա����  *******/
	public static final String PUBLISHER_ID = "56OJzZMIuNQa6i/c1H";
	public static final String InlinePPID = "16TLmacoApcKzNUHwiyJx9kz";
	public static final String InterstitialPPID = "16TLwebvAchksY6iOa7F4DXs";
	public static final String SplashPPID = "16TLwebvAchksY6iOGe3xcik";
	RelativeLayout mAdContainer;
	DomobAdView mAdview320x50;
	
	
	static {
		System.loadLibrary("shuihu");
	}
	/***************************/
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        mAdContainer = (RelativeLayout) findViewById(R.id.adcontainer);
        mAdview320x50 = new DomobAdView(this, PUBLISHER_ID, InlinePPID, DomobAdView.INLINE_SIZE_320X50);
		mAdview320x50.setKeyword("ShuiHuCard");
		//mAdview320x50.setUserGender("male");
		//mAdview320x50.setUserBirthdayStr("2000-08-08");
		//mAdview320x50.setUserPostcode("123456");

		mAdview320x50.setAdEventListener(new DomobAdEventListener() {
						
			@Override
			public void onDomobAdReturned(DomobAdView adView) {
				Log.i("DomobSDKDemo", "onDomobAdReturned");				
			}

			@Override
			public void onDomobAdOverlayPresented(DomobAdView adView) {
				Log.i("DomobSDKDemo", "overlayPresented");
			}

			@Override
			public void onDomobAdOverlayDismissed(DomobAdView adView) {
				Log.i("DomobSDKDemo", "Overrided be dismissed");				
			}

			@Override
			public void onDomobAdClicked(DomobAdView arg0) {
				Log.i("DomobSDKDemo", "onDomobAdClicked");				
			}

			@Override
			public void onDomobAdFailed(DomobAdView arg0, ErrorCode arg1) {
				Log.i("DomobSDKDemo", "onDomobAdFailed");				
			}

			@Override
			public void onDomobLeaveApplication(DomobAdView arg0) {
				Log.i("DomobSDKDemo", "onDomobLeaveApplication");				
			}

			@Override
			public Context onDomobAdRequiresCurrentContext() {
				return MainActivity.this;
			}
		});
		mAdContainer.addView(mAdview320x50);
   //     try {
        //�ļ���Ҫ��assets�ļ����ж�ȡ�� ��ȡ���� �ٽ���(��)
//        AssetManager mgr = getAssets();
//        
//        AssetFileDescriptor afd = mgr.openFd("1.jpg");
//        long length = afd.getLength();
//        
//        afd.close();
//        InputStream inStr = mgr.open("1.jpg");
//        byte[] data = new byte[(int)length];
//        inStr.read(data, 0, data.length);
//        
//        Bitmap imgData = BitmapFactory.decodeByteArray(data, 0, data.length);
//        
//        RelativeLayout.LayoutParams pa = new RelativeLayout.LayoutParams(200,400);
//        
//        	AssetManager mgr = getAssets();
//        	InputStream inStr = mgr.open("Data.pak");
//			
//        	// ȡ���ļ���С��ƫ��
//        	int nIndex = 2;
//        	int nSize = MainActivity.getBmpSize(nIndex);
//        	int nOffset = MainActivity.getOffset(nIndex);
//        	//System.out.println("Index: " + nIndex);
//        	
//        	byte[] buf = new byte[nSize];  
//        	
//        	//ȡ���ļ�
//        	inStr.read(buf, 0, buf.length); 
//			
//        	//����
//        	MainActivity.DecodeBmp(buf);
//        	
//        	Bitmap imgData = BitmapFactory.decodeByteArray(buf, 0, nSize);
//        	
//        ImageView mImgview = new ImageView(this);
//        addContentView(mImgview, pa);
//        
//        mImgview.setImageBitmap(imgData);
//        
//        //System.out.println("bottomMargin"+Integer.toString(pa.bottomMargin));
//        //System.out.println("leftMargin"+Integer.toString(pa.leftMargin));
//        //System.out.println("rightMargin"+Integer.toString(pa.rightMargin));
//        //System.out.println("topMargin"+Integer.toString(pa.topMargin));
//		
//        
//        // test
//        TestLog();
//        byte[] myA = JniGetByteArr(5);
//        System.out.println(myA.length);
//        for (int i = 0; i < myA.length; i++)
//        {
//        	System.out.println(myA[i]);
//        }
        
        InitUI();
        
        DomobUpdater.checkUpdate(this, PUBLISHER_ID);//������
        
//        } catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //getMenuInflater().inflate(R.menu.activity_main, menu);
        menu.add(Menu.NONE, Menu.FIRST, Menu.NONE, "����Ӧ��");
		menu.add(Menu.NONE, Menu.FIRST + 1, Menu.NONE, "�˳�");
        return true;
    }
    
    public boolean onOptionsItemSelected(MenuItem item) {
		super.onOptionsItemSelected(item);

		switch (item.getItemId()) {
		case Menu.FIRST:
			new AlertDialog.Builder(this).setTitle("ƻ���ʳ�").setMessage("Ը���ǿ�����Щ��Ϥ��ͼ���ܹ���һ˿˿���û��䡣\n���д�����ߺõĽ���ɷ����ʼ���\n lpr108@163.com\n��л����֧��!")
					.setPositiveButton("֪����", new DialogInterface.OnClickListener() {
						public void onClick(DialogInterface dialog, int which) {
						}
					}).show();
			break;
		case Menu.FIRST + 1:
			finish();
			android.os.Process.killProcess(android.os.Process.myPid());
			break;
		default:
			break;
		}

		return true;
	}
    
    private void InitUI(){
    	
    	ListView list = (ListView)this.findViewById(R.id.listView1);
    	//list.setX(50);
		
    	//��������
    	SimpleAdapter adapter = new SimpleAdapter(this,getData(),R.layout.activity_main,
				new String[]{"title"},
				new int[]{R.id.title});

		list.setAdapter(adapter);
		
		// ���ü����� ()
		list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				System.out.println(arg2); //���㿪ʼ��
				
				//�л� Activity
				Intent intent = new Intent();
				//intent.putExtra("filename", "/sdcard/"+data.get(arg2)); // ���ݲ���
				intent.putExtra("index", arg2);	//������
				intent.setClass(MainActivity.this, ShowCardActivity.class); //�л�Ϊ  �Ķ�������
				startActivity(intent); 
			}
		});
    }
    
    // ����Դ
    private List<Map<String, Object>> getData()
    {
     	List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
     
     	Map<String, Object> map = new HashMap<String, Object>();
     	
     	ShuiHuCfg cfg = ShuiHuCfg.getInstance();
     	int length = cfg.getSize();
     	for (int i = 1; i < length; ++i)
     	{
     		map.put("title", cfg.GetName(i));
     		list.add(map);
     		map = new HashMap<String, Object>();
     	}
             
      	return list;
    }
    
    
    public void onItemClick(AdapterView<?> arg0, View arg1,	int arg2, long arg3) 
    {
    	
    }
    
    
    
    
    /** ���غ��� **/
}
