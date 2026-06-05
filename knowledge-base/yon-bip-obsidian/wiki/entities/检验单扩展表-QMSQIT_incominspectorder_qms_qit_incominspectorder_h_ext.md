---
tags: ["BIP", "元数据", "数据字典", "QMSQIT", "QMSQIT.incominspectorder.qms_qit_incominspectorder_h_ext"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 检验单扩展表 (`QMSQIT.incominspectorder.qms_qit_incominspectorder_h_ext`)

> QMSQIT | 物理表：`qms_qit_incominspectorder_h_ext`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 检验单扩展表 |
| 物理表 | `qms_qit_incominspectorder_h_ext` |
| 数据库 schema | `QMS-QIT` |
| 所属应用 | `QMSQIT` |
| 构建时间 | `2026-06-05 16:43:04.2090` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | d4ef5893-2422-4c08-8e7e-df2087db7a8f | 检验单id |

---

## 直接属性（26个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 2 | `id` | 检验单id | `id` | d4ef5893-2422-4c08-8e7e-df2087db7a8f |
| 3 | `isMultiInspect` | 多版本检验 | `is_multiinspect` | Short |
| 4 | `isGenerateBarcode` | 自动生码 | `is_generate_barcode` | Boolean |
| 5 | `hasCheckApply` | 是否有检验申请 | `has_check_apply` | Short |
| 6 | `sampleRecordCode` | 样品记录编码 | `sample_record_code` | String |
| 7 | `batchNoId` | 批次号id | `batch_no_id` | 9458cb44-2675-4988-8e64-f6a59fefed89 |
| 8 | `baditemFlag` | 不良品处理 | `baditemFlag` | String |
| 9 | `firstCheck` | 首检 | `first_check` | String |
| 10 | `inspectConBatchId` | 质检连续批id | `inspectconbatch_id` | 828b5bcd-9583-4175-90a0-1473d0768ed1 |
| 11 | `dr` | 逻辑删除标记 | `dr` | Short |
| 12 | `pubts` | 时间戳 | `pubts` | DateTime |
| 13 | `aiImportAttachment` | 智能录入附件 | `aiimport_attachment` | String |
| 14 | `aiImportNSCheck` | 智能录入非系统检验值 | `aiimport_ns_check` | String |
| 15 | `aiImportNSFile` | 智能录入非系统来源文件 | `aiimport_ns_file` | String |
| 16 | `aiImportNSFileID` | 智能录入非系统来源文件ID | `aiimport_ns_fileid` | String |
| 17 | `aiImportNSItem` | 智能录入非系统项目 | `aiimport_ns_item` | String |
| 18 | `aiImportNSStandard` | 智能录入非系统标准值 | `aiimport_ns_standard` | String |
| 19 | `invInspectExchRate` | 质检换算率 | `invinspectexchrate` | Decimal |
| 20 | `invInspectExchRateDen` | 质检换算率分母 | `invinspectexchrateden` | Decimal |
| 21 | `invInspectExchRateNum` | 质检换算率分子 | `invinspectexchratenum` | Decimal |
| 22 | `invStockExchRateDen` | 库存换算率分母 | `invstockexchrateden` | Decimal |
| 23 | `invStockExchRateNum` | 库存换算率分子 | `invstockexchratenum` | Decimal |
| 24 | `nextInspectDate` | 下次检验日期 | `next_inspect_date` | Date |
| 25 | `reexamination` | 复检状态 | `reexamination` | String |
| 26 | `resultInputType` | 合并检验处理结果维护方式 | `result_input_type` | String |

---

## 关联属性（4个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `batchNoId` | 批次号id | `st.batchno.Batchno` | Service |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `inspectConBatchId` | 质检连续批id | `QMSDFM.inspectconbatch.InspectConBatch` | Service |  |
| 4 | `id` | 检验单id | `QMSQIT.incominspectorder.qms_qit_incominspectorder_h` | None | true |
