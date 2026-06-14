---
tags: ["BIP", "元数据", "数据字典", "QIC", "QMSDFM.inspectioncenter.inspectioncenter"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 检测室 (`QMSDFM.inspectioncenter.inspectioncenter`)

> QIC | 物理表：`qms_dfm_inspectioncenter`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 检测室 |
| 物理表 | `qms_dfm_inspectioncenter` |
| domain/服务域 | `QMS-DFM` |
| schema | `qms_dfm` |
| 所属应用 | `QIC` |
| 构建时间 | `2026-06-05 17:29:55.2080` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | String | ID |
| 编码 | `code` | String | 编码 |

---

## 直接属性（21个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 2 | `tenant` | 租户ID | `tenant_id` | String |
| 3 | `id` | ID | `id` | String |
| 4 | `org` | 质检中心id | `pk_org` | 9d2a4a8b-1b44-4c00-b39d-4fbcf8fa958a |
| 5 | `code` | 编码 | `code` | String |
| 6 | `name` | 名称 | `name` | String |
| 7 | `vnote` | 备注 | `vnote` | String |
| 8 | `createDate` | 创建日期 | `create_date` | Date |
| 9 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 10 | `creator` | 创建人id | `creator` | String |
| 11 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 12 | `modifier` | 修改人id | `modifier` | String |
| 13 | `modifierId` | 最后修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 14 | `dr` | 逻辑删除标记 | `dr` | Short |
| 15 | `modifyTime` | 最后修改时间 | `modify_time` | DateTime |
| 16 | `createTime` | 创建时间 | `create_time` | DateTime |
| 17 | `pubts` | 时间戳 | `pubts` | DateTime |
| 18 | `definect_h` | 自定义项特征组 | `definect_h` | c9fdb307-7e58-4ae0-938c-62cd473758be |
| 19 | `defines` | 检测室自定义项 | `` | 718e972d-6a4f-4d44-80dc-031951b706b3 |
| 20 | `ic_inspectorList` | 检验员 | `` | 34860304-82c3-4718-8116-03e9f5994156 |
| 21 | `ic_projectList` | 检验项目 | `` | a0774004-8286-4ff8-9874-23d40090fbf4 |

---

## 关联属性（8个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ic_projectList` | 检验项目 | `QMSDFM.inspectioncenter.ic_project` | None | true |
| 2 | `org` | 质检中心id | `org.func.QualityOrg` | Service |  |
| 3 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 4 | `ic_inspectorList` | 检验员 | `QMSDFM.inspectioncenter.ic_inspector` | None | true |
| 5 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 6 | `modifierId` | 最后修改人 | `base.user.User` | Service |  |
| 7 | `definect_h` | 自定义项特征组 | `QMSDFM.inspectioncenter.InspectionCenterDefineCharacter` | None |  |
| 8 | `defines` | 检测室自定义项 | `QMSDFM.inspectioncenter.inspectioncenter_define` | None | true |
