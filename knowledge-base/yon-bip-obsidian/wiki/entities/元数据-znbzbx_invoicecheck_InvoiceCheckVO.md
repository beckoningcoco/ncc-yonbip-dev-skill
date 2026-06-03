---
tags: [BIP, 元数据, 数据字典, znbzbx.invoicecheck.InvoiceCheckVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 发票查验结果表 (`znbzbx.invoicecheck.InvoiceCheckVO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`znbz_invoicecheck` | domain：`znbzbx` | 应用：`RBSM` | 业务对象ID：`7f58b255-71c2-4e5e-b9ed-acf8068db121`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 发票查验结果表 |
| 物理表 | `znbz_invoicecheck` |
| 数据库 schema | `znbzbx` |
| 所属应用 | `RBSM` |
| 直连字段 | 60 个 |
| 子表 | 1 个 |
| 关联引用 | 7 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `InvoiceCheckBVO` | `znbzbx.invoicecheck.InvoiceCheckBVO` | composition |

## 关联引用 (7个)

| 字段名 | 引用类型 |
|--------|---------|
| `` | `` |
| `cfinaceorg` | `` |
| `ytenant_id` | `` |
| `tenant_id` | `` |

## 继承接口 (3个, 13字段)

- **审计信息** (`base.itf.IAuditInfo`)
  - `create_date` → `create_date`
  - `create_time` → `create_time`
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `modify_date` → `modify_date`
  - `modify_time` → `modify_time`
- **审批信息** (`base.itf.IApprovalInfo`)
  - `audit_date` → `audit_date`
  - `` → ``
  - `` → ``
  - `audit_time` → `audit_time`
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 60 个直连字段

### 文本字段 (29个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `auditor` | `auditor` | 审批人名称 |
| `checkdata` | `checkdata` | `checkdata` | 查验数据 |
| `` | `code` | `code` | 编码 |
| `` | `creator` | `creator` | 创建人名称 |
| `decodedata` | `decodedata` | `decodedata` | 解密数据 |
| `` | `modifier` | `modifier` | 修改人名称 |
| `pk_corp` | `pk_corp` | `pk_corp` | 公司 |
| `tspz` | `tspz` | `tspz` | 特定业务类型 |
| `vcheckcode` | `vcheckcode` | `vcheckcode` | 发票校验码 |
| `vcheckername` | `vcheckername` | `vcheckername` | 复核人名称 |
| `vcheckstatus` | `vcheckstatus` | `vcheckstatus` | 查验状态 |
| `vcustaddrphone` | `vcustaddrphone` | `vcustaddrphone` | 购买方地址电话 |
| `vcustbankaccount` | `vcustbankaccount` | `vcustbankaccount` | 购买方银行账户 |
| `vcustname` | `vcustname` | `vcustname` | 购买方名称 |
| `vcusttaxpayerid` | `vcusttaxpayerid` | `vcusttaxpayerid` | 购买方纳税人识别号 |
| `vdrawername` | `vdrawername` | `vdrawername` | 开票人名称 |
| `vencryption` | `vencryption` | `vencryption` | 发票密文 |
| `vinvoicecode` | `vinvoicecode` | `vinvoicecode` | 发票代码 |
| `vinvoiceno` | `vinvoiceno` | `vinvoiceno` | 发票号码 |
| `vinvoicetypename` | `vinvoicetypename` | `vinvoicetypename` | 发票类型名称 |
| `vmachinecode` | `vmachinecode` | `vmachinecode` | 机器编号 |
| `vmemo` | `vmemo` | `vmemo` | 备注 |
| `vpayeename` | `vpayeename` | `vpayeename` | 收款人名称 |
| `vrule` | `vrule` | `vrule` | 解密规则 |
| `vselladdrphone` | `vselladdrphone` | `vselladdrphone` | 销售方地址电话 |
| `vsellbankaccount` | `vsellbankaccount` | `vsellbankaccount` | 销售方银行账户 |
| `vsellname` | `vsellname` | `vsellname` | 销售方名称 |
| `vselltaxpayerid` | `vselltaxpayerid` | `vselltaxpayerid` | 销售纳税人识别号 |
| `vsubmittername` | `vsubmittername` | `vsubmittername` | 提交人名称 |

### 引用字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `auditorId` | `auditorId` | 审批人 |
| `cfinaceorg` | `cfinaceorg` | `cfinaceorg` | 业务单元 |
| `` | `creatorId` | `creatorId` | 创建人 |
| `` | `modifierId` | `modifierId` | 修改人 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 日期字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `audit_date` | `audit_date` | `auditDate` | 审批日期 |
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `dcheckdate` | `dcheckdate` | `dcheckdate` | 查验时间 |
| `dopendate` | `dopendate` | `dopendate` | 开票日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |
| `` | `vouchdate` | `vouchdate` | 单据日期 |

### 布尔字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `isdelete` | `isdelete` | `isdelete` | 是否作废 |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `checkcount` | `checkcount` | `checkcount` | 查验次数 |

### 短整数 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `iinvoiceformtype` | `iinvoiceformtype` | `iinvoiceformtype` | 发票来源类型 |
| `iinvoicemedia` | `iinvoicemedia` | `iinvoicemedia` | 发票介质 |
| `iinvoicetype` | `iinvoicetype` | `iinvoicetype` | 发票类型 |
| `` | `status` | `status` | 单据状态 |

### 长整数 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `cvendorid` | `cvendorid` | `cvendorid` | 客商基本id |
| `id` | `id` | `id` | ID |
| `pk_checkman` | `pk_checkman` | `pk_checkman` | 查验人 |
| `pk_expensebill` | `pk_expensebill` | `pk_expensebill` | 报销单表头 |
| `pk_tallydata` | `pk_tallydata` | `pk_tallydata` | 来源票据pk |
| `` | `tplid` | `tplid` | 模板id |

### 数值字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `nmny` | `nmny` | `nmny` | 金额 |
| `ntaxmny` | `ntaxmny` | `ntaxmny` | 税额 |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `InvoiceCheckBVO` | 发票查验结果子表 |

### timestamp (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `audit_time` | `audit_time` | `auditTime` | 审批时间 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
