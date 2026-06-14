---
tags: ["BIP", "元数据", "数据字典", "QIC", "QMSDFM.inspectionPlan.matchPlan"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 检验对象 (`QMSDFM.inspectionPlan.matchPlan`)

> QIC | 物理表：`qms_dfm_matchplan`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 检验对象 |
| 物理表 | `qms_dfm_matchplan` |
| domain/服务域 | `QMS-DFM` |
| schema | `qms_dfm` |
| 所属应用 | `QIC` |
| 构建时间 | `2026-06-05 16:46:57.6790` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | String | ID |

---

## 直接属性（35个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 2 | `id` | ID | `id` | String |
| 3 | `factory` | 工厂 | `factory` | dcff4710-92a6-4b3a-85c0-553ad21aabc3 |
| 4 | `standardProcess` | 工序 | `standardProcess` | 5929debb-7319-44fb-8583-5c7d0d5af701 |
| 5 | `inspectionPlanDetailId` | 检验方案主表id | `inspectionplan_detail_id` | cacc3797-7e23-44d9-aad5-ebfe0c680961 |
| 6 | `freect_h` | 检验对象自由项项特征 | `freect_h` | 8c949ac1-aa07-4119-98bb-ecfdd6fe0317 |
| 7 | `planInspectionDays` | 计划检验时长 | `plan_inspection_days` | Decimal |
| 8 | `inspectDaysUnit` | 检验时长单位 | `inspect_days_unit` | String |
| 9 | `materialClassName` | 物料分类名称 | `materialClassName` | String |
| 10 | `materialName` | 物料名称 | `materialName` | String |
| 11 | `materialSKUName` | 物料SKU名称 | `materialSKUName` | String |
| 12 | `standard` | 规格说明 | `standard` | String |
| 13 | `type` | 型号 | `check_type` | String |
| 14 | `customer` | 客户ID | `customer` | 94b3280a-27a4-485a-b90b-b7bce57c6df2 |
| 15 | `defaultPlan` | 默认方案 | `defaultPlan` | String |
| 16 | `supplier` | 供应商id | `supplier` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e |
| 17 | `materialClassCode` | 物料分类编码id | `materialClassCode` | b295ef54-c421-4865-aca3-f5a9207a8d50 |
| 18 | `materialCode` | 物料编码id | `materialCode` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 19 | `pubts` | 时间戳 | `pubts` | DateTime |
| 20 | `materialSKUCode` | 物料SKUid | `materialSKUCode` | 3e9ddc6d-edd0-4508-afcc-e4a20535f2f9 |
| 21 | `free1` | 物料规格1 | `free1` | String |
| 22 | `free2` | 物料规格2 | `free2` | String |
| 23 | `free3` | 物料规格3 | `free3` | String |
| 24 | `free4` | 物料规格4 | `free4` | String |
| 25 | `free5` | 物料规格5 | `free5` | String |
| 26 | `free6` | 物料规格6 | `free6` | String |
| 27 | `free7` | 物料规格7 | `free7` | String |
| 28 | `free8` | 物料规格8 | `free8` | String |
| 29 | `free9` | 物料规格9 | `free9` | String |
| 30 | `free10` | 物料规格10 | `free10` | String |
| 31 | `tenant` | 租户ID | `tenant_id` | String |
| 32 | `dr` | 逻辑删除标记 | `dr` | Short |
| 33 | `inspectionPlanID` | 检验方案id | `inspectionPlanID` | 14bcdfef-7982-4772-baf8-e0d6ebef507e |
| 34 | `definect_d` | 检验对象自定义项 | `definect_d` | 4f57aaf6-b5fe-479b-b05c-43d9e8e07c55 |
| 35 | `matchDefines` | 检验对象自定义项 | `` | c805f563-bb82-4156-a82b-1b1d476a9006 |

---

## 关联属性（13个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `matchDefines` | 检验对象自定义项 | `QMSDFM.inspectionPlan.matchPlanDefine` | None | true |
| 2 | `factory` | 工厂 | `org.func.FactoryOrg` | Service |  |
| 3 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 4 | `materialClassCode` | 物料分类编码id | `pc.cls.ManagementClass` | Service |  |
| 5 | `materialCode` | 物料编码id | `pc.product.Product` | Service |  |
| 6 | `inspectionPlanDetailId` | 检验方案主表id | `QMSDFM.inspectionPlan.inspectionPlanDetail` | None | true |
| 7 | `freect_h` | 检验对象自由项项特征 | `QMSDFM.inspectionPlan.matchPlanFree` | None |  |
| 8 | `supplier` | 供应商id | `aa.vendor.Vendor` | Service |  |
| 9 | `definect_d` | 检验对象自定义项 | `QMSDFM.inspectionPlan.MatchPlanDefineCharacter` | None |  |
| 10 | `standardProcess` | 工序 | `ed.operation.Operation` | Service |  |
| 11 | `inspectionPlanID` | 检验方案id | `QMSDFM.inspectionPlan.inspectionPlan` | None |  |
| 12 | `materialSKUCode` | 物料SKUid | `pc.product.ProductSKU` | Service |  |
| 13 | `customer` | 客户ID | `aa.merchant.Merchant` | Service |  |
