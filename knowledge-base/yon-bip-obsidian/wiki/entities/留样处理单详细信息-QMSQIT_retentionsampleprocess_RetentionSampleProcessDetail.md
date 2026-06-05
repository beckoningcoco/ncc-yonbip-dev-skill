---
tags: ["BIP", "元数据", "数据字典", "QMSQIT", "QMSQIT.retentionsampleprocess.RetentionSampleProcessDetail"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 留样处理单详细信息 (`QMSQIT.retentionsampleprocess.RetentionSampleProcessDetail`)

> QMSQIT | 物理表：`qms_qit_retentsamproc_detail`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 留样处理单详细信息 |
| 物理表 | `qms_qit_retentsamproc_detail` |
| 数据库 schema | `QMS-QIT` |
| 所属应用 | `QMSQIT` |
| 构建时间 | `2026-06-05 16:43:41.7750` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（30个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 2 | `id` | ID | `id` | Long |
| 3 | `retentionsampleProcessId` | 留样处理单id | `retentionsampleprocess_id` | 3569610c-231a-4004-a88b-9954e05eb65e |
| 4 | `productId` | 物料id | `product_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 5 | `supplierId` | 供应商id | `supplier_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e |
| 6 | `batchNoId` | 批次号id | `batch_no_id` | 9458cb44-2675-4988-8e64-f6a59fefed89 |
| 7 | `isCheckApply` | 已请检 | `is_checkapply` | Integer |
| 8 | `retentionResidueNum` | 留样剩余数量 | `retention_residue_num` | Decimal |
| 9 | `unitId` | 计量单位id | `unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 10 | `batchNo` | 批次号 | `batch_no` | String |
| 11 | `sampleDefineId` | 样品类型定义 | `sample_define_id` | bf808ae5-0ef4-49c7-8560-721d1bceaff2 |
| 12 | `sampleRecordId` | 样品记录id | `samplerecord_id` | 8ae568a3-5aa6-44ed-8283-9fe5a36cf435 |
| 13 | `processNum` | 处理数量 | `process_num` | Decimal |
| 14 | `makeRuleCode` | 生单规则编号 | `makerule_code` | String |
| 15 | `firstSource` | 源头单据类型 | `first_source` | String |
| 16 | `firstUpCode` | 源头单据号 | `first_upcode` | String |
| 17 | `firstSourceId` | 源头单据id | `first_source_id` | Long |
| 18 | `firstSourceBId` | 源头单据子表id | `first_source_bid` | Long |
| 19 | `firstSourceLineNo` | 源头单据行号 | `first_source_line_no` | Integer |
| 20 | `source` | 上游单据类型 | `source` | String |
| 21 | `upcode` | 上游单据号 | `upcode` | String |
| 22 | `sourceid` | 上游单据主表id | `sourceid` | Long |
| 23 | `sourceautoid` | 上游单据子表id | `sourceautoid` | Long |
| 24 | `upRowNo` | 上游单据行号 | `up_row_no` | Integer |
| 25 | `definect_b` | 自定义特征 | `definect_b` | 00ae0de9-7537-495c-95ce-310fb4cf41d2 |
| 26 | `groupTaskKey` | 分组任务KEY | `groupTaskKey` | String |
| 27 | `freect_b` | 自由项特征组 | `freect_b` | 1bb03016-5c05-451e-ad65-dac25a8098af |
| 28 | `dr` | 逻辑删除标记 | `dr` | Short |
| 29 | `pubts` | 时间戳 | `pubts` | DateTime |
| 30 | `sourceMainPubts` | 时间戳 | `sourceMainPubts` | DateTime |

---

## 关联属性（10个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `sampleDefineId` | 样品类型定义 | `QMSQIT.sampledefine.SampleDefine` | None |  |
| 2 | `batchNoId` | 批次号id | `st.batchno.Batchno` | Service |  |
| 3 | `supplierId` | 供应商id | `aa.vendor.Vendor` | Service |  |
| 4 | `productId` | 物料id | `pc.product.Product` | Service |  |
| 5 | `freect_b` | 自由项特征组 | `QMSQIT.retentionsampleprocess.RetentionSamProDetailFree` | None |  |
| 6 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 7 | `definect_b` | 自定义特征 | `QMSQIT.retentionsampleprocess.RetentionSamProDetailDefine` | None |  |
| 8 | `unitId` | 计量单位id | `pc.unit.Unit` | Service |  |
| 9 | `retentionsampleProcessId` | 留样处理单id | `QMSQIT.retentionsampleprocess.RetentionSampleProcess` | None | true |
| 10 | `sampleRecordId` | 样品记录id | `QMSQIT.samplerecord.SampleRecord` | None |  |
