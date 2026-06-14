---
tags: ["BIP", "元数据", "数据字典", "ycContractManagement", "cpu-contract.contractchangenew.ContractOrgScopeHistoryNewVO"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 合同适应组织变更历史 (`cpu-contract.contractchangenew.ContractOrgScopeHistoryNewVO`)

> ycContractManagement | 物理表：`cpu_ct_org_scope_history`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 合同适应组织变更历史 |
| 物理表 | `cpu_ct_org_scope_history` |
| domain/服务域 | `cpu-contract` |
| schema | `cpu_cooperation` |
| 所属应用 | `ycContractManagement` |
| 构建时间 | `2026-06-04 23:44:23.7660` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | id |

---

## 直接属性（15个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `contractHistoryId` | 合同历史主表id | `contract_history_id` | Long |
| 2 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 3 | `id` | id | `id` | Long |
| 4 | `contractId` | contractId | `contract_id` | 6c20fd57-9f69-497e-a1af-d0b30f9be5c3 |
| 5 | `contractOrgId` | 原合同适用组织id | `contract_org_id` | Long |
| 6 | `enterpriseId` | enterpriseId | `enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 7 | `enterpriseName` | enterpriseName | `enterprise_name` | String |
| 8 | `puorgId` | 组织id | `pu_org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 9 | `puorgName` | 组织名称 | `pu_org_name` | String |
| 10 | `puorgCode` | 组织编码 | `pu_org_code` | String |
| 11 | `dr` | dr | `dr` | Integer |
| 12 | `ts` | ts | `ts` | DateTime |
| 13 | `changingAction` | changingAction | `changing_action` | String |
| 14 | `changingInfo` | changingInfo | `changing_info` | String |
| 15 | `pubts` | 时间戳 | `ts` | DateTime |

---

## 关联属性（4个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `contractId` | contractId | `cpu-contract.contract.ContractVO` | None |  |
| 3 | `puorgId` | 组织id | `org.func.BaseOrg` | Service |  |
| 4 | `enterpriseId` | enterpriseId | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
