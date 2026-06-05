---
tags: ["BIP", "元数据", "数据字典", "IMP_PES", "pes.pos.PosPerson"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 服务点人员 (`pes.pos.PosPerson`)

> IMP_PES | 物理表：`sms_pos_persons`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 服务点人员 |
| 物理表 | `sms_pos_persons` |
| 数据库 schema | `imppes` |
| 所属应用 | `IMP_PES` |
| 构建时间 | `2026-06-05 17:19:58.6270` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | String | ID |

---

## 直接属性（18个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `posId` | 服务点id | `pos_id` | c685b8cd-eb64-47a1-b5a2-fcf3296b3c7d |
| 2 | `personId` | 人员id | `person_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 3 | `personCode` | 人员编码 | `person_code` | String |
| 4 | `personName` | 人员名称 | `person_name` | String |
| 5 | `personPhone` | 人员电话 | `person_phone` | String |
| 6 | `personEmail` | 人员Email | `person_email` | String |
| 7 | `defaultPos` | 默认服务点 | `default_pos` | Short |
| 8 | `userDefineCharacter` | 自定义项特征 | `user_define_character` | e79cc30c-3454-46a6-a6ee-edbb4bc312fa |
| 9 | `id` | ID | `id` | String |
| 10 | `tenant` | 租户ID | `tenant_id` | String |
| 11 | `createTimeStr` | 创建时间 | `create_time` | String |
| 12 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 13 | `dr` | 逻辑删除 | `dr` | Integer |
| 14 | `lastModified` | 最近修改时间 | `last_modified` | String |
| 15 | `lastModifyUser` | 最近修改者 | `last_modify_user` | String |
| 16 | `createUser` | 创建者 | `create_user` | String |
| 17 | `ts` | 版本号 | `ts` | String |
| 18 | `pubts` | 时间戳 | `pubts` | DateTime |

---

## 关联属性（4个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `posId` | 服务点id | `pes.pos.Pos` | None | true |
| 2 | `userDefineCharacter` | 自定义项特征 | `pes.pos.SmsPosPersonsDefineCharacter` | None |  |
| 3 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 4 | `personId` | 人员id | `bd.staff.Staff` | Service |  |
