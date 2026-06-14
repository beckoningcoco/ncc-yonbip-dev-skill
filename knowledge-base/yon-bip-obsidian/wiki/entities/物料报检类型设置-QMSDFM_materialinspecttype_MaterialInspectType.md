---
tags: ["BIP", "元数据", "数据字典", "QIC", "QMSDFM.materialinspecttype.MaterialInspectType"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 物料报检类型设置 (`QMSDFM.materialinspecttype.MaterialInspectType`)

> QIC | 物理表：`qms_dfm_materialinspectype`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 物料报检类型设置 |
| 物理表 | `qms_dfm_materialinspectype` |
| domain/服务域 | `QMS-DFM` |
| schema | `qms_dfm` |
| 所属应用 | `QIC` |
| 构建时间 | `2026-06-05 17:29:28.1070` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（19个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 2 | `id` | ID | `id` | Long |
| 3 | `orgId` | 质检组织 | `org_id` | 9d2a4a8b-1b44-4c00-b39d-4fbcf8fa958a |
| 4 | `defaultTranstype` | 默认交易类型 | `default_transtype` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 |
| 5 | `productClassId` | 物料分类 | `productclass_id` | b295ef54-c421-4865-aca3-f5a9207a8d50 |
| 6 | `inspectionType` | 检验类型 | `inspect_type` | String |
| 7 | `makeBillType` | 生单类型 | `make_billtype` | String |
| 8 | `lineNo` | 序号 | `line_no` | Decimal |
| 9 | `dr` | 逻辑删除标记 | `dr` | Short |
| 10 | `createTime` | 创建时间 | `create_time` | DateTime |
| 11 | `createDate` | 创建日期 | `create_date` | Date |
| 12 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 13 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 14 | `creator` | 创建人名称 | `creator` | String |
| 15 | `modifier` | 修改人名称 | `modifier` | String |
| 16 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 17 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 18 | `pubts` | 时间戳 | `pubts` | DateTime |
| 19 | `definect_h` | 自定义项特征组 | `definect_h` | 49cd1637-53db-4824-aaf0-b47378f87f41 |

---

## 关联属性（7个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `productClassId` | 物料分类 | `pc.cls.ManagementClass` | Service |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `defaultTranstype` | 默认交易类型 | `bd.bill.TransType` | Service |  |
| 4 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 5 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 6 | `definect_h` | 自定义项特征组 | `QMSDFM.materialinspecttype.MaterialInspectTypeDefineCharacter` | None |  |
| 7 | `orgId` | 质检组织 | `org.func.QualityOrg` | Service |  |
