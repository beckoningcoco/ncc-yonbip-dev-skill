---
tags: ["BIP", "元数据", "数据字典", "IMP_PES", "pes.smsContracts.SmsContractsDetail"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 服务合同详细 (`pes.smsContracts.SmsContractsDetail`)

> IMP_PES | 物理表：`sms_contracts_detail`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 服务合同详细 |
| 物理表 | `sms_contracts_detail` |
| 数据库 schema | `imppes` |
| 所属应用 | `IMP_PES` |
| 构建时间 | `2026-06-05 17:20:07.2340` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | String | id |

---

## 直接属性（22个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `createTimeStr` | 创建时间 | `create_time` | String |
| 2 | `createUser` | 创建者 | `create_user` | String |
| 3 | `dateEffect` | 生效日期 | `date_effect` | DateTime |
| 4 | `dateExpire` | 失效日期 | `date_expire` | DateTime |
| 5 | `dr` | DR | `dr` | Short |
| 6 | `equId` | 设备 | `equ_id` | e9f23971-1c19-49e1-83d7-3a84ebcb187e |
| 7 | `id` | id | `id` | String |
| 8 | `lastModified` | 最近修改时间 | `last_modified` | String |
| 9 | `lastModifyUser` | 最近修改者 | `last_modify_user` | String |
| 10 | `maintenanceLevel` | 维保级别 | `maintenance_level` | f22f58a8-b92b-4775-a182-d1f402b7b1b3 |
| 11 | `memo` | 描述 | `memo` | String |
| 12 | `num` | 数量 | `num` | Integer |
| 13 | `productId` | 产品 | `product_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 14 | `pubts` | 时间戳 | `pubts` | DateTime |
| 15 | `serialNum` | 序列号 | `serial_num` | String |
| 16 | `serviceLevel` | 服务级别 | `service_level` | 34896e73-3827-4b0a-b2f3-585f858bec1a |
| 17 | `smsContractsId` | 服务合同 | `smsContracts_id` | eafb7e7b-746e-4b48-8773-e48df89613f1 |
| 18 | `tenant` | 租户ID | `tenant_id` | String |
| 19 | `ts` | 版本号 | `ts` | String |
| 20 | `unit` | 单位 | `unit` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 21 | `userDefineCharacter` | 自定义项特征 | `user_define_character` | 78570bc1-bd84-4190-9c8c-6c5e85bb5a65 |
| 22 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（8个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `equId` | 设备 | `aim.equip.EquipHeadVO` | Service |  |
| 2 | `smsContractsId` | 服务合同 | `pes.smsContracts.SmsContracts` | None | true |
| 3 | `unit` | 单位 | `pc.unit.Unit` | Service |  |
| 4 | `productId` | 产品 | `pc.product.Product` | Service |  |
| 5 | `userDefineCharacter` | 自定义项特征 | `pes.smsContracts.SmsContractsDetailDefineCharacter` | None |  |
| 6 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 7 | `maintenanceLevel` | 维保级别 | `pes.maintenanceLevel.MaintenanceLevel` | None |  |
| 8 | `serviceLevel` | 服务级别 | `pes.servicelevel.ServiceLevelVO` | None |  |
