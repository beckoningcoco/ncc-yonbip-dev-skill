---
tags: ["BIP", "元数据", "数据字典", "IMP_PES", "PES.fcs.ServicePrices"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 服务价表 (`PES.fcs.ServicePrices`)

> IMP_PES | 物理表：`imp_fcs_service_prices`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 服务价表 |
| 物理表 | `imp_fcs_service_prices` |
| domain/服务域 | `imppes` |
| 所属应用 | `IMP_PES` |
| 构建时间 | `2026-06-05 17:17:30.5210` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | String | id |
| 编码 | `code` | String | 价表编码 |

---

## 直接属性（32个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `orgId` | 组织 | `org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 2 | `transactionType` | 交易类型 | `transaction_type` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 |
| 3 | `code` | 价表编码 | `code` | String |
| 4 | `name` | 价表名称 | `name` | String |
| 5 | `fmDate` | 生效日期 | `fm_date` | DateTime |
| 6 | `toDate` | 失效日期 | `to_date` | DateTime |
| 7 | `memo` | 备注 | `memo` | String |
| 8 | `isEffective` | 是否生效 | `is_effective` | Boolean |
| 9 | `vouchdate` | 单据日期 | `vouchdate` | DateTime |
| 10 | `status` | 状态 | `status` | Short |
| 11 | `tplid` | 模板id | `tplid` | Short |
| 12 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 13 | `creator` | 创建人名称 | `creator` | String |
| 14 | `createUser` | 创建人 | `create_user` | String |
| 15 | `createTime` | 创建时间 | `create_time` | DateTime |
| 16 | `createDate` | 创建日期 | `create_date` | Date |
| 17 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 18 | `modifier` | 修改人名称 | `modifier` | String |
| 19 | `lastModifyUser` | 修改人 | `last_modify_user` | String |
| 20 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 21 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 22 | `lastModified` | 修改时间 | `last_modified` | DateTime |
| 23 | `id` | id | `id` | String |
| 24 | `dr` | DR | `dr` | Short |
| 25 | `isWfControlled` | 是否审批流控制 | `isWfControlled` | Boolean |
| 26 | `returncount` | 退回次数 | `returncount` | Short |
| 27 | `verifystate` | 审批状态 | `verifystate` | Short |
| 28 | `tenant` | 租户ID | `tenant_id` | String |
| 29 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 30 | `pubts` | 时间戳 | `pubts` | DateTime |
| 31 | `ts` | 版本号 | `ts` | String |
| 32 | `ServicePriceDetailsList` | 服务价表明细 | `` | 514f6858-f86f-46ba-98e4-616362a8494a |

---

## 关联属性（6个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `transactionType` | 交易类型 | `bd.bill.TransType` | Service |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 4 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 5 | `orgId` | 组织 | `org.func.BaseOrg` | Service |  |
| 6 | `ServicePriceDetailsList` | 服务价表明细 | `PES.fcs.ServicePriceDetails` | None | true |
