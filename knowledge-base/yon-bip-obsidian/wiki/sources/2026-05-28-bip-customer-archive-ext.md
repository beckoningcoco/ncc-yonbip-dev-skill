---
title: 客户档案扩展开发
source: https://c2.yonyoucloud.com/iuap-hc-client/ucf-wh/client/index.html#/detail/BPKZKF11
author: 张宏涛
date: 2025-09-23
ingested: 2026-05-28
tags: [原厂扩展, 客户档案, 实体扩展, 页面扩展, 动作扩展]
images: 35
image_paths: []
---

# 客户档案扩展开发

> YonBIP 标准产品原厂扩展开发实战指南：以"客户档案"为例，涵盖实体扩展、页面扩展、代码扩展的完整流程。

## 适用场景

适用于**所有部署方案**（公有云/私有云/专属云/本地部署）的客户化定制和 ISV 生态开发。

## 业务场景

1. **实体扩展字段**：通过特征扩展"是否特殊客户"（布尔类型）和"特殊客户说明"两个字段
2. **主实体扩展新子表**：通过元数据平行表扩展子表"客户关系维护经理"，字段：姓名、手机号、是否默认
3. **原厂页面扩展**：新增子实体需手工配置 UI 模板

## 代码扩展

### 前端代码校验

页面加载时，根据"是否特殊客户"值控制"特殊客户说明"的可用状态：

```javascript
viewModel.on('customInit', function (data) {
  viewModel.on('afterLoadData', function (data) {
    viewModel.get("extendNote").setDisabled(true);
  });
});
```

### 调用后端脚手架接口校验

保存前通过 `cb.rest.DynamicProxy` 调用后端接口进行校验：

```javascript
viewModel.on('beforeSave', function (args) {
  let promises = [];
  promises.push(beforeSaveCheck());
  let returnPromise = new cb.promise();
  Promise.all(promises).then(() => {
    this.setFilter({ isExtend: true, simpleVOs: [] });
    returnPromise.resolve();
  });
  return returnPromise;
});

let beforeSaveCheck = function () {
  return new Promise(function (resolve) {
    var queryProxy = cb.rest.DynamicProxy.create({
      settle: {
        url: '/vd1/beforeSaveCheck',
        method: 'POST',
        options: { domainKey: '引擎编码', async: false },
      },
    });
    var paramsQuery = {
      extendSpecial: viewModel.get("extendSpecial").getValue(),
      extendNote: viewModel.get("extendNote").getValue()
    };
    var checkResult = queryProxy.settle(paramsQuery);
    // 错误处理...
    resolve();
  });
}
```

### 后端规则函数校验

场景：保存/更新客户档案时，校验扩展字段"是否特殊客户"为是时"特殊客户说明"必填。

### Java 规则类扩展

在服务脚手架 `service` 工程中增加 Java 规则类，实现 `IRuleValidator` 接口，用于后端校验。

## 关键词

原厂应用扩展、实体扩展、子实体扩展、页面扩展、动作扩展、按钮扩展

## 与其他文档关联

- [[BIP后端开发模板]] — 后端校验/规则函数模板
- [[BillPlugin扩展]] — 插件钩子扩展
- [[API调用]] — DynamicProxy 调用模式
