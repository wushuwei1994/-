1、request.getRequestURL()

返回的是完整的url，包括Http协议，端口号，servlet名字和映射路径，但它不包含请求参数。

2、request.getRequestURI()

得到的是request URL的部分值，并且web容器没有decode过的

3、request.getContextPath() 

返回 the context of the request.

4、request.getServletPath() 

返回调用servlet的部分url.

5、request.getQueryString() 

返回url路径后面的查询字符串

示例：

```
当前url：http://localhost:8080/CarsiLogCenter_new/idpstat.jsp?action=idp.sptopn
request.getRequestURL() http://localhost:8080/CarsiLogCenter_new/idpstat.jsp
request.getRequestURI() /CarsiLogCenter_new/idpstat.jsp
request.getContextPath()/CarsiLogCenter_new
request.getServletPath() /idpstat.jsp
request.getQueryString()action=idp.sptopn
```