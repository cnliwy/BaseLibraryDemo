## 工程结构
工程包括common、library、app三个module,启动common、library为android moudle基础类库。app为项目的主工程目录。
1. common是基础类库，提供工具、服务、自定义控件、网络请求封装等基础服务。任何项目可直接依赖。
2. library依赖common，是根据当前项目需要所封装或提供的一些基础服务，移植较为麻烦。
3. app为项目的主工程目录。
### 一、common基础组件
#### common所依赖库如下：
 1. compile 'com.jakewharton:butterknife:8.5.1' Butterknife注入框架
 2. compile 'com.yanzhenjie:permission:1.1.0'   AndPermission权限框架
 3. compile 'com.liwy.easyhttp:easyhttp:1.0.8'  EasyHttp 网络请求框架
 4. compile 'com.orhanobut:logger:1.15'         Logger 日志框架
 5. compile 'org.greenrobot:eventbus:3.0.0'     EventBus 事件总线
 6. compile 'com.github.CymChad:BaseRecyclerViewAdapterHelper:2.9.27'   万能RecyclerView Adapter
 7. testCompile 'com.squareup.leakcanary:leakcanary-android-no-op:1.5'  内存泄漏检测框架
 8. compile 'io.reactivex.rxjava2:rxjava:2.1.3' Rxjava
#### common提供：
1. Utils工具类
```
    ActivityUtils 页面管理工具类
    DateUtils 时间工具类
    FileUtils 文件工具类
    PhoneUtils 手机信息工具类
    ScreenUtils 尺寸单位计算工具类
    ToastUtils toast工具类
    *BaseUtils 基础工具类，需提前初始化。
 ```
    
2. 自定义控件
```
    Indicator导航栏+底部菜单栏
```


### 二、library 业务基础库
1. Base基类
2. MVP模式基类


### MVP模板
在app目录下有library专用.rar的文件，解压文件。
1. 将MVPActivity2放至：C:\Program Files\Android\Android Studio\plugins\android\lib\templates\activities
2. 将MVPFragment2放至：C:\Program Files\Android\Android Studio\plugins\android\lib\templates\other
放至对应的androidstudio安装目录里。