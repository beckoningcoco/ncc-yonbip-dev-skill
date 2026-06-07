---
title: "图表组件 Analysis"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-web/05-analysis"
section: "Web组件"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, Web组件]
platform_version: "BIP V5"
source_type: mdf-docs
images: 4
---

# 图表组件 Analysis

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-web/05-analysis | 所属：Web组件

## [](#图表组件-analysis)图表组件 Analysis

### [](#1-单据事例)1. 单据事例

单据地址：
[https://测试环境/mdf-node/meta/voucherlist/mdd_echarts?domainKey=iuap-metadata-mdd](https://%E6%B5%8B%E8%AF%95%E7%8E%AF%E5%A2%83/mdf-node/meta/voucherlist/mdd_echarts?domainKey=iuap-metadata-mdd)

### [](#2-ccontroltype)2. cControlType

cControlType: 'analysis'

数据模型：ListModel

### [](#3-pie饼图组件)3. pie饼图组件

#### [](#31-组件展示)3.1. 组件展示

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/AnalysistubiaozujianWebimage1.4949d013.png)![](data:image/png;base64,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)

#### [](#32-参数配置)3.2. 参数配置

cstyle中配置

||属性名称||属性含义||值类型||属性说明|
||type||'pie'||string||饼图设置‘pie’|
||color||颜色||array||默认使用echarts默认提供的颜色|
||itemsConfig||设置echarts除series以外的属性||object||默认{}|
||seriesItemsConfig||设置series的属性||object||默认{}|

#### [](#33-使用说明)3.3. 使用说明

1.组件接收数据

||属性名称||属性含义||值类型||属性说明|
||value||组件渲染需要的数据||array||二维数组，为了能同时渲染多组件|

2.value示例

const value = [ // 二维数组

 [

 { value: 75, name: '累计收款金额' },

 { value: 25, name: '累计付款金额' },

 { value: 25, name: '累计付款金额1' }

 ],

 ],

### [](#4-line折线图组件)4. line折线图组件

#### [](#41-组件展示)4.1. 组件展示

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/AnalysistubiaozujianWebimage3.b790b736.png)

#### [](#42-参数配置)4.2. 参数配置

cstyle中配置

||属性名称||属性含义||值类型||属性说明|
||type||'pie'||string||饼图设置‘pie’|
||color||颜色||array||默认使用echarts默认提供的颜色|
||itemsConfig||设置echarts除series以外的属性||object||默认{}|
||seriesItemsConfig||设置series的属性||object||默认{}|

#### [](#43-使用说明)4.3. 使用说明

1.组件接收数据

||属性名称||属性含义||值类型||属性说明|
||value||组件渲染需要的数据||array||二维数组，为了能同时渲染多组件|

2.value示例

const value = [ // 二维数组

 [

 { value: 75, name: '累计收款金额' },

 { value: 25, name: '累计付款金额' },

 { value: 25, name: '累计付款金额1' }

 ],

 ],

### [](#5-环型组件)5. 环型组件

#### [](#51-组件展示)5.1. 组件展示

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/AnalysistubiaozujianWebimage4.335c0478.png)

#### [](#52-参数配置)5.2. 参数配置

cstyle中配置

||属性名称||属性含义||值类型||属性说明|
||type||'circle'||string||环形设置‘circle’|

#### [](#53-使用说明)5.3. 使用说明

1.组件接收数据

||属性名称||属性含义||值类型||属性说明|
||value||组件渲染需要的数据||array||二维数组，为了能同时渲染多组件|

2.value示例

const value = [ // 二维数组

 [

 { value: 75, name: '累计收款金额' },

 { value: 25, name: '累计付款金额' }

 ],

 ],

### [](#6-智能分析组件)6. 智能分析组件

#### [](#61-组件展示)6.1. 组件展示

no

#### [](#62-参数配置)6.2. 参数配置

cstyle中配置

||属性名称||属性含义||值类型||属性说明|
||type||'analysis'||string||智能分析设置“analysis”|