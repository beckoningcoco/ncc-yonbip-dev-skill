---
tags: ["BIP", "元数据", "数据字典", "QIC", "QMSDFM.sampleMethod.sampleSize"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 样本个数 (`QMSDFM.sampleMethod.sampleSize`)

> QIC | 物理表：`qms_dfm_samplesize`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 样本个数 |
| 物理表 | `qms_dfm_samplesize` |
| 数据库 schema | `QMS-DFM` |
| 所属应用 | `QIC` |
| 构建时间 | `2026-06-05 16:47:20.2590` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | String | ID |

---

## 直接属性（13个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 2 | `tenant` | 租户ID | `tenant_id` | String |
| 3 | `id` | ID | `id` | String |
| 4 | `sampleMethodDetailId` | 取样方式主表id | `sample_method_detail_id` | 5653b278-1a57-42ea-81ab-e579e060556a |
| 5 | `row_no` | 序号 | `row_no` | Integer |
| 6 | `start_quantity` | 起始数量 | `start_quantity` | Long |
| 7 | `end_quantity` | 终止数量 | `end_quantity` | Long |
| 8 | `sample_number` | 样本个数 | `sample_number` | Long |
| 9 | `ac` | Ac | `ac` | Long |
| 10 | `re` | Re | `re` | Long |
| 11 | `pubts` | 时间戳 | `pubts` | DateTime |
| 12 | `dr` | 逻辑删除标记 | `dr` | Short |
| 13 | `definect_b` | 自定义项特征组 | `definect_b` | 57f1f2b7-2acc-44c6-a6ea-20df206a0a00 |

---

## 关联属性（3个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `definect_b` | 自定义项特征组 | `QMSDFM.sampleMethod.SampleSizeDefineCharacter` | None |  |
| 3 | `sampleMethodDetailId` | 取样方式主表id | `QMSDFM.sampleMethod.sampleMethodDetail` | None | true |
