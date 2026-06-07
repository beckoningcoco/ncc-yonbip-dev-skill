---
title: "--查询方案平铺展现"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-web/05-chaxunfanganpingpuzhanxian"
section: "Web组件"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, Web组件]
platform_version: "BIP V5"
source_type: mdf-docs
images: 4
---

# --查询方案平铺展现

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-web/05-chaxunfanganpingpuzhanxian | 所属：Web组件

# [](#查询方案平铺展现)查询方案平铺展现

## [](#1-效果图)1. 效果图

有数字样式：

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/ChaXunFangAnPingPuZhanXianimage1.b3bdb74c.png)

无数字样式：

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/ChaXunFangAnPingPuZhanXianimage2.7e72ee20.png)

## [](#2-配置方式)2. 配置方式

如上图，查询方案由下拉列表样式转换成平铺样式，只需要预制多个查询方案，然后在查询区的cStyle中配置{flatScheme:
true}即可

如果想展示数字，请注意，如果开始查数量开关，可能会有性能问题，尤其是方案数量多或者方案内条件多的场景可能会对服务稳定性造成影响，因此酌情开启该开关。开启查数开关只需要在cStyle中配置{hasSolutionNum:
true}即可

### [](#21-图标配置)2.1. 图标配置

图标资源已经支持读取扩展工程的图标资源，如何扩展请参考文档[领域图标资源扩展（彩色图标）](#/guides/03-lingyutubiaoziyuankuozhan)

配置图标需要在pb_filter_solution表中对应查询方案的cExtProps中配置{icon:'XXX', fontFamily: 'XXX'}

不过，你可能有个疑问，那用户新增的方案怎么办？图标怎么来？

目前新增方案没支持图标选择，因此新增的方案图标都是上图中的蓝色图标![](data:image/png;base64,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)

### [](#22-tips配置)2.2. tips配置

配置tips也同样简单，依旧是在pb_filter_solution表对应的查询方案的cExtProps中配置{tips:
'对应前端中文的多语资源id'}，这个资源id需要提前抽取，但注意，一定得是前端多语，如果上生产或者下沉专属化，请同步多语资源。

### [](#23-分组配置)2.3. 分组配置

配置分组和上文提到的配置都在一个地方，在pb_filter_solution表对应的查询方案的cExtProps中配置{groupKey:
'XXX'}，把你想分到一组的方案，配成相同的value即可。

用户新增的方案没有groupKey，因此如果分组了，会将用户新增的方案归到最后一组中追加。

## [](#3-常见问题)3. 常见问题

Q:像这种需要部分数量显示部分隐藏该怎么做？

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/ChaXunFangAnPingPuZhanXianimage4.63b3583d.png)
A: 在对应方案的cExtProps中配置{"skipGetSolutionNum": true}即可

Q: 如何手动触发一次数量查询请求？
A：可以通过下面扩展代码实现：

filterViewModel.execute('getSolutionNum') // 不传参数查所有方案的数量

filterViewModel.execute('getSolutionNum', [solutionInfo]) // 传入数组可以指定查某些方案的数量

 

// SolutionInfo数据示例：

{

 "id": "1623476274906791939", // 必需 方案id

 "filtersId": 117584272, // 必需

 "solutionName": "默认方案11",

 "solutionNameResid": "UID:C_GZTTMP_0000LC5NLRD4GPBAR40000_1A259DC00AC00003",

 "isDefault": 0,

 "isPublic": 1,

 "orderId": 0,

 "terminalType": "1",

 "tenantId": 3095114733916816,

 "solutionNameMultiLang": {

 "zh_TW": "默認方案",

 "en_US": "Default Scheme",

 "zh_CN": "默认方案11",

 "ja_JP": "默认方案11"

 },

 "cExtProps": "{\"isInitLoadData\":false}",

 "serviceCode": "st_purchaseorderlist"

}

Q: 租户级模板怎么关闭平铺能力/隐藏数量？
A：可以通过下面租户级扩展代码实现（通过UI模板写租户级脚本请咨询本领域开发）：

FilterViewModel.on('afterInit', () => {

 FilterViewModel.getParams().hasSolutionNum = false // 隐藏数量

 FilterViewModel.getParams().flatScheme = false // 关闭方案平铺能力

})

Q: 如何在某些条件变更的时候（比如导航区条件）想更新一下数量？
A: 在导航区条件改变的时候，更新数量即可（自定义过滤条件不行）

// 看上文的示例代码，触发数据更新的逻辑，写在导航区字段的afterValueChange里头即可，导航区字段可以通过下面的代码获取

FilterViewModel.getCache('filterTreeFields')

有问题联系[zhanghaoaq@yonyou.com](mailto:zhanghaoaq@yonyou.com)，持续更新。