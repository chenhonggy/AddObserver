AddObserver是一款支持android2.2以上的SDK，里面用到了我们熟知的单列模式，<br>
通过单列模式的调用，在所需要的类里面添加观察者。<br>
目前版本只适用于不传值，或者只传一个值<br>
后期会加上多传送<br>

#### AddObserver如何开始
#####手动安装
复制Observer文件夹下的类到工程项目中就 OK <br><br><br>

####开始编码
#####NotificationCenter
首先在已经初始化过的类里面添加一个观察者<br>
    //add observer    
    NotificationCenter.getInstance().addObserver("key", this, "MethodName");<br>
    
其次在第二个类里面可以通过上面的key调用第一个类里面MethodName方法<br>
        NotificationCenter.getInstance().postNotification("key");<br>    <br>   

####温馨提醒
        (初始化过的类必须要在第二个类之前，也就是要先添加观察者，才能够调用)<br><br><br><br>


####版本
#####最新版本 : 1.0.0
添加内容: 实现单值传送和无值传送观察者模式
