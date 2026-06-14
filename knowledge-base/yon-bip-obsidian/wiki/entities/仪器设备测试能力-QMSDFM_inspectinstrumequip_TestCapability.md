---
tags: ["BIP", "元数据", "数据字典", "QIC", "QMSDFM.inspectinstrumequip.TestCapability"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 仪器设备测试能力 (`QMSDFM.inspectinstrumequip.TestCapability`)

> QIC | 物理表：`qms_dfm_instrument_equip_testcap`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 仪器设备测试能力 |
| 物理表 | `qms_dfm_instrument_equip_testcap` |
| domain/服务域 | `QMS-DFM` |
| schema | `qms_dfm` |
| 所属应用 | `QIC` |
| 构建时间 | `2026-06-05 16:46:52.1550` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（7个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 2 | `id` | ID | `id` | Long |
| 3 | `equipId` | 仪器设备id | `equip_id` | 3125a9f7-0630-4531-b129-e10d05feb67f |
| 4 | `checkProjectId` | 检验项目 | `checkproject_id` | 10e9d13b-12d5-44ea-8f94-ada2ea783264 |
| 5 | `inspectItemDetailId` | 检验项目主表id | `inspectitem_detail_id` | 3ef85f41-6ab5-4748-9805-2c9ccf03e399 |
| 6 | `dr` | 逻辑删除标记 | `dr` | Short |
| 7 | `pubts` | 时间戳 | `pubts` | DateTime |

---

## 关联属性（4个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `equipId` | 仪器设备id | `QMSDFM.inspectinstrumequip.InspectInstrumEquip` | None | true |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `inspectItemDetailId` | 检验项目主表id | `QMSDFM.checkProject.checkProjectDetail` | None |  |
| 4 | `checkProjectId` | 检验项目 | `QMSDFM.checkProject.checkProject` | None |  |
