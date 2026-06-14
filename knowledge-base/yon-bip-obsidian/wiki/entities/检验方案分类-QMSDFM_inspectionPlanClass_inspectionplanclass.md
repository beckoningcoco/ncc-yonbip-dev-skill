---
tags: ["BIP", "元数据", "数据字典", "QIC", "QMSDFM.inspectionPlanClass.inspectionplanclass"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 检验方案分类 (`QMSDFM.inspectionPlanClass.inspectionplanclass`)

> QIC | 物理表：`qms_dfm_inspectionplancla`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 检验方案分类 |
| 物理表 | `qms_dfm_inspectionplancla` |
| domain/服务域 | `QMS-DFM` |
| schema | `qms_dfm` |
| 所属应用 | `QIC` |
| 构建时间 | `2026-06-05 17:29:32.6180` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | String | ID |

---

## 直接属性（26个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `note` | 备注 | `note` | String |
| 2 | `creator` | 创建人 | `creator` | String |
| 3 | `code` | 编码 | `code` | String |
| 4 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 5 | `creatorId` | 创建人id | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 6 | `modifier` | 修改人 | `modifier` | String |
| 7 | `modifierId` | 修改人id | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 8 | `name` | 名称 | `name` | String |
| 9 | `qualityinSpectionCenter` | 质检中心 | `qualityinSpectionCenter` | 9d2a4a8b-1b44-4c00-b39d-4fbcf8fa958a |
| 10 | `id` | ID | `id` | String |
| 11 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 12 | `pubts` | 时间戳 | `pubts` | DateTime |
| 13 | `createTime` | 创建时间 | `create_time` | DateTime |
| 14 | `tenant` | 租户ID | `tenant_id` | String |
| 15 | `dr` | 逻辑删除标记 | `dr` | Short |
| 16 | `createDate` | 创建日期 | `create_date` | Date |
| 17 | `applyRangeList` | 检验方案分类适用范围 | `` | 37035e32-863f-43ca-ba2c-8fa34ea41a7a |
| 18 | `definect_h` | 自定义项特征组 | `definect_h` | 5808dfed-073b-4643-a6b8-15e57234db96 |
| 19 | `inspectionPlanClassDetailList` | 检验方案分类详情 | `` | f1cf9402-df2d-414f-90f0-a0f75c3fabeb |
| 20 | `isEnd` | 是否末级 | `isEnd` | Boolean |
| 21 | `level` | 层级 | `level` | Integer |
| 22 | `parent` | 上级分类id | `parent_id` | fb967f62-dd79-432d-88d0-aa4789da86d4 |
| 23 | `path` | 路径 | `path` | String |
| 24 | `sort` | 排序号 | `sort_num` | Integer |
| 25 | `vclassify` | 上级分类 | `vclassify` | String |
| 26 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（8个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `parent` | 上级分类id | `QMSDFM.inspectionPlanClass.inspectionplanclass` | None |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `applyRangeList` | 检验方案分类适用范围 | `QMSDFM.inspectionPlanClass.inspectionPlanClassApplyRange` | None | true |
| 4 | `creatorId` | 创建人id | `base.user.User` | Service |  |
| 5 | `modifierId` | 修改人id | `base.user.User` | Service |  |
| 6 | `qualityinSpectionCenter` | 质检中心 | `org.func.QualityOrg` | Service |  |
| 7 | `definect_h` | 自定义项特征组 | `QMSDFM.inspectionPlanClass.InspectionPlanClassDefineCharacter` | None |  |
| 8 | `inspectionPlanClassDetailList` | 检验方案分类详情 | `QMSDFM.inspectionPlanClass.inspectionPlanClassDetail` | None | true |
