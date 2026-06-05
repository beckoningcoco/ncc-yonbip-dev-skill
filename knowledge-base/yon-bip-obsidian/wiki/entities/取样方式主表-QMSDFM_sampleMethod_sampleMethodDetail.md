---
tags: ["BIP", "元数据", "数据字典", "QIC", "QMSDFM.sampleMethod.sampleMethodDetail"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 取样方式主表 (`QMSDFM.sampleMethod.sampleMethodDetail`)

> QIC | 物理表：`qms_dfm_sample_method_detail`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 取样方式主表 |
| 物理表 | `qms_dfm_sample_method_detail` |
| 数据库 schema | `QMS-DFM` |
| 所属应用 | `QIC` |
| 构建时间 | `2026-06-05 16:44:49.6150` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |
| 编码 | `code` | String | 取样方式编码 |

---

## 直接属性（24个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 2 | `tenant` | 租户ID | `tenant_id` | String |
| 3 | `id` | ID | `id` | Long |
| 4 | `sampleMethodId` | 取样方式id(停用) | `sample_method_id` | d21eaba0-3431-4238-b178-c6216a31b34b |
| 5 | `samplePlanId` | 抽样计划 | `sample_plan_id` | 5539bfee-9f1a-4ea1-84d3-fc996d2426c4 |
| 6 | `code` | 取样方式编码 | `code` | String |
| 7 | `name` | 取样方式名称 | `name` | String |
| 8 | `note` | 备注 | `note` | String |
| 9 | `checkMethod` | 检验方式 | `check_method` | String |
| 10 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 11 | `creator` | 创建人名称 | `creator` | String |
| 12 | `createDate` | 创建日期 | `create_date` | Date |
| 13 | `createTime` | 创建时间 | `create_time` | DateTime |
| 14 | `modifier` | 修改人名称 | `modifier` | String |
| 15 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 16 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 17 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 18 | `dr` | 逻辑删除标记 | `dr` | Short |
| 19 | `pubts` | 时间戳 | `pubts` | DateTime |
| 20 | `samplePlanType` | 抽样方案 | `sample_plan_type` | String |
| 21 | `definect_h` | 自定义项特征组 | `definect_h` | cdca78b2-f379-4279-be9b-92e7609d1f88 |
| 22 | `sampleMethod` | 取样方式(停用) | `` | d21eaba0-3431-4238-b178-c6216a31b34b |
| 23 | `sampleRatioList` | 样本比例 | `` | 65c8f04a-03de-4447-bd56-c78ef591b422 |
| 24 | `sampleSizeList` | 样本个数 | `` | d80efd42-fdc5-4abb-8336-470354301f9b |

---

## 关联属性（9个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `sampleRatioList` | 样本比例 | `QMSDFM.sampleMethod.sampleRatio` | None | true |
| 2 | `sampleMethod` | 取样方式(停用) | `QMSDFM.sampleMethod.sampleMethod` | None | true |
| 3 | `sampleMethodId` | 取样方式id(停用) | `QMSDFM.sampleMethod.sampleMethod` | None |  |
| 4 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 5 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 6 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 7 | `definect_h` | 自定义项特征组 | `QMSDFM.sampleMethod.SampleMethodDefineCharacter` | None |  |
| 8 | `samplePlanId` | 抽样计划 | `QMSDFM.samplePlan.SamplePlan` | None |  |
| 9 | `sampleSizeList` | 样本个数 | `QMSDFM.sampleMethod.sampleSize` | None | true |
