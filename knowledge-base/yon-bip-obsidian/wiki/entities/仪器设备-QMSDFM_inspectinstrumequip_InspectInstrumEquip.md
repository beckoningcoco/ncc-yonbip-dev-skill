---
tags: ["BIP", "元数据", "数据字典", "QIC", "QMSDFM.inspectinstrumequip.InspectInstrumEquip"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 仪器设备 (`QMSDFM.inspectinstrumequip.InspectInstrumEquip`)

> QIC | 物理表：`qms_dfm_instrument_equip`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 仪器设备 |
| 物理表 | `qms_dfm_instrument_equip` |
| 数据库 schema | `QMS-DFM` |
| 所属应用 | `QIC` |
| 构建时间 | `2026-06-05 16:44:31.5990` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |
| 编码 | `code` | String | 编码 |

---

## 直接属性（25个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 2 | `id` | ID | `id` | Long |
| 3 | `orgId` | 质检组织 | `org_id` | 9d2a4a8b-1b44-4c00-b39d-4fbcf8fa958a |
| 4 | `code` | 编码 | `code` | String |
| 5 | `name` | 名称 | `name` | String |
| 6 | `specification` | 规格 | `specification` | String |
| 7 | `model` | 型号 | `model` | String |
| 8 | `manufacturer` | 生产厂家 | `manufacturer` | String |
| 9 | `factoryNo` | 出厂编号 | `factory_no` | String |
| 10 | `equipClass` | 仪器设备分类 | `equip_class` | b43cc8a0-c0f5-47d0-8b9f-018641fa5355 |
| 11 | `enable` | 启用状态 | `enable` | Short |
| 12 | `note` | 备注 | `note` | String |
| 13 | `definectEquip` | 自定义项 | `definect_equip` | 3c183c54-3d94-4524-9182-3de58dee3b7d |
| 14 | `location` | 存放地点 | `location` | String |
| 15 | `dr` | 逻辑删除标记 | `dr` | Short |
| 16 | `createTime` | 创建时间 | `create_time` | DateTime |
| 17 | `createDate` | 创建日期 | `create_date` | Date |
| 18 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 19 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 20 | `creator` | 创建人名称 | `creator` | String |
| 21 | `modifier` | 修改人名称 | `modifier` | String |
| 22 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 23 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 24 | `pubts` | 时间戳 | `pubts` | DateTime |
| 25 | `testCapabilityList` | 仪器设备测试能力 | `` | 7f29eccd-7cde-43cd-98b3-1f8b403c434b |

---

## 关联属性（7个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `testCapabilityList` | 仪器设备测试能力 | `QMSDFM.inspectinstrumequip.TestCapability` | None | true |
| 3 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 4 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 5 | `definectEquip` | 自定义项 | `QMSDFM.inspectinstrumequip.InspectInstruEquipDefineCharacter` | None |  |
| 6 | `orgId` | 质检组织 | `org.func.QualityOrg` | Service |  |
| 7 | `equipClass` | 仪器设备分类 | `QMSDFM.instrumentequipclass.InstrumentEquipClass` | None |  |
