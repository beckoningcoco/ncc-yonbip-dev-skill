---
tags: ["BIP", "元数据", "数据字典", "ycSouringAuction", "auction.project.AuctionProject"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 竞拍项目 (`auction.project.AuctionProject`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP ycSouringAuction 模块实体元数据字典。
> 物理表：`cpu_project` | 所属应用：`ycSouringAuction`
> 来源：元数据API `queryByUri` 返回的 `auction.project.AuctionProject` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 竞拍项目 |
| 物理表 | `cpu_project` |
| 数据库 schema | `yonbip-cpu-lawbid` |
| 所属应用 | `ycSouringAuction` |
| 业务对象ID | `43e37b8b-0c1c-449d-a32b-73cfe98bc2d8` |
| 元数据类型 | `Class` |
| 元数据层级 | `0` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 15:29:27.0480` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` | Long | 主键 |
| 编码 | `bid_project_code` | `bid_project_code` | String | 竞拍项目编号（必填，isCode）|

## 部署信息

- **部署时间**: 2025-10-24 23:58:03:000
- **安装来源**: `/app/data_scripts/yonbip-cpu-lawbid/scripts/db/patch/mongodb/V5_R0_2507/0001_yonbip-cpu-lawbid/0010_iuap_common/DML/0270_iuap_metadata/202509111056_metadata_auction-project.zip`
- **安装人**: mongoTools
- **安装排名**: `0c137228-9a95-40cd-a67a-4673c54efaf4`

## 业务场景

- `workflow`
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

- **migration_id** (MetaClassPrimary): ID — 唯一字段: `['id']`

## 依赖接口（共 12 个）

| # | 接口名 | URI | 版本 | 属性数 |
|---|--------|-----|------|--------|
| 1 | 跨租户采购商租户接口 (`IBuyerTenant`) | `cpu.itf.IBuyerTenant` | 10 | 1 |
| 2 | 自动编号 (`IAutoCode`) | `voucher.base.IAutoCode` | 49 | 1 |
| 3 | 项目接口 (`IProject`) | `project.itf.IProject` | 3698 | 82 |
| 4 | 统一租户接口 (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |
| 5 | 审批兼容信息 (`ICompatibleFlowInfo`) | `lawbid.commonitf.ICompatibleFlowInfo` | 6 | 3 |
| 6 | 逻辑删除相关 (`LogicDelete`) | `ucfbase.ucfbaseItf.LogicDelete` | 74 | 1 |
| 7 | 审计信息 (`IAuditInfo`) | `base.itf.IAuditInfo` | 340 | 8 |
| 8 | 审批流信息 (`IApprovalFlow`) | `base.itf.IApprovalFlow` | 134 | 3 |
| 9 | 企业ID (`IEnterprise`) | `cpu.itf.IEnterprise` | 6 | 1 |
| 10 | lawbidTenant租户相关 (`ITenant`) | `lawbid.itf.ITenant` | 2 | 1 |
| 11 | 审批信息 (`IApprovalInfo`) | `base.itf.IApprovalInfo` | 172 | 4 |
| 12 | 流程接口 (`IBusinessFlow`) | `base.itf.IBusinessFlow` | 77 | 2 |

---

## 直接属性（共 115 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `AuctionProjectDefineCharacter` | 竞拍项目主表自定义项 | `define_character_id` | d40dc387-da84-4270-9325-288a16d87b6f | `UserDefine` |  | ✓ |
| 2 | `acceptDepartmentId` | 受理人部门ID | `accept_department_id` | a4352e3c-3eda-4539-a7a9-ec00799be118 | `quote` |  | ✓ |
| 3 | `acceptDepartmentName` | 受理人部门名称 | `accept_department_name` | String | `text` |  | ✓ |
| 4 | `acceptPersonId` | 受理人ID | `accept_person_id` | String | `text` |  | ✓ |
| 5 | `acceptPersonName` | 受理人名字 | `accept_person_name` | String | `text` |  | ✓ |
| 6 | `acceptTime` | 委托受理时间 | `accept_time` | DateTime | `timestamp` |  | ✓ |
| 7 | `agencyEnterpriseId` | 招标代理机构租户ID | `agency_enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 | `quote` |  | ✓ |
| 8 | `agencyEnterpriseName` | 招标代理机构租户名称 | `agency_enterprise_name` | String | `text` |  | ✓ |
| 9 | `agencyOfficialCode` | 招标代理机构组织编码 | `agency_official_code` | String | `text` |  | ✓ |
| 10 | `agencyOrgId` | 招标代理机构 | `agency_org_id` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` |  | ✓ |
| 11 | `agencyOrgName` | 招标代理机构 | `agency_org_name` | String | `text` |  | ✓ |
| 12 | `strategyId` | 管控策略id | `strategy_id` | da7e5585-8f8c-4510-b005-9e6bcaf6995d | `quote` |  | ✓ |
| 13 | `sourcingSolutionId` | 寻源方案主键 | `sourcing_solution_id` | 5feddfc7-e8bb-4914-9718-937e7ea60df0 | `quote` |  | ✓ |
| 14 | `processorId` | 处理人 | `processor_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 | `quote` |  | ✓ |
| 15 | `contactType` | 联系人类型 | `contact_type` | String | `text` |  | ✓ |
| 16 | `agencyOrgRoleId` | 角色 | `agency_org_role_id` | 6c660d78-70a8-438e-9925-f1c342df3a12 | `quote` |  | ✓ |
| 17 | `transTypeName` | 交易类型名称 | `trans_type_name` | String | `text` |  | ✓ |
| 18 | `entrustRefuseReason` | 委托退回原因 | `entrust_refuse_reason` | String | `text` |  | ✓ |
| 19 | `invalidReason` | 作废原因 | `invalid_reason` | String | `text` |  | ✓ |
| 20 | `entrustSourceProjectId` | 采购委托项目id | `entrust_source_project_id` | Long | `long` |  | ✓ |
| 21 | `tenantId` | tenant租户 | `tenant_id` | String | `text` |  | ✓ |
| 22 | `auditor` | 审批人名称 | `auditor` | String | `text` |  | ✓ |
| 23 | `auditorId` | 审批人 | `auditorId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | ✓ |
| 24 | `auditTime` | 审批时间 | `audit_time` | DateTime | `timestamp` |  | ✓ |
| 25 | `auditDate` | 审批日期 | `audit_date` | Date | `date` |  | ✓ |
| 26 | `bizFlow` | 流程ID | `bizFlowId` | 58dd3dad-7eb7-47ea-a5b1-1f89d1709528 | `quote` |  | ✓ |
| 27 | `isFlowCoreBill` | 是否流程核心单据 | `isFlowCoreBill` | Boolean | `switch` |  | ✓ |
| 28 | `agencyOrgPersionMail` | 电子邮箱 | `agency_org_persion_mail` | String | `text` |  | ✓ |
| 29 | `agencyOrgPersonTel` | 联系电话 | `agency_org_person_tel` | String | `text` |  | ✓ |
| 30 | `agencyOrgPsnId` | 代理机构联系人 | `agency_org_psn_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 | `quote` |  | ✓ |
| 31 | `agencyOrgPsnUserId` | 联系人用户ID | `agency_org_psn_user_id` | String | `text` |  | ✓ |
| 32 | `approveRecord` | 是否有审批记录 | `approve_record` | Short | `short` |  | ✓ |
| 33 | `bidBillType` | 招标单据类型 | `bid_bill_type` | String | `text` |  | ✓ |
| 34 | `bidBudgetMny` | 采购预算 | `bid_budget_mny` | Decimal | `number` |  | ✓ |
| 35 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String | `text` |  | ✓ |
| 36 | `createDate` | 创建日期 | `create_date` | Date | `date` |  | ✓ |
| 37 | `createTime` | 创建时间 | `create_time` | DateTime | `timestamp` |  | ✓ |
| 38 | `creator` | 创建人名称 | `creator` | String | `text` |  | ✓ |
| 39 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | ✓ |
| 40 | `currencyId` | 币种 | `currency_id` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e | `quote` |  | ✓ |
| 41 | `dr` | 逻辑删除标记 | `dr` | Short | `short` |  | ✓ |
| 42 | `enterpriseId` | 所属租户id | `enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 | `quote` |  | ✓ |
| 43 | `enterpriseName` | 租户名称 | `enterprise_name` | String | `text` |  | ✓ |
| 44 | `entrustTime` | 委托时间 | `entrust_time` | DateTime | `timestamp` |  | ✓ |
| 45 | `fatherId` | 来源id | `father_id` | Long | `long` |  | ✓ |
| 46 | `fundSource` | 资金来源 | `fund_source` | String | `text` |  | ✓ |
| 47 | `hopeFinishTime` | 期望完成时间 | `hope_finish_time` | DateTime | `timestamp` |  | ✓ |
| 48 | `isCanEditSection` | 是否允许修改标段 | `is_can_edit_section` | Short | `short` |  | ✓ |
| 49 | `lawbidSystemId` | 原始ID | `lawbid_system_id` | Long | `long` |  | ✓ |
| 50 | `lawbidSystemType` | 原始表 | `lawbid_system_type` | String | `text` |  | ✓ |
| 51 | `linkPersionOrgCode` | 联系人组织code | `link_persion_org_code` | String | `text` |  | ✓ |
| 52 | `showTenderSummary` | 竞拍小结 | `show_tendersummary` | Short | `short` |  | ✓ |
| 53 | `linkPersionOrgId` | 联系人组织id | `link_persion_org_id` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` |  | ✓ |
| 54 | `linkPersionOrgName` | 联系人组织名称 | `link_persion_org_name` | String | `text` |  | ✓ |
| 55 | `modifier` | 修改人名称 | `modifier` | String | `text` |  | ✓ |
| 56 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | ✓ |
| 57 | `modifyDate` | 修改日期 | `modify_date` | Date | `date` |  | ✓ |
| 58 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `timestamp` |  | ✓ |
| 59 | `natureFunds` | 资金性质 | `nature_funds` | String | `text` |  | ✓ |
| 60 | `natureFundsId` | 资金性质id | `nature_funds_id` | String | `text` |  | ✓ |
| 61 | `privateCode` | 项目内部编号 | `private_code` | String | `text` |  | ✓ |
| 62 | `projectDocId` | 项目档案ID | `project_doc_id` | Long | `long` |  | ✓ |
| 63 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | ✓ |
| 64 | `purGroupType` | 采购小组设置方式 | `pur_group_type` | String | `text` |  | ✓ |
| 65 | `purModeId` | 采购模式id | `pur_mode_id` | 92b613a5-0e7c-4f87-8a9b-7fccc9ba556a | `quote` |  | ✓ |
| 66 | `purModeName` | 采购模式 | `pur_mode_name` | String | `text` |  | ✓ |
| 67 | `purchaserAddress` | 采购人地址 | `purchaser_address` | String | `text` |  | ✓ |
| 68 | `purchaserCode` | 采购联系人姓名 | `purchaser_code` | String | `text` |  | ✓ |
| 69 | `purchaserDept` | 采购人所在部门 | `purchaser_dept` | String | `text` |  | ✓ |
| 70 | `purchaserMail` | 采购人邮箱 | `purchaser_mail` | String | `text` |  | ✓ |
| 71 | `purchaserTell` | 采购联系人电话 | `purchaser_tell` | String | `text` |  | ✓ |
| 72 | `purchaserUnitAddress` | 采购联系人单位地址 | `purchaser_unit_address` | String | `text` |  | ✓ |
| 73 | `rejectOpinion` | 驳回意见 | `reject_opinion` | String | `text` |  | ✓ |
| 74 | `repulseReason` | 退回原因 | `repulse_reason` | String | `text` |  | ✓ |
| 75 | `sectionMold` | 标段类型 | `section_mold` | String | `text` |  | ✓ |
| 76 | `sectionType` | 标段划分方式 | `section_type` | String | `text` |  | ✓ |
| 77 | `sourceId` | 源头id | `source_id` | Long | `long` |  | ✓ |
| 78 | `sourcesFunds` | 资金来源 | `sources_funds` | String | `text` |  | ✓ |
| 79 | `userId` | 制单人userid | `user_id` | String | `text` |  | ✓ |
| 80 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | ✓ | ✓ |
| 81 | `id` | 主键 | `id` | Long | `long` |  | ✓ |
| 82 | `isWfControlled` | 是否审批流控制 | `isWfControlled` | Boolean | `switch` |  | ✓ |
| 83 | `verifystate` | 审批状态 | `verifystate` | Short | `short` |  | ✓ |
| 84 | `returncount` | 退回次数 | `returncount` | Short | `short` |  | ✓ |
| 85 | `isNewFlow` | 是否为新审批 | `is_new_flow` | Integer | `int` |  | ✓ |
| 86 | `oldBillNum` | 原始单据号 | `old_bill_num` | String | `text` |  | ✓ |
| 87 | `flowSource` | 审批源 | `flow_source` | String | `text` |  | ✓ |
| 88 | `code` | 竞拍项目编号 | `bid_project_code` | String | `text` |  | ✓ |
| 89 | `bidProjectName` | 竞拍项目名称 | `bid_project_name` | String | `text` |  | ✓ |
| 90 | `purOrgName` | 采购组织 | `pur_org_name` | String | `text` |  | ✓ |
| 91 | `purPsnName` | 采购员 | `pur_psn_name` | String | `text` |  | ✓ |
| 92 | `linkPersonName` | 联系人 | `link_person_name` | String | `text` |  | ✓ |
| 93 | `isEntrust` | 采购形式 | `is_entrust` | Short | `short` |  | ✓ |
| 94 | `linkPersonId` | 采购组织联系人 | `link_person_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 | `quote` |  | ✓ |
| 95 | `linkPersonTel` | 联系电话 | `link_person_tel` | String | `text` |  | ✓ |
| 96 | `bidBudgetMnyYuan` | 采购预算 | `bid_budget_mny_yuan` | Decimal | `number` |  | ✓ |
| 97 | `linkPersionMail` | 电子邮箱 | `link_persion_mail` | String | `text` |  | ✓ |
| 98 | `sourcesFundsId` | 资金来源id | `sources_funds_id` | 92b613a5-0e7c-4f87-8a9b-7fccc9ba556a | `quote` |  | ✓ |
| 99 | `linkDepartmentId` | 所属部门 | `link_department_id` | a4352e3c-3eda-4539-a7a9-ec00799be118 | `quote` |  | ✓ |
| 100 | `linkDepartmentName` | 所属部门 | `link_department_name` | String | `text` |  | ✓ |
| 101 | `projectStartTime` | 预计开始日期 | `project_start_time` | DateTime | `timestamp` |  | ✓ |
| 102 | `projectEndTime` | 预计结束日期 | `project_end_time` | DateTime | `timestamp` |  | ✓ |
| 103 | `isBySection` | 标段(包)划分 | `is_by_section` | Short | `short` |  | ✓ |
| 104 | `version` | 版本 | `version` | String | `text` |  | ✓ |
| 105 | `uapProjectdocId` | 项目名称id | `uap_projectdoc_Id` | b1e7cbf6-094a-4200-b451-36bfa3ac3ff4 | `quote` |  | ✓ |
| 106 | `transTypeId` | 交易类型id | `trans_type_id` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 | `quote` |  | ✓ |
| 107 | `memo` | 备注 | `memo` | String | `text` |  | ✓ |
| 108 | `fileId` | 附件 | `file_id` | String | `text` |  | ✓ |
| 109 | `billstate` | 单据状态 | `billstate` | String | `text` |  | ✓ |
| 110 | `purOrgId` | 采购组织ID | `pur_org_id` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` |  | ✓ |
| 111 | `purPsnId` | 采购员ID | `pur_psn_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 | `quote` |  | ✓ |
| 112 | `isFromAcceptance` | 是否为来源受理 | `is_from_acceptance` | Integer | `int` |  | ✓ |
| 113 | `projectGroupList` | 竞拍项目小组 | `` | dffee2cc-43ee-40d5-b3ca-8f2ddbccd181 | `` |  |  |
| 114 | `projectReqList` | 竞拍项目采购需求 | `` | ed5ff430-4c0b-4d1f-94be-fa8cad9cdf61 | `` |  |  |
| 115 | `projectSectionList` | 竞拍项目标段信息 | `` | 19bd41ed-e7a3-4291-95c0-abc0d0555724 | `` |  |  |

---

## 关联属性（共 28 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `purOrgId` | 采购组织ID | `org.func.BaseOrg` | `pur_org_id` |  →  |  |  | Service |  |
| 2 | `projectReqList` | 竞拍项目采购需求 | `auction.project.AuctionProjectReq` | `` | projectReqList → bidProjectId | 0..n | true | None |  |
| 3 | `linkPersonId` | 采购组织联系人 | `bd.staff.Staff` | `link_person_id` |  →  |  |  | Service |  |
| 4 | `creatorId` | 创建人 | `base.user.User` | `creatorId` |  →  |  |  | Service |  |
| 5 | `modifierId` | 修改人 | `base.user.User` | `modifierId` |  →  |  |  | Service |  |
| 6 | `linkDepartmentId` | 所属部门 | `bd.adminOrg.AdminOrgVO` | `link_department_id` |  →  |  |  | Service |  |
| 7 | `bizFlow` | 流程ID | `bf.bizflow.BusinessFlow` | `bizFlowId` |  →  |  |  | Service |  |
| 8 | `uapProjectdocId` | 项目名称id | `bd.project.ProjectVO` | `uap_projectdoc_Id` |  →  |  |  | Service |  |
| 9 | `processorId` | 处理人 | `bd.staff.Staff` | `processor_id` |  →  |  |  | Service |  |
| 10 | `agencyEnterpriseId` | 招标代理机构租户ID | `cpu-privilege.enterprise.EnterprisePOJO` | `agency_enterprise_id` |  →  |  |  | Service |  |
| 11 | `transTypeId` | 交易类型id | `bd.bill.TransType` | `trans_type_id` |  →  |  |  | Service |  |
| 12 | `agencyOrgPsnId` | 代理机构联系人 | `bd.staff.Staff` | `agency_org_psn_id` |  →  |  |  | Service |  |
| 13 | `strategyId` | 管控策略id | `sourcing.businessRuleSolution.BusinessRuleControlStrategy` | `strategy_id` |  →  |  |  | Service |  |
| 14 | `acceptDepartmentId` | 受理人部门ID | `bd.adminOrg.AdminOrgVO` | `accept_department_id` |  →  |  |  | Service |  |
| 15 | `purModeId` | 采购模式id | `bctask.basedoc.CustomerDocVO` | `pur_mode_id` |  →  |  |  | Service |  |
| 16 | `purPsnId` | 采购员ID | `bd.staff.Staff` | `pur_psn_id` |  →  |  |  | Service |  |
| 17 | `currencyId` | 币种 | `bd.currencytenant.CurrencyTenantVO` | `currency_id` |  →  |  |  | Service |  |
| 18 | `agencyOrgId` | 招标代理机构 | `org.func.BaseOrg` | `agency_org_id` |  →  |  |  | Service |  |
| 19 | `sourcingSolutionId` | 寻源方案主键 | `sourcing.businessRuleSolution.BusinessRuleSolution` | `sourcing_solution_id` |  →  |  |  | Service |  |
| 20 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | `ytenant_id` |  →  |  |  | Service |  |
| 21 | `sourcesFundsId` | 资金来源id | `bctask.basedoc.CustomerDocVO` | `sources_funds_id` |  →  |  |  | Service |  |
| 22 | `projectGroupList` | 竞拍项目小组 | `auction.project.AuctionProjectGroup` | `` | projectGroupList → bidProjectId | 0..n | true | None |  |
| 23 | `projectSectionList` | 竞拍项目标段信息 | `auction.project.AuctionProjectSection` | `` | projectSectionList → bidProjectId | 1..n | true | None |  |
| 24 | `auditorId` | 审批人 | `base.user.User` | `auditorId` |  →  |  |  | Service |  |
| 25 | `AuctionProjectDefineCharacter` | 竞拍项目主表自定义项 | `auction.project.AuctionProjectDefineCharacter` | `define_character_id` |  →  |  |  | None |  |
| 26 | `enterpriseId` | 所属租户id | `cpu-privilege.enterprise.EnterprisePOJO` | `enterprise_id` |  →  |  |  | Service |  |
| 27 | `linkPersionOrgId` | 联系人组织id | `org.func.BaseOrg` | `link_persion_org_id` |  →  |  |  | Service |  |
| 28 | `agencyOrgRoleId` | 角色 | `sys.auth.Role` | `agency_org_role_id` |  →  |  |  | Service |  |

### Composition（子表）

- **projectReqList**: `projectReqList` → `auction.project.AuctionProjectReq` | 0..n
- **projectGroupList**: `projectGroupList` → `auction.project.AuctionProjectGroup` | 0..n
- **projectSectionList**: `projectSectionList` → `auction.project.AuctionProjectSection` | 1..n

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `purOrgId` (采购组织ID) | `org.func.BaseOrg` | `pur_org_id` |
| `linkPersonId` (采购组织联系人) | `bd.staff.Staff` | `link_person_id` |
| `creatorId` (创建人) | `base.user.User` | `creatorId` |
| `modifierId` (修改人) | `base.user.User` | `modifierId` |
| `linkDepartmentId` (所属部门) | `bd.adminOrg.AdminOrgVO` | `link_department_id` |
| `bizFlow` (流程ID) | `bf.bizflow.BusinessFlow` | `bizFlowId` |
| `uapProjectdocId` (项目名称id) | `bd.project.ProjectVO` | `uap_projectdoc_Id` |
| `processorId` (处理人) | `bd.staff.Staff` | `processor_id` |
| `agencyEnterpriseId` (招标代理机构租户ID) | `cpu-privilege.enterprise.EnterprisePOJO` | `agency_enterprise_id` |
| `transTypeId` (交易类型id) | `bd.bill.TransType` | `trans_type_id` |
| `agencyOrgPsnId` (代理机构联系人) | `bd.staff.Staff` | `agency_org_psn_id` |
| `strategyId` (管控策略id) | `sourcing.businessRuleSolution.BusinessRuleControlStrategy` | `strategy_id` |
| `acceptDepartmentId` (受理人部门ID) | `bd.adminOrg.AdminOrgVO` | `accept_department_id` |
| `purModeId` (采购模式id) | `bctask.basedoc.CustomerDocVO` | `pur_mode_id` |
| `purPsnId` (采购员ID) | `bd.staff.Staff` | `pur_psn_id` |
| `currencyId` (币种) | `bd.currencytenant.CurrencyTenantVO` | `currency_id` |
| `agencyOrgId` (招标代理机构) | `org.func.BaseOrg` | `agency_org_id` |
| `sourcingSolutionId` (寻源方案主键) | `sourcing.businessRuleSolution.BusinessRuleSolution` | `sourcing_solution_id` |
| `ytenant` (租户id) | `yht.tenant.YhtTenant` | `ytenant_id` |
| `sourcesFundsId` (资金来源id) | `bctask.basedoc.CustomerDocVO` | `sources_funds_id` |
| `auditorId` (审批人) | `base.user.User` | `auditorId` |
| `enterpriseId` (所属租户id) | `cpu-privilege.enterprise.EnterprisePOJO` | `enterprise_id` |
| `linkPersionOrgId` (联系人组织id) | `org.func.BaseOrg` | `link_persion_org_id` |
| `agencyOrgRoleId` (角色) | `sys.auth.Role` | `agency_org_role_id` |
