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
 * ��ʾ��������
 * @author Administrator
 *
 */


public class ShowCardActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_card);
        
        // ���ֵ
        Intent intent = getIntent();
        
        int nIndex = intent.getIntExtra("index", 0);	//0--> �ν� // C++����1
        ++nIndex;
        
        this.setTitle(ShuiHuCfg.getInstance().GetName(nIndex));
        
        ImageView ImgView = (ImageView)findViewById(R.id.imageView1);
        if (ImgView == null){
        	return ;
        }
        
      //�ļ���Ҫ��assets�ļ����ж�ȡ�� ��ȡ���� �ٽ���(��)
        AssetManager mgr = getAssets();
        try {
        	InputStream inStr = mgr.open("Data.pak");
			
        	// ȡ���ļ���С��ƫ��
        	int nSize = MainActivity.getBmpSize(nIndex);
        	int nOffset = MainActivity.getOffset(nIndex);
        	
        	System.out.println("nIndex:" + nIndex + " nSize:" + nSize + " nOffset:" + nOffset);
        	
        	byte[] buf = new byte[nSize];  
        	
        	inStr.skip(nOffset);
        	//ȡ���ļ�
        	inStr.read(buf, 0, buf.length); 
			
        	//����
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
