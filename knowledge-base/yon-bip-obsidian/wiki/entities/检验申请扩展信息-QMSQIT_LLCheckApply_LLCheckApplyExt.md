---
tags: ["BIP", "元数据", "数据字典", "QMSQIT", "QMSQIT.LLCheckApply.LLCheckApplyExt"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 检验申请扩展信息 (`QMSQIT.LLCheckApply.LLCheckApplyExt`)

> QMSQIT | 物理表：`qms_qit_llcheckapply_ext`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 检验申请扩展信息 |
| 物理表 | `qms_qit_llcheckapply_ext` |
| 数据库 schema | `QMS-QIT` |
| 所属应用 | `QMSQIT` |
| 构建时间 | `2026-06-05 16:42:37.6010` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | 0eee67eb-f19b-41be-bd6c-2bb2c555d489 | 检验申请id |

---

## 直接属性（21个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 2 | `id` | 检验申请id | `id` | 0eee67eb-f19b-41be-bd6c-2bb2c555d489 |
| 3 | `generateSampleNum` | 生成样品数量 | `generate_sample_num` | Decimal |
| 4 | `isMultiInspect` | 多版本检验 | `is_multiinspect` | Short |
| 5 | `sampleStatus` | 取样状态 | `sample_status` | Short |
| 6 | `samplePrepaStatus` | 制样状态 | `sampleprepa_status` | Short |
| 7 | `originalRecordStatus` | 原始记录状态 | `originalrecord_status` | Short |
| 8 | `sampleRecordCode` | 样品编码 | `sample_record_code` | String |
| 9 | `firstCheck` | 首检 | `first_check` | String |
| 10 | `inspectConBatchId` | 质检连续批id | `inspectconbatch_id` | 828b5bcd-9583-4175-90a0-1473d0768ed1 |
| 11 | `dr` | 逻辑删除标记 | `dr` | Short |
| 12 | `out_sys_id` | 外部来源线索 | `out_sys_id` | String |
| 13 | `out_sys_code` | 外部来源编码 | `out_sys_code` | String |
| 14 | `out_sys_version` | 外部来源版本 | `out_sys_version` | String |
| 15 | `out_sys_type` | 外部来源类型 | `out_sys_type` | String |
| 16 | `pubts` | 时间戳 | `pubts` | DateTime |
| 17 | `invInspectExchRate` | 质检换算率 | `invinspectexchrate` | Decimal |
| 18 | `invInspectExchRateDen` | 质检换算率分母 | `invinspectexchrateden` | Decimal |
| 19 | `invInspectExchRateNum` | 质检换算率分子 | `invinspectexchratenum` | Decimal |
| 20 | `invStockExchRateDen` | 库存换算率分母 | `invstockexchrateden` | Decimal |
| 21 | `invStockExchRateNum` | 库存换算率分子 | `invstockexchratenum` | Decimal |

---

## 关联属性（3个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `inspectConBatchId` | 质检连续批id | `QMSDFM.inspectconbatch.InspectConBatch` | Service |  |
| 3 | `id` | 检验申请id | `QMSQIT.LLCheckApply.LLCheckApply` | None | true |
