---
tags: ["BIP", "元数据", "数据字典", "ycBusinessCenter", "cpu-contract.salecontractnew.SaleContractExpChangeVO"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 销售合同表体费用 (`cpu-contract.salecontractnew.SaleContractExpChangeVO`)

> ycBusinessCenter | 物理表：`cpu_sale_ct_exp`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 销售合同表体费用 |
| 物理表 | `cpu_sale_ct_exp` |
| 数据库 schema | `cpu-contract` |
| 所属应用 | `ycBusinessCenter` |
| 构建时间 | `2026-06-04 23:43:26.4340` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（11个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `id` | ID | `id` | Long |
| 2 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 3 | `saleContractHistoryId` | 合同历史主表id | `sale_contract_history_id` | 0916e926-2a68-41cc-8d23-29075405e8de |
| 4 | `saleContractId` | 销售合同主表id | `sale_contract_id` | fc6e46f3-a338-4c53-b55a-2c3336f30dd0 |
| 5 | `enterpriseId` | 所属租户id | `enterprise_id` | Long |
| 6 | `expcode` | 费用编码 | `expcode` | String |
| 7 | `expname` | 费用名称 | `expname` | String |
| 8 | `expsum` | 费用金额 | `expsum` | Decimal |
| 9 | `memo` | 备注 | `memo` | String |
| 10 | `purContractExpId` | 采购合同费用表id | `pur_contract_exp_id` | Long |
| 11 | `pubts` | 时间戳 | `ts` | DateTime |

---

## 关联属性（3个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `saleContractHistoryId` | 合同历史主表id | `cpu-contract.salecontractnew.SaleContractChangeVO` | None | true |
| 3 | `saleContractId` | 销售合同主表id | `cpu-contract.salecontract.SaleContractVO` | None |  |
