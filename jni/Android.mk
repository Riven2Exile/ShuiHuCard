LOCAL_PATH := $(call my-dir)
#LIB_FXCORE_PATH	:= jni/lib/fxcore/android_rel

include $(CLEAR_VARS)

LOCAL_MODULE    := shuihu
LOCAL_SRC_FILES := main.cpp \
									CEasyPack.cpp

LOCAL_LDLIBS    := -llog -ljnigraphics -lm -ldl -lstdc++	   
#$(LIB_FXCORE_PATH)/libfpdfemb[rel_arm_linux_android_gcc].a \

LOCAL_C_INCLUDES += /cygdrive/d/android-ndk-r7/sources/cxx-stl/stlport/stlport

include $(BUILD_SHARED_LIBRARY)

APP_STL := stlport_static
