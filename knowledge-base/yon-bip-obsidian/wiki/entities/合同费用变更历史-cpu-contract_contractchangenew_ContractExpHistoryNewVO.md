---
tags: ["BIP", "元数据", "数据字典", "ycContractManagement", "cpu-contract.contractchangenew.ContractExpHistoryNewVO"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 合同费用变更历史 (`cpu-contract.contractchangenew.ContractExpHistoryNewVO`)

> ycContractManagement | 物理表：`cpu_ct_exp_history`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 合同费用变更历史 |
| 物理表 | `cpu_ct_exp_history` |
| domain/服务域 | `cpu-contract` |
| schema | `cpu_cooperation` |
| 所属应用 | `ycContractManagement` |
| 构建时间 | `2026-06-04 23:44:19.4540` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（13个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `id` | ID | `id` | Long |
| 2 | `contractExpId` | 原合同条款id | `contract_exp_id` | f3b75c79-a95a-482b-91d7-ea85bc73d96e |
| 3 | `enterpriseId` | 所属租户id(供应商) | `enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 4 | `expcode` | 费用编码 | `expcode` | String |
| 5 | `expname` | 费用名称 | `expname` | String |
| 6 | `expsum` | 费用金额 | `expsum` | Decimal |
| 7 | `memo` | 备注 | `memo` | String |
| 8 | `contractHistoryId` | 合同历史主表id | `contract_history_id` | 49f97b1c-2c1f-4fc9-855d-6a465985bdf3 |
| 9 | `contractId` | 合同主表主键 | `contract_id` | 6c20fd57-9f69-497e-a1af-d0b30f9be5c3 |
| 10 | `dr` | dr | `dr` | Integer |
| 11 | `pubts` | 时间戳 | `ts` | DateTime |
| 12 | `ts` | 时间戳 | `ts` | DateTime |
| 13 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（5个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `contractId` | 合同主表主键 | `cpu-contract.contract.ContractVO` | None |  |
| 3 | `enterpriseId` | 所属租户id(供应商) | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 4 | `contractHistoryId` | 合同历史主表id | `cpu-contract.contractchangenew.ContractHistryNewVO` | None | true |
| 5 | `contractExpId` | 原合同条款id | `cpu-contract.contract.ContractExpVO` | None |  |
