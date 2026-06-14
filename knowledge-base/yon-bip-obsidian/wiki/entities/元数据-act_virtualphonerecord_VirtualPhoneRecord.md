---
tags: [BIP, 元数据, 数据字典, act.virtualphonerecord.VirtualPhoneRecord]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 通话记录 (`act.virtualphonerecord.VirtualPhoneRecord`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`gscm_csp_call` | domain：`yycrm` | 应用：`ACT` | 业务对象ID：`d900923d-2644-4c54-9ac1-c2a1995a58ce`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 通话记录 |
| 物理表 | `gscm_csp_call` |
| domain/服务域 | `yycrm` |
| schema | `crm` |
| 所属应用 | `ACT` |
| 直连字段 | 32 个 |
| 子表 | 0 个 |
| 关联引用 | 3 个 |

## 关联引用 (3个)

| 字段名 | 引用类型 |
|--------|---------|
| `ytenant_id` | `` |
| `userId` | `` |
| `tenant_id` | `` |

## 继承接口 (2个, 2字段)

- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 32 个直连字段

### 文本字段 (15个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `callId` | `callId` | `callId` | 通话id |
| `duration` | `duration` | `duration` | 录音时长 |
| `outId` | `outId` | `outId` | 业务识别号 |
| `recoDesc` | `recoDesc` | `recoDesc` | 翻译说明 |
| `recoText` | `recoText` | `recoText` | 简要翻译结果 |
| `recordUrl` | `recordUrl` | `recordUrl` | 接通录音地址 |
| `releaseCause` | `releaseCause` | `releaseCause` | 释放原因 |
| `resultDetail` | `resultDetail` | `resultDetail` | 详情翻译结果 |
| `resultDetail_summary` | `resultDetail_summary` | `resultDetailSummary` | 通话摘要 |
| `ringingRecordUrl` | `ringingRecordUrl` | `ringingRecordUrl` | 振铃录音地址 |
| `serial` | `serial` | `serial` | 翻译序列号 |
| `telA` | `telA` | `telA` | A号码 |
| `telB` | `telB` | `telB` | B号码 |
| `telX` | `telX` | `telX` | X号码 |
| `yunke_workphone_record_id` | `yunke_workphone_record_id` | `yunKeWorkPhoneRecordId` | 云客通话记录ID |

### 引用字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `userId` | `userId` | `userId` | 用户id |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 枚举字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `callStatus` | `callStatus` | `callStatus` | 通话类型 |
| `callType` | `callType` | `callType` | 呼叫类型 |
| `hangupCause` | `hangupCause` | `hangupCause` | 释放方向 |
| `recoStatus` | `recoStatus` | `recoStatus` | 翻译状态 |

### 整数 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `emotion_analysis_status` | `emotion_analysis_status` | `emotionAnalysisStatus` | 情感分析状态 |
| `emotion_result` | `emotion_result` | `emotionResult` | 情绪分析结果 |
| `sentiment_result` | `sentiment_result` | `sentimentResult` | 情感分析结果 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |

### timestamp (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `hangupTime` | `hangupTime` | `hangupTime` | 结束时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `ringingTime` | `ringingTime` | `ringingTime` | 振铃时间 |
| `startTime` | `startTime` | `startTime` | 发起时间 |
| `talkingTime` | `talkingTime` | `talkingTime` | 通话时间 |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `phone_type` | `phone_type` | `phoneType` | 电话类型 |
