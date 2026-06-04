---
tags: ["BIP", "元数据", "数据字典", "ycBusinessCenter", "cpu-contract.salecontractnew.SaleContractTermChangeVO"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 销售合同表体条款 (`cpu-contract.salecontractnew.SaleContractTermChangeVO`)

> ycBusinessCenter | 物理表：`cpu_sale_ct_term_history`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 销售合同表体条款 |
| 物理表 | `cpu_sale_ct_term_history` |
| 数据库 schema | `cpu-contract` |
| 所属应用 | `ycBusinessCenter` |
| 构建时间 | `2026-06-04 23:43:31.8260` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（16个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `id` | ID | `id` | Long |
| 2 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 3 | `saleContractHistoryId` | 合同历史主表id | `sale_contract_history_id` | 0916e926-2a68-41cc-8d23-29075405e8de |
| 4 | `dr` | dr | `dr` | Integer |
| 5 | `saleContractId` | 合同主表id | `sale_contract_id` | fc6e46f3-a338-4c53-b55a-2c3336f30dd0 |
| 6 | `enterpriseId` | 所属租户id | `enterprise_id` | Long |
| 7 | `termcode` | 条款编码 | `termcode` | String |
| 8 | `termname` | 条款名称 | `termname` | String |
| 9 | `termtypename` | 条款类型 | `termtypename` | String |
| 10 | `termcontent` | 条款内容 | `termcontent` | String |
| 11 | `memo` | 备注 | `memo` | String |
| 12 | `otherinfo` | 其它信息 | `otherinfo` | String |
| 13 | `purContractTermId` | 采购合同条款id | `pur_contract_term_id` | Long |
| 14 | `changingAction` | 变更动作 | `changing_action` | String |
| 15 | `changingInfo` | 变更信息 | `changing_info` | String |
| 16 | `pubts` | 时间戳 | `ts` | DateTime |

---

## 关联属性（3个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `saleContractHistoryId` | 合同历史主表id | `cpu-contract.salecontractnew.SaleContractChangeVO` | None | true |
| 3 | `saleContractId` | 合同主表id | `cpu-contract.salecontract.SaleContractVO` | None |  |
