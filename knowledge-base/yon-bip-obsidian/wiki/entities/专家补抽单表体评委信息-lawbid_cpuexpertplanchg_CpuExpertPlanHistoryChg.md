---
tags: ["BIP", "元数据", "数据字典", "ycSouringBid", "lawbid.cpuexpertplanchg.CpuExpertPlanHistoryChg"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 专家补抽单表体评委信息 (`lawbid.cpuexpertplanchg.CpuExpertPlanHistoryChg`)

> **平台版本：BIP 旗舰版 V5**

> ycSouringBid 模块 | 物理表：`cpu_expert_plan_history_chg`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 专家补抽单表体评委信息 |
| 物理表 | `cpu_expert_plan_history_chg` |
| domain/服务域 | `yonbip-cpu-lawbid` |
| schema | `cpu_lawbid` |
| 所属应用 | `ycSouringBid` |
| 构建时间 | `2026-06-04 20:00:05.7810` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | id |

## 部署信息

- 部署时间: 2026-01-23 23:56:01:000

## 依赖接口（3个）

| # | 接口名 | URI | 版本 |
|---|--------|-----|------|
| 1 | 统一租户接口 | `ucfbase.ucfbaseItf.IYTenant` | 40 |
| 2 | 跨租户采购商租户接口 | `cpu.itf.IBuyerTenant` | 10 |
| 3 | 逻辑删除相关 | `ucfbase.ucfbaseItf.LogicDelete` | 74 |

---

## 直接属性（36个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `id` | id | `id` | Long |
| 2 | `expertHistoryId` | 原抽取历史主键 | `expert_history_id` | fd8db517-307c-41c8-90f9-dd752772768b |
| 3 | `expertPlanChgId` | 抽取方案ID | `expert_plan_chg_id` | 3b7262c7-c461-45b8-b8cc-950f46405e46 |
| 4 | `cpuExpertPlanHistoryChgDefineCharacter` | 专家补抽单表体评委信息特征 | `define_character_id` | 890b5a64-6606-4ffb-9bbf-d2e35759eaec |
| 5 | `expertId` | 专家档案ID | `expert_id` | Long |
| 6 | `expertCode` | 专家编码 | `expert_code` | String |
| 7 | `expertName` | 专家名称 | `expert_name` | String |
| 8 | `expertIdCard` | 身份证件号码 | `expert_id_card` | String |
| 9 | `expertPhone` | 专家电话 | `expert_phone` | String |
| 10 | `reviewType` | 评审类型 | `review_type` | String |
| 11 | `expertType` | 专家类型 | `expert_type` | String |
| 12 | `remark` | 备注 记录专家通知结果 的原因 | `remark` | String |
| 13 | `expertMajorId` | 专家专业ID | `expert_major_id` | Long |
| 14 | `expertMajorCode` | 专家专业编码 | `expert_major_code` | String |
| 15 | `expertMajorName` | 专家专业名称 | `expert_major_name` | String |
| 16 | `state` | 抽取状态 | `state` | String |
| 17 | `detail` | 说明 | `detail` | String |
| 18 | `userId` | 用户ID | `user_id` | Long |
| 19 | `userName` | 用户名字 | `user_name` | String |
| 20 | `dr` | 删除标志 | `dr` | Short |
| 21 | `extractionRounds` | 当前抽取的轮次 | `extraction_rounds` | Integer |
| 22 | `drawSerialNum` | 抽取序号 | `draw_serial_num` | Integer |
| 23 | `expertRuleChgId` | 抽取规则ID | `expert_rule_chg_id` | 5e60a4d1-d9ee-4ba9-8069-59b5cae899dd |
| 24 | `expertOrgName` | 工作单位 | `expert_org_name` | String |
| 25 | `drawType` | 抽取方式 | `draw_type` | String |
| 26 | `pubts` | 最后修改时间 | `ts` | DateTime |
| 27 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 28 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 29 | `expertPlanId` | 抽取方案ID | `expert_plan_id` | 68a1e01e-9b68-40bd-9070-bcaaf8b65d03 |
| 30 | `cpuExpertPlanHistoryDefineCharacter` | 抽取历史特征 | `define_character_id` | e06c9bb6-b20c-4999-a0d8-662ad4fdba39 |
| 31 | `expertRuleId` | 抽取规则ID | `expert_rule_id` | 9e065ec2-d70e-48c2-8c3b-f24c7ddbeb5d |
| 32 | `vacationNo` | 抽取编码 | `vacation_no` | Long |
| 33 | `vacationReason` | 请假原因 | `vacation_reason` | String |
| 34 | `note` | 备注信息 | `note` | String |
| 35 | `notifyType` | 通知方式 | `notify_type` | String |
| 36 | `reviewTypeHistoryChgList` | 专家补抽单抽取结果评审类型 | `` | ae5497d6-b9b4-4630-bfa7-b8d1e3358ea3 |

---

## 关联属性（9个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `cpuExpertPlanHistoryDefineCharacter` | 抽取历史特征 | `lawbid.cpuexpertplan.CpuExpertPlanHistoryDefineCharacter` | None |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `expertRuleId` | 抽取规则ID | `lawbid.cpuexpertplan.CpuExpertPlanRule` | None |  |
| 4 | `cpuExpertPlanHistoryChgDefineCharacter` | 专家补抽单表体评委信息特征 | `lawbid.cpuexpertplanchg.CpuExpertPlanHistoryChgDefineCharacter` | None |  |
| 5 | `expertRuleChgId` | 抽取规则ID | `lawbid.cpuexpertplanchg.CpuExpertPlanRuleChg` | None |  |
| 6 | `expertPlanChgId` | 抽取方案ID | `lawbid.cpuexpertplanchg.CpuExpertPlanChg` | None | true |
| 7 | `expertPlanId` | 抽取方案ID | `lawbid.cpuexpertplan.CpuExpertPlan` | None |  |
| 8 | `reviewTypeHistoryChgList` | 专家补抽单抽取结果评审类型 | `lawbid.cpuexpertplanchg.CpuExpertPlanHistoryChgReviewType` | None | true |
| 9 | `expertHistoryId` | 原抽取历史主键 | `lawbid.cpuexpertplan.CpuExpertPlanHistory` | None |  |
