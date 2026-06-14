---
tags: ["BIP", "元数据", "数据字典", "ycSupplierManagement", "cpu-supplymgr.supplyevaluate.EvaluateReportSupply"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 评价报告供应商得分表 (`cpu-supplymgr.supplyevaluate.EvaluateReportSupply`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP ycSupplierManagement 模块实体元数据字典。
> 物理表：`cpu_evaluate_report_supply` | 所属应用：`ycSupplierManagement`
> 来源：元数据API `queryByUri` 返回的 `cpu-supplymgr.supplyevaluate.EvaluateReportSupply` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 评价报告供应商得分表 |
| 物理表 | `cpu_evaluate_report_supply` |
| domain/服务域 | `cpu-supplymgr` |
| schema | `cpu_suppliermgr` |
| 所属应用 | `ycSupplierManagement` |
| 业务对象ID | `879dade0-4d75-44f1-af95-f932204913f4` |
| 元数据类型 | `Class` |
| 元数据层级 | `0` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 16:35:43.8790` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` | Long | id |

## 部署信息

- **部署时间**: 2026-05-22 23:45:58:000
- **安装来源**: `/app/data_scripts/cpu-suppliermgr-bootstrap/scripts/db/patch/mongodb/V5_R0_2507/0001_yonbip-cpu-suppliermgr/0010_iuap_common/DML/0270_iuap_metadata/202601201940_metadata_cpu-supplymgr-supplyevaluate.zip`
- **安装人**: mongoTools
- **安装排名**: `381ec7c1-7af7-49f5-b852-fff1aee2ffcb`

## 业务场景

- `UITemplate`
- `report`

## 术语标记

`BusinessData`, `isMain`

## 约束

- **migration_id** (MetaClassPrimary): ID — 唯一字段: `['id']`

## 依赖接口（共 1 个）

| # | 接口名 | URI | 版本 | 属性数 |
|---|--------|-----|------|--------|
| 1 | 统一租户接口 (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |

---

## 直接属性（共 43 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `id` | id | `id` | Long | `long` |  | ✓ |
| 2 | `evaReportId` | 评价报告id | `eva_report_id` | 4adb01ab-5983-467b-a459-8c00966fa86e | `quote` |  | ✓ |
| 3 | `supplydocId` | 供应商ID | `supply_doc_id` | Long | `long` |  | ✓ |
| 4 | `supplydocCode` | 供应商编码 | `supply_doc_code` | String | `text` |  | ✓ |
| 5 | `supplydocName` | 供应商 | `supply_doc_name` | String | `text` |  | ✓ |
| 6 | `materialClassId` | 物料分类ID | `material_class_id` | b295ef54-c421-4865-aca3-f5a9207a8d50 | `quote` |  | ✓ |
| 7 | `materialId` | 物料ID | `material_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 | `quote` |  | ✓ |
| 8 | `applyCode` | 编码 | `apply_code` | String | `text` |  | ✓ |
| 9 | `evaAbilityDetailName` | 等级 | `ability_detial_name` | String | `text` |  | ✓ |
| 10 | `objectType` | 业务单据 | `object_type` | String | `text` |  | ✓ |
| 11 | `evaAbilityDetailStatus` | 状态 | `ability_status` | String | `text` |  | ✓ |
| 12 | `score` | 得分 | `score` | Decimal | `number` |  | ✓ |
| 13 | `adjustScore` | 校准后得分 | `adjust_score` | Decimal | `number` |  | ✓ |
| 14 | `evaAbilityDetailId` | 等级体系ID | `ability_detial_id` | 5ffdc7d3-9e62-4b5f-8668-eb39ddd20dd5 | `quote` |  | ✓ |
| 15 | `adjustEvaAbilityDetailId` | 校准后等级体系ID | `adjust_ability_detial_id` | 5ffdc7d3-9e62-4b5f-8668-eb39ddd20dd5 | `quote` |  | ✓ |
| 16 | `userDefineCharacter` | 评价报告供应商得分特征 | `user_define_character` | 586a615e-917a-43ea-87eb-2eddfb8a807a | `UserDefine` |  | ✓ |
| 17 | `applyDate` | 申请日期 | `createtime` | DateTime | `dateTime` |  | ✓ |
| 18 | `applyOrgId` | 申请组织id | `apply_org_id` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` |  | ✓ |
| 19 | `applyOrgName` | 客户名称 | `apply_org_name` | String | `text` |  | ✓ |
| 20 | `applyTitle` | 评价任务名称 | `apply_title` | String | `text` |  | ✓ |
| 21 | `approveStatus` | 审批状态 | `approve_status` | String | `text` |  | ✓ |
| 22 | `buyerName` | 采购商名称 | `buyer_name` | String | `text` |  | ✓ |
| 23 | `buyerTenant` | 采购商租户id | `buyer_tenant_id` | String | `text` |  | ✓ |
| 24 | `cooperationId` | 合作等级 | `cooperation_id` | 5ffdc7d3-9e62-4b5f-8668-eb39ddd20dd5 | `quote` |  | ✓ |
| 25 | `createTime` | 评价时间 | `createtime` | DateTime | `dateTime` |  | ✓ |
| 26 | `evaEndDate` | 结束时间 | `eva_end_date` | DateTime | `dateTime` |  | ✓ |
| 27 | `evaReportOrgIndicatorList` | 评价报告详情指标明细子表 | `` | 51dd7def-e7b9-4d91-8d85-fa21b8823d8e | `` |  |  |
| 28 | `evaReportSupIndicatorList` | 评价报告指标得分表 | `` | 4e21ad4f-098a-4fa2-b2c8-1c90f3467e71 | `` |  |  |
| 29 | `evaStartDate` | 开始时间 | `eva_start_date` | DateTime | `dateTime` |  | ✓ |
| 30 | `feedbackFileId` | 反馈附件 | `feedback_file_id` | String | `text` |  | ✓ |
| 31 | `lifecycleId` | 生命周期状态 | `lifecycle_id` | 5ffdc7d3-9e62-4b5f-8668-eb39ddd20dd5 | `quote` |  | ✓ |
| 32 | `objectBillCode` | 业务单据编码 | `object_bill_code` | String | `text` |  | ✓ |
| 33 | `objectBillId` | 业务单据ID | `object_bill_id` | Long | `long` |  | ✓ |
| 34 | `objectBillNum` | 业务单据num | `object_bill_num` | String | `text` |  | ✓ |
| 35 | `pubts` | 时间戳 | `ts` | DateTime | `timestamp` |  | ✓ |
| 36 | `purchaseClassId` | 采购品类ID | `purchase_class_id` | ec3f827d-4cff-462d-b74c-1dd556c96baa | `quote` |  | ✓ |
| 37 | `supSynergy` | 是否协同供应商 | `sup_synergy` | String | `text` |  | ✓ |
| 38 | `supVisible` | 供应商是否可见 | `sup_visible` | String | `text` |  | ✓ |
| 39 | `supplyBillId` | 业务单据id | `supply_bill_id` | Long | `long` |  | ✓ |
| 40 | `supplyType` | 考评颗粒度 | `supply_type` | String | `text` |  | ✓ |
| 41 | `synergyFileId` | 协同附件 | `synergy_file_id` | String | `text` |  | ✓ |
| 42 | `vendorTenant` | 供应商租户id | `vendor_tenant_id` | String | `text` |  | ✓ |
| 43 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | ✓ | ✓ |

---

## 关联属性（共 13 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `purchaseClassId` | 采购品类ID | `pc.cls.PurchaseClass` | `purchase_class_id` |  →  |  |  | Service |  |
| 2 | `applyOrgId` | 申请组织id | `org.func.BaseOrg` | `apply_org_id` |  →  |  |  | Service |  |
| 3 | `materialClassId` | 物料分类ID | `pc.cls.ManagementClass` | `material_class_id` |  →  |  |  | Service |  |
| 4 | `userDefineCharacter` | 评价报告供应商得分特征 | `cpu-supplymgr.supplyevaluate.EvaluateReportSupplyUserDefineCharacter` | `user_define_character` |  →  |  |  | None |  |
| 5 | `evaReportOrgIndicatorList` | 评价报告详情指标明细子表 | `cpu-supplymgr.supplyevaluate.EvaluateReportOrgIndicator` | `` | evaReportOrgIndicatorList → evaSupplyId | 0..n | true | None |  |
| 6 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | `ytenant_id` |  →  |  |  | Service |  |
| 7 | `materialId` | 物料ID | `pc.product.Product` | `material_id` |  →  |  |  | Service |  |
| 8 | `evaReportSupIndicatorList` | 评价报告指标得分表 | `cpu-supplymgr.supplyevaluate.EvaluateReportSupIndicator` | `` | evaReportSupIndicatorList → evaSupplyId | 0..n | true | None |  |
| 9 | `adjustEvaAbilityDetailId` | 校准后等级体系ID | `aa.supplyability.SupplyAbilityDetail` | `adjust_ability_detial_id` |  →  |  |  | Service |  |
| 10 | `evaReportId` | 评价报告id | `cpu-supplymgr.supplyevaluate.EvaluateReport` | `eva_report_id` | evaReportSupplyList → evaReportId | 0..n | true | None |  |
| 11 | `cooperationId` | 合作等级 | `aa.supplyability.SupplyAbilityDetail` | `cooperation_id` |  →  |  |  | Service |  |
| 12 | `lifecycleId` | 生命周期状态 | `aa.supplyability.SupplyAbilityDetail` | `lifecycle_id` |  →  |  |  | Service |  |
| 13 | `evaAbilityDetailId` | 等级体系ID | `aa.supplyability.SupplyAbilityDetail` | `ability_detial_id` |  →  |  |  | Service |  |

### Composition（子表）

- **evaReportOrgIndicatorList**: `evaReportOrgIndicatorList` → `cpu-supplymgr.supplyevaluate.EvaluateReportOrgIndicator` | 0..n
- **evaReportSupIndicatorList**: `evaReportSupIndicatorList` → `cpu-supplymgr.supplyevaluate.EvaluateReportSupIndicator` | 0..n
- **evaReportId**: `evaReportSupplyList` → `cpu-supplymgr.supplyevaluate.EvaluateReport` | 0..n

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `purchaseClassId` (采购品类ID) | `pc.cls.PurchaseClass` | `purchase_class_id` |
| `applyOrgId` (申请组织id) | `org.func.BaseOrg` | `apply_org_id` |
| `materialClassId` (物料分类ID) | `pc.cls.ManagementClass` | `material_class_id` |
| `ytenant` (租户id) | `yht.tenant.YhtTenant` | `ytenant_id` |
| `materialId` (物料ID) | `pc.product.Product` | `material_id` |
| `adjustEvaAbilityDetailId` (校准后等级体系ID) | `aa.supplyability.SupplyAbilityDetail` | `adjust_ability_detial_id` |
| `cooperationId` (合作等级) | `aa.supplyability.SupplyAbilityDetail` | `cooperation_id` |
| `lifecycleId` (生命周期状态) | `aa.supplyability.SupplyAbilityDetail` | `lifecycle_id` |
| `evaAbilityDetailId` (等级体系ID) | `aa.supplyability.SupplyAbilityDetail` | `ability_detial_id` |
