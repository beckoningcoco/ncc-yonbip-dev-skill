---
tags: ["BIP", "元数据", "数据字典", "ycBusinessCenter", "cpu-contract.salecontract.SaleContractTermVO"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 销售合同表体条款 (`cpu-contract.salecontract.SaleContractTermVO`)

> ycBusinessCenter | 物理表：`cpu_sale_ct_term`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 销售合同表体条款 |
| 物理表 | `cpu_sale_ct_term` |
| 数据库 schema | `cpu-contract` |
| 所属应用 | `ycBusinessCenter` |
| 构建时间 | `2026-06-04 23:43:20.7810` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（15个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 2 | `id` | ID | `id` | Long |
| 3 | `memo` | 备注 | `memo` | String |
| 4 | `enterpriseId` | 所属租户id | `enterprise_id` | Long |
| 5 | `termcode` | 条款编码 | `termcode` | String |
| 6 | `termname` | 条款名称 | `termname` | String |
| 7 | `termtypename` | 条款类型 | `termtypename` | String |
| 8 | `termcontent` | 条款内容 | `termcontent` | String |
| 9 | `otherinfo` | 其它信息 | `otherinfo` | String |
| 10 | `purContractTermId` | 采购合同条款id | `pur_contract_term_id` | Long |
| 11 | `changingAction` | 变更动作 | `changing_action` | String |
| 12 | `changingInfo` | 变更信息 | `changing_info` | String |
| 13 | `saleContractId` | 合同主表id | `sale_contract_id` | fc6e46f3-a338-4c53-b55a-2c3336f30dd0 |
| 14 | `dr` | 删除标识 | `dr` | Integer |
| 15 | `pubts` | 时间戳 | `ts` | DateTime |

---

## 关联属性（2个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `saleContractId` | 合同主表id | `cpu-contract.salecontract.SaleContractVO` | None | true |
