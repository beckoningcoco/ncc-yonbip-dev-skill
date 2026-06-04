---
tags: ["BIP", "元数据", "数据字典", "ycSouringBid", "lawbid.project.LawbidProject"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 采购项目 (`lawbid.project.LawbidProject`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP ycSouringBid 模块实体元数据字典。
> 物理表：`cpu_project` | 所属应用：`ycSouringBid`
> 来源：元数据API `queryByUri` 返回的 `lawbid.project.LawbidProject` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 采购项目 |
| 物理表 | `cpu_project` |
| 数据库 schema | `yonbip-cpu-lawbid` |
| 所属应用 | `ycSouringBid` |
| 业务对象ID | `fb92ae5a-a964-4a8e-a29a-e7865934c2d2` |
| 元数据类型 | `Class` |
| 元数据层级 | `2` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 14:16:40.8170` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` | Long | 主键 |
| 编码 | `bid_project_code` | `bid_project_code` | String | 采购项目编号（必填，isCode）|

## 部署信息

- **部署时间**: 2025-10-24 23:57:50:000
- **安装来源**: `/app/data_scripts/yonbip-cpu-lawbid/scripts/db/patch/mongodb/V5_R0_2507/0001_yonbip-cpu-lawbid/0010_iuap_common/DML/0270_iuap_metadata/202509111011_metadata_lawbid-project.zip`
- **安装人**: mongoTools
- **安装排名**: `f99b34df-c29b-4cc5-ad3c-8fbeeca6416c`

## 业务场景

- `DataAuth`
- `transtype`
- `dataPrivacy`
- `userdefine`
- `extdevelop`
- `print`
- `UITemplate`
- `imextmp`
- `report`
- `billcode`
- `ruleengine`
- `msgtemplate`
- `api`
- `bpm`

## 术语标记

`BusinessData`, `isAssigned`, `isExtend`, `data_auth`, `isMain`, `doc`

## 约束

- **PRIMARY** (transformKey): 主键 — 唯一字段: `['id']`
- **migration_id** (MetaClassPrimary): ID — 唯一字段: `['id']`

## 依赖接口（共 12 个）

| # | 接口名 | URI | 版本 | 属性数 |
|---|--------|-----|------|--------|
| 1 | 统一租户接口 (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |
| 2 | 审计信息 (`IAuditInfo`) | `base.itf.IAuditInfo` | 340 | 8 |
| 3 | 自动编号 (`IAutoCode`) | `voucher.base.IAutoCode` | 49 | 1 |
| 4 | 逻辑删除相关 (`LogicDelete`) | `ucfbase.ucfbaseItf.LogicDelete` | 74 | 1 |
| 5 | 审批流信息 (`IApprovalFlow`) | `base.itf.IApprovalFlow` | 134 | 3 |
| 6 | 企业ID (`IEnterprise`) | `cpu.itf.IEnterprise` | 6 | 1 |
| 7 | 跨租户采购商租户接口 (`IBuyerTenant`) | `cpu.itf.IBuyerTenant` | 10 | 1 |
| 8 | 审批兼容信息 (`ICompatibleFlowInfo`) | `lawbid.commonitf.ICompatibleFlowInfo` | 6 | 3 |
| 9 | 项目接口 (`IProject`) | `project.itf.IProject` | 3698 | 82 |
| 10 | lawbidTenant租户相关 (`ITenant`) | `lawbid.itf.ITenant` | 2 | 1 |
| 11 | 审批信息 (`IApprovalInfo`) | `base.itf.IApprovalInfo` | 172 | 4 |
| 12 | 采购模板-领域扩展字段 (`TplId`) | `tpl.itf.TplId` | 53 | 2 |

---

## 直接属性（共 120 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `lawbidProjectDefineCharacter` | 表头自定义项特征属性 | `define_character_id` | 8ae4d053-58a5-477a-a80c-af15b2ac0f48 | `UserDefine` |  | ✓ |
| 2 | `acceptDepartmentName` | 受理人部门名称 | `accept_department_name` | String | `text` |  | ✓ |
| 3 | `acceptDepartmentId` | 受理人部门ID | `accept_department_id` | a4352e3c-3eda-4539-a7a9-ec00799be118 | `quote` |  | ✓ |
| 4 | `acceptPersonId` | 受理人ID | `accept_person_id` | String | `text` |  | ✓ |
| 5 | `acceptPersonName` | 受理人名字 | `accept_person_name` | String | `text` |  | ✓ |
| 6 | `acceptTime` | 委托受理时间 | `accept_time` | DateTime | `timestamp` |  | ✓ |
| 7 | `agencyEnterpriseId` | 招标代理机构租户ID | `agency_enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 | `quote` |  | ✓ |
| 8 | `agencyEnterpriseName` | 招标代理机构租户名称 | `agency_enterprise_name` | String | `text` |  | ✓ |
| 9 | `agencyOfficialCode` | 招标代理机构组织编码 | `agency_official_code` | String | `text` |  | ✓ |
| 10 | `entrustRefuseReason` | 委托退回原因 | `entrust_refuse_reason` | String | `text` |  | ✓ |
| 11 | `transTypeName` | 交易类型名称 | `trans_type_name` | String | `text` |  | ✓ |
| 12 | `strategyId` | 管控策略id | `strategy_id` | da7e5585-8f8c-4510-b005-9e6bcaf6995d | `quote` |  | ✓ |
| 13 | `sourcingSolutionId` | 寻源方案主键 | `sourcing_solution_id` | 5feddfc7-e8bb-4914-9718-937e7ea60df0 | `quote` |  | ✓ |
| 14 | `templateId` | 主模板主键 | `template_id` | 9846efd9-caa6-4b42-a848-477a09a83b44 | `quote` |  | ✓ |
| 15 | `billTemplateId` | 单据模板主键 | `bill_template_id` | fa7aa0a8-dffb-4595-ab15-ad7053de81a3 | `quote` |  | ✓ |
| 16 | `uiVersion` | UI模板版本 | `ui_version` | Integer | `int` |  | ✓ |
| 17 | `processorId` | 处理人ID | `processor_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 | `quote` |  | ✓ |
| 18 | `auditor` | 审批人名称 | `auditor` | String | `text` |  | ✓ |
| 19 | `auditorId` | 审批人 | `auditorId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | ✓ |
| 20 | `auditTime` | 审批时间 | `audit_time` | DateTime | `timestamp` |  | ✓ |
| 21 | `auditDate` | 审批日期 | `audit_date` | Date | `date` |  | ✓ |
| 22 | `invalidReason` | 作废原因 | `invalid_reason` | String | `text` |  | ✓ |
| 23 | `tenantId` | tenant租户 | `tenant_id` | String | `text` |  | ✓ |
| 24 | `approveRecord` | 是否有审批记录 | `approve_record` | Short | `short` |  | ✓ |
| 25 | `bidBillType` | 招标单据类型 | `bid_bill_type` | String | `text` |  | ✓ |
| 26 | `bidBudgetMny` | 采购预算 | `bid_budget_mny` | Decimal | `number` |  | ✓ |
| 27 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String | `text` |  | ✓ |
| 28 | `createDate` | 创建日期 | `create_date` | Date | `date` |  | ✓ |
| 29 | `contactType` | 联系人类型 | `contact_type` | String | `text` |  | ✓ |
| 30 | `createTime` | 创建时间 | `create_time` | DateTime | `timestamp` |  | ✓ |
| 31 | `creator` | 创建人名称 | `creator` | String | `text` |  | ✓ |
| 32 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | ✓ |
| 33 | `agencyOrgRoleId` | 角色 | `agency_org_role_id` | 6c660d78-70a8-438e-9925-f1c342df3a12 | `quote` |  | ✓ |
| 34 | `dr` | 逻辑删除标记 | `dr` | Short | `short` |  | ✓ |
| 35 | `enterpriseId` | 所属租户id | `enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 | `quote` |  | ✓ |
| 36 | `enterpriseName` | 租户名称 | `enterprise_name` | String | `text` |  | ✓ |
| 37 | `entrustTime` | 委托时间 | `entrust_time` | DateTime | `timestamp` |  | ✓ |
| 38 | `fatherId` | 来源id | `father_id` | Long | `long` |  | ✓ |
| 39 | `currencyId` | 币种 | `currency_id` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e | `quote` |  | ✓ |
| 40 | `fundSource` | 资金来源 | `fund_source` | String | `text` |  | ✓ |
| 41 | `hopeFinishTime` | 期望完成时间 | `hope_finish_time` | DateTime | `timestamp` |  | ✓ |
| 42 | `isCanEditSection` | 是否允许修改标段 | `is_can_edit_section` | Short | `short` |  | ✓ |
| 43 | `lawbidSystemId` | 原始ID | `lawbid_system_id` | Long | `long` |  | ✓ |
| 44 | `lawbidSystemType` | 原始表 | `lawbid_system_type` | String | `text` |  | ✓ |
| 45 | `linkPersionOrgCode` | 联系人组织code | `link_persion_org_code` | String | `text` |  | ✓ |
| 46 | `linkPersionOrgId` | 联系人组织ID | `link_persion_org_id` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` |  | ✓ |
| 47 | `linkPersionOrgName` | 联系人组织名称 | `link_persion_org_name` | String | `text` |  | ✓ |
| 48 | `modifier` | 修改人名称 | `modifier` | String | `text` |  | ✓ |
| 49 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | ✓ |
| 50 | `modifyDate` | 修改日期 | `modify_date` | Date | `date` |  | ✓ |
| 51 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `timestamp` |  | ✓ |
| 52 | `natureFunds` | 资金性质 | `nature_funds` | String | `text` |  | ✓ |
| 53 | `natureFundsId` | 资金性质ID | `nature_funds_id` | String | `text` |  | ✓ |
| 54 | `privateCode` | 项目内部编号 | `private_code` | String | `text` |  | ✓ |
| 55 | `projectDocId` | 项目档案ID | `project_doc_id` | Long | `long` |  | ✓ |
| 56 | `entrustSourceProjectId` | 来源受理外键 | `entrust_source_project_id` | Long | `long` |  | ✓ |
| 57 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | ✓ |
| 58 | `purGroupType` | 采购小组设置方式 | `pur_group_type` | String | `text` |  | ✓ |
| 59 | `purModeId` | 采购模式ID | `pur_mode_id` | 92b613a5-0e7c-4f87-8a9b-7fccc9ba556a | `quote` |  | ✓ |
| 60 | `purchaserAddress` | 采购人地址 | `purchaser_address` | String | `text` |  | ✓ |
| 61 | `purchaserCode` | 采购联系人姓名 | `purchaser_code` | String | `text` |  | ✓ |
| 62 | `purchaserDept` | 采购人所在部门 | `purchaser_dept` | String | `text` |  | ✓ |
| 63 | `purchaserMail` | 采购人邮箱 | `purchaser_mail` | String | `text` |  | ✓ |
| 64 | `purchaserTell` | 采购联系人电话 | `purchaser_tell` | String | `text` |  | ✓ |
| 65 | `showTenderSummary` | 招标小结 | `show_tendersummary` | Short | `short` |  | ✓ |
| 66 | `purchaserUnitAddress` | 采购联系人单位地址 | `purchaser_unit_address` | String | `text` |  | ✓ |
| 67 | `rejectOpinion` | 驳回意见 | `reject_opinion` | String | `text` |  | ✓ |
| 68 | `repulseReason` | 退回原因 | `repulse_reason` | String | `text` |  | ✓ |
| 69 | `sectionMold` | 标段类型 | `section_mold` | String | `text` |  | ✓ |
| 70 | `sectionType` | 标段划分方式 | `section_type` | String | `text` |  | ✓ |
| 71 | `sourceId` | 源头id | `source_id` | Long | `long` |  | ✓ |
| 72 | `sourcesFunds` | 资金来源 | `sources_funds` | String | `text` |  | ✓ |
| 73 | `sourcesFundsId` | 资金来源id | `sources_funds_id` | 92b613a5-0e7c-4f87-8a9b-7fccc9ba556a | `quote` |  | ✓ |
| 74 | `userId` | 制单人userid | `user_id` | String | `text` |  | ✓ |
| 75 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | ✓ | ✓ |
| 76 | `id` | 主键 | `id` | Long | `long` |  | ✓ |
| 77 | `isWfControlled` | 是否审批流控制 | `isWfControlled` | Boolean | `switch` |  | ✓ |
| 78 | `verifystate` | 审批状态 | `verifystate` | Short | `short` |  | ✓ |
| 79 | `returncount` | 退回次数 | `returncount` | Short | `short` |  | ✓ |
| 80 | `isNewFlow` | 是否为新审批 | `is_new_flow` | Integer | `int` |  | ✓ |
| 81 | `oldBillNum` | 原始单据号 | `old_bill_num` | String | `text` |  | ✓ |
| 82 | `flowSource` | 审批源 | `flow_source` | String | `text` |  | ✓ |
| 83 | `code` | 采购项目编号 | `bid_project_code` | String | `text` |  | ✓ |
| 84 | `agencyOrgName` | 招标代理机构 | `agency_org_name` | String | `text` |  | ✓ |
| 85 | `agencyOrgId` | 招标代理机构 | `agency_org_id` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` |  | ✓ |
| 86 | `bidProjectName` | 采购项目名称 | `bid_project_name` | String | `text` |  | ✓ |
| 87 | `purOrgName` | 采购组织 | `pur_org_name` | String | `text` |  | ✓ |
| 88 | `purPsnName` | 采购员 | `pur_psn_name` | String | `text` |  | ✓ |
| 89 | `fromEntrust` | 是否来源任务委托 | `from_entrust` | Integer | `int` |  | ✓ |
| 90 | `linkPersonName` | 联系人 | `link_person_name` | String | `text` |  | ✓ |
| 91 | `entrustId` | 委托单id | `entrust_id` | 0dbcfc08-59dc-4d8e-8ad5-08af5e2055bf | `quote` |  | ✓ |
| 92 | `isEntrust` | 采购形式 | `is_entrust` | Short | `short` |  | ✓ |
| 93 | `linkPersonId` | 采购员 | `link_person_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 | `quote` |  | ✓ |
| 94 | `linkPersonTel` | 联系电话 | `link_person_tel` | String | `text` |  | ✓ |
| 95 | `agencyOrgPsnId` | 代理机构接收人 | `agency_org_psn_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 | `quote` |  | ✓ |
| 96 | `agencyOrgPsnUserId` | 联系人用户ID | `agency_org_psn_user_id` | String | `text` |  | ✓ |
| 97 | `agencyOrgPersonTel` | 联系电话 | `agency_org_person_tel` | String | `text` |  | ✓ |
| 98 | `bidBudgetMnyYuan` | 采购预算(元) | `bid_budget_mny_yuan` | Decimal | `number` |  | ✓ |
| 99 | `linkPersionMail` | 电子邮箱 | `link_persion_mail` | String | `text` |  | ✓ |
| 100 | `agencyOrgPersionMail` | 电子邮箱 | `agency_org_persion_mail` | String | `text` |  | ✓ |
| 101 | `purModeName` | 资金来源 | `pur_mode_name` | String | `text` |  | ✓ |
| 102 | `linkDepartmentId` | 所属部门 | `link_department_id` | a4352e3c-3eda-4539-a7a9-ec00799be118 | `quote` |  | ✓ |
| 103 | `linkDepartmentName` | 所属部门 | `link_department_name` | String | `text` |  | ✓ |
| 104 | `projectStartTime` | 预计开始日期 | `project_start_time` | DateTime | `timestamp` |  | ✓ |
| 105 | `projectEndTime` | 预计结束日期 | `project_end_time` | DateTime | `timestamp` |  | ✓ |
| 106 | `isBySection` | 标段(包)划分 | `is_by_section` | Short | `short` |  | ✓ |
| 107 | `version` | 版本 | `version` | String | `text` |  | ✓ |
| 108 | `uapProjectdocId` | 项目名称id | `uap_projectdoc_Id` | b1e7cbf6-094a-4200-b451-36bfa3ac3ff4 | `quote` |  | ✓ |
| 109 | `transTypeId` | 交易类型id | `trans_type_id` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 | `quote` |  | ✓ |
| 110 | `memo` | 备注 | `memo` | String | `text` |  | ✓ |
| 111 | `billstate` | 单据状态 | `billstate` | String | `text` |  | ✓ |
| 112 | `fileId` | 附件 | `file_id` | String | `text` |  | ✓ |
| 113 | `purOrgId` | 采购组织ID | `pur_org_id` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` |  | ✓ |
| 114 | `purPsnId` | 采购员ID | `pur_psn_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 | `quote` |  | ✓ |
| 115 | `isFromAcceptance` | 是否为来源受理 | `is_from_acceptance` | Integer | `int` |  | ✓ |
| 116 | `define` | 采购方案自由自定义项 | `` | 75d4c13d-723b-4a76-814b-f88cb3b68d7b | `` |  |  |
| 117 | `lawbidSectionList` | 新标段 | `` | f5606e38-57cf-4a3c-bd43-50a817decf9e | `` |  |  |
| 118 | `projectGroupList` | 采购小组 | `` | cbb6f73e-f0e1-4cf3-84c4-0da4c4f1ac57 | `` |  |  |
| 119 | `projectReqList` | 采购需求 | `` | eaa675ed-6ca4-4862-9a10-5df7fa557f36 | `` |  |  |
| 120 | `projectSectionList` | 招标项目标段信息 | `` | ecfe849d-8880-4a81-ac60-5318b0a7915b | `` |  |  |

---

## 关联属性（共 32 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `purOrgId` | 采购组织ID | `org.func.BaseOrg` | `pur_org_id` |  →  |  |  | Service |  |
| 2 | `billTemplateId` | 单据模板主键 | `tpl.templateinst.TplBillTemplateInst` | `bill_template_id` |  →  |  |  | Service |  |
| 3 | `projectReqList` | 采购需求 | `lawbid.project.LawbidProjectReq` | `` | projectReqList → bidProjectId | 0..n | true | None |  |
| 4 | `linkPersonId` | 采购员 | `bd.staff.Staff` | `link_person_id` |  →  |  |  | Service |  |
| 5 | `creatorId` | 创建人 | `base.user.User` | `creatorId` |  →  |  |  | Service |  |
| 6 | `modifierId` | 修改人 | `base.user.User` | `modifierId` |  →  |  |  | Service |  |
| 7 | `entrustId` | 委托单id | `sourcing.entrust.CpuReqEntrust` | `entrust_id` |  →  |  |  | Service |  |
| 8 | `linkDepartmentId` | 所属部门 | `bd.adminOrg.AdminOrgVO` | `link_department_id` |  →  |  |  | Service |  |
| 9 | `templateId` | 主模板主键 | `tpl.templateorginst.TplTemplateInst` | `template_id` |  →  |  |  | Service |  |
| 10 | `uapProjectdocId` | 项目名称id | `bd.project.ProjectVO` | `uap_projectdoc_Id` |  →  |  |  | Service |  |
| 11 | `processorId` | 处理人ID | `bd.staff.Staff` | `processor_id` |  →  |  |  | Service |  |
| 12 | `lawbidSectionList` | 新标段 | `lawbid.project.LawbidSectionNew` | `` | lawbidSectionList → bidProjectId | 0..n | true | None |  |
| 13 | `agencyEnterpriseId` | 招标代理机构租户ID | `cpu-privilege.enterprise.EnterprisePOJO` | `agency_enterprise_id` |  →  |  |  | Service |  |
| 14 | `transTypeId` | 交易类型id | `bd.bill.TransType` | `trans_type_id` |  →  |  |  | Service |  |
| 15 | `define` | 采购方案自由自定义项 | `lawbid.project.LawbidProjectFreedefine` | `` | define → id | 1 | true | None | ⚠️ |
| 16 | `agencyOrgPsnId` | 代理机构接收人 | `bd.staff.Staff` | `agency_org_psn_id` |  →  |  |  | Service |  |
| 17 | `strategyId` | 管控策略id | `sourcing.businessRuleSolution.BusinessRuleControlStrategy` | `strategy_id` |  →  |  |  | Service |  |
| 18 | `acceptDepartmentId` | 受理人部门ID | `bd.adminOrg.AdminOrgVO` | `accept_department_id` |  →  |  |  | Service |  |
| 19 | `purModeId` | 采购模式ID | `bctask.basedoc.CustomerDocVO` | `pur_mode_id` |  →  |  |  | Service |  |
| 20 | `purPsnId` | 采购员ID | `bd.staff.Staff` | `pur_psn_id` |  →  |  |  | Service |  |
| 21 | `currencyId` | 币种 | `bd.currencytenant.CurrencyTenantVO` | `currency_id` |  →  |  |  | Service |  |
| 22 | `agencyOrgId` | 招标代理机构 | `org.func.BaseOrg` | `agency_org_id` |  →  |  |  | Service |  |
| 23 | `sourcingSolutionId` | 寻源方案主键 | `sourcing.businessRuleSolution.BusinessRuleSolution` | `sourcing_solution_id` |  →  |  |  | Service |  |
| 24 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | `ytenant_id` |  →  |  |  | Service |  |
| 25 | `sourcesFundsId` | 资金来源id | `bctask.basedoc.CustomerDocVO` | `sources_funds_id` |  →  |  |  | Service |  |
| 26 | `projectGroupList` | 采购小组 | `lawbid.project.LawbidProjectGroup` | `` | projectGroupList → bidProjectId | 0..n | true | None |  |
| 27 | `projectSectionList` | 招标项目标段信息 | `lawbid.project.LawbidProjectSection` | `` | projectSectionList → bidProjectId | 1..n | true | None |  |
| 28 | `auditorId` | 审批人 | `base.user.User` | `auditorId` |  →  |  |  | Service |  |
| 29 | `lawbidProjectDefineCharacter` | 表头自定义项特征属性 | `lawbid.project.LawbidProjectDefineCharacter` | `define_character_id` |  →  |  |  | None |  |
| 30 | `enterpriseId` | 所属租户id | `cpu-privilege.enterprise.EnterprisePOJO` | `enterprise_id` |  →  |  |  | Service |  |
| 31 | `linkPersionOrgId` | 联系人组织ID | `org.func.BaseOrg` | `link_persion_org_id` |  →  |  |  | Service |  |
| 32 | `agencyOrgRoleId` | 角色 | `sys.auth.Role` | `agency_org_role_id` |  →  |  |  | Service |  |

### Composition（子表）

- **projectReqList**: `projectReqList` → `lawbid.project.LawbidProjectReq` | 0..n
- **lawbidSectionList**: `lawbidSectionList` → `lawbid.project.LawbidSectionNew` | 0..n
- **define**: `define` → `lawbid.project.LawbidProjectFreedefine` | 1 ⚠️ 已废弃
- **projectGroupList**: `projectGroupList` → `lawbid.project.LawbidProjectGroup` | 0..n
- **projectSectionList**: `projectSectionList` → `lawbid.project.LawbidProjectSection` | 1..n

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `purOrgId` (采购组织ID) | `org.func.BaseOrg` | `pur_org_id` |
| `billTemplateId` (单据模板主键) | `tpl.templateinst.TplBillTemplateInst` | `bill_template_id` |
| `linkPersonId` (采购员) | `bd.staff.Staff` | `link_person_id` |
| `creatorId` (创建人) | `base.user.User` | `creatorId` |
| `modifierId` (修改人) | `base.user.User` | `modifierId` |
| `entrustId` (委托单id) | `sourcing.entrust.CpuReqEntrust` | `entrust_id` |
| `linkDepartmentId` (所属部门) | `bd.adminOrg.AdminOrgVO` | `link_department_id` |
| `templateId` (主模板主键) | `tpl.templateorginst.TplTemplateInst` | `template_id` |
| `uapProjectdocId` (项目名称id) | `bd.project.ProjectVO` | `uap_projectdoc_Id` |
| `processorId` (处理人ID) | `bd.staff.Staff` | `processor_id` |
| `agencyEnterpriseId` (招标代理机构租户ID) | `cpu-privilege.enterprise.EnterprisePOJO` | `agency_enterprise_id` |
| `transTypeId` (交易类型id) | `bd.bill.TransType` | `trans_type_id` |
| `agencyOrgPsnId` (代理机构接收人) | `bd.staff.Staff` | `agency_org_psn_id` |
| `strategyId` (管控策略id) | `sourcing.businessRuleSolution.BusinessRuleControlStrategy` | `strategy_id` |
| `acceptDepartmentId` (受理人部门ID) | `bd.adminOrg.AdminOrgVO` | `accept_department_id` |
| `purModeId` (采购模式ID) | `bctask.basedoc.CustomerDocVO` | `pur_mode_id` |
| `purPsnId` (采购员ID) | `bd.staff.Staff` | `pur_psn_id` |
| `currencyId` (币种) | `bd.currencytenant.CurrencyTenantVO` | `currency_id` |
| `agencyOrgId` (招标代理机构) | `org.func.BaseOrg` | `agency_org_id` |
| `sourcingSolutionId` (寻源方案主键) | `sourcing.businessRuleSolution.BusinessRuleSolution` | `sourcing_solution_id` |
| `ytenant` (租户id) | `yht.tenant.YhtTenant` | `ytenant_id` |
| `sourcesFundsId` (资金来源id) | `bctask.basedoc.CustomerDocVO` | `sources_funds_id` |
| `auditorId` (审批人) | `base.user.User` | `auditorId` |
| `enterpriseId` (所属租户id) | `cpu-privilege.enterprise.EnterprisePOJO` | `enterprise_id` |
| `linkPersionOrgId` (联系人组织ID) | `org.func.BaseOrg` | `link_persion_org_id` |
| `agencyOrgRoleId` (角色) | `sys.auth.Role` | `agency_org_role_id` |
