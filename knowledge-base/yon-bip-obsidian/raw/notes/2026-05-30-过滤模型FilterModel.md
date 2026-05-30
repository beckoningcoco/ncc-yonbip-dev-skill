---
url: https://c2.yonyoucloud.com/iuap-hc-client/ucf-wh/client/index.html#/detail/SJMX-FilterModel1?nodeId=5a2c14c6-7e6b-483b-976c-3b404e123a12&productline=CommunityDoc&type=enableDoc&localeHelp=zh_CN
title: "YonBIP社区文档中心"
language: "zh-CN"
captured_at: "2026-05-29T16:56:04.465Z"
---

# YonBIP社区文档中心

![logo](https://design.yonyoucloud.com/static/ucf/iuap-hc-client-fe/latest/client/assets/images/biplogo.fa4fb30c.svg)

社区文档中心

![avator](https://design.yonyoucloud.com/static/ucf/iuap-hc-client-fe/latest/client/assets/images/avatar.d348c3b4.svg) 未登录

## 过滤模型 FilterModel

最后更新时间：2025-11-14

![](https://design.yonyoucloud.com/static/ucf/iuap-hc-client-fe/latest/client/assets/images/share.2570fc0c.svg)

## 概述

## 适用场景

| **部署方案** | **开发类型** | **是否适用** |
| --- | --- | --- |
| 公有云 | 客户化定制开发 | *是* |
| 私有云 | 客户化定制开发 | *是* |
| 专属云 | 客户化定制开发 | *是* |
| 本地部署 | 客户化定制开发 | *是* |
| 公有云 | ISV生态开发 | *是* |
| 私有云 | ISV生态开发 | *是* |
| 专属云 | ISV生态开发 | *是* |
| 本地部署 | ISV生态开发 | *是* |

## 业务场景

本文主要讲解FilterModel（过滤）模型系统预制的方法及事件，通过该文档您将学习到在YonBuilder（可视化应用构建）中FilterModel（过滤）模型如何使用。

MDF官方文档-数据模型： [过滤模型 FilterModel](https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/api/02-filter-model "过滤模型 FilterModel")

## 关键词

FilterModel模型、过滤模型、FilterModel方法、FilterModel事件、查询区模型

## 如何获取FilterModel（过滤）模型

获取FilterModel（过滤）模型的之前需要先获取查询区容器模型，然后才可以获取到FilterModel（过滤）模型。

```
viewModel.on('afterMount', function (data) {
    //1、获取查询区模型
    let filterViewModelInfo = viewModel.getCache('FilterViewModel');
    //2、查询区afterInit事件，必须放在页面模型的afterMount事件中才生效
filterViewModelInfo.on('afterInit', function(data){
    //3、获取过滤模型，cItemName：字段的字段别名
        let filterModelInfo = filterViewModelInfo.get('cItemName');
    })
});
```

## FilterModel（过滤）模型预制方法

## 3.1、getFromModel()

**方法：getFromModel()**

**使用说明：** FilterModel的 **getFromModel()** 方法，用于获取查询区字段模型。

**参数：** 无

**示例代码：**

FilterModel.**getFromModel** ();

## 3.2、getToModel()

**方法：** getToModel()

**使用说明：** FilterModel的getToModel()方法，用于获取过滤结束 model，只存在于区间类过滤 如开始-结束日期。

**示例代码：**

FilterModel.getToModel();

## 3.3、getFromDisplayModel()

**方法：** getFromDisplayModel()

**使用说明：** FilterModel的getFromDisplayModel()方法，用于获取过滤显示 model。

**示例代码：**

FilterModel.getFromDisplayModel();

## 3.4、getDirtyData()

**方法：** getDirtyData()

**使用说明：** FilterModel的getDirtyData()方法，用于获取脏数据。

**示例代码：**

FilterModel.getDirtyData();

## 3.5、getData(value)

**方法：** getData(value)

**使用说明：** FilterModel的getData(value)方法，用于获取数据。

**参数：**

| **参数** | **属性含义** | **值类型** | **说明** |
| --- | --- | --- | --- |
| value | value=> true 脏数据value=> false 全部数据 | Array |  |

**示例代码：**

//value=> true 脏数据value=> false 全部数据

FilterModel.getData(value);

## 问题1：查询条件设置默认值

答：

1. 详细示例见下方代码：
```
viewModel.on('afterMount', function (data) {
    //1、获取查询区模型
    let filterViewModelInfo = viewModel.getCache('FilterViewModel');
    //2、查询区afterInit事件，必须放在页面模型的afterMount事件中才生效
filterViewModelInfo.on('afterInit', function(data){
    //3、获取过滤模型，cItemName：字段的字段别名
        let filterModelInfo = filterViewModelInfo.get('cItemName');
       // 4、获取真实模型，赋值
        filterModelInfo.getFromModel().setValue('111');
    })
});
```

## 问题2：如何取消单据自动查询功能

答：

1. 详细示例见下方代码：

viewModel.getParams().autoLoad = false;

## 问题3：查询区搜索前，修改请求参数？

答：

1. 详细示例见下方代码：
```
//点击查询区搜索按钮前，将字段参数传入
viewModel.on('beforeSearch', function (args) {
   //设置具体的查询条件
   var condition = {
      "isExtend": true,
       simpleVOs: []
   };
   //字段stopstatus等于0的数据进行查询
   condition.simpleVOs.push({
       field: 'stopstatus',
       op: 'eq',
       value1: 0
   });
});
```

## 问题4：如何手动触发搜索？

答：

1. 详细示例见下方代码:

viewmodel.get('search').fireEvent('click', { solutionid: schemeId});

## 问题5：如何默认展示多行查询条件？

答：

1. 详细示例见下方代码：

viewModel.getParams().filterRows = 3;// 默认展示的行数

页内目录

1\. 概述

1.1 适用场景

1.2 业务场景

1.3 关键词

2\. 如何获取FilterModel（过滤）模型

3\. FilterModel（过滤）模型预制方法

3.1 3.1、getFromModel

3.2 3.2、getToModel

3.3 3.3、getFromDisplayModel

3.4 3.4、getDirtyData

3.5 3.5、getData(value)

3.6 问题1：查询条件设置默认值

3.7 问题2：如何取消单据自动查询功能

3.8 问题3：查询区搜索前，修改请求参数？

3.9 问题4：如何手动触发搜索？

3.10 问题5：如何默认展示多行查询条件？

文档反馈

返回顶部