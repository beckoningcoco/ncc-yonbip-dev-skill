---
tags: ["BIP", "元数据", "数据字典", "BCD", "aa.barcoderule.BarcodeRule"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 条码解析规则 (`aa.barcoderule.BarcodeRule`)

> BCD | 物理表：`aa_barcoderule`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 条码解析规则 |
| 物理表 | `aa_barcoderule` |
| domain/服务域 | `uscmpub` |
| schema | `usp_plantransportroute` |
| 所属应用 | `BCD` |
| 构建时间 | `2026-06-04 23:33:51.9850` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（39个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `createTime` | 创建时间 | `create_time` | DateTime |
| 2 | `creator` | 创建人名称 | `creator` | String |
| 3 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 4 | `isExternalCode` | 外部码 | `isExternalCode` | Boolean |
| 5 | `isOverGeneration` | 允许超量生码 | `isOverGeneration` | Boolean |
| 6 | `isCustCheck` | 校验客户 | `isCustCheck` | Boolean |
| 7 | `isDoubleCheck` | 双码校验 | `isDoubleCheck` | Boolean |
| 8 | `isRepeatGeneration` | 允许重复生码 | `isRepeatGeneration` | Boolean |
| 9 | `checkRegExp` | 规则含有标志位时的校验字符串 | `checkregexp` | String |
| 10 | `priority` | 多个等长解析规则的优先级 | `priority` | Integer |
| 11 | `isScanOverQty` | 扫码验货允许超量 | `isScanOverQty` | Short |
| 12 | `isOutAutoDeBarcode` | 出库自动拆码 | `isout_auto_debarcode` | Boolean |
| 13 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 14 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 15 | `barcodePlan` | 条码方案 | `barcode_plan` | Short |
| 16 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 17 | `code` | 规则编码 | `code` | String |
| 18 | `divider` | 分隔符 | `divider` | String |
| 19 | `name` | 规则名称 | `name` | String |
| 20 | `iLength` | 长度 | `iLength` | Short |
| 21 | `memo` | 备注 | `cMemo` | String |
| 22 | `padMethod` | 补位方式 | `padMethod` | Short |
| 23 | `paddingChar` | 补位符号 | `paddingChar` | String |
| 24 | `createDate` | 创建日期 | `create_date` | Date |
| 25 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 26 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 27 | `modifier` | 修改人 | `modifier` | String |
| 28 | `id` | ID | `id` | Long |
| 29 | `pubts` | 时间戳 | `pubts` | DateTime |
| 30 | `isRepeatInStock` | 允许重复入库 | `isRepeatInStock` | Boolean |
| 31 | `isRepeatOutStock` | 允许重复出库 | `isRepeatOutStock` | Boolean |
| 32 | `isFalsifying` | 开启防串货 | `isFalsifying` | Boolean |
| 33 | `isNoInOut` | 允许未入即出 | `isNoInOut` | Boolean |
| 34 | `ruleType` | 条码类型 | `ruleType` | Short |
| 35 | `isScanDetail` | 记扫描明细 | `isScanDetail` | Boolean |
| 36 | `isOneLine` | 一码一行 | `isOneLine` | Boolean |
| 37 | `regulationType` | 规则类型 | `regulationType` | Short |
| 38 | `barcodeRuleAllocation` | 条码解析规则分配 | `` | c4ab4873-1923-4c4f-b0ab-a481fca265ac |
| 39 | `barcodeRuleDetail` | 条码解析规则明细 | `` | 91da734a-f343-4d8d-853a-2b5006a7da39 |

---

## 关联属性（6个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `barcodeRuleAllocation` | 条码解析规则分配 | `aa.barcoderule.BarcodeRuleAllocation` | None | true |
| 3 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 4 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 5 | `barcodeRuleDetail` | 条码解析规则明细 | `aa.barcoderule.BarcodeRuleDetail` | None | true |
| 6 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
