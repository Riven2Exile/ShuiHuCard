

#include "com_shuihucard_MainActivity.h"
#include <jni.h>
#include <stdio.h>
#include <android/log.h>

#include "ShuiHuCardCfg.h"
#include "CEasyPack.h"
#include "CXor.h"


typedef unsigned char BYTE;

#define  LOG_TAG    "== native =="
#define  LOGI(...)  __android_log_print(ANDROID_LOG_INFO,LOG_TAG,__VA_ARGS__)
#define  LOGE(...)  __android_log_print(ANDROID_LOG_ERROR,LOG_TAG,__VA_ARGS__)


// keyÅäÖÃ
byte g_bFirstKey = 0x8c;
byte g_bNextKey = 0x47;


extern "C"{



	void Java_com_shuihucard_MainActivity_TestLog(JNIEnv *env, jobject obj)
	{
		LOGI("can test it");
	}


	jbyteArray Java_com_shuihucard_MainActivity_JniGetByteArr(JNIEnv *env, jobject obj, jint nSize)
	{
		LOGI("size:%d", nSize);
		jbyteArray data = NULL;
		if(nSize >= 0)
			data= env->NewByteArray(nSize);

		LOGI("before");
		jbyte * olddata = env->GetByteArrayElements(data, 0);
		LOGI("after %x", data);
		BYTE* bytearr = (BYTE*)olddata;

		int i = 0;
		for ( ; i < nSize; i++)
		{
			bytearr[i] = i;
		}

		return data;
	}


	void Java_com_shuihucard_MainActivity_DecodeBmp(JNIEnv* env, jclass jcla , jbyteArray abyte)
	{
		LOGI("DecodeBmp");
		LOGI("env:%x", env);
		jbyte* byteArr = env->GetByteArrayElements(abyte, 0);
		jsize nSize = env->GetArrayLength(abyte);
		LOGI("DecodeBmp arr size:%d", nSize);

		byte* pByte = (byte*) byteArr;
		if (pByte && nSize >= 0)
		{
			CToolXor tool;
			tool.SetfirstKey(g_bFirstKey);
			tool.SetLeftKey(g_bNextKey);
			tool.DoXor(pByte, nSize);
		}
	}


	jint Java_com_shuihucard_MainActivity_getOffset(JNIEnv *env, jclass jcla, jint nIndex)
	{
		if (nIndex < 0 || nIndex >= 109)
		{
			return 0;
		}

		ToolOffset tool;
		tool.Init();
		return tool.GetOffSet(nIndex);
	}


	jint JNICALL Java_com_shuihucard_MainActivity_getBmpSize(JNIEnv *env, jclass jcla, jint nIndex)
	{
		if (nIndex < 0 || nIndex >= 109)
		{
			return 0;
		}

		return s_aShuiHuPak[nIndex];
	}


}