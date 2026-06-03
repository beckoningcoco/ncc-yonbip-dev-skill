---
tags: [BIP, 元数据, 数据字典, znbzbx.intransexpwithholding.InTransExpWithHoldingVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 费用预提处理 (`znbzbx.intransexpwithholding.InTransExpWithHoldingVO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`znbz_intransexpwithholding` | domain：`znbzbx` | 应用：`RBSM` | 业务对象ID：`9278c490-06a5-4b44-bb0c-ebe441551ce9`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 费用预提处理 |
| 物理表 | `znbz_intransexpwithholding` |
| 数据库 schema | `znbzbx` |
| 所属应用 | `RBSM` |
| 直连字段 | 75 个 |
| 子表 | 4 个 |
| 关联引用 | 24 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `InTransExpWithHoldingDetailVO` | `znbzbx.intransexpwithholding.InTransExpWithHoldingDetailVO` | composition |
| `InTransExpWithHoldingBusiVO` | `znbzbx.intransexpwithholding.InTransExpWithHoldingBusiVO` | composition |
| `InTransExpWithHoldingUserdefVO` | `znbzbx.intransexpwithholding.InTransExpWithHoldingUserdefVO` | composition |
| `inTransExpWithHoldingBusimemoVO` | `znbzbx.intransexpwithholding.InTransExpWithHoldingBusimemoVO` | composition |

## 关联引用 (24个)

| 字段名 | 引用类型 |
|--------|---------|
| `chandleorg` | `ucf-org-center.org_unit_tree_ref` |
| `vhandledeptid` | `ucf-org-center.bd_admindepttreeviewref` |
| `pk_dutyrank` | `ucf-staff-center.bd_rankref` |
| `` | `` |
| `ytenant_id` | `` |
| `intransexpwithholdingDcs` | `` |
| `vfinacedeptid` | `ucf-org-center.bd_admindepttreeviewref` |
| `bustype` | `bd_billtyperef` |
| `cfinacecostcenter` | `finbd.bd_costcenterref` |
| `chandlecostcenter` | `finbd.bd_costcenterref` |
| `profitcenter` | `finbd.bd_allaccbodyref_inner` |
| `caccountorg` | `ucf-org-center.bd_financeorgtreeref` |
| `cfinaceorg` | `ucf-org-center.org_unit_tree_ref` |
| `vnatcurrency` | `ucfbasedoc.bd_currencytenantref` |
| `pk_handlepsn` | `ucf-staff-center.bd_staff_ref` |
| `pk_dutypost` | `ucf-staff-center.bd_positiontreeref` |
| `tenant_id` | `` |
| `pk_dutyjob` | `ucf-staff-center.bd_duty` |

## 继承接口 (5个, 17字段)

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
- **审批流信息** (`base.itf.IApprovalFlow`)
  - `` → ``
  - `` → ``
  - `` → ``
- **条形码** (`ucfbase.ucfbaseItf.IBarCode`)
  - `bar_code` → `bar_code`
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 75 个直连字段

### 文本字段 (21个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `code` | `code` | 批次号 |
| `pk_billtype` | `pk_billtype` | `pk_billtype` | 单据类型 |
| `vdescription` | `vdescription` | `vdescription` | 预提说明 |
| `vmemo` | `vmemo` | `vmemo` | 备注 |
| `bar_code` | `bar_code` | `barCode` | 条形码 |
| `vattachmentass` | `vattachmentass` | `vattachmentass` | 单据附件id |
| `thirdsysflag` | `thirdsysflag` | `thirdsysflag` | 第三方系统标识 |
| `thirdsysbill` | `thirdsysbill` | `thirdsysbill` | 第三方系统单据ID |
| `` | `creator` | `creator` | 创建人 |
| `` | `modifier` | `modifier` | 修改人 |
| `` | `auditor` | `auditor` | 审批人 |
| `vdef1` | `vdef1` | `vdef1` | 自定义项1 |
| `vdef2` | `vdef2` | `vdef2` | 自定义项2 |
| `vdef3` | `vdef3` | `vdef3` | 自定义项3 |
| `vdef4` | `vdef4` | `vdef4` | 自定义项4 |
| `vdef5` | `vdef5` | `vdef5` | 自定义项5 |
| `vdef6` | `vdef6` | `vdef6` | 自定义项6 |
| `vdef7` | `vdef7` | `vdef7` | 自定义项7 |
| `vdef8` | `vdef8` | `vdef8` | 自定义项8 |
| `vdef9` | `vdef9` | `vdef9` | 自定义项9 |
| `vdef10` | `vdef10` | `vdef10` | 自定义项10 |

### 引用字段 (19个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bustype` | `bustype` | `bustype` | 交易类型 |
| `pk_handlepsn` | `pk_handlepsn` | `pk_handlepsn` | 经办人 |
| `vhandledeptid` | `vhandledeptid` | `vhandledeptid` | 经办人部门 |
| `chandleorg` | `chandleorg` | `chandleorg` | 经办人组织 |
| `chandlecostcenter` | `chandlecostcenter` | `chandlecostcenter` | 经办人成本中心 |
| `vfinacedeptid` | `vfinacedeptid` | `vfinacedeptid` | 费用承担部门 |
| `cfinaceorg` | `cfinaceorg` | `cfinaceorg` | 费用承担组织 |
| `cfinacecostcenter` | `cfinacecostcenter` | `cfinacecostcenter` | 费用承担成本中心 |
| `caccountorg` | `caccountorg` | `caccountorg` | 会计主体 |
| `profitcenter` | `profitcenter` | `profitcenter` | 利润中心 |
| `pk_dutyjob` | `pk_dutyjob` | `pk_dutyjob` | 职务 |
| `pk_dutypost` | `pk_dutypost` | `pk_dutypost` | 岗位 |
| `pk_dutyrank` | `pk_dutyrank` | `pk_dutyrank` | 职级 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `vnatcurrency` | `vnatcurrency` | `vnatcurrency` | 组织本币 |
| `` | `creatorId` | `creatorId` | 创建人id |
| `` | `modifierId` | `modifierId` | 修改人id |
| `` | `auditorId` | `auditorId` | 审批人ID |

### 日期字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `vouchdate` | `vouchdate` | 预提日期 |
| `redcavdate` | `redcavdate` | `redcavdate` | 预提红冲日期 |
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |
| `audit_date` | `audit_date` | `auditDate` | 审批日期 |

### 布尔字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `ismulticurrency` | `ismulticurrency` | `ismulticurrency` | 是否多币种 |
| `` | `isWfControlled` | `isWfControlled` | 是否审批流控制 |

### 整数 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `redcavrule` | `redcavrule` | `redcavrule` | 预提红冲规则 |
| `processrule` | `processrule` | `processrule` | 预提流程规则 |
| `makebillrule` | `makebillrule` | `makebillrule` | 预提生单规则 |
| `imakebilltype` | `imakebilltype` | `imakebilltype` | 单据生成方式 |

### 短整数 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `status` | `status` | 单据状态 |
| `billstatus` | `billstatus` | `billstatus` | 状态 |
| `irejectstatus` | `irejectstatus` | `irejectstatus` | 驳回状态 |
| `` | `verifystate` | `verifystate` | 审批状态 |
| `` | `returncount` | `returncount` | 退回次数 |

### 长整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `tplid` | `tplid` | 模板id |
| `id` | `id` | `id` | ID |

### 数值字段 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `nnatwithholdingmny` | `nnatwithholdingmny` | `nnatwithholdingmny` | 预提总额 |
| `nnatredcavmny` | `nnatredcavmny` | `nnatredcavmny` | 已红冲 |
| `nnatunredcavmny` | `nnatunredcavmny` | `nnatunredcavmny` | 未红冲 |
| `ndefnum1` | `ndefnum1` | `ndefnum1` | 自定义项(小数)1 |
| `ndefnum2` | `ndefnum2` | `ndefnum2` | 自定义项(小数)2 |
| `ndefnum3` | `ndefnum3` | `ndefnum3` | 自定义项(小数)3 |
| `ndefnum4` | `ndefnum4` | `ndefnum4` | 自定义项(小数)4 |
| `ndefnum5` | `ndefnum5` | `ndefnum5` | 自定义项(小数)5 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `intransexpwithholdingDcs` | `intransexpwithholdingDcs` | `intransexpwithholdingDcs` | 费用预提处理自定义项 |

### timestamp (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `audit_time` | `audit_time` | `auditTime` | 审批时间 |

### other (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `InTransExpWithHoldingBusiVO` | 业务数据 |
| `` | `` | `InTransExpWithHoldingDetailVO` | 预提详情 |
| `` | `` | `InTransExpWithHoldingUserdefVO` | 费用预提处理主表（自定义项）表 |
| `` | `` | `inTransExpWithHoldingBusimemoVO` | 费用预提处理费用项目 |
