---
title: 汇率计算使用指南
source: https://c2.yonyoucloud.com/iuap-hc-client/ucf-wh/client/index.html#/detail/QQH-HLJS1
date: 2025-11-21
ingested: 2026-05-28
tags: [汇率, 全球化, 标价法, OpenAPI]
images: 20
image_paths: []
---

# 汇率计算使用指南

> YonBIP 汇率计算新功能：支持指定标价法的汇率计算，区分乘/除汇率。

## 适用场景

仅适用**公有云**。私有云/专属云/本地部署不适用。

## 核心概念

- **汇率标价法**：直接汇率 vs 间接汇率，决定是乘还是除汇率值
- **汇率折算方式**：1 = 乘以汇率，否则 = 除以汇率
- **参数**："汇率计算支持指定标价法" — 新租户默认开启，历史租户默认关闭，开启后**不可逆**

参数路径：数字化建模 → 参数设置 → 租户级参数 → 应用平台 → 基础数据 → 公共信息

## 新旧模型对比

| 维度 | 旧模型（参数=否） | 新模型（参数=是） |
|------|-------------------|-------------------|
| 计算方式 | 始终乘以汇率值（含反算值） | 按标价法决定乘或除 |
| 反算逻辑 | 自动反算另一个汇率值 | 不再反算，使用用户指定的汇率 |
| 字段 | 无汇率折算方式 | 增加 `exchRateOps` 字段 |
| 历史租户 | 默认使用 | 需确认客开点后手动开启 |

## UI 模板公式

```
iif(
  exchRateOps == 1,
  purchaseOrders.oriSum * exchRate,
  purchaseOrders.oriSum / exchRate
)
```

## 自建单据接入

### 对象建模需添加字段

| 字段 | 类型 | URI |
|------|------|-----|
| 原币 | — | — |
| 本币 | — | — |
| 汇率折算方式 | 单选 | `unitfyEnum.GZTBDM.ExchangeRateMethod` |
| 汇率 | — | — |
| 汇率日期 | — | — |
| 汇率类型 | 单选引用 | `bd.exchangeRate.ExchangeRateTypeVO` |

> 汇率折算方式编码建议 = "汇率编码" + "Ops"，否则需单独设置"关联的枚举字段"属性。

### 页面建模

汇率字段设置协议 `cControlType: exchangerate` 可启用汇率组件（汇率 + 折算方式联动）。可编辑性由"允许修改"控制：汇率折算方式不可改，汇率可改（修改时汇率类型自动变为"用户自定义"）。

### 脚本调用 OpenAPI

```javascript
cb.rest.invokeFunction('AT2133E3F81C980003.rule.computeExchangeRate', {
  originalCurrency, localCurrency, exchangeRateTypeVO, exchangeRateDate
}, function (err, res) {
  if (res && res.code == '200') {
    viewModel.get('exchangeRate').setValue(res.data.recordList[0].exchRate);
    viewModel.get('exchangeRateOps').setValue(res.data.recordList[0].exchRateOps);
  }
});
```

> 汇率日期、汇率类型、原币、本币每个字段变更时，都必须重新调用接口计算汇率。

## 常见问题

- 原厂单据默认不显示汇率字段 → UI 模板 → 显示隐藏字段勾选
- 历史租户开启需确认：函数中直接乘汇率值的地方需改为判断折算方式

## 与其他文档关联

- [[API调用]] — `cb.rest.invokeFunction` 模式
- [[2026-05-28-bip-i18n]] — 全球化多语
- [[专业开发]] — 对象建模与页面建模
