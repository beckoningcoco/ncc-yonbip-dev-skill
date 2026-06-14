---
tags: ["BIP", "元数据", "数据字典", "ycBusinessCenter", "cpu-contract.salecontractnew.SaleContractOrgScopeChangeVO"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 销售合同适应组织 (`cpu-contract.salecontractnew.SaleContractOrgScopeChangeVO`)

> ycBusinessCenter | 物理表：`cpu_sale_ct_org_scope_history`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 销售合同适应组织 |
| 物理表 | `cpu_sale_ct_org_scope_history` |
| domain/服务域 | `cpu-contract` |
| schema | `cpu_cooperation` |
| 所属应用 | `ycBusinessCenter` |
| 构建时间 | `2026-06-04 23:43:29.1270` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | id |

---

## 直接属性（16个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `id` | id | `id` | Long |
| 2 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 3 | `saleContractHistoryId` | 合同历史主表id | `sale_contract_history_id` | 0916e926-2a68-41cc-8d23-29075405e8de |
| 4 | `saleContractId` | 主表id | `sale_contract_id` | fc6e46f3-a338-4c53-b55a-2c3336f30dd0 |
| 5 | `purContractScopeHistoryId` | 采购合同执行组织Id | `pur_contract_scope_history_id` | Long |
| 6 | `enterpriseId` | enterpriseId | `enterprise_id` | Long |
| 7 | `purOrgScopeId` | 采购合同执行组织Id | `pur_org_scope_id` | String |
| 8 | `enterpriseName` | enterpriseName | `enterprise_name` | String |
| 9 | `puorgId` | 采购组织id | `pu_org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 10 | `puorgCode` | 组织编码 | `pu_org_code` | String |
| 11 | `puorgName` | 组织名称 | `pu_org_name` | String |
| 12 | `dr` | dr | `dr` | Integer |
| 13 | `ts` | ts | `ts` | DateTime |
| 14 | `changingAction` | 变更动作 | `changing_action` | String |
| 15 | `changingInfo` | 变更信息 | `changing_info` | String |
| 16 | `pubts` | 时间戳 | `ts` | DateTime |

---

## 关联属性（4个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `puorgId` | 采购组织id | `org.func.BaseOrg` | Service |  |
| 3 | `saleContractHistoryId` | 合同历史主表id | `cpu-contract.salecontractnew.SaleContractChangeVO` | None | true |
| 4 | `saleContractId` | 主表id | `cpu-contract.salecontract.SaleContractVO` | None |  |
