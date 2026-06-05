---
tags: ["BIP", "元数据", "数据字典", "QIC", "QMSDFM.dfmCheck.QmsDfmCheckSimple"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 样本记录 (`QMSDFM.dfmCheck.QmsDfmCheckSimple`)

> QIC | 物理表：`qms_dfm_check_simple`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 样本记录 |
| 物理表 | `qms_dfm_check_simple` |
| 数据库 schema | `QMS-DFM` |
| 所属应用 | `QIC` |
| 构建时间 | `2026-06-05 16:44:27.2190` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | 样本记录id |

---

## 直接属性（30个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 2 | `id` | 样本记录id | `id` | Long |
| 3 | `pkDfmCheckRecord` | 检验记录id | `pk_dfm_check_record` | 631cb01f-3080-4010-9744-e5b5bea34d6a |
| 4 | `coord` | 是否协同 | `coord` | Boolean |
| 5 | `inspector` | 检验员 | `inspector` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 6 | `checkTime` | 检验时间 | `check_time` | DateTime |
| 7 | `note` | 备注 | `note` | String |
| 8 | `qualify_grade_id` | 质量等级ID | `qualify_grade_id` | 0807260c-f881-4419-9dab-a412fad4e530 |
| 9 | `inspect_item_name` | 检验项目名称 | `inspect_item_name` | String |
| 10 | `inspectItemDetailId` | 检验项目主表id | `inspectitem_detail_id` | 3ef85f41-6ab5-4748-9805-2c9ccf03e399 |
| 11 | `pkDfmCheckInfo` | 检验信息id | `pk_dfm_check_info` | String |
| 12 | `pk_inspect_item` | 检验项目 | `pk_inspect_item` | 10e9d13b-12d5-44ea-8f94-ada2ea783264 |
| 13 | `pubts` | 时间戳 | `pubts` | DateTime |
| 14 | `tenant` | 租户ID | `tenant_id` | String |
| 15 | `upstream_id` | 上游id | `upstream_id` | String |
| 16 | `pk_inspectorder_simple` | 样本号 | `pk_inspectorder_simple` | String |
| 17 | `pkQualifyGrade` | 质量等级 | `pk_qualify_grade` | String |
| 18 | `inspectValue` | 检验值 | `inspect_value` | String |
| 19 | `sampleInspectResult` | 样本检验结果 | `sample_inspect_result` | String |
| 20 | `pkInspector` | 录入人 | `pk_inspector` | String |
| 21 | `inspectTime` | 录入时间 | `inspect_time` | DateTime |
| 22 | `createDate` | 创建日期 | `create_date` | Date |
| 23 | `createTime` | 创建时间 | `create_time` | DateTime |
| 24 | `creator` | 创建人名称 | `creator` | String |
| 25 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 26 | `dr` | 逻辑删除标记 | `dr` | Short |
| 27 | `modifier` | 修改人名称 | `modifier` | String |
| 28 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 29 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 30 | `modifyTime` | 修改时间 | `modify_time` | DateTime |

---

## 关联属性（8个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `inspectItemDetailId` | 检验项目主表id | `QMSDFM.checkProject.checkProjectDetail` | None |  |
| 3 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 4 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 5 | `pkDfmCheckRecord` | 检验记录id | `QMSDFM.dfmCheck.QmsDfmCheckRecord` | None | true |
| 6 | `inspector` | 检验员 | `bd.staff.Staff` | Service |  |
| 7 | `pk_inspect_item` | 检验项目 | `QMSDFM.checkProject.checkProject` | None |  |
| 8 | `qualify_grade_id` | 质量等级ID | `QMSDFM.qualityGrade.qualityGradeBody` | None |  |
