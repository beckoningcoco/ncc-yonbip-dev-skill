---
tags: [BIP, metadata, hrjx, Scheme]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 考核方案 (hrjx.pmCore.Scheme)

> Platform: BIP V5 | Table: pm_scheme | Schema: yonbip-hr-pmcore

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 考核方案 |
| uri | hrjx.pmCore.Scheme |
| tableName | pm_scheme |
| domain | yonbip-hr-pmcore |
| applicationCode | HRJX-MDD |
| superUri | ucfbase.entity.BizObject |
| isBusinessObject | true |

## Key
| Role | Column |
|------|--------|
| key | id |

## Suppliers (3)

| # | Name | URI |
|---|------|-----|
| 1 | 租户接口 (ITenant) | ucfbase.ucfbaseItf.ITenant |
| 2 | 统一租户接口 (IYTenant) | ucfbase.ucfbaseItf.IYTenant |
| 3 | 审计信息 (IAuditInfo) | ucfbase.ucfbaseItf.IAuditInfo |

---

## All Fields (47)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | schemename | 考核方案 | schemename | text | String |  |  | isName,nullable |
| 2 | periodid | 绩效周期 | periodid | text | String |  |  | nullable |
| 3 | periodcode | 绩效值 | periodcode | text | String |  |  | nullable |
| 4 | applyobj | 适用对象 | applyobj | int | Integer |  |  | nullable |
| 5 | schemestate | 状态 | schemestate | int | Integer |  |  | nullable |
| 6 | fdate | 开始日期 | fdate | timestamp | Timestamp |  |  | nullable |
| 7 | tdate | 截止 | tdate | timestamp | Timestamp |  |  | nullable |
| 8 | orgid | 所属组织 | orgid | text | String |  |  | nullable |
| 9 | remark | 方案说明 | remark | text | String |  |  | nullable |
| 10 | templateid | 20220820添加考核方案模板id | templateid | text | String |  |  | nullable |
| 11 | scoreruleid | 评分规则id | scoreruleid | text | String |  |  | nullable |
| 12 | gradeid | 考核结果等级id | gradeid | text | String |  |  | nullable |
| 13 | scoreway | 总分汇总规则 | scoreway | int | Integer |  |  | nullable |
| 14 | viewresults | 查看结果选项 | viewresults | int | Integer |  |  | nullable |
| 15 | abstentionmode | 弃权处理方式 | abstentionmode | int | Integer |  |  | nullable |
| 16 | agentschemeid | 代理人方案id | agentschemeid | text | String |  |  | nullable |
| 17 | copyagentschemeid | 方案启动后复制的代理人方案id | copyagentschemeid | text | String |  |  | nullable |
| 18 | indisource | 指标来源 | indisource | int | Integer |  |  | nullable |
| 19 | schememode | 方案类型 | schememode | int | Integer |  |  | nullable |
| 20 | isentryresult | 是否支持考核结果录入 | isentryresult | int | Integer |  |  | nullable |
| 21 | isresultaudited | 考核结果需要审核 | isresultaudited | int | Integer |  |  | nullable |
| 22 | isresultconfirm | 是否需要员工确认 | isresultconfirm | int | Integer |  |  | nullable |
| 23 | isallowmtr | 是否允许创建中期回顾 | isallowmtr | int | Integer |  |  | nullable |
| 24 | isturn | 按轮次顺序打分 | isturn | int | Integer |  |  | nullable |
| 25 | ismergemsg | 前面多人时只收到最后一条消息 | ismergemsg | int | Integer |  |  | nullable |
| 26 | isdoubleweight | 按指标分类、指标两级设置权重 | isdoubleweight | int | Integer |  |  | nullable |
| 27 | ismodifyappr | 是否允许考核对象修改指标考核流程 | ismodifyappr | int | Integer |  |  | nullable |
| 28 | isshowappr | 是否显示评分人 | isshowappr | int | Integer |  |  | nullable |
| 29 | isindiassign | 是否支持指标指派 | isindiassign | int | Integer |  |  | nullable |
| 30 | isallowfillup | 允许员工填报 | isallowfillup | int | Integer |  |  | nullable |
| 31 | indiconfirm | 指标需确认 | indiconfirm | int | Integer |  |  | nullable |
| 32 | indiaudit | 指标需审核 | indiaudit | int | Integer |  |  | nullable |
| 33 | isallowcalc | 是否支持指标评分 | isallowcalc | int | Integer |  |  | nullable |
| 34 | distid | 强制分布id | distid | quote | hrjx.pmCore.Distribution |  |  | nullable |
| 35 | issyncstaff | 是否同步人员子集 | issyncstaff | int | Integer |  |  | nullable |
| 36 | tagid | 标签id | tagid | text | String |  |  | nullable |
| 37 | pdate | 方案发布时间,发布时写入 | pdate | timestamp | Timestamp |  |  | nullable,uiHide |
| 38 | isend | 是否方案已结束 | isend | int | Integer |  |  | nullable |
| 39 | schemecode | 考核方案编码 | schemecode | text | String |  |  | isCode,nullable |
| 40 | creator | 创建人 | creator | quote | base.user.BipUser |  |  | nullable |
| 41 | createTime | 创建时间 | creationtime | timestamp | Timestamp |  |  | nullable,uiHide |
| 42 | modifier | 更新人id | modifier | quote | base.user.BipUser |  |  | nullable |
| 43 | modifyTime | 更新时间 | modifiedtime | timestamp | Timestamp |  |  | nullable,uiHide |
| 44 | id | ID | id | text | String |  |  | nullable,REF.ID,uiHide |
| 45 | pubts | 时间戳 | ts | timestamp | Timestamp |  |  | nullable,uiHide,isSyncKey |
| 46 | tenant | 租户id | tenantid | text | String |  | Y | nullable,uiHide |
| 47 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant | Y | Y | notGenerate,nullable,uiHide |

---

## Reference Fields (4)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | distid | 强制分布id | distid | hrjx.pmCore.Distribution |
| 2 | creator | 创建人 | creator | base.user.BipUser |
| 3 | modifier | 更新人id | modifier | base.user.BipUser |
| 4 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |
