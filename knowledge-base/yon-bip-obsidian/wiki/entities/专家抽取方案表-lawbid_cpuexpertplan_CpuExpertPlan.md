---
tags: ["BIP", "元数据", "数据字典", "ycSouringBid", "lawbid.cpuexpertplan.CpuExpertPlan"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 专家抽取方案表 (`lawbid.cpuexpertplan.CpuExpertPlan`)

> **平台版本：BIP 旗舰版 V5**

> ycSouringBid 模块 | 物理表：`cpu_expert_plan`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 专家抽取方案表 |
| 物理表 | `cpu_expert_plan` |
| domain/服务域 | `yonbip-cpu-lawbid` |
| schema | `cpu_lawbid` |
| 所属应用 | `ycSouringBid` |
| 构建时间 | `2026-06-04 19:25:53.3460` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | 主键 |
| 编码 | `code` | String | 抽取申请编号 |

## 部署信息

- 部署时间: 2026-01-23 23:56:03:000

## 依赖接口（8个）

| # | 接口名 | URI | 版本 |
|---|--------|-----|------|
| 1 | 统一租户接口 | `ucfbase.ucfbaseItf.IYTenant` | 40 |
| 2 | 跨租户采购商租户接口 | `cpu.itf.IBuyerTenant` | 10 |
| 3 | 逻辑删除相关 | `ucfbase.ucfbaseItf.LogicDelete` | 74 |
| 4 | 自动编号 | `voucher.base.IAutoCode` | 49 |
| 5 | 审计信息 | `base.itf.IAuditInfo` | 340 |
| 6 | 审批流信息 | `base.itf.IApprovalFlow` | 134 |
| 7 | 审批兼容信息 | `lawbid.commonitf.ICompatibleFlowInfo` | 6 |
| 8 | 审批信息 | `base.itf.IApprovalInfo` | 172 |

---

## 直接属性（49个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `id` | 主键 | `id` | Long |
| 2 | `pubts` | 时间戳 | `ts` | DateTime |
| 3 | `purOrgId` | 采购组织 | `pur_org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 4 | `code` | 抽取申请编号 | `code` | String |
| 5 | `realNum` | 实际抽取专家数 | `real_num` | Integer |
| 6 | `drawTime` | 抽取耗费时间 | `draw_time` | Long |
| 7 | `assType` | 专家考核 | `ass_type` | String |
| 8 | `state` | 抽取状态 | `state` | String |
| 9 | `enterpriseId` | 企业ID | `enterprise_id` | Long |
| 10 | `enterpriseName` | 企业名称 | `enterprise_name` | String |
| 11 | `tenantId` | 租户ID | `tenant_id` | String |
| 12 | `creatorName` | 创建者 | `creator_name` | String |
| 13 | `noticeContent` | 通知内容 | `notice_content` | String |
| 14 | `creator` | 创建人 | `creator` | String |
| 15 | `createTime` | 创建时间 | `create_time` | DateTime |
| 16 | `modifierName` | 修改者 | `modifier_name` | String |
| 17 | `modifyTime` | 修改时间 | `modified_time` | DateTime |
| 18 | `modifyDate` | 修改日期 | `modify_date` | DateTime |
| 19 | `modifier` | 修改人 | `modifier` | String |
| 20 | `dr` | 删除标志 | `dr` | Short |
| 21 | `approveRecord` | 是否有审批记录 | `approve_record` | Short |
| 22 | `creatorId` | 创建者ID | `creator_id` | 54800425-15da-4742-ae89-059d05e77c9b |
| 23 | `modifierId` | 修改者ID | `modifier_id` | 54800425-15da-4742-ae89-059d05e77c9b |
| 24 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 25 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 26 | `createDate` | 创建日期 | `create_date` | Date |
| 27 | `isWfControlled` | 是否审批流控制 | `isWfControlled` | Boolean |
| 28 | `verifystate` | 审批状态 | `verifystate` | Short |
| 29 | `returncount` | 退回次数 | `returncount` | Short |
| 30 | `isNewFlow` | 是否为新审批 | `is_new_flow` | Integer |
| 31 | `oldBillNum` | 原始单据号 | `old_bill_num` | String |
| 32 | `flowSource` | 审批源 | `flow_source` | String |
| 33 | `auditor` | 审批人名称 | `auditor` | String |
| 34 | `auditorId` | 审批人 | `auditorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 35 | `auditTime` | 审批时间 | `audit_time` | DateTime |
| 36 | `auditDate` | 审批日期 | `audit_date` | Date |
| 37 | `name` | 抽取申请名称 | `name` | String |
| 38 | `planNum` | 评委人数 | `plan_num` | Integer |
| 39 | `assPlace` | 评标地址 | `ass_place` | String |
| 40 | `preStartTime` | 预计评标开始时间 | `pre_start_time` | DateTime |
| 41 | `preEndTime` | 预计评标结束时间 | `pre_end_time` | DateTime |
| 42 | `drawType` | 抽取方式 | `draw_type` | String |
| 43 | `notifyType` | 通知方式 | `notify_type` | String |
| 44 | `remark` | 备注 | `remark` | String |
| 45 | `curExtractionRounds` | 当前抽取轮次 | `cur_extraction_rounds` | Integer |
| 46 | `cpuExpertPlanDefineCharacter` | 专家抽取自定义项 | `define_character_id` | 6813a137-4f5f-47df-8373-82ebdcf8202f |
| 47 | `contentList` | 专家抽取方案表体标段包信息 | `` | 2e85a2ed-178f-40ec-a7ec-56c0a97fdb90 |
| 48 | `historyList` | 专家抽取方案表体评委信息 | `` | fd8db517-307c-41c8-90f9-dd752772768b |
| 49 | `ruleList` | 专家抽取方案表体抽取规则 | `` | 9e065ec2-d70e-48c2-8c3b-f24c7ddbeb5d |

---

## 关联属性（9个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `cpuExpertPlanDefineCharacter` | 专家抽取自定义项 | `lawbid.cpuexpertplan.CpuExpertPlanDefineCharacter` | None |  |
| 2 | `purOrgId` | 采购组织 | `org.func.BaseOrg` | Service |  |
| 3 | `auditorId` | 审批人 | `base.user.User` | Service |  |
| 4 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 5 | `historyList` | 专家抽取方案表体评委信息 | `lawbid.cpuexpertplan.CpuExpertPlanHistory` | None | true |
| 6 | `ruleList` | 专家抽取方案表体抽取规则 | `lawbid.cpuexpertplan.CpuExpertPlanRule` | None | true |
| 7 | `creatorId` | 创建者ID | `base.user.User` | Service |  |
| 8 | `modifierId` | 修改者ID | `base.user.User` | Service |  |
| 9 | `contentList` | 专家抽取方案表体标段包信息 | `lawbid.cpuexpertplan.CpuExpertPlanContent` | None | true |
