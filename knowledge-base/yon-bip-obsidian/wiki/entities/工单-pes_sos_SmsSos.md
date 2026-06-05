---
tags: ["BIP", "元数据", "数据字典", "IMP_PES", "pes.sos.SmsSos"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 工单 (`pes.sos.SmsSos`)

> IMP_PES | 物理表：`sms_sos`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 工单 |
| 物理表 | `sms_sos` |
| 数据库 schema | `imppes` |
| 所属应用 | `IMP_PES` |
| 构建时间 | `2026-06-05 17:19:41.2410` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | String | id |
| 编码 | `docno` | String | 工单号 |

---

## 直接属性（154个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `orgId` | 组织 | `org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 2 | `tosId` | 服务类型 | `tos_id` | 792f6d8f-bf3b-4090-ac4d-a7f2e9230758 |
| 3 | `transactionTypeId` | 交易类型 | `transaction_type_id` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 |
| 4 | `code` | 工单号 | `docno` | String |
| 5 | `createdAt` | 提单时间 | `created_at` | String |
| 6 | `sourceCategory` | 来源类别 | `source_category` | String |
| 7 | `questionaryId` | 来源问题单ID | `questionary_id` | eeb14336-53d4-43c2-8fec-54c61718e8aa |
| 8 | `sourceNumber` | 来源单号 | `source_number` | String |
| 9 | `bdProjectId` | 项目 | `bd_projectId` | b1e7cbf6-094a-4200-b451-36bfa3ac3ff4 |
| 10 | `wbs` | WBS | `wbs` | 145cc7d2-79cf-4f3a-934c-c03b46d0fd42 |
| 11 | `activity` | 活动 | `activity` | b4a90beb-49ed-4301-b12e-9221d0d12fd1 |
| 12 | `serviceLevelId` | 服务级别 | `service_level_id` | 34896e73-3827-4b0a-b2f3-585f858bec1a |
| 13 | `maintenanceLevelId` | 维保级别 | `maintenance_level_id` | f22f58a8-b92b-4775-a182-d1f402b7b1b3 |
| 14 | `isuseTaskPlan` | 使用安装计划 | `isuse_task_plan` | Short |
| 15 | `bizFlow` | 流程ID | `bizFlowId` | 58dd3dad-7eb7-47ea-a5b1-1f89d1709528 |
| 16 | `isFlowCoreBill` | 是否流程核心单据 | `isFlowCoreBill` | Boolean |
| 17 | `taskPlanId` | 安装计划 | `task_plan_id` | c20e1a0b-799a-419e-997d-d8c9c59a4b77 |
| 18 | `installWorkId` | 安装作业 | `install_work_id` | eb52c260-ba96-4244-9393-e7325b3f163a |
| 19 | `urgency` | 紧急程度 | `urgency` | String |
| 20 | `handleMethod` | 处理方式 | `handle_method` | String |
| 21 | `serviceContent` | 服务内容 | `service_content` | String |
| 22 | `voucherStatus` | 单据状态 | `voucher_status` | Short |
| 23 | `customId` | 客户 | `custom_id` | 94b3280a-27a4-485a-b90b-b7bce57c6df2 |
| 24 | `contactName` | 联系人 | `contact_name` | String |
| 25 | `ymsencContactPhone` | 联系电话 | `ymsenc_contact_phone` | String |
| 26 | `logisticsCompany` | 物流公司 | `logistics_company` | String |
| 27 | `logisticsNumber` | 物流单号 | `logistics_number` | String |
| 28 | `serviceOrgId` | 服务组织 | `service_org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 29 | `vendorId` | 服务商 | `vendor_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e |
| 30 | `posId` | 服务点 | `pos_id` | c685b8cd-eb64-47a1-b5a2-fcf3296b3c7d |
| 31 | `serviceTeamId` | 服务团队 | `serviceTeam_id` | 7b7859d5-26ea-433e-8fee-007cb85c64d7 |
| 32 | `seId` | 服务工程师 | `se_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 33 | `completedAt` | 实际完工时间 | `completed_at` | String |
| 34 | `completeStatus` | 完成状态 | `complete_status` | String |
| 35 | `checkResult` | 验收状态 | `check_result` | String |
| 36 | `workingHours` | 工时 | `working_hours` | Decimal |
| 37 | `priceService` | 应收服务费 | `price_service` | Decimal |
| 38 | `priceMaterial` | 应收材料费 | `price_material` | Decimal |
| 39 | `priceOther` | 其他费用 | `price_other` | Decimal |
| 40 | `priceSum` | 费用合计 | `price_sum` | Decimal |
| 41 | `memoComplete` | 完工说明 | `memo_complete` | String |
| 42 | `srcType` | 来源类型 | `src_type` | String |
| 43 | `serviceSource` | 服务来源 | `service_source` | bc55507b-7e08-4a2b-998a-dd9b3e953f8d |
| 44 | `status` | 工单状态 | `status` | String |
| 45 | `projectId` | 服务项目 | `project_id` | 80e2a9ee-50bc-440b-97c0-694cf5697ccc |
| 46 | `workflowAfterComplete` | 完工后启用工作流 | `workflow_after_complete` | Boolean |
| 47 | `smsSosDefineCharacter` | 自定义项特征 | `sos_define_character` | 9d9cd1ee-1f75-4499-979a-3e92ae9ef5c8 |
| 48 | `isMulEquipment` | 是否多设备 | `is_mul_equipment` | Boolean |
| 49 | `isSub` | 是否子单 | `is_sub` | Boolean |
| 50 | `assignStatus` | 分派状态 | `assign_status` | String |
| 51 | `isWfControlled` | 是否审批流控制 | `isWfControlled` | Boolean |
| 52 | `operateDesc` | 操作描述 | `operateDesc` | String |
| 53 | `isCancel` | 作废 | `is_cancel` | Boolean |
| 54 | `isBreak` | 是否异常 | `is_break` | Boolean |
| 55 | `breakReason` | 异常原因 | `break_reason` | String |
| 56 | `breakAt` | 异常关闭时间 | `break_at` | String |
| 57 | `applicationServiceAt` | 服务申请时间 | `application_service_at` | String |
| 58 | `appointServiceTime` | 预约服务时间 | `appoint_service_time` | String |
| 59 | `planSoId` | 计划工单Id | `plan_so_id` | fb011718-aab6-4d01-849c-15dcd313e46d |
| 60 | `isQuick` | 是否快捷工单 | `is_quick` | Boolean |
| 61 | `customFactory` | 客户工厂 | `custom_factory` | cfde0823-db21-43ef-94cd-0b511e013ba6 |
| 62 | `confirmAt` | 确认时间 | `confirm_at` | String |
| 63 | `customName` | 客户名称 | `custom_name` | String |
| 64 | `customCategoryId` | 客户分类 | `custom_category_id` | 3198ce2d-0e64-462d-bacf-54d18171756a |
| 65 | `contactPhone` | 联系电话 | `contact_phone` | String |
| 66 | `handlePersonId` | 经手人 | `handle_person_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 67 | `handlePersonName` | 经手人名称 | `handle_person_name` | String |
| 68 | `ymsencHandlePersonPhone` | 经手人手机号 | `ymsenc_handle_person_phone` | String |
| 69 | `handlePersonPhone` | 经手人手机号 | `handle_person_phone` | String |
| 70 | `handleDeptId` | 经手部门 | `handle_dept_id` | 10ff81be-23e4-45e8-b173-240aff8ef9f3 |
| 71 | `itemTypeNum` | 配件种类数 | `item_type_num` | Short |
| 72 | `equipmentFailureNum` | 设备故障数 | `equipment_failure_num` | Short |
| 73 | `parentId` | 工单母单 | `parent_id` | String |
| 74 | `groupTaskKey` | 分组任务KEY | `groupTaskKey` | String |
| 75 | `isAutoDispatch` | 是否自动派工 | `is_auto_dispatch` | Boolean |
| 76 | `dispatchedAt` | 派工时间 | `dispatched_at` | String |
| 77 | `pushStatus` | 工单下推状态 | `push_status` | String |
| 78 | `dispatchReason` | 改派原因 | `dispatch_reason` | String |
| 79 | `receivedAt` | 接收时间 | `received_at` | String |
| 80 | `grabbingAt` | 抢单时间 | `grabbing_at` | String |
| 81 | `grabbingPersonId` | 抢单人 | `grabbing_person_id` | String |
| 82 | `scoringStatus` | 打分状态 | `scoring_status` | String |
| 83 | `scoreOrgId` | 评分组织 | `score_org` | 14302233-1394-4a70-94e1-bed51636f312 |
| 84 | `scoreAssessor` | 评分人 | `score_assessor` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 85 | `scoreAt` | 打分时间 | `score_at` | String |
| 86 | `scoreRatio` | 评分系数 | `score_ratio` | Decimal |
| 87 | `scoreMoney` | 绩效金额 | `score_money` | Decimal |
| 88 | `scoreMemo` | 打分说明 | `score_memo` | String |
| 89 | `scoreReturnCount` | 打分返回次数 | `score_return_count` | Decimal |
| 90 | `completionConfirmationAt` | 完工确认日期 | `completion_confirmation_at` | String |
| 91 | `completionConfirmationPerson` | 完工确认人 | `completion_confirmation_person` | String |
| 92 | `attachmentId` | 附件管理id | `attachmentId` | String |
| 93 | `docDate` | 工单时间 | `doc_date` | String |
| 94 | `equId` | 设备 | `equ_id` | e9f23971-1c19-49e1-83d7-3a84ebcb187e |
| 95 | `equipmentName` | 设备名称 | `equipment_name` | String |
| 96 | `specification` | 规格 | `specification` | String |
| 97 | `productId` | 产品 | `product_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 98 | `productCategoryId` | 产品分类 | `product_category_id` | String |
| 99 | `qaType` | 质保类型 | `qa_type` | String |
| 100 | `positionId` | 位置 | `position_id` | 95577e23-979f-4f09-a629-61fea93e576d |
| 101 | `country` | 国家 | `country` | String |
| 102 | `province` | 省市 | `province` | String |
| 103 | `city` | 市区 | `city` | String |
| 104 | `district` | 县 | `district` | String |
| 105 | `street` | 街道 | `street` | String |
| 106 | `address` | 详细地址 | `address` | String |
| 107 | `serviceContractId` | 服务合同 | `service_contract_id` | eafb7e7b-746e-4b48-8773-e48df89613f1 |
| 108 | `authResult` | 鉴权结果 | `auth_result` | String |
| 109 | `failureStartAt` | 故障发生时间 | `failure_start_at` | String |
| 110 | `failureEndAt` | 故障结束时间 | `failure_end_at` | String |
| 111 | `effectDate` | 生效日期 | `effect_date` | DateTime |
| 112 | `totalHours` | 总工时 | `total_hours` | Decimal |
| 113 | `weChatId` | 微信ID | `wechat_id` | String |
| 114 | `isAutoConfirm` | 自动确认 | `is_auto_confirm` | Boolean |
| 115 | `isChangeDispatched` | 是否改派 | `is_change_dispatched` | Boolean |
| 116 | `invalidDate` | 失效日期 | `invalid_date` | DateTime |
| 117 | `isSettled` | 已结算 | `is_settled` | Boolean |
| 118 | `isOverdue` | 是否超时 | `is_overdue` | Boolean |
| 119 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 120 | `creator` | 创建人名称 | `creator` | String |
| 121 | `createUser` | 创建者 | `create_user` | String |
| 122 | `createTime` | 创建时间 | `create_time` | DateTime |
| 123 | `createDate` | 创建日期 | `create_date` | Date |
| 124 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 125 | `modifier` | 修改人名称 | `modifier` | String |
| 126 | `lastModifyUser` | 最近修改者 | `last_modify_user` | String |
| 127 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 128 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 129 | `lastModified` | 最近修改时间 | `last_modified` | String |
| 130 | `id` | id | `id` | String |
| 131 | `dr` | 逻辑删除 | `dr` | Integer |
| 132 | `verifystate` | 审批状态 | `verifystate` | Short |
| 133 | `returncount` | 退回次数 | `returncount` | Short |
| 134 | `auditorId` | 审批人 | `auditorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 135 | `auditor` | 审批人名称 | `auditor` | String |
| 136 | `auditTime` | 审批时间 | `audit_time` | DateTime |
| 137 | `auditDate` | 审批日期 | `audit_date` | Date |
| 138 | `source` | 上游单据类型 | `source` | String |
| 139 | `sourceid` | 上游单据主表id | `sourceid` | Long |
| 140 | `sourceautoid` | 上游单据子表id | `sourceautoid` | Long |
| 141 | `sourceMainPubts` | 时间戳 | `sourceMainPubts` | DateTime |
| 142 | `upcode` | 上游单据号 | `upcode` | String |
| 143 | `makeRuleCode` | 生单规则编号 | `makerule_code` | String |
| 144 | `tenant` | 租户ID | `tenant_id` | String |
| 145 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 146 | `pubts` | 时间戳 | `pubts` | DateTime |
| 147 | `ts` | 版本号 | `ts` | String |
| 148 | `smsSoServicePriceList` | 服务费用 | `` | 063573ea-b920-4756-b947-6d6d12d78413 |
| 149 | `smsSosEquipmentList` | 工单设备信息 | `` | 25487918-5ce6-4ec1-ac75-96ac434f137f |
| 150 | `smsSosProductList` | 工单设备物料信息 | `` | 20657805-df6d-4ae1-827b-02b02ab4c7d3 |
| 151 | `soLogsList` | 工单服务记录 | `` | 2efa6356-3d04-4a47-8bdb-4793aaffbe1c |
| 152 | `soPersonList` | 工单协助人员表 | `` | f173e6e2-9955-4d03-a74b-a730f0b72886 |
| 153 | `soReportList` | 工单汇报子表 | `` | 07598c70-6fe0-4db3-9619-839699dace02 |
| 154 | `soServiceStandardList` | 工单完工服务标准 | `` | 5ec441e4-f2e7-439c-8476-e8e6b5b0cb34 |

---

## 关联属性（43个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `equId` | 设备 | `aim.equip.EquipHeadVO` | Service |  |
| 2 | `planSoId` | 计划工单Id | `pes.ps.PlanSoVO` | None |  |
| 3 | `activity` | 活动 | `pgrm.projecttask.ProjectScheduleTask` | Service |  |
| 4 | `tosId` | 服务类型 | `pes.tos.Tos` | None |  |
| 5 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 6 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 7 | `vendorId` | 服务商 | `aa.vendor.Vendor` | Service |  |
| 8 | `wbs` | WBS | `BGDM.wbs.wbs_doc` | Service |  |
| 9 | `bizFlow` | 流程ID | `bf.bizflow.BusinessFlow` | Service |  |
| 10 | `questionaryId` | 来源问题单ID | `pes.questionary.QuestionaryVO` | None |  |
| 11 | `customId` | 客户 | `aa.merchant.Merchant` | Service |  |
| 12 | `soServiceStandardList` | 工单完工服务标准 | `pes.sos.SoServiceStandard` | None | true |
| 13 | `soReportList` | 工单汇报子表 | `pes.sos.SoReport` | None | true |
| 14 | `orgId` | 组织 | `org.func.BaseOrg` | Service |  |
| 15 | `posId` | 服务点 | `pes.pos.Pos` | None |  |
| 16 | `customFactory` | 客户工厂 | `pes.customFactory.CustomFactory` | None |  |
| 17 | `serviceTeamId` | 服务团队 | `pes.serviceTeam.serviceTeam` | None |  |
| 18 | `serviceContractId` | 服务合同 | `pes.smsContracts.SmsContracts` | None |  |
| 19 | `productId` | 产品 | `pc.product.Product` | Service |  |
| 20 | `serviceSource` | 服务来源 | `pes.enum.EnumValue` | None |  |
| 21 | `transactionTypeId` | 交易类型 | `bd.bill.TransType` | Service |  |
| 22 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 23 | `smsSoServicePriceList` | 服务费用 | `pes.sos.SmsSoServicePrice` | None | true |
| 24 | `scoreOrgId` | 评分组织 | `org.func.BaseOrg` | Service |  |
| 25 | `smsSosEquipmentList` | 工单设备信息 | `pes.sos.SmsSosEquipment` | None | true |
| 26 | `bdProjectId` | 项目 | `bd.project.ProjectVO` | Service |  |
| 27 | `installWorkId` | 安装作业 | `pes.installJob.InstallJob` | None |  |
| 28 | `maintenanceLevelId` | 维保级别 | `pes.maintenanceLevel.MaintenanceLevel` | None |  |
| 29 | `serviceLevelId` | 服务级别 | `pes.servicelevel.ServiceLevelVO` | None |  |
| 30 | `scoreAssessor` | 评分人 | `bd.staff.Staff` | Service |  |
| 31 | `handlePersonId` | 经手人 | `bd.staff.Staff` | Service |  |
| 32 | `smsSosProductList` | 工单设备物料信息 | `pes.sos.SmsSosProduct` | None | true |
| 33 | `taskPlanId` | 安装计划 | `pes.installPlan.InstallPlan` | None |  |
| 34 | `auditorId` | 审批人 | `base.user.User` | Service |  |
| 35 | `positionId` | 位置 | `bd.region.BaseRegionVO` | Service |  |
| 36 | `handleDeptId` | 经手部门 | `bd.adminOrg.AdminOrgViewDept` | Service |  |
| 37 | `soPersonList` | 工单协助人员表 | `pes.sos.SoPersons` | None | true |
| 38 | `seId` | 服务工程师 | `bd.staff.Staff` | Service |  |
| 39 | `serviceOrgId` | 服务组织 | `org.func.BaseOrg` | Service |  |
| 40 | `smsSosDefineCharacter` | 自定义项特征 | `pes.sos.SmsSosDefineCharacter` | None |  |
| 41 | `customCategoryId` | 客户分类 | `aa.custcategory.CustCategory` | Service |  |
| 42 | `soLogsList` | 工单服务记录 | `pes.sos.SmsSoLogs` | None | true |
| 43 | `projectId` | 服务项目 | `pes.serviceProject.ServiceProject` | None |  |
