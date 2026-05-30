---
url: https://community.yonyou.com/datadict/bipbook/chapter2501/chapter2501.html
title: "Action鉴权注册 | YonBIP高级版"
description: "YonBIP高级版电子书"
language: "zh"
captured_at: "2026-05-29T18:28:08.551Z"
---

# Action鉴权注册 | YonBIP高级版

[Skip to content](https://community.yonyou.com/datadict/bipbook/chapter2501/chapter2501.html#VPContent)

## Action鉴权注册

## Action鉴权说明

- 作用：通过 appCode 限定各个应用能够调用的 Action，应用只能调用有权限的 Action，避免跨业务边界越权进行业务方法的调用。
- 流程：
	1. 登录相关请求，跳过鉴权；
		2. 打印下载等form请求，跳过鉴权；
		3. 平台请求（部分不需要鉴权），跳过鉴权；
		4. 白名单请求，跳过鉴权；
		5. 开放服务（\*），跳过鉴权；
		6. 校验appcode对应有权地址集合是否包含当前请求地址。包含，鉴权通过，执行后续校验；不包含，鉴权不通过，提示权限异常。
- 中间件服务启动成功后，加载appcode和有权地址集合的键值对到缓存中，用于权限校验。

![](https://community.yonyou.com/datadict/bipbook/assets/%E9%89%B4%E6%9D%83%E6%B5%81%E7%A8%8B.DRwgGYCt.png)

## 配置方式

- 开发环境下鉴权文件位置： hotwebs\\nccloud\\WEB-INF\\extend\\yyconfig\\modules\\module\\component\\config\\authorize\*.xml
- 扩展名为xml文件的鉴权文件内容包括：
	1. authorizes、authorize，鉴权文件格式限定标签；
		2. appcode标签的内容为对actions标签中的请求地址有权限的应用编码，以逗号分隔。配置为\*代表开放请求，不进行鉴权操作；
		3. actions标签，appcode标签中有权限的应用编码对应的请求地址集合；
		4. action标签，appcode标签中有权限的应用编码对应的请求地址，和前端发送ajax请求时的请求路径中.do扩展名向前三段的编码保持一致，并使用”.”替换”/”。 例如： 前端ajax的请求路径为：/nccloud/uapbd/custclass/enablestate.do，那么action标签的内容为：uapbd.custclass.enablestate

![](https://community.yonyou.com/datadict/bipbook/assets/%E9%89%B4%E6%9D%83%E6%96%87%E4%BB%B6%E8%B7%AF%E5%BE%84.BGKlDX5P.png)

![](https://community.yonyou.com/datadict/bipbook/assets/%E9%89%B4%E6%9D%83%E6%96%87%E4%BB%B6%E5%86%85%E5%AE%B9.C1zogI1L.png)

- 为单个应用配置有权地址，appcode为应用编码

![](https://community.yonyou.com/datadict/bipbook/assets/%E5%8D%95%E5%BA%94%E7%94%A8%E9%89%B4%E6%9D%83.DVQkTFfh.png)

- 为多个应用配置有权地址，appcode为应用编码集合，使用”,”分隔

![](https://community.yonyou.com/datadict/bipbook/assets/%E5%A4%9A%E5%BA%94%E7%94%A8%E9%89%B4%E6%9D%83.C2zq3K9s.png)

- 配置”\*”则为开放请求，不进行鉴权操作

![](https://community.yonyou.com/datadict/bipbook/assets/%E5%BC%80%E6%94%BE%E9%89%B4%E6%9D%83.BhVhl40r.png)

## 平台实现

- 权限校验由配置在web.xml中的过滤器完成，web.xml文件路径为：home/hotwebs/ncloud/WEB-INF/web.xml
	1. userAppFilter实现用户权限校验功能；
		2. appActionFilter实现应用权限校验功能；
		3. filter-mapping标签规定了过滤器的执行顺序；
		4. NCCloudContextListener监听器实现了加载appcode和其有权地址集合的键值对到缓存；
		5. EntryController为高级版系列产品响应前端请求的控制器。

![](https://community.yonyou.com/datadict/bipbook/assets/Web%E9%85%8D%E7%BD%AE.CLdOP_XL.png)

- 需要配置在鉴权文件中的请求路径的条件：
	1. 需要对appcode中的应用编码有权；
		2. 非平台通用请求。

![](https://community.yonyou.com/datadict/bipbook/assets/%E9%89%B4%E6%9D%83%E6%96%87%E4%BB%B6%E5%86%85%E5%AE%B9.C1zogI1L.png)

- 平台通用请求格式为：
	1. action路径.do扩展名的前三段编码中以platform开头的路径，前两段为platform.appregister或platform.templet或platform.template的路径除外；
		2. action路径.do扩展名的前三段编码中以uapbd.refer、uapbd.org开头的路径。
- 二次开发需要将新增的请求路径补充到鉴权文件的actions标签中，否则会出现权限异常的提示。

![](https://community.yonyou.com/datadict/bipbook/assets/%E9%80%9A%E7%94%A8%E8%AF%B7%E6%B1%82.BCiwzHw8.png)