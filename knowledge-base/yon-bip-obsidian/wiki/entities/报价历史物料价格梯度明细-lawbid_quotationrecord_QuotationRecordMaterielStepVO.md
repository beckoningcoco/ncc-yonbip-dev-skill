---
tags: ["BIP", "元数据", "数据字典", "ycSouringBid", "lawbid.quotationrecord.QuotationRecordMaterielStepVO"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 报价历史物料价格梯度明细 (`lawbid.quotationrecord.QuotationRecordMaterielStepVO`)

> **平台版本：BIP 旗舰版 V5**

> ycSouringBid 模块 | 物理表：`cpu_quotation_record_materiel_step`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 报价历史物料价格梯度明细 |
| 物理表 | `cpu_quotation_record_materiel_step` |
| 数据库 schema | `yonbip-cpu-lawbid` |
| 所属应用 | `ycSouringBid` |
| 构建时间 | `2026-06-04 20:16:44.5320` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | id |

## 部署信息

- 部署时间: 2025-10-24 23:57:01:000

## 依赖接口（2个）

| # | 接口名 | URI | 版本 |
|---|--------|-----|------|
| 1 | 统一租户接口 | `ucfbase.ucfbaseItf.IYTenant` | 40 |
| 2 | 逻辑删除相关 | `ucfbase.ucfbaseItf.LogicDelete` | 74 |

---

## 直接属性（6个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `id` | id | `id` | Long |
| 2 | `materialDetailId` | 谈判报价单物料ID | `material_detail_id` | c4231859-aa3f-4a94-ba39-d707b60f5f83 |
| 3 | `stepDetailId` | 阶梯价子表id | `step_detail_id` | 02c5d065-2e0e-435a-82c2-edd034ab6eef |
| 4 | `dr` | 逻辑删除标记 | `dr` | Short |
| 5 | `pubts` | 时间戳 | `pubts` | DateTime |
| 6 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（3个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `stepDetailId` | 阶梯价子表id | `aa.quotation.BiQuotationBody` | Service |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `materialDetailId` | 谈判报价单物料ID | `lawbid.quotationrecord.QuotationRecordMaterielVO` | None | true |
