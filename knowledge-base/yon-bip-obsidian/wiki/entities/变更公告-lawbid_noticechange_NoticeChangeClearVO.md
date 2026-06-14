---
tags: ["BIP", "元数据", "数据字典", "ycSouringBid", "lawbid.noticechange.NoticeChangeClearVO"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 变更公告 (`lawbid.noticechange.NoticeChangeClearVO`)

> **平台版本：BIP 旗舰版 V5**

> ycSouringBid 模块 | 物理表：`cpu_bid_pjt_clear`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 变更公告 |
| 物理表 | `cpu_bid_pjt_clear` |
| domain/服务域 | `yonbip-cpu-lawbid` |
| schema | `cpu_lawbid` |
| 所属应用 | `ycSouringBid` |
| 构建时间 | `2026-06-04 19:25:09.4590` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | 投标文件ID |

## 部署信息

- 部署时间: 2025-10-24 23:58:03:000

## 依赖接口（9个）

| # | 接口名 | URI | 版本 |
|---|--------|-----|------|
| 1 | 变更公告接口 | `noticechange.itf.INoticeChangeClear` | 107 |
| 2 | 逻辑删除相关 | `ucfbase.ucfbaseItf.LogicDelete` | 74 |
| 3 | 统一租户接口 | `ucfbase.ucfbaseItf.IYTenant` | 40 |
| 4 | 审计信息 | `ucfbase.ucfbaseItf.IAuditInfo` | 192 |
| 5 | 跨租户采购商租户接口 | `cpu.itf.IBuyerTenant` | 10 |
| 6 | 审批兼容信息 | `lawbid.commonitf.ICompatibleFlowInfo` | 6 |
| 7 | 审批流信息 | `base.itf.IApprovalFlow` | 134 |
| 8 | 审计信息 | `base.itf.IAuditInfo` | 340 |
| 9 | 审批信息 | `base.itf.IApprovalInfo` | 172 |

---

## 直接属性（78个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `id` | 投标文件ID | `id` | Long |
| 2 | `pubts` | 修改时间 | `pubts` | DateTime |
| 3 | `dr` | 是否删除标识 | `dr` | Short |
| 4 | `status` | 发布 1  未发布 0 | `status` | String |
| 5 | `isInvitationReply` | 变更邀请结束时间 | `is_invitation_reply` | Integer |
| 6 | `isSignup` | 变更报名截止时间 | `is_signup` | Integer |
| 7 | `invitationReplyEndTime` | 变更邀请结束时间 | `invitation_reply_end_time` | DateTime |
| 8 | `signupEndTime` | 变更报名截止时间 | `signup_end_time` | DateTime |
| 9 | `isStart` | 变更招标文件发售开始时间 | `is_start` | Integer |
| 10 | `publishToMediaChannel` | 公告发布媒体 | `publish_to_media_channel` | String |
| 11 | `saleStartTime` | 变更招标文件发售开始时间 | `sale_start_time` | DateTime |
| 12 | `isEnd` | 变更招标文件发售截止时间 | `is_end` | Integer |
| 13 | `saleEndTime` | 变更招标文件发售截止时间 | `sale_end_time` | DateTime |
| 14 | `isAsk` | 变更询问质疑截止时间 | `is_ask` | Integer |
| 15 | `askEndTime` | 变更询问质疑截止时间 | `ask_end_time` | DateTime |
| 16 | `isSubmit` | 变更投标文件递交截止时间 | `is_submit` | Integer |
| 17 | `tenderDocSubmitEnd` | 变更投标文件递交截止时间 | `tender_doc_submit_end` | DateTime |
| 18 | `isOpen` | 变更开标时间 | `is_open` | Integer |
| 19 | `openTime` | 变更开标时间 | `open_time` | DateTime |
| 20 | `isWfControlled` | 是否审批历史 | `isWfControlled` | Boolean |
| 21 | `isHistoryFlow` | 是否审批历史 | `is_history_flow` | Integer |
| 22 | `noticeChangeClearVODefineCharacter` | 变更公告特征自定义项 | `define_character_id` | d833808e-f2a8-4506-aa04-3c9af6e3708c |
| 23 | `approveTime` | 变更公告审批通过时间 | `approve_time` | DateTime |
| 24 | `auctionStartTime` | 拍卖开始时间 | `auction_start_time` | DateTime |
| 25 | `auditDate` | 审批日期 | `audit_date` | Date |
| 26 | `auditTime` | 审批时间 | `audit_time` | DateTime |
| 27 | `auditor` | 审批人名称 | `auditor` | String |
| 28 | `auditorId` | 审批人 | `auditorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 29 | `bidProjectCode` | 招标项目编码 | `bid_project_code` | String |
| 30 | `bidProjectId` | 采购项目 | `bid_project_id` | 070c3520-bf5d-4b3e-a523-59e73d9f6349 |
| 31 | `bidProjectName` | 招标项目名称 | `bid_project_name` | String |
| 32 | `bidSectionCode` | 标包编码 | `bid_section_code` | String |
| 33 | `bidSectionId` | 标包 | `bid_section_id` | 0409e7d6-ed4c-4c0d-bc0d-dde79bdbf461 |
| 34 | `bidSectionName` | 标包名称 | `bid_section_name` | String |
| 35 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 36 | `clearNoticeType` | 公告类型 | `clear_notice_type` | Integer |
| 37 | `commitTime` | 变更公告提交审批时间 | `commit_time` | DateTime |
| 38 | `competitionEndTime` | 竞价截止时间 | `competition_end_time` | DateTime |
| 39 | `competitionStartTime` | 竞价开始时间 | `competition_start_time` | DateTime |
| 40 | `countDown` | 倒计时时长 | `count_down` | String |
| 41 | `createDate` | 创建日期 | `create_date` | Date |
| 42 | `createTime` | 创建时间 | `create_time` | DateTime |
| 43 | `creator` | 创建人 | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b |
| 44 | `creatorId` | 操作用户 | `creator_id` | 54800425-15da-4742-ae89-059d05e77c9b |
| 45 | `creatorName` | 操作用户 | `creator_name` | String |
| 46 | `defines` | 变更公告自定义项 | `` | 6b7c46bb-e2e3-4f87-a938-cc3aa09cd929 |
| 47 | `delayedTime` | 延时时长 | `delayed_time` | String |
| 48 | `enterpriseId` | 企业 | `enterprise_id` | Long |
| 49 | `enterpriseName` | 企业名称 | `enterprise_name` | String |
| 50 | `flowSource` | 审批源 | `flow_source` | String |
| 51 | `gradient` | 报价梯度 | `gradient` | String |
| 52 | `historyFlowKey` | 历史businessKey | `history_flow_key` | String |
| 53 | `isBidStart` | 是否是法招开始 | `is_bid_start` | Integer |
| 54 | `isNewFlow` | 是否为新审批 | `is_new_flow` | Integer |
| 55 | `isTriedEnd` | 是否是尝试时间结束? | `is_tried_end` | Integer |
| 56 | `isTriedStart` | 是否是尝试时间开始 | `is_tried_start` | Integer |
| 57 | `limitNorm` | 是否限制报价梯度 | `limit_norm` | Long |
| 58 | `modifier` | 修改人 | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b |
| 59 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 60 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 61 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 62 | `multipleCurrentStage` | 当前招标阶段 | `multiple_current_stage` | Integer |
| 63 | `noticeChangeClearSectionVO` | 变更公告关系 | `` | cb0a0564-95a9-4a4a-a254-9e7814c8c961 |
| 64 | `noticeChangeContentVO` | 公告内容 | `` | ec6ff825-4b1c-40e9-af57-52abd3bbe1a1 |
| 65 | `noticeContentId` | 公告内容主键 | `notice_content_id` | Long |
| 66 | `oldBillNum` | 原始单据号 | `old_bill_num` | String |
| 67 | `publdate` | 发布公告时间 | `publdate` | DateTime |
| 68 | `publishTime` | 变更时间 | `publish_time` | DateTime |
| 69 | `purOrgId` | 采购组织 | `pur_org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 70 | `qualifyCheckStep` | 资格审核当前流程阶段 | `qualify_check_step` | Integer |
| 71 | `returncount` | 退回次数 | `returncount` | Short |
| 72 | `startPrice` | 起始价 | `start_price` | String |
| 73 | `triedEndTime` | 尝试结束时间 | `tried_end_time` | DateTime |
| 74 | `triedStartTime` | 尝试开始时间 | `tried_start_time` | DateTime |
| 75 | `ts` | 时间戳 | `ts` | DateTime |
| 76 | `type` | 变更公告类型（预审公告、标书公告）标识 | `type` | Integer |
| 77 | `verifystate` | 审批状态 | `verifystate` | Short |
| 78 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（13个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `purOrgId` | 采购组织 | `org.func.BaseOrg` | Service |  |
| 2 | `creator` | 创建人 | `base.user.BipUser` | Service |  |
| 3 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 4 | `modifier` | 修改人 | `base.user.BipUser` | Service |  |
| 5 | `creatorId` | 操作用户 | `base.user.User` | Service |  |
| 6 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 7 | `bidProjectId` | 采购项目 | `lawbid.project.LawbidProject` | None |  |
| 8 | `defines` | 变更公告自定义项 | `lawbid.noticechange.NoticeChangeClearVOFreeDefine` | None | true |
| 9 | `noticeChangeClearVODefineCharacter` | 变更公告特征自定义项 | `lawbid.noticechange.NoticeChangeClearVODefineCharacter` | None |  |
| 10 | `auditorId` | 审批人 | `base.user.User` | Service |  |
| 11 | `noticeChangeClearSectionVO` | 变更公告关系 | `lawbid.noticechange.NoticeChangeClearSectionVO` | None | true |
| 12 | `noticeChangeContentVO` | 公告内容 | `lawbid.noticechange.NoticeChangeContentVO` | None | true |
| 13 | `bidSectionId` | 标包 | `lawbid.section.LawbidSection` | None |  |
