# OkhttpExample
v2.4->初次使用
================
菜鸟第一次试玩OkHttp_v2.4，就只是试了一下post和get两种，而且只是基本的传几个参数。里面的网址连接只是我本地Tomcat上的小网站。
莫要全抄，毕竟内网地址。 

## 主要内容
### OkHttpUtils 
OkHttpUtils 是我自己为了代码好整理写的一个类，跟[鸿洋大大](http://blog.csdn.net/lmj623565791/article/details/47911083)的并不是一个东西，也不是他那个级别的东西。
就写了get和post两个方法。（链接还有OkHttp的使用都写在里面了）

``` bash
public class OkHttpUtils {
    private static final String tag = OkHttpUtils.class.getName();
    public static void get() {}
    public static void post() {}
}
```
具体看代码...不多说

### LoginCallback
在post里面使用了Gson来解析返回的json，写的一个类。是bean还是pojo还是什么都好，只是菜鸟，不懂。
json包含了3个key，也就对应了写了3个属性跟setter和getter。
``` bash
代码省略...
```

就写到这里，后续有改动再说...
