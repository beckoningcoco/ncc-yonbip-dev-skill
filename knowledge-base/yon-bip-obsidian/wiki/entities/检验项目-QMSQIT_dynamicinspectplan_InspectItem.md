---
tags: ["BIP", "元数据", "数据字典", "QMSQIT", "QMSQIT.dynamicinspectplan.InspectItem"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 检验项目 (`QMSQIT.dynamicinspectplan.InspectItem`)

> QMSQIT | 物理表：`qms_qit_dynamic_item`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 检验项目 |
| 物理表 | `qms_qit_dynamic_item` |
| 数据库 schema | `QMS-QIT` |
| 所属应用 | `QMSQIT` |
| 构建时间 | `2026-06-05 16:45:18.3790` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（46个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 2 | `id` | ID | `id` | Long |
| 3 | `inspectPlanId` | 动态检验方案 | `inspectplan_id` | f9c8adf8-5485-417b-bb35-f242b0995126 |
| 4 | `productClassId` | 物料分类 | `productclass_id` | b295ef54-c421-4865-aca3-f5a9207a8d50 |
| 5 | `productId` | 物料 | `product_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 6 | `vendorId` | 供应商 | `vendor_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e |
| 7 | `merchantId` | 客户 | `merchant_id` | 94b3280a-27a4-485a-b90b-b7bce57c6df2 |
| 8 | `factoryId` | 工厂 | `factory_id` | dcff4710-92a6-4b3a-85c0-553ad21aabc3 |
| 9 | `operationId` | 工序 | `operation_id` | 5929debb-7319-44fb-8583-5c7d0d5af701 |
| 10 | `inspectItemId` | 检验项目 | `inspectitem_id` | 10e9d13b-12d5-44ea-8f94-ada2ea783264 |
| 11 | `inspectOrder` | 检验顺序 | `inspect_order` | Integer |
| 12 | `controlStandards` | 内控标准规定 | `control_standard` | String |
| 13 | `statutoryStandard` | 法定标准规定 | `statutory_standard` | String |
| 14 | `keyItem` | 关键项目 | `key_item` | String |
| 15 | `originalRecordVisible` | 仅原始记录可见 | `originalrecord_visible` | Short |
| 16 | `sampleMethodId` | 取样方式 | `samplemethod_id` | d21eaba0-3431-4238-b178-c6216a31b34b |
| 17 | `sampleUnit` | 取样单位 | `sampleunit` | Short |
| 18 | `pointNumber` | 测点数 | `point_number` | Integer |
| 19 | `standardvalue` | 标准值 | `standardvalue` | String |
| 20 | `multiCheckValue` | 多样本检验值 | `multi_checkvalue` | Short |
| 21 | `decimalPlace` | 小数位数 | `decimal_place` | Integer |
| 22 | `roudingRule` | 修约规则 | `rouding_rule` | String |
| 23 | `inspectValueUnit` | 检验值单位 | `inspectvalue_unit` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 24 | `inspectValueFormula` | 检验值计算公式 | `inspectvalue_formula` | String |
| 25 | `qualityIndexType` | 质量指标类型 | `qualityindex_type` | String |
| 26 | `inspectValueType` | 检验值类型 | `inspectvalue_type` | String |
| 27 | `detectionMethodId` | 检测方法 | `detectionmethod_id` | 90d44bff-eef4-4fd8-a0c1-8ce14fbab951 |
| 28 | `note` | 备注 | `note` | String |
| 29 | `defineCharacteristics` | 自定义项特征组 | `define_cts` | 3e439e34-1435-41f5-8752-667815145514 |
| 30 | `detectionMethodAttachment` | 检测方法附件 | `detection_method_attachment` | String |
| 31 | `lineNo` | 行号 | `line_no` | Decimal |
| 32 | `standardValueFormula` | 标准值计算公式 | `standardvalue_formula` | String |
| 33 | `inspectionValueEnum` | 检验值枚举 | `inspectionValueEnum` | String |
| 34 | `additionalInspection` | 附加检验 | `additional_inspect` | Short |
| 35 | `defaultInspectValue` | 默认检验值 | `default_inspectvalue` | String |
| 36 | `inspectItemDetailId` | 检验项目主表id | `inspectitem_detail_id` | 3ef85f41-6ab5-4748-9805-2c9ccf03e399 |
| 37 | `sampleMethodDetailId` | 取样方式主表id | `sample_method_detailid` | 5653b278-1a57-42ea-81ab-e579e060556a |
| 38 | `inspectItemClassId` | 检验项目分类 | `inspectitemclass_id` | c3b4c20b-a758-485f-8565-7cec8f466bf4 |
| 39 | `destroyInspect` | 破坏性检验 | `destroy_inspect` | String |
| 40 | `detectionBasicId` | 检测依据 | `detectionbasic_id` | f0529fa3-5e4b-444a-8212-716743519d68 |
| 41 | `coord` | 是否协同 | `coord` | String |
| 42 | `standValCharacId` | 标准值特征 | `standval_charac_id` | String |
| 43 | `defaInspValCharacId` | 默认检验值特征 | `defa_inspval_charac_id` | String |
| 44 | `characRefCode` | 特征参照编码 | `charac_refcode` | String |
| 45 | `dr` | 逻辑删除标记 | `dr` | Short |
| 46 | `pubts` | 时间戳 | `pubts` | DateTime |

---

## 关联属性（17个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `detectionBasicId` | 检测依据 | `QMSDFM.detectionbasis.qam_detectionbasis` | Service |  |
| 2 | `inspectPlanId` | 动态检验方案 | `QMSQIT.dynamicinspectplan.DynamicInspectPlan` | None | true |
| 3 | `productClassId` | 物料分类 | `pc.cls.ManagementClass` | Service |  |
| 4 | `productId` | 物料 | `pc.product.Product` | Service |  |
| 5 | `sampleMethodId` | 取样方式 | `QMSDFM.sampleMethod.sampleMethod` | Service |  |
| 6 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 7 | `factoryId` | 工厂 | `org.func.FactoryOrg` | Service |  |
| 8 | `vendorId` | 供应商 | `aa.vendor.Vendor` | Service |  |
| 9 | `inspectValueUnit` | 检验值单位 | `pc.unit.Unit` | Service |  |
| 10 | `defineCharacteristics` | 自定义项特征组 | `QMSQIT.dynamicinspectplan.InspectItemDefineCharacter` | None |  |
| 11 | `merchantId` | 客户 | `aa.merchant.Merchant` | Service |  |
| 12 | `inspectItemClassId` | 检验项目分类 | `QMSDFM.checkProjectClass.checkProjectClass` | Service |  |
| 13 | `inspectItemDetailId` | 检验项目主表id | `QMSDFM.checkProject.checkProjectDetail` | Service |  |
| 14 | `inspectItemId` | 检验项目 | `QMSDFM.checkProject.checkProject` | Service |  |
| 15 | `operationId` | 工序 | `ed.operation.Operation` | Service |  |
| 16 | `sampleMethodDetailId` | 取样方式主表id | `QMSDFM.sampleMethod.sampleMethodDetail` | Service |  |
| 17 | `detectionMethodId` | 检测方法 | `QMSDFM.detectionMethod.QmsDfmDetectionMethod` | Service |  |
