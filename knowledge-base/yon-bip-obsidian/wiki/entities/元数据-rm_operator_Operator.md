---
tags: [BIP, 元数据, 数据字典, rm.operator.Operator]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 店员 (`rm.operator.Operator`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`mp_storeemployee` | domain：`yxybase` | 应用：`RM` | 业务对象ID：`0adb6180-18e0-4967-940a-2fc03d5efbe7`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 店员 |
| 物理表 | `mp_storeemployee` |
| domain/服务域 | `yxybase` |
| schema | `pricecenter` |
| 所属应用 | `RM` |
| 直连字段 | 54 个 |
| 子表 | 4 个 |
| 关联引用 | 17 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `operatorRoleForImport` | `rm.operator.OperatorRoleForImport` | composition |
| `operatorStore` | `rm.operator.OperatorStore` | composition |
| `operatorDefine` | `rm.operator.OperatorDefine` | composition |
| `iQRCode` | `rm.operator.IQRCode` | composition |

## 关联引用 (17个)

| 字段名 | 引用类型 |
|--------|---------|
| `iDepartmentID` | `` |
| `ytenant_id` | `` |
| `` | `` |
| `staffId` | `ucf-staff-center.bd_staff_outer_ref` |
| `iPosition` | `ucf-staff-center.bd_positiontreeref` |
| `cPersonDefineCharacter` | `` |
| `iSuperior` | `` |
| `cYxyUserId` | `` |
| `iStoreId` | `` |
| `iCustID` | `productcenter.aa_merchantclerk` |
| `tenant_id` | `` |

## 继承接口 (8个, 12字段)

- **逻辑删除相关** (`ucfbase.ucfbaseItf.LogicDelete`)
  - `dr` → `dr`
- **U会员审计信息** (`membase.itf.IYlAuditable`)
  - `dCreateDate` → `dCreateDate`
  - `dCreateTime` → `dCreateTime`
  - `cCreator` → `cCreator`
  - `cModifier` → `cModifier`
  - `dModifyDate` → `dModifyDate`
  - `dModifyTime` → `dModifyTime`
- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **erp编码** (`base.itf.IErpCode`)
  - `erpCode` → `erpCode`
- **客户接口** (`aa.itf.ICust`)
  - `iCustID` → `iCustID`
- **客户接口** (`aa.itf.ICustAll`)
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`
- **自动编号** (`voucher.base.IAutoCode`)
  - `` → ``

## 字段列表（按类型分组）

> 共 54 个直连字段

### 文本字段 (18个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |
| `cHeadPicUrl` | `cHeadPicUrl` | `cHeadPicUrl` | 员工照片 |
| `cCode` | `cCode` | `code` | 员工编码 |
| `cCountryCode` | `cCountryCode` | `countryCode` | 区号 |
| `iStoreCode` | `iStoreCode` | `iStoreCode` | 门店编码 |
| `cOpenID` | `cOpenID` | `cOpenID` | 员工OPENID |
| `cIntro` | `cIntro` | `cIntro` | 介绍 |
| `identityType` | `identityType` | `identityType` | 身份类型 |
| `cCreator` | `cCreator` | `creator` | 创建人 |
| `cModifier` | `cModifier` | `modifier` | 修改人 |
| `cAppID` | `cAppID` | `cAppID` | 会员体系ID |
| `cCorpUserName` | `cCorpUserName` | `cCorpUserName` | 绑定操作员名称 |
| `cCalendarJson` | `cCalendarJson` | `cCalendarJson` | 计算依据 |
| `cEmail` | `cEmail` | `cEmail` | 邮箱 |
| `cPhone` | `cPhone` | `cPhone` | 联系电话 |
| `cERPcode` | `cERPcode` | `erpCode` | ERP编码 |
| `cName` | `cName` | `name` | 员工名称 |
| `yhtUserId` | `yhtUserId` | `yhtUserId` | 友户通用户ID |

### 引用字段 (12个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `iPosition` | `iPosition` | `iPosition` | 员工职位Id |
| `iSuperior` | `iSuperior` | `iSuperior` | 上级 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
| `iDepartmentID` | `iDepartmentID` | `iDepartmentID` | 部门Id |
| `iStoreId` | `iStoreId` | `iStoreId` | 商家店员所属门店 |
| `cYxyUserId` | `cYxyUserId` | `cYxyUser` | 操作员账号ID |
| `staffId` | `staffId` | `staff` | 员工主键 |
| `iCustID` | `iCustID` | `cust` | 所属客户ID |
| `staffId` | `staffId` | `merchantStaff` | 客户员工ID |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `` | `creatorId` | `creatorId` | 创建人 |
| `` | `modifierId` | `modifierId` | 修改人 |

### 日期字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dEntryTime` | `dEntryTime` | `dEntryTime` | 入职日期 |
| `dLeaveTime` | `dLeaveTime` | `dLeaveTime` | 离职日期 |
| `dCreateDate` | `dCreateDate` | `createDate` | 创建日期 |
| `dModifyDate` | `dModifyDate` | `modifyDate` | 修改日期 |

### 日期时间 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dCreateTime` | `dCreateTime` | `createTime` | 创建日期 |
| `dUpdateTime` | `dUpdateTime` | `modifyTime` | 修改日期 |

### 布尔字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `outUser` | `outUser` | `outUser` | 外部员工 |
| `bIsemployee` | `bIsemployee` | `isemployee` | 是否营业员 |
| `bIsclerk` | `bIsclerk` | `isclerk` | 是否店员 |
| `salesman` | `salesman` | `salesman` | 是否业务员 |
| `generateUser` | `generateUser` | `generateUser` | 是否创建用户 |
| `isDeleted` | `isDeleted` | `isDeleted` | 是否已删除 |

### 整数 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `iStatus` | `iStatus` | `iStatus` | 状态 |
| `iSort` | `iSort` | `iSort` | 排序号 |
| `iAuditStatus` | `iAuditStatus` | `iAuditStatus` | 审核状态 |
| `iGender` | `iGender` | `gender` | 性别 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | dr |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `iCorpUserID` | `iCorpUserID` | `iCorpUserID` | 绑定操作员id |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `ts` | `ts` | `pubts` | 时间戳 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `cPersonDefineCharacter` | `cPersonDefineCharacter` | `personDefineCharacter` | 表头自定义项特征 |

### other (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `iQRCode` | 渠道 |
| `` | `` | `operatorDefine` | 人员自由自定义项 |
| `` | `` | `operatorRoleForImport` | 角色导入辅助 |
| `` | `` | `operatorStore` | 店员所属门店 |
