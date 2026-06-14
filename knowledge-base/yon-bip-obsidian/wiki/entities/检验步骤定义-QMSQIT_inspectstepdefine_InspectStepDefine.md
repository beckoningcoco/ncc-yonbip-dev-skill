---
tags: ["BIP", "元数据", "数据字典", "QMSQIT", "QMSQIT.inspectstepdefine.InspectStepDefine"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 检验步骤定义 (`QMSQIT.inspectstepdefine.InspectStepDefine`)

> QMSQIT | 物理表：`qms_qit_inspect_step_define`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 检验步骤定义 |
| 物理表 | `qms_qit_inspect_step_define` |
| domain/服务域 | `QMS-QIT` |
| schema | `qms_qit_rejectbill` |
| 所属应用 | `QMSQIT` |
| 构建时间 | `2026-06-05 16:43:15.5850` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |
| 编码 | `code` | String | 编码 |

---

## 直接属性（24个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `code` | 编码 | `code` | String |
| 2 | `createDate` | 创建日期 | `create_date` | Date |
| 3 | `createTime` | 创建时间 | `create_time` | DateTime |
| 4 | `creator` | 创建人名称 | `creator` | String |
| 5 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 6 | `defineCharacter` | 自定义项特征组 | `definect_h` | 5381aef1-6526-48bf-b729-e0383aef95fb |
| 7 | `dr` | 逻辑删除标记 | `dr` | Short |
| 8 | `id` | ID | `id` | Long |
| 9 | `inspectTime` | 检验时长 | `inspect_time` | Decimal |
| 10 | `isEnd` | 是否末级 | `isEnd` | Boolean |
| 11 | `level` | 层级 | `level` | Integer |
| 12 | `memo` | 备注 | `memo` | String |
| 13 | `modifier` | 修改人名称 | `modifier` | String |
| 14 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 15 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 16 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 17 | `name` | 名称 | `name` | String |
| 18 | `orgId` | 质检组织 | `org_id` | 9d2a4a8b-1b44-4c00-b39d-4fbcf8fa958a |
| 19 | `parent` | 上级分组 | `parent_id` | 0267b439-f9c9-4267-916c-66139b0f3627 |
| 20 | `path` | 路径 | `path` | String |
| 21 | `pubts` | 时间戳 | `pubts` | DateTime |
| 22 | `sort` | 排序号 | `sort_num` | Integer |
| 23 | `unit` | 时间单位 | `unit` | String |
| 24 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（6个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `parent` | 上级分组 | `QMSQIT.inspectstepdefine.InspectStepDefine` | None |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 4 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 5 | `defineCharacter` | 自定义项特征组 | `QMSQIT.inspectstepdefine.InspectStepDefineCharacter` | None |  |
| 6 | `orgId` | 质检组织 | `org.func.QualityOrg` | Service |  |
