---
title: "--嵌套表配置"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-web/04-qiantaobiaopeizhi"
section: "Web组件"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, Web组件]
platform_version: "BIP V5"
source_type: mdf-docs
images: 3
---

# --嵌套表配置

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-web/04-qiantaobiaopeizhi | 所属：Web组件

# [](#嵌套表配置)嵌套表配置

1、表格实体：父表实体、嵌套表实体；

2、嵌套表(孙表)配在父表下边：

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/qiantaobiaopeizhiimg1.b02bb63b.png)

3、父表需要配置属性，在cExtProps里配

{"multiRowModel": true, "suitetable": "嵌套表的childrenfield",
"suitetableHideHeader":"是否隐藏嵌套表表头", autoSelectSuitetable:
false}

||multiRowModel||true|||
||suitetable||嵌套表的childrenfield|||
||suitetableHideHeader||是否隐藏嵌套表表头，默认显示|||
||autoSelectSuitetable||表格行选中时内外层表是否联动|||

4、嵌套表数据在父表中返回

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/qiantaobiaopeizhiimg2.1b1ce0a9.png)

5、嵌套表模型没有挂载在viewmodel上，需要用父表模型中取嵌套表模型

父表model.getRowModel(index).get('嵌套表的childrenfield');

6、嵌套表是独立的表格，支持表格组件的事件。

7、列表页、卡片页都支持嵌套表。

8、嵌套表最大10行内容的高度，超出的部分嵌套表会有滚动条。

9、领域开发实例，实名感谢领域开发刘强同学

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/qiantaobiaopeizhiimg3.b4beb704.png)