---
tags: ["BIP", "元数据", "数据字典", "QMSQIT", "QMSQIT.retentionsample.RetentionSampleBody"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 留样信息 (`QMSQIT.retentionsample.RetentionSampleBody`)

> QMSQIT | 物理表：`qms_qit_retentionsample_b`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 留样信息 |
| 物理表 | `qms_qit_retentionsample_b` |
| 数据库 schema | `QMS-QIT` |
| 所属应用 | `QMSQIT` |
| 构建时间 | `2026-06-05 16:43:36.6710` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | 主键 |

---

## 直接属性（44个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `retentionSampleId` | 留样单id | `retentionsample_id` | e20161cc-7628-4234-ad85-ad31ae11ec1c |
| 2 | `sampleRecordId` | 样品记录id | `samplerecord_id` | 8ae568a3-5aa6-44ed-8283-9fe5a36cf435 |
| 3 | `sampleRecordCode` | 样品编号 | `samplerecord_code` | String |
| 4 | `sampleDefineId` | 样品类别定义id | `sampledefine_id` | bf808ae5-0ef4-49c7-8560-721d1bceaff2 |
| 5 | `productId` | 物料id | `product_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 6 | `freect_b` | 自由项特征组实体 | `freect_b` | dba26abb-f068-4395-b458-403fe476ba2e |
| 7 | `supplierId` | 供应商id | `supplier_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e |
| 8 | `processId` | 工序id | `process_id` | 5929debb-7319-44fb-8583-5c7d0d5af701 |
| 9 | `customId` | 客户id | `custom_id` | 94b3280a-27a4-485a-b90b-b7bce57c6df2 |
| 10 | `batchNo` | 批次号 | `batch_no` | String |
| 11 | `retentionNum` | 留样数量 | `retention_num` | Decimal |
| 12 | `unitId` | 计量单位id | `unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 13 | `retentionPlanId` | 留样方案id | `retention_plan_id` | 796856f9-9afa-4e80-be76-0557abe84b5e |
| 14 | `storageCondition` | 存储条件 | `storage_condition` | String |
| 15 | `retentionDate` | 留样日期 | `retention_date` | Date |
| 16 | `retentExpiration` | 留样效期 | `retent_expiration` | Integer |
| 17 | `retentExpirationUnit` | 留样效期单位 | `retent_expiration_unit` | String |
| 18 | `retentExpirationTo` | 留样效期至 | `retent_expiration_to` | Date |
| 19 | `sampleSite` | 取样地点 | `sample_site` | String |
| 20 | `sampleContainer` | 样品容器 | `sample_container` | String |
| 21 | `sampleMorphology` | 样品形态 | `sample_morphology` | String |
| 22 | `sampleRemark` | 样品备注 | `sample_remark` | String |
| 23 | `sourceBillType` | 来源单据类型 | `source_bill_type` | String |
| 24 | `sourceBillId` | 来源单据id | `source_bill_id` | String |
| 25 | `sourceCode` | 来源单据号 | `source_code` | String |
| 26 | `checkType` | 检验类型 | `check_type` | String |
| 27 | `sourceDocType` | 源头单据类型 | `source_doc_type` | String |
| 28 | `sourceDocCode` | 源头单据号 | `source_doc_code` | String |
| 29 | `sourceDocRowNum` | 源头单据行号 | `source_doc_row_num` | String |
| 30 | `sampleSourceId` | 样品来源单据id | `sample_source_id` | Long |
| 31 | `definect_b` | 留样信息自定义项特征 | `definect_b` | c6aeb73e-6c28-4a69-99fa-c21ff61364f9 |
| 32 | `requestInspectBillType` | 请检来源单据类型 | `request_inspect_bill_type` | String |
| 33 | `requestInspectBillId` | 请检来源单据id | `request_inspect_bill_id` | String |
| 34 | `requestInspectBillCode` | 请检来源单据号 | `request_inspect_bill_code` | String |
| 35 | `requestInspectBillBId` | 请检来源单据行id | `request_inspect_billb_id` | String |
| 36 | `requestInspectBillBNum` | 请检来源单据行号 | `request_inspect_billb_num` | String |
| 37 | `checkApplyId` | 检验申请id | `check_apply_id` | String |
| 38 | `checkApplyCode` | 检验申请单号 | `check_apply_code` | String |
| 39 | `batchNoId` | 批次号id | `batch_no_id` | 9458cb44-2675-4988-8e64-f6a59fefed89 |
| 40 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 41 | `dr` | 逻辑删除标记 | `dr` | Short |
| 42 | `id` | 主键 | `id` | Long |
| 43 | `pubts` | 时间戳 | `pubts` | DateTime |
| 44 | `checkApplySourceId` | 检验申请源单信息ID | `check_apply_srcid` | String |

---

## 关联属性（13个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `sampleDefineId` | 样品类别定义id | `QMSQIT.sampledefine.SampleDefine` | None |  |
| 2 | `supplierId` | 供应商id | `aa.vendor.Vendor` | Service |  |
| 3 | `productId` | 物料id | `pc.product.Product` | Service |  |
| 4 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 5 | `definect_b` | 留样信息自定义项特征 | `QMSQIT.retentionsample.RetentionSampleBDefineCharacter` | None |  |
| 6 | `customId` | 客户id | `aa.merchant.Merchant` | Service |  |
| 7 | `retentionSampleId` | 留样单id | `QMSQIT.retentionsample.RetentionSampleHead` | None | true |
| 8 | `batchNoId` | 批次号id | `st.batchno.Batchno` | Service |  |
| 9 | `freect_b` | 自由项特征组实体 | `QMSQIT.retentionsample.RetentionSampleBFree` | None |  |
| 10 | `processId` | 工序id | `ed.operation.Operation` | Service |  |
| 11 | `retentionPlanId` | 留样方案id | `QMSQIT.retentionsampleplan.RetentionSamplePlan` | None |  |
| 12 | `unitId` | 计量单位id | `pc.unit.Unit` | Service |  |
| 13 | `sampleRecordId` | 样品记录id | `QMSQIT.samplerecord.SampleRecord` | None |  |
