---
tags: ["BIP", "元数据", "数据字典", "IMP_PES", "pes.equip.EquipServiceInfoDetail"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 设备服务信息详情 (`pes.equip.EquipServiceInfoDetail`)

> IMP_PES | 物理表：`sms_sis_detail`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 设备服务信息详情 |
| 物理表 | `sms_sis_detail` |
| domain/服务域 | `imppes` |
| 所属应用 | `IMP_PES` |
| 构建时间 | `2026-06-05 17:18:36.9100` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（13个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `serviceOrgId` | 服务组织 | `service_org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 2 | `vendorId` | 服务商 | `vendor_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e |
| 3 | `posId` | 服务点 | `pos_id` | c685b8cd-eb64-47a1-b5a2-fcf3296b3c7d |
| 4 | `serviceTeamId` | 服务团队 | `serviceTeam_id` | 7b7859d5-26ea-433e-8fee-007cb85c64d7 |
| 5 | `serverPersonId` | 服务人员 | `server_person_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 6 | `serverContact` | 联系人员联系方式 | `server_contact` | String |
| 7 | `deptId` | 服务部门 | `dept_id` | ca871996-b447-42f9-8dac-dd7c21ee0662 |
| 8 | `siId` | 设备服务信息ID | `si_id` | 4ba8e18b-e89c-47e4-9531-0886b549774d |
| 9 | `UserDefineCharacter` | 自定义项特征 | `user_define_character` | 8a4b154f-6a0f-4a32-8c7a-4e37d5f6a6b3 |
| 10 | `id` | ID | `id` | Long |
| 11 | `tenant` | 租户ID | `tenant_id` | String |
| 12 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 13 | `pubts` | 时间戳 | `pubts` | DateTime |

---

## 关联属性（9个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `posId` | 服务点 | `pes.pos.Pos` | None |  |
| 2 | `serverPersonId` | 服务人员 | `bd.staff.Staff` | Service |  |
| 3 | `siId` | 设备服务信息ID | `pes.equip.EquipServiceInfo` | None | true |
| 4 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 5 | `deptId` | 服务部门 | `bd.adminOrg.DeptOrgVO` | Service |  |
| 6 | `serviceOrgId` | 服务组织 | `org.func.BaseOrg` | Service |  |
| 7 | `UserDefineCharacter` | 自定义项特征 | `pes.equip.EquipServiceInfoDetailDefineCharacter` | None |  |
| 8 | `vendorId` | 服务商 | `aa.vendor.Vendor` | Service |  |
| 9 | `serviceTeamId` | 服务团队 | `pes.serviceTeam.serviceTeam` | None |  |
