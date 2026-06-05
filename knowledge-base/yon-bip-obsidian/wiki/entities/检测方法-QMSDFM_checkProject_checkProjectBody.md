---
tags: ["BIP", "元数据", "数据字典", "QIC", "QMSDFM.checkProject.checkProjectBody"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 检测方法 (`QMSDFM.checkProject.checkProjectBody`)

> QIC | 物理表：`qms_dfm_checkproject_body`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 检测方法 |
| 物理表 | `qms_dfm_checkproject_body` |
| 数据库 schema | `QMS-DFM` |
| 所属应用 | `QIC` |
| 构建时间 | `2026-06-05 16:46:30.4030` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | String | id |

---

## 直接属性（14个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 2 | `tenant` | 租户ID | `tenant_id` | String |
| 3 | `id` | id | `id` | String |
| 4 | `detailId` | 检验项目主表id | `detail_id` | 3ef85f41-6ab5-4748-9805-2c9ccf03e399 |
| 5 | `externalSourceId` | 外部来源ID | `externalSourceId` | String |
| 6 | `defineCharacteristics` | 自定义项特征组 | `define_cts` | dd933c6e-4d17-4659-a108-59ec241ec367 |
| 7 | `externalSourceType` | 外部来源类型 | `externalSourceType` | String |
| 8 | `isDefault` | 是否默认 | `is_default` | String |
| 9 | `attachmentId` | 附件 | `attachmentId` | String |
| 10 | `testbasis` | 检测依据id | `testbasis` | f0529fa3-5e4b-444a-8212-716743519d68 |
| 11 | `testmethod` | 检测方法id | `testmethod` | 90d44bff-eef4-4fd8-a0c1-8ce14fbab951 |
| 12 | `dr` | 逻辑删除标记 | `dr` | Short |
| 13 | `pubts` | 时间戳 | `pubts` | DateTime |
| 14 | `defines` | 检测依据自定义项表 | `` | 2aea6f4e-b8f8-497a-8960-3581ccbe846f |

---

## 关联属性（6个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `defineCharacteristics` | 自定义项特征组 | `QMSDFM.checkProject.checkProjectBody_defineCharacter` | None |  |
| 2 | `testmethod` | 检测方法id | `QMSDFM.detectionMethod.QmsDfmDetectionMethod` | None |  |
| 3 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 4 | `testbasis` | 检测依据id | `QMSDFM.detectionbasis.qam_detectionbasis` | None |  |
| 5 | `detailId` | 检验项目主表id | `QMSDFM.checkProject.checkProjectDetail` | None | true |
| 6 | `defines` | 检测依据自定义项表 | `QMSDFM.checkProject.bodydefine` | None | true |
