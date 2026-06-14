---
tags: ["BIP", "元数据", "数据字典", "ycSouringBid", "lawbid.cpuexpertplan.CpuExpertPlanHistory"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 专家抽取方案表体评委信息 (`lawbid.cpuexpertplan.CpuExpertPlanHistory`)

> **平台版本：BIP 旗舰版 V5**

> ycSouringBid 模块 | 物理表：`cpu_expert_plan_history`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 专家抽取方案表体评委信息 |
| 物理表 | `cpu_expert_plan_history` |
| domain/服务域 | `yonbip-cpu-lawbid` |
| schema | `cpu_lawbid` |
| 所属应用 | `ycSouringBid` |
| 构建时间 | `2026-06-04 19:56:54.2430` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | 主键 |

## 部署信息

- 部署时间: 2026-01-23 23:56:01:000

## 依赖接口（3个）

| # | 接口名 | URI | 版本 |
|---|--------|-----|------|
| 1 | 统一租户接口 | `ucfbase.ucfbaseItf.IYTenant` | 40 |
| 2 | 跨租户采购商租户接口 | `cpu.itf.IBuyerTenant` | 10 |
| 3 | 逻辑删除相关 | `ucfbase.ucfbaseItf.LogicDelete` | 74 |

---

## 直接属性（32个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `id` | 主键 | `id` | Long |
| 2 | `expertId` | 专家主键 | `expert_id` | Long |
| 3 | `expertCode` | 专家编号 | `expert_code` | String |
| 4 | `expertName` | 专家姓名 | `expert_name` | String |
| 5 | `expertIdCard` | 身份证件号码 | `expert_id_card` | String |
| 6 | `expertType` | 专家类型 | `expert_type` | String |
| 7 | `expertMajorId` | 专家专业主键 | `expert_major_id` | Long |
| 8 | `expertMajorCode` | 专家专业编码 | `expert_major_code` | String |
| 9 | `expertMajorName` | 专业 | `expert_major_name` | String |
| 10 | `expertOrgName` | 工作单位 | `expert_org_name` | String |
| 11 | `expertPhone` | 联系方式 | `expert_phone` | String |
| 12 | `drawType` | 抽取方式 | `draw_type` | String |
| 13 | `remark` | 抽取理由 | `remark` | String |
| 14 | `userId` | 用户主键 | `user_id` | Long |
| 15 | `userName` | 用户名称 | `user_name` | String |
| 16 | `extractionRounds` | 当前抽取的轮次 | `extraction_rounds` | Integer |
| 17 | `cpuExpertPlanHistoryDefineCharacter` | 抽取历史自定义项 | `define_character_id` | e06c9bb6-b20c-4999-a0d8-662ad4fdba39 |
| 18 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 19 | `detail` | 说明 | `detail` | String |
| 20 | `dr` | 删除标志 | `dr` | Short |
| 21 | `drawSerialNum` | 抽取序号 | `draw_serial_num` | Integer |
| 22 | `expertPlanId` | 抽取方案ID | `expert_plan_id` | 68a1e01e-9b68-40bd-9070-bcaaf8b65d03 |
| 23 | `expertRuleId` | 抽取规则ID | `expert_rule_id` | 9e065ec2-d70e-48c2-8c3b-f24c7ddbeb5d |
| 24 | `historyReviewTypeList` | 专家抽取方案抽取结果评审类型 | `` | f275cbeb-3391-44dd-a382-11e4a5b362b6 |
| 25 | `note` | 备注信息 | `note` | String |
| 26 | `notifyType` | 通知方式 | `notify_type` | String |
| 27 | `pubts` | 最后修改时间 | `ts` | DateTime |
| 28 | `reviewType` | 评审类型 | `review_type` | String |
| 29 | `state` | 抽取状态 | `state` | String |
| 30 | `vacationNo` | 抽取编码 | `vacation_no` | Long |
| 31 | `vacationReason` | 请假原因 | `vacation_reason` | String |
| 32 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（5个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `historyReviewTypeList` | 专家抽取方案抽取结果评审类型 | `lawbid.cpuexpertplan.CpuExpertPlanHistoryReviewType` | None | true |
| 2 | `cpuExpertPlanHistoryDefineCharacter` | 抽取历史自定义项 | `lawbid.cpuexpertplan.CpuExpertPlanHistoryDefineCharacter` | None |  |
| 3 | `expertRuleId` | 抽取规则ID | `lawbid.cpuexpertplan.CpuExpertPlanRule` | None |  |
| 4 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 5 | `expertPlanId` | 抽取方案ID | `lawbid.cpuexpertplan.CpuExpertPlan` | None | true |
