---
tags: ["BIP", "元数据", "数据字典", "IMP_PES", "pes.smsContracts.SmsContracts"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 服务合同 (`pes.smsContracts.SmsContracts`)

> IMP_PES | 物理表：`sms_contracts`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 服务合同 |
| 物理表 | `sms_contracts` |
| domain/服务域 | `imppes` |
| 所属应用 | `IMP_PES` |
| 构建时间 | `2026-06-05 17:19:35.4620` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | String | ID |
| 编码 | `code` | String | 合同编码 |

---

## 直接属性（36个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `code` | 合同编码 | `code` | String |
| 2 | `contractAmount` | 合同金额 | `contract_amount` | Decimal |
| 3 | `contractSORecordList` | 服务合同工单记录 | `` | 6dc8964c-1d78-4059-83ad-42849f345602 |
| 4 | `contypeId` | 合同类型 | `contype_id` | 1171eb1a-bcd6-4fb1-9d11-578420468003 |
| 5 | `createDate` | 创建日期 | `create_date` | Date |
| 6 | `createTime` | 创建时间 | `create_time` | DateTime |
| 7 | `createUser` | 创建者 | `create_user` | String |
| 8 | `creator` | 创建人名称 | `creator` | String |
| 9 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 10 | `customerId` | 客户 | `customer_id` | 94b3280a-27a4-485a-b90b-b7bce57c6df2 |
| 11 | `dateEffect` | 生效日期 | `date_effect` | DateTime |
| 12 | `dateExpire` | 到期日期 | `date_expire` | DateTime |
| 13 | `dateSign` | 签订日期 | `date_sign` | DateTime |
| 14 | `dr` | DR | `dr` | Short |
| 15 | `executiveOrgId` | 执行组织id | `executive_org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 16 | `id` | ID | `id` | String |
| 17 | `isEffective` | 终止标识 | `is_effective` | Integer |
| 18 | `lastModified` | 最近修改时间 | `last_modified` | String |
| 19 | `lastModifyUser` | 最近修改者 | `last_modify_user` | String |
| 20 | `linkman` | 联系人 | `linkman` | fe608271-1042-435f-ba79-113c7a41e420 |
| 21 | `memo` | 描述 | `memo` | String |
| 22 | `modifier` | 修改人名称 | `modifier` | String |
| 23 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 24 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 25 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 26 | `name` | 合同名称 | `name` | String |
| 27 | `orgId` | 组织id | `org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 28 | `phone` | 联系电话 | `phone` | String |
| 29 | `projectId` | 项目 | `project_id` | b1e7cbf6-094a-4200-b451-36bfa3ac3ff4 |
| 30 | `pubts` | 时间戳 | `pubts` | DateTime |
| 31 | `smsContractsDetailList` | 服务合同详细 | `` | d0c7cf01-d148-4dee-b282-505b504c79ca |
| 32 | `tcId` | 交易币种 | `tc_id` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e |
| 33 | `tenant` | 租户ID | `tenant_id` | String |
| 34 | `ts` | 版本号 | `ts` | String |
| 35 | `userDefineCharacter` | 自定义项特征 | `user_define_character` | 3d551187-05d6-45c9-bdb5-11b388935e6f |
| 36 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（13个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `contypeId` | 合同类型 | `pes.smsContractType.SmsContractType` | None |  |
| 2 | `userDefineCharacter` | 自定义项特征 | `pes.smsContracts.SmsContractsDefineCharacter` | None |  |
| 3 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 4 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 5 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 6 | `linkman` | 联系人 | `pes.cms.Contact` | None |  |
| 7 | `orgId` | 组织id | `org.func.BaseOrg` | Service |  |
| 8 | `smsContractsDetailList` | 服务合同详细 | `pes.smsContracts.SmsContractsDetail` | None | true |
| 9 | `customerId` | 客户 | `aa.merchant.Merchant` | Service |  |
| 10 | `tcId` | 交易币种 | `bd.currencytenant.CurrencyTenantVO` | Service |  |
| 11 | `contractSORecordList` | 服务合同工单记录 | `pes.smsContracts.ContractSORecordVO` | None | true |
| 12 | `projectId` | 项目 | `bd.project.ProjectVO` | Service |  |
| 13 | `executiveOrgId` | 执行组织id | `org.func.BaseOrg` | Service |  |
