---
tags: ["BIP", "元数据", "数据字典", "ycContractManagement", "cpu-contract.contractchangenew.ContractSignPartyHistory"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 合同签署方 (`cpu-contract.contractchangenew.ContractSignPartyHistory`)

> ycContractManagement | 物理表：`cpu_ct_sign_party_history`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 合同签署方 |
| 物理表 | `cpu_ct_sign_party_history` |
| domain/服务域 | `cpu-contract` |
| schema | `cpu_cooperation` |
| 所属应用 | `ycContractManagement` |
| 构建时间 | `2026-06-04 23:44:27.8870` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（20个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `address` | 通讯地址 | `address` | String |
| 2 | `orgId` | 组织 | `org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 3 | `onlineSign` | 是否线上签署 | `online_sign` | Boolean |
| 4 | `signOrder` | 签署顺序 | `sign_order` | Integer |
| 5 | `ContractSignPartyHistoryChd` | 签署方变更特征属性组 | `his_chd_id` | fd260b8f-4f0e-4115-a5d9-6404687e5bd7 |
| 6 | `dr` | 逻辑删除标记 | `dr` | Short |
| 7 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 8 | `memo` | 备注 | `memo` | String |
| 9 | `ytenantId` | 租户id | `ytenant_id` | String |
| 10 | `type` | 关联客商类型 | `type` | String |
| 11 | `ContractSignPartyChdId` | 采购合同签署方特征属性组 | `chd_id` | f2a2734d-1120-4671-b4e7-ca5a7832db89 |
| 12 | `contractPartySignId` | contractPartySignId | `contractPartySignId` | Long |
| 13 | `phone` | 联系电话 | `phone` | String |
| 14 | `supplydocId` | 供应商档案ID | `supplydoc_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e |
| 15 | `customerId` | 客户目录 | `customer_id` | 94b3280a-27a4-485a-b90b-b7bce57c6df2 |
| 16 | `contractId` | 合同主表id | `contract_id` | 6c20fd57-9f69-497e-a1af-d0b30f9be5c3 |
| 17 | `id` | ID | `id` | Long |
| 18 | `contractHistoryId` | 合同主表id | `contract_history_id` | 49f97b1c-2c1f-4fc9-855d-6a465985bdf3 |
| 19 | `ts` | 时间戳 | `ts` | DateTime |
| 20 | `pubts` | 时间戳 | `ts` | DateTime |

---

## 关联属性（8个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ContractSignPartyChdId` | 采购合同签署方特征属性组 | `cpu-contract.contract.ContractSignPartyChd` | None |  |
| 2 | `ContractSignPartyHistoryChd` | 签署方变更特征属性组 | `cpu-contract.contractchangenew.ContractSignPartyhistoryChd` | None |  |
| 3 | `supplydocId` | 供应商档案ID | `aa.vendor.Vendor` | Service |  |
| 4 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 5 | `customerId` | 客户目录 | `aa.merchant.Merchant` | Service |  |
| 6 | `contractId` | 合同主表id | `cpu-contract.contract.ContractVO` | None |  |
| 7 | `contractHistoryId` | 合同主表id | `cpu-contract.contractchangenew.ContractHistryNewVO` | None | true |
| 8 | `orgId` | 组织 | `org.func.BaseOrg` | Service |  |
