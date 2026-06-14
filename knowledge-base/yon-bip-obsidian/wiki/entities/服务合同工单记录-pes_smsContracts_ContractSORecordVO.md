---
tags: ["BIP", "元数据", "数据字典", "IMP_PES", "pes.smsContracts.ContractSORecordVO"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 服务合同工单记录 (`pes.smsContracts.ContractSORecordVO`)

> IMP_PES | 物理表：`sms_contract_record`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 服务合同工单记录 |
| 物理表 | `sms_contract_record` |
| domain/服务域 | `imppes` |
| 所属应用 | `IMP_PES` |
| 构建时间 | `2026-06-05 17:19:34.0290` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（5个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `soId` | 工单Id | `so_id` | 18332b41-ebd3-4301-90af-714dfea07d9f |
| 2 | `smsContractsId` | 服务合同 | `contracts_id` | eafb7e7b-746e-4b48-8773-e48df89613f1 |
| 3 | `id` | ID | `id` | Long |
| 4 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 5 | `pubts` | 时间戳 | `pubts` | DateTime |

---

## 关联属性（3个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `smsContractsId` | 服务合同 | `pes.smsContracts.SmsContracts` | None | true |
| 2 | `soId` | 工单Id | `pes.sos.SmsSos` | None |  |
| 3 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
