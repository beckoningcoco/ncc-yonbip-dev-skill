---
tags: ["BIP", "元数据", "数据字典", "ycBusinessCenter", "cpu-contract.salecontract.SaleContractExpVO"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 销售合同表体费用 (`cpu-contract.salecontract.SaleContractExpVO`)

> ycBusinessCenter | 物理表：`cpu_sale_ct_exp`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 销售合同表体费用 |
| 物理表 | `cpu_sale_ct_exp` |
| domain/服务域 | `cpu-contract` |
| schema | `cpu_cooperation` |
| 所属应用 | `ycBusinessCenter` |
| 构建时间 | `2026-06-04 23:43:16.7940` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（10个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `saleContractId` | 销售合同主表id | `sale_contract_id` | fc6e46f3-a338-4c53-b55a-2c3336f30dd0 |
| 2 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 3 | `id` | ID | `id` | Long |
| 4 | `enterpriseId` | 所属租户id | `enterprise_id` | Long |
| 5 | `expcode` | 费用编码 | `expcode` | String |
| 6 | `expname` | 费用名称 | `expname` | String |
| 7 | `expsum` | 费用金额 | `expsum` | Decimal |
| 8 | `memo` | 备注 | `memo` | String |
| 9 | `purContractExpId` | 采购合同费用表id | `pur_contract_exp_id` | Long |
| 10 | `pubts` | 时间戳 | `ts` | DateTime |

---

## 关联属性（2个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `saleContractId` | 销售合同主表id | `cpu-contract.salecontract.SaleContractVO` | None | true |
