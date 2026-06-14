---
tags: ["BIP", "元数据", "数据字典", "IMP_PES", "pes.questionary.QuestionaryVO"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 问题单 (`pes.questionary.QuestionaryVO`)

> IMP_PES | 物理表：`sms_questionarys`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 问题单 |
| 物理表 | `sms_questionarys` |
| domain/服务域 | `imppes` |
| 所属应用 | `IMP_PES` |
| 构建时间 | `2026-06-05 17:17:57.2060` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | id |
| 编码 | `code` | String | 编码 |

---

## 直接属性（79个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `orgId` | 组织id | `org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 2 | `transTypeId` | 交易类型id | `trans_type_id` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 |
| 3 | `code` | 编码 | `code` | String |
| 4 | `questionSource` | 问题来源 | `question_source` | String |
| 5 | `questionProp` | 问题属性 | `question_prop` | String |
| 6 | `projectId` | 服务项目id | `project_id` | b1e7cbf6-094a-4200-b451-36bfa3ac3ff4 |
| 7 | `questionType` | 问题分类id | `question_type` | e47c578a-b780-4988-aa12-97132d21f153 |
| 8 | `questionLevel` | 问题级别 | `question_level` | String |
| 9 | `happenTime` | 发生时间 | `happen_time` | DateTime |
| 10 | `createdAt` | 提单时间 | `created_at` | String |
| 11 | `title` | 问题标题 | `title` | String |
| 12 | `description` | 问题描述 | `description` | String |
| 13 | `status` | 状态 | `status` | String |
| 14 | `voucherStatus` | 单据状态 | `voucher_status` | Short |
| 15 | `isCanceled` | 作废 | `is_canceled` | String |
| 16 | `equipmentId` | 设备ID | `equipment_id` | e9f23971-1c19-49e1-83d7-3a84ebcb187e |
| 17 | `productId` | 产品id | `product_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 18 | `regionId` | 所属区域id | `region_id` | 95577e23-979f-4f09-a629-61fea93e576d |
| 19 | `address` | 详细地址 | `address` | String |
| 20 | `contractId` | 服务合同 | `contract_id` | eafb7e7b-746e-4b48-8773-e48df89613f1 |
| 21 | `customId` | 客户id | `custom_id` | 94b3280a-27a4-485a-b90b-b7bce57c6df2 |
| 22 | `custContactId` | 客户联系人Id | `cust_contact_id` | fe608271-1042-435f-ba79-113c7a41e420 |
| 23 | `ymsencCustContactPhone` | 联系电话 | `ymsenc_cust_contact_phone` | String |
| 24 | `serviceTeamId` | 服务团队Id | `service_team_id` | 7b7859d5-26ea-433e-8fee-007cb85c64d7 |
| 25 | `acceptOrg` | 受理组织id | `accept_org` | 14302233-1394-4a70-94e1-bed51636f312 |
| 26 | `acceptPerson` | 受理人id | `accept_person` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 27 | `locationOrg` | 定位组织id | `location_org` | 14302233-1394-4a70-94e1-bed51636f312 |
| 28 | `locationPerson` | 定位人id | `location_person` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 29 | `solveOrg` | 解决组织id | `solve_org` | 14302233-1394-4a70-94e1-bed51636f312 |
| 30 | `solvePerson` | 解决人id | `solve_Person` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 31 | `closeOrg` | 关闭组织id | `close_org` | 14302233-1394-4a70-94e1-bed51636f312 |
| 32 | `closePerson` | 关闭人id | `close_person` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 33 | `processType` | 处理方式 | `process_type` | String |
| 34 | `purposeDoc` | 目的单号 | `purpose_doc` | String |
| 35 | `suggestSolution` | 建议方案 | `suggest_Solution` | String |
| 36 | `solveSolution` | 解决方案 | `solve_solution` | String |
| 37 | `partsDealType` | 配件处理方式 | `parts_deal_type` | String |
| 38 | `returnVisitType` | 回访方式 | `return_visit_type` | String |
| 39 | `returnVisitResult` | 回访结果 | `return_visit_result` | String |
| 40 | `customerComment` | 客户意见 | `customer_comment` | String |
| 41 | `rejectReason` | 驳回原因 | `reject_reason` | String |
| 42 | `isAuthenticated` | 已鉴权 | `is_authenticated` | String |
| 43 | `authenticateResult` | 鉴权结果 | `authenticate_result` | String |
| 44 | `isDispatch` | 派单标识 | `is_dispatch` | String |
| 45 | `processProgress` | 处理进程 | `process_progress` | String |
| 46 | `questionaryDefineCharacter` | 自定义项特征 | `questionary_define_character` | 6b0e876e-ed3d-45d6-9319-c00b0f03bf9b |
| 47 | `name` | 名称 | `name` | String |
| 48 | `snum` | 序列号 | `snum` | String |
| 49 | `spec` | 规格 | `spec` | String |
| 50 | `custContactPhone` | 联系电话 | `cust_contact_phone` | String |
| 51 | `custContactEmail` | 邮箱 | `cust_contact_email` | String |
| 52 | `attachmentId` | 附件管理id | `attachmentId` | String |
| 53 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 54 | `creator` | 创建人名称 | `creator` | String |
| 55 | `createUser` | 创建者 | `create_user` | String |
| 56 | `createTime` | 创建时间 | `create_time` | DateTime |
| 57 | `createDate` | 创建日期 | `create_date` | Date |
| 58 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 59 | `modifier` | 修改人名称 | `modifier` | String |
| 60 | `lastModifyUser` | 最近修改者 | `last_modify_user` | String |
| 61 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 62 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 63 | `lastModified` | 最近修改时间 | `last_modified` | String |
| 64 | `id` | id | `id` | Long |
| 65 | `isWfControlled` | 是否审批流控制 | `isWfControlled` | Boolean |
| 66 | `verifystate` | 审批状态 | `verifystate` | Short |
| 67 | `returncount` | 退回次数 | `returncount` | Short |
| 68 | `auditorId` | 审批人 | `auditorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 69 | `auditor` | 审批人名称 | `auditor` | String |
| 70 | `auditTime` | 审批时间 | `audit_time` | DateTime |
| 71 | `auditDate` | 审批日期 | `audit_date` | Date |
| 72 | `dr` | 逻辑删除 | `dr` | Integer |
| 73 | `tenant` | 租户ID | `tenant_id` | String |
| 74 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 75 | `pubts` | 时间戳 | `pubts` | DateTime |
| 76 | `ts` | 版本号 | `ts` | String |
| 77 | `questionaryLogsList` | 问题单处理记录 | `` | 947f6004-fdde-474a-b55a-713518c33061 |
| 78 | `questionaryRecordList` | 问题单服务记录 | `` | 3c6e766b-70f5-43d6-ae57-a25cf7d7e45c |
| 79 | `questionaryRelatedList` | 关联问题单 | `` | 07faeda4-6cdc-4c0c-9297-963237953c83 |

---

## 关联属性（27个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `locationOrg` | 定位组织id | `org.func.BaseOrg` | Service |  |
| 2 | `locationPerson` | 定位人id | `bd.staff.Staff` | Service |  |
| 3 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 4 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 5 | `customId` | 客户id | `aa.merchant.Merchant` | Service |  |
| 6 | `equipmentId` | 设备ID | `aim.equip.EquipHeadVO` | Service |  |
| 7 | `questionaryDefineCharacter` | 自定义项特征 | `pes.questionary.QuestionDefineCharacter` | None |  |
| 8 | `orgId` | 组织id | `org.func.BaseOrg` | Service |  |
| 9 | `solveOrg` | 解决组织id | `org.func.BaseOrg` | Service |  |
| 10 | `custContactId` | 客户联系人Id | `pes.cms.Contact` | None |  |
| 11 | `transTypeId` | 交易类型id | `bd.bill.TransType` | Service |  |
| 12 | `questionaryLogsList` | 问题单处理记录 | `pes.questionary.QuestionaryLogVO` | None | true |
| 13 | `serviceTeamId` | 服务团队Id | `pes.serviceTeam.serviceTeam` | None |  |
| 14 | `questionaryRecordList` | 问题单服务记录 | `pes.questionary.QuestionaryRecordVO` | None | true |
| 15 | `productId` | 产品id | `pc.product.Product` | Service |  |
| 16 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 17 | `closeOrg` | 关闭组织id | `org.func.BaseOrg` | Service |  |
| 18 | `solvePerson` | 解决人id | `bd.staff.Staff` | Service |  |
| 19 | `questionaryRelatedList` | 关联问题单 | `pes.questionary.QuestionaryRelatedVO` | None | true |
| 20 | `closePerson` | 关闭人id | `bd.staff.Staff` | Service |  |
| 21 | `auditorId` | 审批人 | `base.user.User` | Service |  |
| 22 | `regionId` | 所属区域id | `bd.region.BaseRegionVO` | Service |  |
| 23 | `contractId` | 服务合同 | `pes.smsContracts.SmsContracts` | None |  |
| 24 | `acceptOrg` | 受理组织id | `org.func.BaseOrg` | Service |  |
| 25 | `acceptPerson` | 受理人id | `bd.staff.Staff` | Service |  |
| 26 | `projectId` | 服务项目id | `bd.project.ProjectVO` | Service |  |
| 27 | `questionType` | 问题分类id | `pes.kmsCategoryTree.KmsCategoryTreeVO` | None |  |
