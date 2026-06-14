---
tags: ["BIP", "元数据", "数据字典", "ycSouringBid", "lawbid.talks.BidClarifyVO"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 谈判单表头 (`lawbid.talks.BidClarifyVO`)

> **平台版本：BIP 旗舰版 V5**

> ycSouringBid 模块 | 物理表：`cpu_bid_clarify`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 谈判单表头 |
| 物理表 | `cpu_bid_clarify` |
| domain/服务域 | `yonbip-cpu-lawbid` |
| schema | `cpu_lawbid` |
| 所属应用 | `ycSouringBid` |
| 构建时间 | `2026-06-04 19:24:56.0420` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |
| 编码 | `clarify_code` | String | 谈判编码 |

## 部署信息

- 部署时间: 2026-05-22 23:54:59:000

## 依赖接口（8个）

| # | 接口名 | URI | 版本 |
|---|--------|-----|------|
| 1 | 审计信息 | `base.itf.IAuditInfo` | 340 |
| 2 | 采购模板-领域扩展字段 | `tpl.itf.TplId` | 53 |
| 3 | 自动编号 | `voucher.base.IAutoCode` | 49 |
| 4 | 审批流信息 | `base.itf.IApprovalFlow` | 134 |
| 5 | 逻辑删除相关 | `ucfbase.ucfbaseItf.LogicDelete` | 74 |
| 6 | 统一租户接口 | `ucfbase.ucfbaseItf.IYTenant` | 40 |
| 7 | 跨租户采购商租户接口 | `cpu.itf.IBuyerTenant` | 10 |
| 8 | 审批信息 | `base.itf.IApprovalInfo` | 172 |

---

## 直接属性（73个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `BidClarifyDefineCharacter` | 谈判单表头自定义项 | `define_character_id` | 30567e80-ca9e-42ef-a9f3-48c7e947e78d |
| 2 | `mainOrgId` | 主组织 | `main_org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 3 | `returncount` | 退回次数 | `returncount` | Short |
| 4 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 5 | `createDate` | 创建日期 | `create_date` | Date |
| 6 | `isWfControlled` | 是否审批流控制 | `isWfControlled` | Boolean |
| 7 | `createTime` | 创建时间 | `create_time` | DateTime |
| 8 | `verifystate` | 审批状态 | `verifystate` | Short |
| 9 | `creator` | 创建人名称 | `creator` | String |
| 10 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 11 | `billVersionId` | 版本id | `bill_version_id` | a3a5ef89-acd9-4d26-bfa0-f2828d18ef6b |
| 12 | `quoteViewablePostNeg` | 报价查看权限控制:1 = 需开启权限方可查看报价,0 = 无需开启权限,直接查看报价 | `quote_viewable_post_neg` | Integer |
| 13 | `showLowestPrice` | 显示报价最低价 | `show_lowest_price` | Short |
| 14 | `showPriceRank` | 显示价格排名 | `show_price_rank` | Short |
| 15 | `stepSeq` | 当前分步开标阶段 | `step_seq` | Short |
| 16 | `supplierTechnologyFitFlag` | 供应商技术谈判是否一致:是、否,默认否 | `supplier_technology_fit_flag` | Integer |
| 17 | `modifier` | 修改人名称 | `modifier` | String |
| 18 | `auditor` | 审批人名称 | `auditor` | String |
| 19 | `auditorId` | 审批人 | `auditorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 20 | `auditTime` | 审批时间 | `audit_time` | DateTime |
| 21 | `auditDate` | 审批日期 | `audit_date` | Date |
| 22 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 23 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 24 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 25 | `pubts` | 时间戳 | `pubts` | DateTime |
| 26 | `ytenant` | 租户 | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 27 | `code` | 谈判编码 | `clarify_code` | String |
| 28 | `responseClarifyTime` | 谈判开始时间 | `response_clarify_time` | DateTime |
| 29 | `responseTime` | 谈判截止时间 | `Response_time` | DateTime |
| 30 | `clarifyTitle` | 谈判标题 | `clarify_title` | String |
| 31 | `talksRounds` | 谈判轮次 | `talks_rounds` | Integer |
| 32 | `responseAll` | 响应情况 | `response_all` | String |
| 33 | `talksSequence` | 谈判次数 | `talks_sequence` | Integer |
| 34 | `id` | ID | `id` | Long |
| 35 | `projectId` | 招标项目 | `project_id` | 070c3520-bf5d-4b3e-a523-59e73d9f6349 |
| 36 | `sectionId` | 标段(包) | `section_id` | 0409e7d6-ed4c-4c0d-bc0d-dde79bdbf461 |
| 37 | `priceWhether` | 是否报价 | `price_whether` | Integer |
| 38 | `priceRange` | 报价范围 | `price_range` | Integer |
| 39 | `enterpriseId` | 租户 | `enterprise_id` | Long |
| 40 | `eliminate` | 淘汰未选择的供应商 | `eliminate` | Integer |
| 41 | `enterpriseName` | 租户名 | `enterprise_name` | String |
| 42 | `supplierMaterialFitFlag` | 供应商谈判物料是否一致 | `supplier_material_fit_flag` | Integer |
| 43 | `ts` | 时间戳 | `ts` | DateTime |
| 44 | `dr` | 删除标志位 | `dr` | Integer |
| 45 | `submit` | 提交状态 | `submit` | Integer |
| 46 | `purchaseType` | 采购类型 | `purchase_type` | String |
| 47 | `status` | 澄清时间是否截至 | `status` | Integer |
| 48 | `consignationId` | 委托单 | `consignation_id` | Long |
| 49 | `ytenantId` | 租户名 | `ytenant_id` | String |
| 50 | `scoringGroupId` | 评标组 | `scoring_group_id` | bd52c08b-9c24-45c6-b5ba-6209956c1411 |
| 51 | `talksContent` | 谈判内容 | `talks_content` | String |
| 52 | `templateId` | 模板ID | `template_id` | Long |
| 53 | `allMaterials` | 全部物料 | `all_materials` | Short |
| 54 | `billTemplateId` | 采购模板ID | `bill_template_id` | Long |
| 55 | `noHigher` | 不高于上次报价 | `no_higher` | Short |
| 56 | `stepSize` | 报价步长 | `step_size` | Short |
| 57 | `guidePrice` | 判断指导价 | `guide_price` | Short |
| 58 | `files` | 附件 | `files` | String |
| 59 | `talksStatus` | 是否最新轮次 | `talks_status` | Integer |
| 60 | `billType` | 单据类型 | `bill_type` | String |
| 61 | `historyData` | 数据版本 | `history_data` | Integer |
| 62 | `clarifySetId` | 谈判设置 | `clarify_set_id` | c02e0db8-e1da-48fb-9d99-ec926f7b0e28 |
| 63 | `bidClarifyIdOld` | 上轮谈判 | `bid_clarify_id_old` | Long |
| 64 | `videoConferenceFlag` | 视频会议开启状态 | `video_conference_flag` | Integer |
| 65 | `approvalFlowStatus` | 审批状态 | `approval_flow_status` | String |
| 66 | `multipleCurrentStage` | 当前招标阶段 | `multiple_current_stage` | Integer |
| 67 | `transType` | 交易类型 | `trans_type` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 |
| 68 | `openPriceStatus` | 报价单开启状态 | `open_price_status` | Integer |
| 69 | `clarifyHistoryId` | 谈判历史 | `clarify_history_id` | 986cca5c-0709-4854-942f-f51b747ee900 |
| 70 | `clarifyBidders` | 谈判供应商表体 | `` | bba56d77-1d5d-4f71-8c6a-3659c6ea7242 |
| 71 | `clarifyMaterialOffers` | 价格谈判回复表体 | `` | 9c4b20e9-c754-4080-a440-fb308a57cbdb |
| 72 | `clarifyProblemResponses` | 商务技术谈判回复表体 | `` | 18e737aa-7647-4f2b-bf2c-fd7c48974bef |
| 73 | `headdefine` | 谈判单自定义项 | `` | e6c20dd5-d20a-4123-83cc-11b9bada8348 |

---

## 关联属性（17个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `clarifyBidders` | 谈判供应商表体 | `lawbid.talks.ClarifyBidderVO` | None | true |
| 2 | `mainOrgId` | 主组织 | `org.func.BaseOrg` | Service |  |
| 3 | `headdefine` | 谈判单自定义项 | `lawbid.talks.BidClarifyDefine` | None | true |
| 4 | `billVersionId` | 版本id | `lawbid.billversion.BizBillVersion` | None |  |
| 5 | `BidClarifyDefineCharacter` | 谈判单表头自定义项 | `lawbid.talks.BidClarifyDefineCharacter` | None |  |
| 6 | `ytenant` | 租户 | `yht.tenant.YhtTenant` | Service |  |
| 7 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 8 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 9 | `scoringGroupId` | 评标组 | `lawbid.scoringgroup.ScoringGroupVO` | None |  |
| 10 | `sectionId` | 标段(包) | `lawbid.section.LawbidSection` | None |  |
| 11 | `clarifyProblemResponses` | 商务技术谈判回复表体 | `lawbid.talks.ClarifyProblemResponseVO` | None | true |
| 12 | `auditorId` | 审批人 | `base.user.User` | Service |  |
| 13 | `clarifyHistoryId` | 谈判历史 | `lawbid.clarifyhistory.CpuClarifyHistory` | None |  |
| 14 | `transType` | 交易类型 | `bd.bill.TransType` | Service |  |
| 15 | `clarifySetId` | 谈判设置 | `lawbid.clarifySet.ClarifySet` | None |  |
| 16 | `clarifyMaterialOffers` | 价格谈判回复表体 | `lawbid.talks.ClarifyMaterialOfferVO` | None | true |
| 17 | `projectId` | 招标项目 | `lawbid.project.LawbidProject` | None |  |
