---
tags: ["BIP", "元数据", "数据字典", "ycSouringAuction", "auction.entrustacceptance.AuctionProjectEntrust"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 竞拍项目受理 (`auction.entrustacceptance.AuctionProjectEntrust`)

> ycSouringAuction | 物理表：`cpu_project_apt`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 竞拍项目受理 |
| 物理表 | `cpu_project_apt` |
| domain/服务域 | `yonbip-cpu-lawbid` |
| schema | `cpu_lawbid` |
| 所属应用 | `ycSouringAuction` |
| 构建时间 | `2026-06-04 23:24:36.4290` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | 主键 |

---

## 直接属性（106个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `id` | 主键 | `id` | Long |
| 2 | `isWfControlled` | 是否审批流控制 | `isWfControlled` | Boolean |
| 3 | `verifystate` | 审批状态 | `verifystate` | Short |
| 4 | `returncount` | 退回次数 | `returncount` | Short |
| 5 | `isNewFlow` | 是否为新审批 | `is_new_flow` | Integer |
| 6 | `oldBillNum` | 原始单据号 | `old_bill_num` | String |
| 7 | `flowSource` | 审批源 | `flow_source` | String |
| 8 | `code` | 竞拍委托项目编号 | `bid_project_code` | String |
| 9 | `agencyOrgName` | 招标代理机构 | `agency_org_name` | String |
| 10 | `agencyOrgId` | 招标代理机构 | `agency_org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 11 | `bidProjectName` | 竞拍委托项目名称 | `bid_project_name` | String |
| 12 | `purOrgName` | 采购组织 | `pur_org_name` | String |
| 13 | `purPsnName` | 采购员 | `pur_psn_name` | String |
| 14 | `contactType` | 联系人类型 | `contact_type` | String |
| 15 | `agencyOrgRoleId` | 角色 | `agency_org_role_id` | 6c660d78-70a8-438e-9925-f1c342df3a12 |
| 16 | `linkPersonName` | 联系人 | `link_person_name` | String |
| 17 | `isEntrust` | 采购形式 | `is_entrust` | Short |
| 18 | `linkPersonId` | 联系人 | `link_person_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 19 | `linkPersonTel` | 联系电话 | `link_person_tel` | String |
| 20 | `agencyOrgPsnId` | 联系人 | `agency_org_psn_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 21 | `agencyOrgPsnUserId` | 联系人用户ID | `agency_org_psn_user_id` | String |
| 22 | `agencyOrgPersonTel` | 联系电话 | `agency_org_person_tel` | String |
| 23 | `bidBudgetMnyYuan` | 采购预算 | `bid_budget_mny_yuan` | Decimal |
| 24 | `linkPersionMail` | 电子邮箱 | `link_persion_mail` | String |
| 25 | `agencyOrgPersionMail` | 电子邮箱 | `agency_org_persion_mail` | String |
| 26 | `sourcesFundsId` | 资金来源id | `sources_funds_id` | 92b613a5-0e7c-4f87-8a9b-7fccc9ba556a |
| 27 | `linkDepartmentId` | 所属部门 | `link_department_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 28 | `linkDepartmentName` | 所属部门 | `link_department_name` | String |
| 29 | `projectStartTime` | 预计开始日期 | `project_start_time` | DateTime |
| 30 | `projectEndTime` | 预计结束日期 | `project_end_time` | DateTime |
| 31 | `isBySection` | 标段(包)划分 | `is_by_section` | Short |
| 32 | `version` | 版本 | `version` | String |
| 33 | `uapProjectdocId` | 项目名称id | `uap_projectdoc_Id` | b1e7cbf6-094a-4200-b451-36bfa3ac3ff4 |
| 34 | `showTenderSummary` | 竞拍小结 | `show_tendersummary` | Short |
| 35 | `transTypeId` | 交易类型id | `trans_type_id` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 |
| 36 | `memo` | 备注 | `memo` | String |
| 37 | `fileId` | 附件 | `file_id` | String |
| 38 | `billstate` | 单据状态 | `billstate` | String |
| 39 | `AuctionProjectEntrustDefineCharacter` | 竞拍项目受理自定义项 | `define_character_id` | 20c0cad7-8c95-4b64-bfca-c8f938194074 |
| 40 | `purOrgId` | 采购组织ID | `pur_org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 41 | `acceptPersonId` | 受理人ID | `accept_person_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 42 | `sourceId` | 源头id | `source_id` | 070c3520-bf5d-4b3e-a523-59e73d9f6349 |
| 43 | `purPsnId` | 采购员ID | `pur_psn_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 44 | `isFromAcceptance` | 是否为来源受理 | `is_from_acceptance` | Integer |
| 45 | `acceptDepartmentId` | 受理人部门ID | `accept_department_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 46 | `acceptDepartmentName` | 受理人部门名称 | `accept_department_name` | String |
| 47 | `acceptPersonName` | 受理人名字 | `accept_person_name` | String |
| 48 | `acceptTime` | 委托受理时间 | `accept_time` | DateTime |
| 49 | `agencyEnterpriseId` | 招标代理机构租户ID | `agency_enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 50 | `agencyEnterpriseName` | 招标代理机构租户名称 | `agency_enterprise_name` | String |
| 51 | `agencyOfficialCode` | 招标代理机构组织编码 | `agency_official_code` | String |
| 52 | `approveRecord` | 是否有审批记录 | `approve_record` | Short |
| 53 | `bidBillType` | 招标单据类型 | `bid_bill_type` | String |
| 54 | `bidBudgetMny` | 采购预算 | `bid_budget_mny` | Decimal |
| 55 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 56 | `createDate` | 创建日期 | `create_date` | Date |
| 57 | `createTime` | 创建时间 | `create_time` | DateTime |
| 58 | `creator` | 创建人名称 | `creator` | String |
| 59 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 60 | `currencyId` | 币种 | `currency_id` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e |
| 61 | `define` | 竞拍项目受理自由自定义项 | `` | 2c2fe68a-3e64-4e4f-a47c-914101b3211a |
| 62 | `dr` | 逻辑删除标记 | `dr` | Short |
| 63 | `enterpriseId` | 所属租户id | `enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 64 | `enterpriseName` | 租户名称 | `enterprise_name` | String |
| 65 | `entrustRefuseReason` | 委托退回原因 | `entrust_refuse_reason` | String |
| 66 | `entrustTime` | 委托时间 | `entrust_time` | DateTime |
| 67 | `fatherId` | 来源id | `father_id` | Long |
| 68 | `fundSource` | 资金来源 | `fund_source` | String |
| 69 | `hopeFinishTime` | 期望完成时间 | `hope_finish_time` | DateTime |
| 70 | `isCanEditSection` | 是否允许修改标段 | `is_can_edit_section` | Short |
| 71 | `lawbidSystemId` | 原始ID | `lawbid_system_id` | Long |
| 72 | `lawbidSystemType` | 原始表 | `lawbid_system_type` | String |
| 73 | `linkPersionOrgCode` | 联系人组织code | `link_persion_org_code` | String |
| 74 | `linkPersionOrgId` | 联系人组织id | `link_persion_org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 75 | `linkPersionOrgName` | 联系人组织名称 | `link_persion_org_name` | String |
| 76 | `modifier` | 修改人名称 | `modifier` | String |
| 77 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 78 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 79 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 80 | `natureFunds` | 资金性质 | `nature_funds` | String |
| 81 | `natureFundsId` | 资金性质id | `nature_funds_id` | String |
| 82 | `privateCode` | 项目内部编号 | `private_code` | String |
| 83 | `projectDocId` | 项目档案ID | `project_doc_id` | Long |
| 84 | `projectGroupList` | 竞拍项目受理小组 | `` | d43ab333-0822-41b1-a2f8-ef0a249cd97f |
| 85 | `projectReqList` | 竞拍项目受理采购需求 | `` | 5772802b-44bb-44ac-9cff-efd4de751299 |
| 86 | `projectSectionList` | 竞拍项目受理标段信息 | `` | 15243ad8-6c8b-4b6b-971b-88aaa0506f6c |
| 87 | `pubts` | 时间戳 | `pubts` | DateTime |
| 88 | `purGroupType` | 采购小组设置方式 | `pur_group_type` | String |
| 89 | `purModeId` | 采购模式id | `pur_mode_id` | 92b613a5-0e7c-4f87-8a9b-7fccc9ba556a |
| 90 | `purModeName` | 采购模式 | `pur_mode_name` | String |
| 91 | `purchaserAddress` | 采购人地址 | `purchaser_address` | String |
| 92 | `purchaserCode` | 采购联系人姓名 | `purchaser_code` | String |
| 93 | `purchaserDept` | 采购人所在部门 | `purchaser_dept` | String |
| 94 | `purchaserMail` | 采购人邮箱 | `purchaser_mail` | String |
| 95 | `purchaserTell` | 采购联系人电话 | `purchaser_tell` | String |
| 96 | `purchaserUnitAddress` | 采购联系人单位地址 | `purchaser_unit_address` | String |
| 97 | `rejectOpinion` | 驳回意见 | `reject_opinion` | String |
| 98 | `repulseReason` | 退回原因 | `repulse_reason` | String |
| 99 | `returnMsgUserId` | 委托退回消息人 | `return_msg_user_id` | String |
| 100 | `sectionMold` | 标段类型 | `section_mold` | String |
| 101 | `sectionType` | 标段划分方式 | `section_type` | String |
| 102 | `sourcesFunds` | 资金来源 | `sources_funds` | String |
| 103 | `tenantId` | tenant租户 | `tenant_id` | String |
| 104 | `transTypeName` | 交易类型名称 | `trans_type_name` | String |
| 105 | `userId` | 制单人userid | `user_id` | String |
| 106 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（26个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `sourceId` | 源头id | `lawbid.project.LawbidProject` | None |  |
| 2 | `purOrgId` | 采购组织ID | `org.func.BaseOrg` | Service |  |
| 3 | `AuctionProjectEntrustDefineCharacter` | 竞拍项目受理自定义项 | `auction.entrustacceptance.AuctionProjectEntrustDefineCharacter` | None |  |
| 4 | `projectReqList` | 竞拍项目受理采购需求 | `auction.entrustacceptance.AuctionProjectEntrustReq` | None | true |
| 5 | `linkPersonId` | 联系人 | `bd.staff.Staff` | Service |  |
| 6 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 7 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 8 | `linkDepartmentId` | 所属部门 | `org.func.BaseOrg` | Service |  |
| 9 | `uapProjectdocId` | 项目名称id | `bd.project.ProjectVO` | Service |  |
| 10 | `agencyEnterpriseId` | 招标代理机构租户ID | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 11 | `transTypeId` | 交易类型id | `bd.bill.TransType` | Service |  |
| 12 | `define` | 竞拍项目受理自由自定义项 | `auction.entrustacceptance.AuctionProjectEntrustFreedefine` | None | true |
| 13 | `agencyOrgPsnId` | 联系人 | `bd.staff.Staff` | Service |  |
| 14 | `acceptDepartmentId` | 受理人部门ID | `org.func.BaseOrg` | Service |  |
| 15 | `purModeId` | 采购模式id | `bctask.basedoc.CustomerDocVO` | Service |  |
| 16 | `purPsnId` | 采购员ID | `bd.staff.Staff` | Service |  |
| 17 | `currencyId` | 币种 | `bd.currencytenant.CurrencyTenantVO` | Service |  |
| 18 | `agencyOrgId` | 招标代理机构 | `org.func.BaseOrg` | Service |  |
| 19 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 20 | `sourcesFundsId` | 资金来源id | `bctask.basedoc.CustomerDocVO` | Service |  |
| 21 | `projectGroupList` | 竞拍项目受理小组 | `auction.entrustacceptance.AuctionProjectEntrustGroup` | None | true |
| 22 | `projectSectionList` | 竞拍项目受理标段信息 | `auction.entrustacceptance.AuctionProjectEntrustSection` | None | true |
| 23 | `acceptPersonId` | 受理人ID | `bd.staff.Staff` | Service |  |
| 24 | `enterpriseId` | 所属租户id | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 25 | `linkPersionOrgId` | 联系人组织id | `org.func.BaseOrg` | Service |  |
| 26 | `agencyOrgRoleId` | 角色 | `sys.auth.Role` | Service |  |
