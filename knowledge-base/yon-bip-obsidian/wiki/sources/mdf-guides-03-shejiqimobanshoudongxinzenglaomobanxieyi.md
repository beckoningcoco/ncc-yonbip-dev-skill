---
title: "设计器模板手动新增老模板协议"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/03-shejiqimobanshoudongxinzenglaomobanxieyi"
section: "指南"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 指南]
platform_version: "BIP V5"
source_type: mdf-docs
images: 1
---

# 设计器模板手动新增老模板协议

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/03-shejiqimobanshoudongxinzenglaomobanxieyi | 所属：指南

# [](#设计器模板手动新增老模板协议)设计器模板手动新增老模板协议

1 删除子集页签下tabpane生成的默认模板 tabpane手动插入
cardboxgroup和toolbar

cardboxgroup**绑定childrenField** 下面依次插入cardbox flex
flex下面放具体子表字段 **cardbox flex都需要绑定childrenField**

toolbar**绑定childrenField**下面放增行按钮 增行绑定addrow事件

2 手动增加子页面 插入cardbox 和footer组件

对于子页面groupcontainer
cgroupCode需要与子表**childrenField保持一致，并在协议中关联childrenField字段**

cardbox 插入flex flex下面放子表具体字段 **cardbox
flex都需要绑定childrenField**

footer下面放toolbar 托人取消和确定按钮 都绑定前端动作 closepgae **注
取消事件需要填入子容器名称 确定不需要**

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/shejiqimobanshoudongxinzenglaomobanxieyi_image1.dcec0165.png)