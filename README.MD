## 工程结构
工程包括common、library、app三个module,启动common、library为android moudle基础类库。app为项目的主工程目录。
1. common是基础类库，提供工具、服务、自定义控件、网络请求封装等基础服务。任何项目可直接依赖。
2. library依赖common，是根据当前项目需要所封装或提供的一些基础服务，移植较为麻烦。
3. app为项目的主工程目录。
### 一、common基础组件
common所依赖库如下：
 1. compile 'com.jakewharton:butterknife:8.5.1' Butterknife注入框架
 2. compile 'com.yanzhenjie:permission:1.1.0'   AndPermission权限框架
 3. compile 'com.liwy.easyhttp:easyhttp:1.0.8'  EasyHttp 网络请求框架
 4. compile 'com.orhanobut:logger:1.15'         Logger 日志框架
 5. compile 'org.greenrobot:eventbus:3.0.0'     EventBus 事件总线
 6. compile 'com.github.CymChad:BaseRecyclerViewAdapterHelper:2.9.27'   万能RecyclerView Adapter
 7. testCompile 'com.squareup.leakcanary:leakcanary-android-no-op:1.5'  内存泄漏检测框架

common提供：
1. Utils工具类
2. Indicator导航栏+底部菜单栏

### 二、library 业务基础库