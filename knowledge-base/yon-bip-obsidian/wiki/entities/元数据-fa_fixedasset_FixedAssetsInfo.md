---
tags: [BIP, 元数据, 数据字典, fa.fixedasset.FixedAssetsInfo]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 固定资产 (`fa.fixedasset.FixedAssetsInfo`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`at_fixedassets_info` | domain：`yonyoufi` | 应用：`FA` | 业务对象ID：`680ee7f1-3048-4ea4-a7e4-5d0c09bd072f`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 固定资产 |
| 物理表 | `at_fixedassets_info` |
| domain/服务域 | `yonyoufi` |
| schema | `figl` |
| 所属应用 | `FA` |
| 直连字段 | 72 个 |
| 子表 | 9 个 |
| 关联引用 | 30 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `costrecords` | `fa.fixedasset.CostRecords` | composition |
| `fixedDefines` | `fa.fixedasset.FixedAssetsInfoDefine` | composition |
| `devices` | `fa.fixedasset.Accessorydevice` | composition |
| `bodies` | `fa.fixedasset.CalculateInfo` | composition |
| `changebillrecords` | `fa.fixedasset.ChangeBillRecords` | composition |
| `headItem` | `fa.fixedasset.FixedAssetsInfoCustomItem` | composition |
| `equips` | `fa.fixedasset.EquipVO` | composition |
| `departments` | `fa.fixedasset.MoreDepartment` | composition |
| `depreciationrecords` | `fa.fixedasset.DepreciationRecord` | composition |

## 关联引用 (30个)

| 字段名 | 引用类型 |
|--------|---------|
| `periodid` | `bd_period` |
| `` | `` |
| `accpurpose` | `finbd.bd_accpurposeref` |
| `project` | `ucfbasedoc.bd_projectNewRef` |
| `accentity` | `finbd.bd_allaccbodyref_all` |
| `natCurrency` | `bd_currencytenantreflist` |
| `vendor` | `aa_vendor` |
| `addway` | `at_addwayref` |
| `usedepredept` | `ucf-org-center.bd_adminorgsharetreeref` |
| `place` | `ucf-amc-ambd.ampub_location_ref` |
| `tenant_id` | `` |
| `managedepredept` | `ucf-org-center.bd_adminorgsharetreeref` |
| `custodian` | `bd_staff_ref` |
| `changeperiodid` | `bd_period` |
| `tradetype` | `bd_transtypelistref` |
| `vendor_class` | `aa_vendorclassificationref` |
| `usagestate` | `at_usagestateref` |
| `category` | `fixed_assets_categorytreeref` |
| `user` | `bd_staff_ref` |

## 继承接口 (2个, 7字段)

- **审批信息** (`base.itf.IApprovalInfo`)
  - `audit_date` → `audit_date`
  - `` → ``
  - `` → ``
  - `audit_time` → `audit_time`
- **审批流信息** (`base.itf.IApprovalFlow`)
  - `` → ``
  - `` → ``
  - `` → ``

## 字段列表（按类型分组）

> 共 72 个直连字段

### 文本字段 (17个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pull_field_name` | `pull_field_name` | `pullfieldname` | 拉单非空字段 |
| `tagno` | `tagno` | `tagno` | 标签号 |
| `` | `auditor` | `auditor` | 审批人名称 |
| `changeperiod` | `changeperiod` | `changeperiod` | 开始折旧期间 |
| `` | `modifier` | `modifier` | 修改人名称 |
| `period` | `period` | `period` | 会计期间 |
| `usedepredeptname` | `usedepredeptname` | `usedepredeptname` | 固定资产使用部门名称 |
| `voucherstatus` | `voucherstatus` | `voucherstatus` | 凭证状态 |
| `code` | `code` | `code` | 固定资产编码 |
| `assetcode` | `assetcode` | `assetcode` | 卡片编码 |
| `fixedstatus` | `fixedstatus` | `fixedstatus` | 卡片状态 |
| `` | `creator` | `creator` | 创建人 |
| `status` | `status` | `status` | 单据状态 |
| `equipcode` | `equipcode` | `equipcode` | 资产编码 |
| `sourcetype` | `sourcetype` | `sourcetype` | 来源交易类型 |
| `sourcebillno` | `sourcebillno` | `sourcebillno` | 来源单据号 |
| `sourcecreatetype` | `sourcecreatetype` | `sourcecreatetype` | 来源建卡方式 |

### 引用字段 (21个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `vendor` | `vendor` | `vendor` | 供应商 |
| `vendor_class` | `vendor_class` | `vendorclass` | 供应商分类 |
| `` | `auditorId` | `auditorId` | 审批人 |
| `changeperiodid` | `changeperiodid` | `changeperiodid` | 开始折旧期间id |
| `` | `creatorId` | `creatorId` | 创建人 |
| `natCurrency` | `natCurrency` | `natCurrency` | 本币币种 |
| `periodid` | `periodid` | `periodid` | 会计期间id |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `accentity` | `accentity` | `accentity` | 会计主体 |
| `category` | `category` | `category` | 固定资产类别id |
| `addway` | `addway` | `addway` | 增加方式id |
| `usagestate` | `usagestate` | `usagestate` | 使用状态id |
| `usedepredept` | `usedepredept` | `usedepredept` | 使用部门id |
| `managedepredept` | `managedepredept` | `managedepredept` | 管理部门id |
| `project` | `project` | `project` | 项目id |
| `custodian` | `custodian` | `custodian` | 保管人id |
| `user` | `user` | `user` | 使用人id |
| `` | `modifierId` | `modifierId` | 修改人 |
| `accpurpose` | `accpurpose` | `accpurpose` | 核算目的 |
| `tradetype` | `tradetype` | `tradetype` | 交易类型 |
| `place` | `place` | `place` | 位置id |

### 日期字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `audit_date` | `audit_date` | `auditDate` | 审批日期 |
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |
| `` | `vouchdate` | `vouchdate` | 单据日期 |
| `begintime` | `begintime` | `begintime` | 开始使用时间 |
| `createassetdate` | `createassetdate` | `createassetdate` | 建卡日期 |

### 布尔字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `initflag` | `initflag` | `initflag` | 是否期初数据 |
| `is_right_of_use` | `is_right_of_use` | `isRightOfUse` | 是否使用权资产 |
| `moredepartment` | `moredepartment` | `moredepartment` | 是否多部门使用 |
| `` | `isWfControlled` | `isWfControlled` | 是否审批流控制 |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `amount` | `amount` | `amount` | 数量 |

### 短整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `verifystate` | `verifystate` | 审批状态 |
| `` | `returncount` | `returncount` | 退回次数 |

### 长整数 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `auditstatus` | `auditstatus` | `auditstatus` | 审批状态 |
| `` | `tplid` | `tplid` | 模板id |
| `id` | `id` | `id` | 卡片主表关联标识 |
| `categoryParentId` | `categoryParentId` | `categoryParentId` | 资产类别一级节点id |

### timestamp (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `audit_time` | `audit_time` | `auditTime` | 审批时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |

### multiLanguage (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `name` | `name` | `name` | 固定资产名称 |
| `specification` | `specification` | `specification` | 固定资产规格 |
| `assetsmodel` | `assetsmodel` | `assetsmodel` | 固定资产型号 |
| `location` | `location` | `location` | 存放地点 |

### other (9个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `bodies` | 核算信息 |
| `` | `` | `changebillrecords` | 变动单记录 |
| `` | `` | `costrecords` | 费用记录 |
| `` | `` | `departments` | 多部门 |
| `` | `` | `depreciationrecords` | 折旧清单 |
| `` | `` | `devices` | 附属设备 |
| `` | `` | `equips` | 固定资产资产卡片 |
| `` | `` | `fixedDefines` | 基本信息自由自定义项表 |
| `` | `` | `headItem` | 基本信息自定义项 |
