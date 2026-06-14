---
tags: ["BIP", "元数据", "数据字典", "ycContractManagement", "cpu-contract.contractchangenew.ContractTermHistoryNewVO"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 合同条款变更历史 (`cpu-contract.contractchangenew.ContractTermHistoryNewVO`)

> ycContractManagement | 物理表：`cpu_ct_term_history`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 合同条款变更历史 |
| 物理表 | `cpu_ct_term_history` |
| domain/服务域 | `cpu-contract` |
| schema | `cpu_cooperation` |
| 所属应用 | `ycContractManagement` |
| 构建时间 | `2026-06-04 23:44:29.1880` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | 变量内容 |

---

## 直接属性（27个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `rowNum` | 序号 | `row_num` | Integer |
| 2 | `contractHistoryId` | 合同历史主表id | `contract_history_id` | 49f97b1c-2c1f-4fc9-855d-6a465985bdf3 |
| 3 | `contractTermId` | 原合同条款id | `contract_term_id` | 873806f0-228c-4dbd-9efc-0e107fa57891 |
| 4 | `contractId` | 合同主表id | `contract_id` | 6c20fd57-9f69-497e-a1af-d0b30f9be5c3 |
| 5 | `termInputId` | 条款输入id | `term_input_id` | Long |
| 6 | `dr` | dr | `dr` | Integer |
| 7 | `ts` | 时间戳 | `ts` | DateTime |
| 8 | `pubts` | 时间戳 | `ts` | DateTime |
| 9 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 10 | `enterpriseId` | 所属租户id | `enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 11 | `termcode` | 条款编码 | `termcode` | String |
| 12 | `termname` | 条款名称 | `termname` | String |
| 13 | `termtypename` | 条款类型 | `termtypename` | String |
| 14 | `termcontent` | 条款内容 | `termcontent` | String |
| 15 | `number` | 变量序号 | `number` | Integer |
| 16 | `inputValue` | 变量内容 | `input_value` | String |
| 17 | `id` | 变量内容 | `id` | Long |
| 18 | `memo` | 备注 | `memo` | String |
| 19 | `otherinfo` | 其它信息 | `otherinfo` | String |
| 20 | `termDocCode` | 条款档案code | `term_doc_code` | String |
| 21 | `inputType` | 输入类型 | `input_type` | String |
| 22 | `inputValues` | 输入选择值 | `input_values` | String |
| 23 | `defaultValue` | 默认值 | `default_value` | String |
| 24 | `defaultValueEditable` | 默认值是否可编辑 | `default_value_editable` | Boolean |
| 25 | `changingAction` | 变更动作:删除原协议、变更协议、新增协议 | `changing_action` | String |
| 26 | `changingInfo` | 变更信息 | `changing_info` | String |
| 27 | `termDocId` | 条款id | `term_doc_id` | Long |

---

## 关联属性（5个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `contractId` | 合同主表id | `cpu-contract.contract.ContractVO` | None |  |
| 3 | `contractTermId` | 原合同条款id | `cpu-contract.contract.ContractTermVO` | None |  |
| 4 | `enterpriseId` | 所属租户id | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 5 | `contractHistoryId` | 合同历史主表id | `cpu-contract.contractchangenew.ContractHistryNewVO` | None | true |
