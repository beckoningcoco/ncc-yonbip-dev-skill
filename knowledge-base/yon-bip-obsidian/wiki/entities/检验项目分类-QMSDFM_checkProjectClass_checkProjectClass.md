---
tags: ["BIP", "元数据", "数据字典", "QIC", "QMSDFM.checkProjectClass.checkProjectClass"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 检验项目分类 (`QMSDFM.checkProjectClass.checkProjectClass`)

> QIC | 物理表：`qms_dfm_checkprojectclass`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 检验项目分类 |
| 物理表 | `qms_dfm_checkprojectclass` |
| 数据库 schema | `QMS-DFM` |
| 所属应用 | `QIC` |
| 构建时间 | `2026-06-05 16:46:35.4590` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | String | ID |
| 编码 | `code` | String | 编码 |

---

## 直接属性（28个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 2 | `tenant` | 租户ID | `tenant_id` | String |
| 3 | `id` | ID | `id` | String |
| 4 | `qualityinSpectionCenter` | 管理组织 | `qualityinSpectionCenter` | 9d2a4a8b-1b44-4c00-b39d-4fbcf8fa958a |
| 5 | `code` | 编码 | `code` | String |
| 6 | `name` | 名称 | `name` | String |
| 7 | `createDate` | 创建日期 | `create_date` | Date |
| 8 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 9 | `definect_h` | 检验项目分类自定义项 | `definect_h` | 70f193c2-0863-4a53-9721-2adb64ff55ce |
| 10 | `vclassify` | 上级分类 | `vclassify` | String |
| 11 | `codeprint` | 编码打印 | `codeprint` | String |
| 12 | `parent` | 上级分类 | `parent_id` | c3b4c20b-a758-485f-8565-7cec8f466bf4 |
| 13 | `creator` | 创建人 | `creator` | String |
| 14 | `level` | 层级 | `level` | Integer |
| 15 | `modifier` | 修改人 | `modifier` | String |
| 16 | `sort` | 排序号 | `sort_num` | Integer |
| 17 | `isEnd` | 是否末级 | `isEnd` | Boolean |
| 18 | `dr` | 逻辑删除标记 | `dr` | Short |
| 19 | `creatorId` | 创建人id | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 20 | `path` | 路径 | `path` | String |
| 21 | `createTime` | 创建时间 | `create_time` | DateTime |
| 22 | `modifierId` | 修改人id | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 23 | `vnote` | 备注 | `vnote` | String |
| 24 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 25 | `pubts` | 时间戳 | `pubts` | DateTime |
| 26 | `vclassifyprint` | 上级分类打印 | `vclassifyprint` | String |
| 27 | `applyRangeList` | 检验项目分类适用范围 | `` | 7a05e230-b0b0-4529-a6c3-b4a32d4b851d |
| 28 | `checkProjectClassBodyList` | 分配组织(弃用) | `` | baed5fea-760d-4cc3-8c08-4f4f30c1979b |

---

## 关联属性（8个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `parent` | 上级分类 | `QMSDFM.checkProjectClass.checkProjectClass` | None |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `applyRangeList` | 检验项目分类适用范围 | `QMSDFM.checkProjectClass.checkProjectClassApplyRange` | None | true |
| 4 | `creatorId` | 创建人id | `base.user.User` | Service |  |
| 5 | `modifierId` | 修改人id | `base.user.User` | Service |  |
| 6 | `qualityinSpectionCenter` | 管理组织 | `org.func.QualityOrg` | Service |  |
| 7 | `definect_h` | 检验项目分类自定义项 | `QMSDFM.checkProjectClass.CheckProjectClassDefineCharacter` | None |  |
| 8 | `checkProjectClassBodyList` | 分配组织(弃用) | `QMSDFM.checkProjectClass.checkProjectClassBody` | None | true |
