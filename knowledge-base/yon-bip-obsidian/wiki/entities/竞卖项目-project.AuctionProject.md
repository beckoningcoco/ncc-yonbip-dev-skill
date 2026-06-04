---
tags: ["BIP", "元数据", "数据字典", "ycAuction", "saleauction.project.AuctionProject"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 竞卖项目 (`saleauction.project.AuctionProject`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP ycAuction 模块实体元数据字典。
> 物理表：`cpu_project` | 所属应用：`ycAuction`
> 来源：元数据API `queryByUri` 返回的 `saleauction.project.AuctionProject` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 竞卖项目 |
| 物理表 | `cpu_project` |
| 数据库 schema | `yonbip-cpu-lawbid` |
| 所属应用 | `ycAuction` |
| 业务对象ID | `a2d2c6ea-007b-4761-80bf-c58114041631` |
| 元数据类型 | `Class` |
| 元数据层级 | `0` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 15:30:40.4470` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` | Long | 主键 |
| 编码 | `bid_project_code` | `bid_project_code` | String | 废旧拍卖项目编号（必填，isCode）|

## 部署信息

- **部署时间**: 2025-10-24 23:58:08:000
- **安装来源**: `/app/data_scripts/yonbip-cpu-lawbid/scripts/db/patch/mongodb/V5_R0_2507/0001_yonbip-cpu-lawbid/0010_iuap_common/DML/0270_iuap_metadata/202509111111_metadata_saleauction-project.zip`
- **安装人**: mongoTools
- **安装排名**: `5e23f044-be2b-49b9-afb5-5f94c06eff71`

## 业务场景

- `workflow`
- `UITemplate`
- `DataAuth`
- `transtype`
- `report`
- `billcode`
- `dataPrivacy`
- `userdefine`
- `msgtemplate`
- `bpm`

## 术语标记

`BusinessData`, `data_auth`, `isMain`

## 约束

- **PRIMARY** (transformKey): 主键 — 唯一字段: `['id']`
- **migration_id** (MetaClassPrimary): ID — 唯一字段: `['id']`

## 依赖接口（共 12 个）

| # | 接口名 | URI | 版本 | 属性数 |
|---|--------|-----|------|--------|
| 1 | 企业ID (`IEnterprise`) | `cpu.itf.IEnterprise` | 6 | 1 |
| 2 | 审批流信息 (`IApprovalFlow`) | `base.itf.IApprovalFlow` | 134 | 3 |
| 3 | 项目接口 (`IProject`) | `project.itf.IProject` | 3698 | 82 |
| 4 | 逻辑删除相关 (`LogicDelete`) | `ucfbase.ucfbaseItf.LogicDelete` | 74 | 1 |
| 5 | 统一租户接口 (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |
| 6 | 审计信息 (`IAuditInfo`) | `base.itf.IAuditInfo` | 340 | 8 |
| 7 | 审批兼容信息 (`ICompatibleFlowInfo`) | `lawbid.commonitf.ICompatibleFlowInfo` | 6 | 3 |
| 8 | 自动编号 (`IAutoCode`) | `voucher.base.IAutoCode` | 49 | 1 |
| 9 | 跨租户采购商租户接口 (`IBuyerTenant`) | `cpu.itf.IBuyerTenant` | 10 | 1 |
| 10 | lawbidTenant租户相关 (`ITenant`) | `lawbid.itf.ITenant` | 2 | 1 |
| 11 | 审批信息 (`IApprovalInfo`) | `base.itf.IApprovalInfo` | 172 | 4 |
| 12 | 流程接口 (`IBusinessFlow`) | `base.itf.IBusinessFlow` | 77 | 2 |

---

## 直接属性（共 113 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `id` | 主键 | `id` | Long | `long` |  | ✓ |
| 2 | `isWfControlled` | 是否审批流控制 | `isWfControlled` | Boolean | `switch` |  | ✓ |
| 3 | `verifystate` | 审批状态 | `verifystate` | Short | `short` |  | ✓ |
| 4 | `returncount` | 退回次数 | `returncount` | Short | `short` |  | ✓ |
| 5 | `isNewFlow` | 是否为新审批 | `is_new_flow` | Integer | `int` |  | ✓ |
| 6 | `oldBillNum` | 原始单据号 | `old_bill_num` | String | `text` |  | ✓ |
| 7 | `flowSource` | 审批源 | `flow_source` | String | `text` |  | ✓ |
| 8 | `code` | 废旧拍卖项目编号 | `bid_project_code` | String | `text` |  | ✓ |
| 9 | `bidProjectName` | 废旧拍卖项目名称 | `bid_project_name` | String | `text` |  | ✓ |
| 10 | `purOrgName` | 采购组织 | `pur_org_name` | String | `text` |  | ✓ |
| 11 | `processorId` | 处理人 | `processor_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 | `quote` |  | ✓ |
| 12 | `bidBudgetMny` | 采购预算 | `bid_budget_mny` | Decimal | `number` |  | ✓ |
| 13 | `fundSource` | 资金来源 | `fund_source` | String | `text` |  | ✓ |
| 14 | `agencyEnterpriseId` | 招标代理机构租户ID | `agency_enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 | `quote` |  | ✓ |
| 15 | `agencyOrgId` | 招标代理机构 | `agency_org_id` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` |  | ✓ |
| 16 | `agencyOrgName` | 招标代理机构名称 | `agency_org_name` | String | `text` |  | ✓ |
| 17 | `contactType` | 联系人类型 | `contact_type` | String | `text` |  | ✓ |
| 18 | `agencyOrgRoleId` | 角色 | `agency_org_role_id` | 6c660d78-70a8-438e-9925-f1c342df3a12 | `quote` |  | ✓ |
| 19 | `agencyOrgPsnUserId` | 联系人用户ID | `agency_org_psn_user_id` | String | `text` |  | ✓ |
| 20 | `agencyOrgPersonTel` | 招标代理机构联系电话 | `agency_org_person_tel` | String | `text` |  | ✓ |
| 21 | `agencyOrgPersionMail` | 招标代理机构电子邮箱 | `agency_org_persion_mail` | String | `text` |  | ✓ |
| 22 | `agencyEnterpriseName` | 招标代理机构租户名称 | `agency_enterprise_name` | String | `text` |  | ✓ |
| 23 | `agencyOfficialCode` | 招标代理机构组织编码 | `agency_official_code` | String | `text` |  | ✓ |
| 24 | `sectionType` | 标段划分方式 | `section_type` | String | `text` |  | ✓ |
| 25 | `projectDocId` | 项目档案ID | `project_doc_id` | Long | `long` |  | ✓ |
| 26 | `isCanEditSection` | 是否允许修改标段 | `is_can_edit_section` | Short | `short` |  | ✓ |
| 27 | `hopeFinishTime` | 期望完成时间 | `hope_finish_time` | DateTime | `timestamp` |  | ✓ |
| 28 | `enterpriseName` | 租户名称 | `enterprise_name` | String | `text` |  | ✓ |
| 29 | `linkPersionOrgName` | 联系人组织名称 | `link_persion_org_name` | String | `text` |  | ✓ |
| 30 | `linkPersionOrgCode` | 联系人组织code | `link_persion_org_code` | String | `text` |  | ✓ |
| 31 | `entrustTime` | 委托时间 | `entrust_time` | DateTime | `timestamp` |  | ✓ |
| 32 | `acceptTime` | 委托受理时间 | `accept_time` | DateTime | `timestamp` |  | ✓ |
| 33 | `acceptPersonId` | 受理人ID | `accept_person_id` | String | `text` |  | ✓ |
| 34 | `acceptPersonName` | 受理人名字 | `accept_person_name` | String | `text` |  | ✓ |
| 35 | `acceptDepartmentName` | 受理人部门名称 | `accept_department_name` | String | `text` |  | ✓ |
| 36 | `purGroupType` | 采购小组设置方式 | `pur_group_type` | String | `text` |  | ✓ |
| 37 | `sectionMold` | 标段类型 | `section_mold` | String | `text` |  | ✓ |
| 38 | `fatherId` | 来源id | `father_id` | Long | `long` |  | ✓ |
| 39 | `purModeId` | 采购模式id | `pur_mode_id` | 92b613a5-0e7c-4f87-8a9b-7fccc9ba556a | `quote` |  | ✓ |
| 40 | `purModeName` | 采购模式 | `pur_mode_name` | String | `text` |  | ✓ |
| 41 | `rejectOpinion` | 驳回意见 | `reject_opinion` | String | `text` |  | ✓ |
| 42 | `natureFundsId` | 资金性质id | `nature_funds_id` | String | `text` |  | ✓ |
| 43 | `natureFunds` | 资金性质 | `nature_funds` | String | `text` |  | ✓ |
| 44 | `sourcesFunds` | 资金来源 | `sources_funds` | String | `text` |  | ✓ |
| 45 | `privateCode` | 项目内部编号 | `private_code` | String | `text` |  | ✓ |
| 46 | `purchaserCode` | 采购联系人姓名 | `purchaser_code` | String | `text` |  | ✓ |
| 47 | `purchaserUnitAddress` | 采购联系人单位地址 | `purchaser_unit_address` | String | `text` |  | ✓ |
| 48 | `purchaserTell` | 采购联系人电话 | `purchaser_tell` | String | `text` |  | ✓ |
| 49 | `purchaserAddress` | 采购人地址 | `purchaser_address` | String | `text` |  | ✓ |
| 50 | `purchaserMail` | 采购人邮箱 | `purchaser_mail` | String | `text` |  | ✓ |
| 51 | `purchaserDept` | 采购人所在部门 | `purchaser_dept` | String | `text` |  | ✓ |
| 52 | `repulseReason` | 退回原因 | `repulse_reason` | String | `text` |  | ✓ |
| 53 | `approveRecord` | 是否有审批记录 | `approve_record` | Short | `short` |  | ✓ |
| 54 | `transTypeName` | 交易类型名称 | `trans_type_name` | String | `text` |  | ✓ |
| 55 | `userId` | 制单人userid | `user_id` | String | `text` |  | ✓ |
| 56 | `bidBillType` | 招标单据类型 | `bid_bill_type` | String | `text` |  | ✓ |
| 57 | `lawbidSystemId` | 原始ID | `lawbid_system_id` | Long | `long` |  | ✓ |
| 58 | `entrustRefuseReason` | 委托退回原因 | `entrust_refuse_reason` | String | `text` |  | ✓ |
| 59 | `invalidReason` | 作废原因 | `invalid_reason` | String | `text` |  | ✓ |
| 60 | `entrustSourceProjectId` | 采购委托项目id | `entrust_source_project_id` | Long | `long` |  | ✓ |
| 61 | `currencyId` | 币种 | `currency_id` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e | `quote` |  | ✓ |
| 62 | `linkPersionOrgId` | 联系人组织id | `link_persion_org_id` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` |  | ✓ |
| 63 | `acceptDepartmentId` | 受理人部门ID | `accept_department_id` | a4352e3c-3eda-4539-a7a9-ec00799be118 | `quote` |  | ✓ |
| 64 | `lawbidSystemType` | 原始表 | `lawbid_system_type` | String | `text` |  | ✓ |
| 65 | `agencyOrgPsnId` | 代理机构联系人 | `agency_org_psn_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 | `quote` |  | ✓ |
| 66 | `dr` | 逻辑删除标记 | `dr` | Short | `short` |  | ✓ |
| 67 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | ✓ | ✓ |
| 68 | `createTime` | 创建时间 | `create_time` | DateTime | `timestamp` |  | ✓ |
| 69 | `createDate` | 创建日期 | `create_date` | Date | `date` |  | ✓ |
| 70 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `timestamp` |  | ✓ |
| 71 | `modifyDate` | 修改日期 | `modify_date` | Date | `date` |  | ✓ |
| 72 | `creator` | 创建人名称 | `creator` | String | `text` |  | ✓ |
| 73 | `modifier` | 修改人名称 | `modifier` | String | `text` |  | ✓ |
| 74 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | ✓ |
| 75 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | ✓ |
| 76 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String | `text` |  | ✓ |
| 77 | `tenantId` | tenant租户 | `tenant_id` | String | `text` |  | ✓ |
| 78 | `bizFlow` | 流程ID | `bizFlowId` | 58dd3dad-7eb7-47ea-a5b1-1f89d1709528 | `quote` |  | ✓ |
| 79 | `isFlowCoreBill` | 是否流程核心单据 | `isFlowCoreBill` | Boolean | `switch` |  | ✓ |
| 80 | `auditor` | 审批人名称 | `auditor` | String | `text` |  | ✓ |
| 81 | `auditorId` | 审批人 | `auditorId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | ✓ |
| 82 | `auditTime` | 审批时间 | `audit_time` | DateTime | `timestamp` |  | ✓ |
| 83 | `auditDate` | 审批日期 | `audit_date` | Date | `date` |  | ✓ |
| 84 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | ✓ |
| 85 | `purPsnName` | 采购员 | `pur_psn_name` | String | `text` |  | ✓ |
| 86 | `linkPersonName` | 联系人 | `link_person_name` | String | `text` |  | ✓ |
| 87 | `isEntrust` | 拍卖形式 | `is_entrust` | Short | `short` |  | ✓ |
| 88 | `linkPersonId` | 拍卖组织联系人 | `link_person_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 | `quote` |  | ✓ |
| 89 | `linkPersonTel` | 联系电话 | `link_person_tel` | String | `text` |  | ✓ |
| 90 | `bidBudgetMnyYuan` | 采购预算 | `bid_budget_mny_yuan` | Decimal | `number` |  | ✓ |
| 91 | `linkPersionMail` | 电子邮箱 | `link_persion_mail` | String | `text` |  | ✓ |
| 92 | `sourcesFundsId` | 资金来源id | `sources_funds_id` | 92b613a5-0e7c-4f87-8a9b-7fccc9ba556a | `quote` |  | ✓ |
| 93 | `linkDepartmentId` | 所属部门 | `link_department_id` | a4352e3c-3eda-4539-a7a9-ec00799be118 | `quote` |  | ✓ |
| 94 | `linkDepartmentName` | 所属部门 | `link_department_name` | String | `text` |  | ✓ |
| 95 | `projectStartTime` | 预计开始日期 | `project_start_time` | DateTime | `timestamp` |  | ✓ |
| 96 | `projectEndTime` | 预计结束日期 | `project_end_time` | DateTime | `timestamp` |  | ✓ |
| 97 | `isBySection` | 标段(包)划分 | `is_by_section` | Short | `short` |  | ✓ |
| 98 | `version` | 版本 | `version` | String | `text` |  | ✓ |
| 99 | `uapProjectdocId` | 项目名称id | `uap_projectdoc_Id` | b1e7cbf6-094a-4200-b451-36bfa3ac3ff4 | `quote` |  | ✓ |
| 100 | `showTenderSummary` | 竞卖小结 | `show_tendersummary` | Short | `short` |  | ✓ |
| 101 | `transTypeId` | 交易类型id | `trans_type_id` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 | `quote` |  | ✓ |
| 102 | `memo` | 备注 | `memo` | String | `text` |  | ✓ |
| 103 | `enterpriseId` | 租户id | `enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 | `quote` |  | ✓ |
| 104 | `fileId` | 附件 | `file_id` | String | `text` |  | ✓ |
| 105 | `billstate` | 单据状态 | `billstate` | String | `text` |  | ✓ |
| 106 | `sourceId` | 源头id | `source_id` | Long | `long` |  | ✓ |
| 107 | `AuctionProjectDefineCharacter` | 废旧拍卖项目自定义项 | `define_character_id` | 0727fd35-c2ea-4c39-bd85-febbdec5c8e0 | `UserDefine` |  | ✓ |
| 108 | `purOrgId` | 采购组织ID | `pur_org_id` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` |  | ✓ |
| 109 | `purPsnId` | 采购员ID | `pur_psn_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 | `quote` |  | ✓ |
| 110 | `isFromAcceptance` | 是否为来源受理 | `is_from_acceptance` | Integer | `int` |  | ✓ |
| 111 | `projectGroupList` | 竞卖项目小组 | `` | 69d4b1ee-66b5-42c8-a3b4-50a09a80d553 | `` |  |  |
| 112 | `projectReqList` | 竞卖项目采购需求 | `` | 6cc6a17b-c4c9-4b40-80a0-d82ca7c92e43 | `` |  |  |
| 113 | `projectSectionList` | 竞卖项目标段信息 | `` | 7c0b1886-d21b-4dc6-b462-391bbee9c79b | `` |  |  |

---

## 关联属性（共 26 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `purOrgId` | 采购组织ID | `org.func.BaseOrg` | `pur_org_id` |  →  |  |  | Service |  |
| 2 | `projectReqList` | 竞卖项目采购需求 | `saleauction.project.AuctionProjectReq` | `` | projectReqList → bidProjectId | 0..n | true | None |  |
| 3 | `linkPersonId` | 拍卖组织联系人 | `bd.staff.Staff` | `link_person_id` |  →  |  |  | Service |  |
| 4 | `creatorId` | 创建人 | `base.user.User` | `creatorId` |  →  |  |  | Service |  |
| 5 | `modifierId` | 修改人 | `base.user.User` | `modifierId` |  →  |  |  | Service |  |
| 6 | `linkDepartmentId` | 所属部门 | `bd.adminOrg.AdminOrgVO` | `link_department_id` |  →  |  |  | Service |  |
| 7 | `bizFlow` | 流程ID | `bf.bizflow.BusinessFlow` | `bizFlowId` |  →  |  |  | Service |  |
| 8 | `uapProjectdocId` | 项目名称id | `bd.project.ProjectVO` | `uap_projectdoc_Id` |  →  |  |  | Service |  |
| 9 | `processorId` | 处理人 | `bd.staff.Staff` | `processor_id` |  →  |  |  | Service |  |
| 10 | `agencyEnterpriseId` | 招标代理机构租户ID | `cpu-privilege.enterprise.EnterprisePOJO` | `agency_enterprise_id` |  →  |  |  | Service |  |
| 11 | `transTypeId` | 交易类型id | `bd.bill.TransType` | `trans_type_id` |  →  |  |  | Service |  |
| 12 | `agencyOrgPsnId` | 代理机构联系人 | `bd.staff.Staff` | `agency_org_psn_id` |  →  |  |  | Service |  |
| 13 | `acceptDepartmentId` | 受理人部门ID | `bd.adminOrg.AdminOrgVO` | `accept_department_id` |  →  |  |  | Service |  |
| 14 | `purModeId` | 采购模式id | `bctask.basedoc.CustomerDocVO` | `pur_mode_id` |  →  |  |  | Service |  |
| 15 | `purPsnId` | 采购员ID | `bd.staff.Staff` | `pur_psn_id` |  →  |  |  | Service |  |
| 16 | `currencyId` | 币种 | `bd.currencytenant.CurrencyTenantVO` | `currency_id` |  →  |  |  | Service |  |
| 17 | `agencyOrgId` | 招标代理机构 | `org.func.BaseOrg` | `agency_org_id` |  →  |  |  | Service |  |
| 18 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | `ytenant_id` |  →  |  |  | Service |  |
| 19 | `sourcesFundsId` | 资金来源id | `bctask.basedoc.CustomerDocVO` | `sources_funds_id` |  →  |  |  | Service |  |
| 20 | `projectGroupList` | 竞卖项目小组 | `saleauction.project.AuctionProjectGroup` | `` | projectGroupList → bidProjectId | 0..n | true | None |  |
| 21 | `projectSectionList` | 竞卖项目标段信息 | `saleauction.project.AuctionProjectSection` | `` | projectSectionList → bidProjectId | 1..n | true | None |  |
| 22 | `auditorId` | 审批人 | `base.user.User` | `auditorId` |  →  |  |  | Service |  |
| 23 | `AuctionProjectDefineCharacter` | 废旧拍卖项目自定义项 | `saleauction.project.AuctionProjectDefineCharacter` | `define_character_id` |  →  |  |  | None |  |
| 24 | `enterpriseId` | 租户id | `cpu-privilege.enterprise.EnterprisePOJO` | `enterprise_id` |  →  |  |  | Service |  |
| 25 | `linkPersionOrgId` | 联系人组织id | `org.func.BaseOrg` | `link_persion_org_id` |  →  |  |  | Service |  |
| 26 | `agencyOrgRoleId` | 角色 | `sys.auth.Role` | `agency_org_role_id` |  →  |  |  | Service |  |

### Composition（子表）

- **projectReqList**: `projectReqList` → `saleauction.project.AuctionProjectReq` | 0..n
- **projectGroupList**: `projectGroupList` → `saleauction.project.AuctionProjectGroup` | 0..n
- **projectSectionList**: `projectSectionList` → `saleauction.project.AuctionProjectSection` | 1..n

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `purOrgId` (采购组织ID) | `org.func.BaseOrg` | `pur_org_id` |
| `linkPersonId` (拍卖组织联系人) | `bd.staff.Staff` | `link_person_id` |
| `creatorId` (创建人) | `base.user.User` | `creatorId` |
| `modifierId` (修改人) | `base.user.User` | `modifierId` |
| `linkDepartmentId` (所属部门) | `bd.adminOrg.AdminOrgVO` | `link_department_id` |
| `bizFlow` (流程ID) | `bf.bizflow.BusinessFlow` | `bizFlowId` |
| `uapProjectdocId` (项目名称id) | `bd.project.ProjectVO` | `uap_projectdoc_Id` |
| `processorId` (处理人) | `bd.staff.Staff` | `processor_id` |
| `agencyEnterpriseId` (招标代理机构租户ID) | `cpu-privilege.enterprise.EnterprisePOJO` | `agency_enterprise_id` |
| `transTypeId` (交易类型id) | `bd.bill.TransType` | `trans_type_id` |
| `agencyOrgPsnId` (代理机构联系人) | `bd.staff.Staff` | `agency_org_psn_id` |
| `acceptDepartmentId` (受理人部门ID) | `bd.adminOrg.AdminOrgVO` | `accept_department_id` |
| `purModeId` (采购模式id) | `bctask.basedoc.CustomerDocVO` | `pur_mode_id` |
| `purPsnId` (采购员ID) | `bd.staff.Staff` | `pur_psn_id` |
| `currencyId` (币种) | `bd.currencytenant.CurrencyTenantVO` | `currency_id` |
| `agencyOrgId` (招标代理机构) | `org.func.BaseOrg` | `agency_org_id` |
| `ytenant` (租户id) | `yht.tenant.YhtTenant` | `ytenant_id` |
| `sourcesFundsId` (资金来源id) | `bctask.basedoc.CustomerDocVO` | `sources_funds_id` |
| `auditorId` (审批人) | `base.user.User` | `auditorId` |
| `enterpriseId` (租户id) | `cpu-privilege.enterprise.EnterprisePOJO` | `enterprise_id` |
| `linkPersionOrgId` (联系人组织id) | `org.func.BaseOrg` | `link_persion_org_id` |
| `agencyOrgRoleId` (角色) | `sys.auth.Role` | `agency_org_role_id` |
