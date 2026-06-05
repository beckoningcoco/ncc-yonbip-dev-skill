---
tags: ["BIP", "元数据", "数据字典", "QIC", "QMSDFM.dfmCheck.QmsDfmCheckRecordExpinfo"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 检验记录扩展信息 (`QMSDFM.dfmCheck.QmsDfmCheckRecordExpinfo`)

> QIC | 物理表：`qms_dfm_check_record_expinfo`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 检验记录扩展信息 |
| 物理表 | `qms_dfm_check_record_expinfo` |
| 数据库 schema | `QMS-DFM` |
| 所属应用 | `QIC` |
| 构建时间 | `2026-06-05 16:44:24.3340` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | 631cb01f-3080-4010-9744-e5b5bea34d6a | 检验记录id |

---

## 直接属性（16个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 2 | `id` | 检验记录id | `id` | 631cb01f-3080-4010-9744-e5b5bea34d6a |
| 3 | `sourceOrderLineNo` | 请检来源订单行号 | `source_order_line_no` | Decimal |
| 4 | `sourceOrderType` | 请检来源订单类型 | `source_order_type` | String |
| 5 | `sourceOrderCode` | 请检来源订单号 | `source_order_code` | String |
| 6 | `sampleRecordCode` | 样品编号 | `sample_record_code` | String |
| 7 | `batchNoId` | 批次号id | `batch_no_id` | 9458cb44-2675-4988-8e64-f6a59fefed89 |
| 8 | `dr` | 逻辑删除标记 | `dr` | Short |
| 9 | `pubts` | 时间戳 | `pubts` | DateTime |
| 10 | `customId` | 客户 | `customer_id` | 94b3280a-27a4-485a-b90b-b7bce57c6df2 |
| 11 | `inspectRule` | 检验规则 | `inspect_rule` | String |
| 12 | `invInspectExchRate` | 质检换算率 | `invinspectexchrate` | Decimal |
| 13 | `invInspectExchRateDen` | 质检换算率分母 | `invinspectexchrateden` | Decimal |
| 14 | `invInspectExchRateNum` | 质检换算率分子 | `invinspectexchratenum` | Decimal |
| 15 | `invStockExchRateDen` | 库存换算率分母 | `invstockexchrateden` | Decimal |
| 16 | `invStockExchRateNum` | 库存换算率分子 | `invstockexchratenum` | Decimal |

---

## 关联属性（4个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `batchNoId` | 批次号id | `st.batchno.Batchno` | Service |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `id` | 检验记录id | `QMSDFM.dfmCheck.QmsDfmCheckRecord` | None | true |
| 4 | `customId` | 客户 | `aa.merchant.Merchant` | Service |  |
