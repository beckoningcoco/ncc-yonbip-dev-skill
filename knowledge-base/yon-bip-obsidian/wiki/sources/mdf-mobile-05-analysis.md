---
title: "图表组件 Analysis"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-mobile/05-analysis"
section: "移动组件"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 移动组件]
platform_version: "BIP V5"
source_type: mdf-docs
images: 6
---

# 图表组件 Analysis

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-mobile/05-analysis | 所属：移动组件

# [](#图表组件-analysis)图表组件 Analysis

数据模型：ListModel

## [](#1-circle进度组件)1. circle进度组件

### [](#11-组件展示)1.1. 组件展示

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/Analysistubiaozujian_image1.31484ef5.png)![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/Analysistubiaozujian_image2.1b4d6899.png)![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/Analysistubiaozujian_image3.00469ff8.png)![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/Analysistubiaozujian_image4.c0dedc77.png)

### [](#12-基本属性-cstyle)1.2. 基本属性 cStyle

||属性名称||属性含义||值类型||属性说明|
||属性名称||属性含义||值类型||属性说明|
||type||'circle'||string||环形进度表只能设置‘circle’|
||color||定义环的颜色||array||默认值['#4D86F0', '#F0F0F0']如实例所示颜色，灰色也要设置|
||showTitle||是否展示'完成率'位置的文字||boolean||默认true|
||show100PercentTitle||进度100%的时候是否展示‘完成’||string||默认 '完成'|
||itemsConfig||设置echarts除series以外的属性||object||默认{}|
||seriesItemsConfig||设置series的属性||object||默认{}|
||showBottomTitle||是否展示‘记录人’文字||object||默认true，展示取cShowCaption字段|
||successColor||100%以后展示颜色||string||默认‘#1CD797’上图绿色|
||style||图表大小||object||默认 {width:'70px',height:'70px' }|
||className||'.pie-containers'元素的class||string||领域可以自己扩展样式控制元素的展示|
||bottomTitleFontSize||底部'记录人'位置文字大小||string||默认0.2rem相当于375px的屏幕10px|
||percentFontSize||环形中间的文字大小||string||默认0.2rem相当于375px的屏幕10px|

扩展属性 seriesItemsConfig

||属性名称||属性含义||值类型||属性说明|
||属性名称||属性含义||值类型||属性说明|
||radius||圆环的粗度||array||默认['85%', '100%'] , 85%表示距离中心的位置，越大越细|

### [](#13-使用说明)1.3. 使用说明

#### [](#131-1组件接收数据)1.3.1. 1、组件接收数据

||属性名称||属性含义||值类型||属性说明|
||属性名称||属性含义||值类型||属性说明|
||value||组件渲染需要的数据||array||二维数组，为了能同时渲染多组件|

#### [](#132-2value示例)1.3.2. 2、value示例

**二维数组**

const value = [[

 { value: 80, name: '完成率', title: '记录人', showValue: '自定义' }, 上面第四张图展示

 { value: 20, name: '未完成', title: '记录人' }

], [

 { value: 80, name: '完成率', title: '记录人1' },

 { value: 20, name: '未完成', title: '记录人1' }

]];

### [](#14-数据要求)1.4. 数据要求

数据要领域自行计算完传入，进度中间显示的'80%'取第一条数据的80展示，数据加起来要等于100

## [](#2-stackingbar堆叠表)2. stackingbar堆叠表

### [](#21-组件展示)2.1. 组件展示

![](data:image/png;base64,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)

### [](#22-基本属性-cstyle)2.2. 基本属性 cStyle

||属性名称||属性含义||值类型||属性说明|
||属性名称||属性含义||值类型||属性说明|
||type||'stackingbar'||string||堆叠表只能设置‘stackingbar’|
||color||颜色||array||默认值['#1CD797', '#0086FF', '#FF5735', '#ee6666', '#73c0de', '#3ba272', '#fc8452', '#9a60b4', '#ea7ccc'];|
||itemsConfig||设置echarts除series以外的属性||object||默认 {}|
||style||图表大小||object||默认 {height:20 }|
||barWidth||图表的bar宽度||number||默认 8|

### [](#23-使用说明)2.3. 使用说明

1、组件接收数据

||属性名称||属性含义||值类型||属性说明|
||属性名称||属性含义||值类型||属性说明|
||value||组件渲染需要的数据||array||二维数组，为了能同时渲染多组件|

2、value示例

**二维数组**

const value = [[

 { value: 10, name: '完成率', color: 'red' }, // 进度颜色自定义

 { value: 25, name: '未完成', color: 'green' },

 { value: 25, name: '待进行', color: 'blue' },

]],

3、数据要求

数据要领域自行计算完传入，进度中间显示的'80%'取第一条数据的80展示，数据加起来要等于100

## [](#3-barchart-进度图)3. BarChart 进度图

### [](#31-组件展示)3.1. 组件展示

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/Analysistubiaozujian_image6.0b0827ba.png)

### [](#32-基本属性-cstyle)3.2. 基本属性 cStyle

||属性名称||属性含义||值类型||属性说明|
||属性名称||属性含义||值类型||属性说明|
||type||'bar'||string||进度图只能设置‘bar’|
||color||颜色||array||默认['#0086FF']|
||itemsConfig||设置echarts除series以外的属性||object||默认{}|
||style||图表父容器样式||object||eg： {height: '20px'}|
||barWidth||图表的bar宽度||number||默认8|

### [](#33-使用说明)3.3. 使用说明

1、组件接收数据

||属性名称||属性含义||值类型||属性说明|
||属性名称||属性含义||值类型||属性说明|
||value||组件渲染需要的数据||array||二维数组，为了能同时渲染多组件|

2、value示例

**二维数组**

const value = [

 [{ value: 80, name: '完成率'}], // 图（1）第一个进度条

 [{ value: 80, name: '完成率', showValue: '4.2万/3.2万'}], // 图（1）第二个进度条

];

name: 左侧展示

value: 进度

showValue: 有就用展示右边占位，没有展示 (value'%')