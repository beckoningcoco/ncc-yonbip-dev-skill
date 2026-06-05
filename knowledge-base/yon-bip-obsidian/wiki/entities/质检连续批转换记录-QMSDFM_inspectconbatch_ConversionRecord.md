---
tags: ["BIP", "元数据", "数据字典", "QIC", "QMSDFM.inspectconbatch.ConversionRecord"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 质检连续批转换记录 (`QMSDFM.inspectconbatch.ConversionRecord`)

> QIC | 物理表：`qms_dfm_conversionrecord`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 质检连续批转换记录 |
| 物理表 | `qms_dfm_conversionrecord` |
| 数据库 schema | `QMS-DFM` |
| 所属应用 | `QIC` |
| 构建时间 | `2026-06-05 16:46:45.2330` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（24个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 2 | `id` | ID | `id` | Long |
| 3 | `continuousBatchId` | 质检连续批id | `conbatch_id` | 828b5bcd-9583-4175-90a0-1473d0768ed1 |
| 4 | `sourcebillNum` | 请检来源单据号 | `sourcebill_num` | String |
| 5 | `sourceBillId` | 请检来源单据id | `src_doc_id` | String |
| 6 | `checkApplyCode` | 检验申请单号 | `checkapply_code` | String |
| 7 | `checkApplyId` | 检验申请单id | `checkapply_id` | String |
| 8 | `checkType` | 检验类型 | `check_type` | String |
| 9 | `inspectDate` | 请检时间 | `inspect_date` | DateTime |
| 10 | `checkCode` | 检验单号 | `check_code` | String |
| 11 | `checkId` | 检验单id | `check_id` | String |
| 12 | `inspectNum` | 检验数量 | `inspect_num` | Decimal |
| 13 | `sourceBillType` | 请检来源单据类型 | `src_bill_type` | String |
| 14 | `inspectEndDate` | 检验结束时间 | `inspectend_date` | DateTime |
| 15 | `judgmentResult` | 整单判定结果 | `judgment_result` | String |
| 16 | `thisBatchStrictness` | 本批严格程度 | `thisbatch_strictness` | String |
| 17 | `nextBatchStrictness` | 下批严格程度 | `nextbatch_strictness` | String |
| 18 | `creatSource` | 创建来源 | `creat_source` | String |
| 19 | `adjustmentReason` | 调整原因 | `adjustment_reason` | String |
| 20 | `defineCharacteristics` | 自定义项特征组 | `define_cts` | 64d9c202-c02d-45b1-8fe8-51b572ea1c90 |
| 21 | `createTime` | 创建时间 | `create_time` | DateTime |
| 22 | `dr` | 逻辑删除标记 | `dr` | Short |
| 23 | `pubts` | 时间戳 | `pubts` | DateTime |
| 24 | `mainUnitId` | 主计量 | `mainunit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |

---

## 关联属性（4个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `continuousBatchId` | 质检连续批id | `QMSDFM.inspectconbatch.InspectConBatch` | None | true |
| 2 | `defineCharacteristics` | 自定义项特征组 | `QMSDFM.inspectconbatch.ConversionRecord_defineCharacter` | None |  |
| 3 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 4 | `mainUnitId` | 主计量 | `pc.unit.Unit` | Service |  |
