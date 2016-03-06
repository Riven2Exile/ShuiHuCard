package com.shuihucard;

import java.io.IOException;
import java.io.InputStream;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.Menu;
import android.widget.ImageView;

/**
 * 显示卡和内容
 * @author Administrator
 *
 */


public class ShowCardActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_card);
        
        // 获得值
        Intent intent = getIntent();
        
        int nIndex = intent.getIntExtra("index", 0);	//0--> 宋江 // C++中是1
        ++nIndex;
        
        this.setTitle(ShuiHuCfg.getInstance().GetName(nIndex));
        
        ImageView ImgView = (ImageView)findViewById(R.id.imageView1);
        if (ImgView == null){
        	return ;
        }
        
      //文件需要从assets文件夹中读取， 读取流， 再解密(后话)
        AssetManager mgr = getAssets();
        try {
        	InputStream inStr = mgr.open("Data.pak");
			
        	// 取得文件大小和偏移
        	int nSize = MainActivity.getBmpSize(nIndex);
        	int nOffset = MainActivity.getOffset(nIndex);
        	
        	System.out.println("nIndex:" + nIndex + " nSize:" + nSize + " nOffset:" + nOffset);
        	
        	byte[] buf = new byte[nSize];  
        	
        	inStr.skip(nOffset);
        	//取得文件
        	inStr.read(buf, 0, buf.length); 
			
        	//解密
        	MainActivity.DecodeBmp(buf);
        	
        	Bitmap bit = BitmapFactory.decodeByteArray(buf, 0, nSize);
        	
        	ImgView.setImageBitmap(bit);
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //getMenuInflater().inflate(R.menu.activity_show_card, menu);
        return true;
    }
}
