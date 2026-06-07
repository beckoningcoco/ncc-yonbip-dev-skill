---
title: "多语词条拼接解决方案（旧）"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/20-duoyucitiaopinjiejiejuefangan"
section: "指南"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 指南]
platform_version: "BIP V5"
source_type: mdf-docs
images: 3
---

# 多语词条拼接解决方案（旧）

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/20-duoyucitiaopinjiejiejuefangan | 所属：指南

# [](#多语词条拼接解决方案旧)多语词条拼接解决方案（旧）

**MDF 框架内解决词条拼接问题**

## [](#api)API

||API||说明||类型||默认值/参数|
||cb.locale（非MDF工程用lang.locale）||统一处理多语词条拼接问题||function(string,obj)||function(key,data)key:对应多语服务的词条编码data: 当前词条中需要插入的变量|

示例一:

**普通词条**

let text = "确定要删除XX员工吗?"

- 先拼接处词条 ： let text = "确定要删除<%=abandonText%>员工吗?"
- 在多语服务中心添加一条词条。(翻译找李军进行翻译)

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/duoyucitiaopinjiejiejuefangan(jiu)_image1.4088294e.png)

- 调用 cb.locale('P_YS_FED_FW_0001026038',{abandonText:text})（非MDF工程用lang.locale）即可(API中已经做了为空处理)。
- 如果你要是修改MDF框架的代码，需要你把当前词条复制到 cb.locale.js 中。

词条导入问题找(赵东升)

示例二:

**包含多个词条处理。**

P_YS_FED_XX_0001026024: '<%=text%> 上传失败！<%=code%> : <%=message%>',

调用

cb.locale('P_YS_FED_XX_0001026024',{text:"xx",code:'xx',message:'xx'})（非MDF工程用lang.locale）

示例三

**内容想多的多个词条。**

P_YS_FED_XX_0001026052: '该操作将会删除当前<%=text%>及其子<%=text%>，是否继续?'

调用 cb.locale('P_YS_FED_XX_0001026052',{text:"xx"})（非MDF工程用lang.locale）

**测试环境导入到资源中心**

登陆测试环境，打开[https://bip-test.yyuap.com/iuap-apcom-i18n/ucf-wh/index.html#/dev](https://bip-test.yyuap.com/iuap-apcom-i18n/ucf-wh/index.html#/dev)

如果是多语新模型打开[https://bip-test.yyuap.com/iuap-apcom-i18n/ucf-wh/vendor/index.html#/dev](https://bip-test.yyuap.com/iuap-apcom-i18n/ucf-wh/vendor/index.html#/dev)

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/duoyucitiaopinjiejiejuefangan(jiu)_image2.6228af6e.png)

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/duoyucitiaopinjiejiejuefangan(jiu)_image3.ab5c94b0.png) 

确定后会返回一个资源编码P_YS_FED_FW_1680048029250879496

源码中写上cb.locale('P_YS_FED_FW_1680048029250879496',{num:"xx"})（非MDF工程用lang.locale）