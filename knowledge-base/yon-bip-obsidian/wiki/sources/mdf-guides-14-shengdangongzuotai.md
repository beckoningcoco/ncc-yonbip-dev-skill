---
title: "生单工作台"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/14-shengdangongzuotai"
section: "指南"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 指南]
platform_version: "BIP V5"
source_type: mdf-docs
images: 2
---

# 生单工作台

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/14-shengdangongzuotai | 所属：指南

# [](#生单工作台)生单工作台

## [](#faq)FAQ

### [](#q1-生单工作台保存完一单想停留到当前单据)Q1: 生单工作台保存完一单，想停留到当前单据？

**A: 生单工作台保存完一单，默认是跳转到下一单，
如果想停留到当前单据，需要开启前端特性开关： bWorkbenchNoNext**

**这个开关开启后， 单据全部保存完也会停留到当前工作台**

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/shengdangongzuotai_image1.f06c49a4.png)

### [](#q2-生单工作台保存完当前单据界面上不想保留展示这单数据-即保存成功就删除这一单据怎么办)Q2: 生单工作台保存完当前单据，界面上不想保留展示这单数据， 即保存成功就删除这一单据，怎么办？

**A: 生单工作台成功保存当前单据，默认是不删除当前单据，
如果想删除，需要开启前端特性开关：bWorkbenchDisappear**

### [](#q3-判断当前是否在生单工作台界面)Q3: 判断当前是否在生单工作台界面？

**A: 示例：vm.getCache('isInWorkBench') 返回true代表在生单工作台**

### [](#q4-下推多单没有打开生单工作台界面)Q4: 下推多单没有打开生单工作台界面？

**A: 打开生单工作台界面需要2个必要条件**

- 

下推接口返回的dimenstioKeys包含多条数据

- 

commond表的cSvcUrl字段里需要携带groupCode

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/shengdangongzuotai_image2.67b00186.png)

### [](#q5-生单工作台无法统计信息提示共处理0条数据成功0条数据失败0条数据)Q5: 生单工作台无法统计信息，提示"共处理0条数据，成功0条数据，失败0条数据？

**A: 修改生单工作台pushCodeField**

当生单工作台无法统计信息，提示"共处理0条数据，成功0条数据，失败0条数据。"，说明当前单据主表中没有code属性，此时需要添加code属性
或 通过pushCodeField配置唯一的Key

需要区别列表和卡片的下推，配置按钮的cParameter

**voucherlist（列表）:**

// 给生单的按钮设置参数 bill_code只是假设字段 （bill_toolbaritem

 表的parameter字段）

  

 parameter: "{"pushCodeField":"bill_code"}"

**voucher（卡片）:**

// 给生单的按钮设置参数 bill_code只是假设字段（bill_commond

 表的parameter字段） 

 parameter: "{"pushCodeField":"bill_code"}"

### [](#q6-保存全部功能考虑领域页面异步接口的返回时间发起下一次保存暂时由具体场景决定)Q6: 保存全部功能，考虑领域页面异步接口的返回时间，发起下一次保存暂时由具体场景决定？

**A: 扩展脚本监听beforeDimensionClick 配置数据收集间隔时间 单位ms**

// 示例 

 vm.on('beforeDimensionClick', (data)=>{ 

 

      data.timer = 3000 

 

})