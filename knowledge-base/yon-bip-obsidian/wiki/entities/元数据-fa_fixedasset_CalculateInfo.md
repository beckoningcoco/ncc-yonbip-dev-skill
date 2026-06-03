---
tags: [BIP, 元数据, 数据字典, fa.fixedasset.CalculateInfo]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 核算信息 (`fa.fixedasset.CalculateInfo`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`at_calculate_info` | domain：`yonyoufi` | 应用：`FA` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 核算信息 |
| 物理表 | `at_calculate_info` |
| 数据库 schema | `yonyoufi` |
| 所属应用 | `FA` |
| 直连字段 | 69 个 |
| 子表 | 2 个 |
| 关联引用 | 12 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `bodyItem` | `fa.fixedasset.CalculateInfoCustomItem` | composition |
| `bodyDefines` | `fa.fixedasset.CalculateInfoDefine` | composition |

## 关联引用 (12个)

| 字段名 | 引用类型 |
|--------|---------|
| `exchangeratetype` | `ucfbasedoc.bd_exchangeratetyperef` |
| `periodid` | `bd_period` |
| `busiaccbook` | `fiepub.fiepub_accountbookref` |
| `` | `` |
| `natCurrency` | `bd_currencytenantreflist` |
| `fixedassetsinfo` | `` |
| `depreciationmethod` | `at_depreciation_methodlistref` |
| `currency` | `bd_currencytenantreflist` |
| `accentity` | `bd_accbody` |
| `tenant_id` | `` |

## 继承接口 (4个, 15字段)

- **审批信息** (`base.itf.IApprovalInfo`)
  - `audit_date` → `audit_date`
  - `` → ``
  - `` → ``
  - `audit_time` → `audit_time`
- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **审批流信息** (`base.itf.IApprovalFlow`)
  - `` → ``
  - `` → ``
  - `` → ``
- **生单回写字符型** (`base.itf.IBackWriteStr`)
  - `groupTaskKey` → `groupTaskKey`
  - `makerule_code` → `makerule_code`
  - `` → ``
  - `` → ``
  - `` → ``
  - `sourceMainPubts` → `sourceMainPubts`
  - `` → ``

## 字段列表（按类型分组）

> 共 69 个直连字段

### 文本字段 (12个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `groupTaskKey` | `groupTaskKey` | `groupTaskKey` | 分组任务KEY |
| `` | `upcode` | `upcode` | 上游单据号 |
| `voucherid` | `voucherid` | `voucherid` | 凭证id |
| `period` | `period` | `period` | 会计期间 |
| `depreciationMethodPath` | `depreciationMethodPath` | `depreciationMethodPath` | 折旧方法路径值 |
| `voucherstatus` | `voucherstatus` | `voucherstatus` | 凭证状态 |
| `` | `auditor` | `auditor` | 审批人 |
| `depreciationstatus` | `depreciationstatus` | `depreciationstatus` | 折旧状态 |
| `` | `sourceid` | `sourceid` | 上游单据主表id |
| `` | `sourceautoid` | `sourceautoid` | 上游单据子表id |
| `` | `source` | `source` | 上游单据类型 |
| `makerule_code` | `makerule_code` | `makeRuleCode` | 生单规则编号 |

### 引用字段 (10个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `accentity` | `accentity` | `accentity` | 会计主体 |
| `` | `auditorId` | `auditorId` | 审批人 |
| `periodid` | `periodid` | `periodid` | 会计期间id |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `fixedassetsinfo` | `fixedassetsinfo` | `fixedassetsinfo` | 卡片主表关联标识 |
| `depreciationmethod` | `depreciationmethod` | `depreciationmethod` | 折旧方法 |
| `currency` | `currency` | `currency` | 币种 |
| `natCurrency` | `natCurrency` | `natCurrency` | 本币币种id |
| `busiaccbook` | `busiaccbook` | `busiaccbook` | 账簿 |
| `exchangeratetype` | `exchangeratetype` | `exchangeRateType` | 汇率类型id |

### 日期字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `audit_date` | `audit_date` | `auditDate` | 审批日期 |

### 布尔字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `depreciationedflag` | `depreciationedflag` | `depreciationedflag` | 卡片是否折旧标识 |
| `` | `isWfControlled` | `isWfControlled` | 是否审批流控制 |
| `monthdepreciation` | `monthdepreciation` | `monthdepreciation` | 当月是否计提折旧 |
| `initflag` | `initflag` | `initflag` | 期初标志 |

### 整数 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `doubleperiod` | `doubleperiod` | `doubleperiod` | 双倍计数器 |
| `sumyearperiod` | `sumyearperiod` | `sumyearperiod` | 年数总和计数器 |
| `lifemonth` | `lifemonth` | `lifemonth` | 使用月限 |
| `extractedperiod` | `extractedperiod` | `extractedperiod` | 已计提期数 |
| `backamount` | `backamount` | `backamount` | 回写数量 |

### 短整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `returncount` | `returncount` | 退回次数 |
| `` | `verifystate` | `verifystate` | 审批状态 |

### 长整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |
| `auditstatus` | `auditstatus` | `auditstatus` | 审批状态 |

### 数值字段 (27个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `doubleBeforelinevalue` | `doubleBeforelinevalue` | `doubleBeforelinevalue` | 双倍余额2直线对比价值 |
| `doublelinevalue` | `doublelinevalue` | `doublelinevalue` | 双倍余额进入直线累计折旧价值 |
| `halfadd` | `halfadd` | `halfadd` | 五五摊销原值增加 |
| `initdepreciation` | `initdepreciation` | `initdepreciation` | 累计折旧初始值 |
| `lastmonthdepreciationrate` | `lastmonthdepreciationrate` | `lastmonthdepreciationrate` | 上月计提折旧率 |
| `lastmonthdepreciationvalue` | `lastmonthdepreciationvalue` | `lastmonthdepreciationvalue` | 月计提折旧额 |
| `yearbeginvalue` | `yearbeginvalue` | `yearbeginvalue` | 双倍年初折余价值 |
| `yeardepreciation` | `yeardepreciation` | `yeardepreciation` | 年计提折旧额 |
| `fcoriginalvalue` | `fcoriginalvalue` | `fcoriginalvalue` | 原值 |
| `scrapvalue` | `scrapvalue` | `scrapvalue` | 净残值 |
| `scrapvaluerate` | `scrapvaluerate` | `scrapvaluerate` | 净残值率(%) |
| `netvalue` | `netvalue` | `netvalue` | 净值 |
| `exchangerate` | `exchangerate` | `exchangerate` | 汇率 |
| `accruedoriginalvalue` | `accruedoriginalvalue` | `accruedoriginalvalue` | 本币原值 |
| `depreciation` | `depreciation` | `depreciation` | 累计折旧 |
| `monthdepreciationrate` | `monthdepreciationrate` | `monthdepreciationrate` | 月折旧率 |
| `monthdepreciationvalue` | `monthdepreciationvalue` | `monthdepreciationvalue` | 月折旧额 |
| `impairment` | `impairment` | `impairment` | 减值准备 |
| `addedtax` | `addedtax` | `addedtax` | 增值税 |
| `taxrate` | `taxrate` | `taxrate` | 税率(%) |
| `totalworkload` | `totalworkload` | `totalworkload` | 工作总量 |
| `existingworkload` | `existingworkload` | `existingworkload` | 累计工作量 |
| `monthworkload` | `monthworkload` | `monthworkload` | 月工作量 |
| `unitdepreciation` | `unitdepreciation` | `unitdepreciation` | 单位折旧 |
| `netamount` | `netamount` | `netamount` | 净额 |
| `sumyeardeprevalue` | `sumyeardeprevalue` | `sumyeardeprevalue` | 年数总和累计折旧价值 |
| `residualworkload` | `residualworkload` | `residualworkload` | 剩余工作量 |

### timestamp (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `sourceMainPubts` | `sourceMainPubts` | `sourceMainPubts` | 时间戳 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `audit_time` | `audit_time` | `auditTime` | 审核时间 |

### multiLanguage (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `workloadunit` | `workloadunit` | `workloadunit` | 工作量单位 |

### other (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `bodyDefines` | 核算信息自由自定义项 |
| `` | `` | `bodyItem` | 核算信息自定义项 |
