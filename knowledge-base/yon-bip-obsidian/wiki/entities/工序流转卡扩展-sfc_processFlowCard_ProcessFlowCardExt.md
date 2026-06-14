---
tags: ["BIP", "元数据", "数据字典", "IMPSFC", "sfc.processFlowCard.ProcessFlowCardExt"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 工序流转卡扩展 (`sfc.processFlowCard.ProcessFlowCardExt`)

> IMPSFC | 物理表：`imp_sfc_procflowcard_ext`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 工序流转卡扩展 |
| 物理表 | `imp_sfc_procflowcard_ext` |
| domain/服务域 | `IMP-SFC` |
| schema | `production_order` |
| 所属应用 | `IMPSFC` |
| 构建时间 | `2026-06-05 09:22:27.5120` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | a1d46721-c171-401e-9f07-ef70a36e2abf | 工序流转卡id |

---

## 直接属性（9个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `changeRateDen` | 生产换算率分母 | `change_rateden` | Decimal |
| 2 | `changeRateNum` | 生产换算率分子 | `change_ratenum` | Decimal |
| 3 | `closeRemark` | 关闭说明 | `close_remark` | String |
| 4 | `dr` | 逻辑删除标记 | `dr` | Short |
| 5 | `holdDesc` | 挂起说明 | `hold_desc` | String |
| 6 | `id` | 工序流转卡id | `id` | a1d46721-c171-401e-9f07-ef70a36e2abf |
| 7 | `pubts` | 时间戳 | `pubts` | DateTime |
| 8 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 9 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（3个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `id` | 工序流转卡id | `sfc.processFlowCard.processFlowCard` | None | true |
| 3 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
