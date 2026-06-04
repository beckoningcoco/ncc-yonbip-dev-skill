---
tags: ["BIP", "元数据", "数据字典", "ycSouringBid", "lawbid.cpuexpertplanchg.CpuExpertPlanChg"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 专家补抽单 (`lawbid.cpuexpertplanchg.CpuExpertPlanChg`)

> **平台版本：BIP 旗舰版 V5**

> ycSouringBid 模块 | 物理表：`cpu_expert_plan_chg`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 专家补抽单 |
| 物理表 | `cpu_expert_plan_chg` |
| 数据库 schema | `yonbip-cpu-lawbid` |
| 所属应用 | `ycSouringBid` |
| 构建时间 | `2026-06-04 19:26:04.3000` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | id |

## 部署信息

- 部署时间: 2025-10-24 23:58:14:000

## 依赖接口（6个）

| # | 接口名 | URI | 版本 |
|---|--------|-----|------|
| 1 | 统一租户接口 | `ucfbase.ucfbaseItf.IYTenant` | 40 |
| 2 | 跨租户采购商租户接口 | `cpu.itf.IBuyerTenant` | 10 |
| 3 | 逻辑删除相关 | `ucfbase.ucfbaseItf.LogicDelete` | 74 |
| 4 | 审计信息 | `base.itf.IAuditInfo` | 340 |
| 5 | 审批流信息 | `base.itf.IApprovalFlow` | 134 |
| 6 | 审批信息 | `base.itf.IApprovalInfo` | 172 |

---

## 直接属性（53个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `id` | id | `id` | Long |
| 2 | `expertPlanId` | 原专家抽取方案主键 | `expert_plan_id` | 68a1e01e-9b68-40bd-9070-bcaaf8b65d03 |
| 3 | `sysVersion` | 系统版本 | `sys_version` | String |
| 4 | `cpuExpertPlanChgDefineCharacter` | 专家抽取方案特征 | `define_character_id` | b0555cb3-531d-4339-9b89-42dc735651bc |
| 5 | `code` | 方案编码 | `code` | String |
| 6 | `name` | 方案名称 | `name` | String |
| 7 | `planNum` | 计划抽取专家数 | `plan_num` | Integer |
| 8 | `realNum` | 实际抽取专家数 | `real_num` | Integer |
| 9 | `supplementNum` | 补抽人数 | `supplement_num` | Integer |
| 10 | `assPlace` | 评标地点 | `ass_place` | String |
| 11 | `preStartTime` | 预计评标开始时间 | `pre_start_time` | DateTime |
| 12 | `preEndTime` | 预计评标结束时间 | `pre_end_time` | DateTime |
| 13 | `drawType` | 抽取方式 | `draw_type` | String |
| 14 | `drawTime` | 抽取耗费时间 | `draw_time` | Long |
| 15 | `notifyType` | 通知方式 | `notify_type` | String |
| 16 | `assType` | 专家考核 | `ass_type` | String |
| 17 | `state` | 抽取状态 | `state` | String |
| 18 | `enterpriseId` | 企业ID | `enterprise_id` | Long |
| 19 | `enterpriseName` | 企业名称 | `enterprise_name` | String |
| 20 | `tenantId` | 租户ID | `tenant_id` | String |
| 21 | `creatorName` | 创建者 | `creator_name` | String |
| 22 | `noticeContent` | 通知内容 | `notice_content` | String |
| 23 | `creator` | 创建人 | `creator` | String |
| 24 | `createTime` | 创建时间 | `create_time` | DateTime |
| 25 | `modifierName` | 修改者 | `modifier_name` | String |
| 26 | `modifyTime` | 修改时间 | `modified_time` | DateTime |
| 27 | `modifyDate` | 修改日期 | `modify_date` | DateTime |
| 28 | `modifier` | 修改人 | `modifier` | String |
| 29 | `dr` | 删除标志 | `dr` | Short |
| 30 | `curExtractionRounds` | 当前抽取的轮次 | `cur_extraction_rounds` | Integer |
| 31 | `approveRecord` | 是否有审批记录 | `approve_record` | Short |
| 32 | `remark` | 备注 | `remark` | String |
| 33 | `pubts` | 最后修改时间 | `ts` | DateTime |
| 34 | `purOrgId` | 采购组织 | `pur_org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 35 | `creatorId` | 创建者ID | `creator_id` | 54800425-15da-4742-ae89-059d05e77c9b |
| 36 | `modifierId` | 修改者ID | `modifier_id` | 54800425-15da-4742-ae89-059d05e77c9b |
| 37 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 38 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 39 | `createDate` | 创建日期 | `create_date` | Date |
| 40 | `isWfControlled` | 是否审批流控制 | `isWfControlled` | Boolean |
| 41 | `verifystate` | 审批状态 | `verifystate` | Short |
| 42 | `returncount` | 退回次数 | `returncount` | Short |
| 43 | `auditor` | 审批人名称 | `auditor` | String |
| 44 | `auditorId` | 审批人 | `auditorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 45 | `auditTime` | 审批时间 | `audit_time` | DateTime |
| 46 | `auditDate` | 审批日期 | `audit_date` | Date |
| 47 | `cpuExpertPlanDefineCharacter` | 专家抽取方案特征 | `define_character_id` | 6813a137-4f5f-47df-8373-82ebdcf8202f |
| 48 | `isNewFlow` | 是否为新审批 | `is_new_flow` | Integer |
| 49 | `oldBillNum` | 原始单据号 | `old_bill_num` | String |
| 50 | `flowSource` | 审批源 | `flow_source` | String |
| 51 | `contentChgList` | 专家补抽单表体标段包信息 | `` | 737e4319-3672-4036-ad34-baf531bf3b10 |
| 52 | `historyChgList` | 专家补抽单表体评委信息 | `` | 3a1361e7-95f5-45ed-a0b5-461a35167852 |
| 53 | `ruleChgList` | 专家补抽单表体抽取规则 | `` | 5e60a4d1-d9ee-4ba9-8069-59b5cae899dd |

---

## 关联属性（11个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `purOrgId` | 采购组织 | `org.func.BaseOrg` | Service |  |
| 2 | `cpuExpertPlanDefineCharacter` | 专家抽取方案特征 | `lawbid.cpuexpertplan.CpuExpertPlanDefineCharacter` | None |  |
| 3 | `ruleChgList` | 专家补抽单表体抽取规则 | `lawbid.cpuexpertplanchg.CpuExpertPlanRuleChg` | None | true |
| 4 | `historyChgList` | 专家补抽单表体评委信息 | `lawbid.cpuexpertplanchg.CpuExpertPlanHistoryChg` | None | true |
| 5 | `auditorId` | 审批人 | `base.user.User` | Service |  |
| 6 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 7 | `creatorId` | 创建者ID | `base.user.User` | Service |  |
| 8 | `modifierId` | 修改者ID | `base.user.User` | Service |  |
| 9 | `expertPlanId` | 原专家抽取方案主键 | `lawbid.cpuexpertplan.CpuExpertPlan` | None |  |
| 10 | `contentChgList` | 专家补抽单表体标段包信息 | `lawbid.cpuexpertplanchg.CpuExpertPlanContentChg` | None | true |
| 11 | `cpuExpertPlanChgDefineCharacter` | 专家抽取方案特征 | `lawbid.cpuexpertplanchg.CpuExpertPlanChgDefineCharacter` | None |  |
