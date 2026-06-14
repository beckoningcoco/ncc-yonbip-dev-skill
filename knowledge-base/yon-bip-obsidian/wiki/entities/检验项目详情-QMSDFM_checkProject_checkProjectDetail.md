---
tags: ["BIP", "元数据", "数据字典", "QIC", "QMSDFM.checkProject.checkProjectDetail"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 检验项目详情 (`QMSDFM.checkProject.checkProjectDetail`)

> QIC | 物理表：`qms_dfm_check_project_detail`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 检验项目详情 |
| 物理表 | `qms_dfm_check_project_detail` |
| domain/服务域 | `QMS-DFM` |
| schema | `qms_dfm` |
| 所属应用 | `QIC` |
| 构建时间 | `2026-06-05 17:29:41.3820` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | id |
| 编码 | `code` | String | 检验项目编码 |

---

## 直接属性（45个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 2 | `tenant` | 租户ID | `tenant_id` | String |
| 3 | `id` | id | `id` | Long |
| 4 | `qualityinSpectionCenter` | 质检中心 | `qualityinSpectionCenter` | 9d2a4a8b-1b44-4c00-b39d-4fbcf8fa958a |
| 5 | `code` | 检验项目编码 | `code` | String |
| 6 | `analysismethod` | 分析方法 | `analysismethod` | String |
| 7 | `checkProjectclassId` | 检验项目分类id | `checkProjectclassId` | c3b4c20b-a758-485f-8565-7cec8f466bf4 |
| 8 | `checkvalueenum` | 检验值枚举 | `checkvalueenum` | String |
| 9 | `coord` | 是否协同 | `coord` | String |
| 10 | `feature` | 特征 | `characteristic` | 1a5d304f-40a4-47a2-a075-f8b5ab6af37b |
| 11 | `destroyInspect` | 破坏性检验 | `destroy_inspect` | String |
| 12 | `externalSourceId` | 外部来源ID | `externalSourceId` | String |
| 13 | `externalSourceType` | 外部来源类型 | `externalSourceType` | String |
| 14 | `featureCode` | 特征编码 | `characteristic_code` | String |
| 15 | `featureRefCode` | 特征参照编码 | `feature_refcode` | String |
| 16 | `controlStandards` | 内控标准规定 | `controlStandards` | String |
| 17 | `statutoryStandard` | 法定标准规定 | `statutoryStandard` | String |
| 18 | `enable` | 启用 | `enable` | sys_intboolean |
| 19 | `enablets` | 启用时间 | `enablets` | DateTime |
| 20 | `disablets` | 停用时间 | `disablets` | DateTime |
| 21 | `createDate` | 创建日期 | `create_date` | Date |
| 22 | `createTime` | 创建时间 | `create_time` | DateTime |
| 23 | `creator` | 创建人名称 | `creator` | String |
| 24 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 25 | `definect_checkproject` | 检验项目自定义项特征 | `definect_checkproject` | 2fc8a92e-3ade-4336-93bd-ed52536889ef |
| 26 | `dr` | 逻辑删除标记 | `dr` | Short |
| 27 | `inspectionItemId` | 检验项目id | `inspection_item_id` | 10e9d13b-12d5-44ea-8f94-ada2ea783264 |
| 28 | `inspectiontype` | 检验值类型 | `inspectiontype` | String |
| 29 | `inspectionunit` | 检验值单位 | `inspectionunit` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 30 | `isAchieve` | 必须达到 | `isAchieve` | String |
| 31 | `modifier` | 修改人名称 | `modifier` | String |
| 32 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 33 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 34 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 35 | `name` | 检验项目名称 | `name` | String |
| 36 | `number` | 小数位数 | `number` | Integer |
| 37 | `pubts` | 时间戳 | `pubts` | DateTime |
| 38 | `qualitynature` | 质量指标性质 | `qualitynature` | String |
| 39 | `rules` | 修约规则 | `rules` | String |
| 40 | `vindex` | 显示顺序 | `vindex` | String |
| 41 | `vnote` | 备注 | `vnote` | String |
| 42 | `BadItemBodyList` | 不良项目 | `` | 4fdc199a-04c2-4651-99cc-c224755ca7d5 |
| 43 | `checkProjectBodyList` | 检测方法 | `` | 53e0a246-a61c-4136-b97c-3610ce6cc863 |
| 44 | `defines` | 检验项目详情自定义项表 | `` | 6a284786-10db-49b3-a282-7fa52dccd219 |
| 45 | `mainList` | 检验项目 | `` | 10e9d13b-12d5-44ea-8f94-ada2ea783264 |

---

## 关联属性（13个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `inspectionItemId` | 检验项目id | `QMSDFM.checkProject.checkProject` | None |  |
| 3 | `checkProjectclassId` | 检验项目分类id | `QMSDFM.checkProjectClass.checkProjectClass` | None |  |
| 4 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 5 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 6 | `definect_checkproject` | 检验项目自定义项特征 | `QMSDFM.checkProject.CheckProjectdefineCharacter` | None |  |
| 7 | `qualityinSpectionCenter` | 质检中心 | `org.func.QualityOrg` | Service |  |
| 8 | `mainList` | 检验项目 | `QMSDFM.checkProject.checkProject` | None | true |
| 9 | `inspectionunit` | 检验值单位 | `pc.unit.Unit` | Service |  |
| 10 | `defines` | 检验项目详情自定义项表 | `QMSDFM.checkProject.checkProjectDetaildefine` | None | true |
| 11 | `feature` | 特征 | `base.character.Character` | Service |  |
| 12 | `BadItemBodyList` | 不良项目 | `QMSDFM.checkProject.BadItemBody` | None | true |
| 13 | `checkProjectBodyList` | 检测方法 | `QMSDFM.checkProject.checkProjectBody` | None | true |
