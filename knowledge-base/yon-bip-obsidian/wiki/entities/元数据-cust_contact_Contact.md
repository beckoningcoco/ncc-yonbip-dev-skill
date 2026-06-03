---
tags: [BIP, 元数据, 数据字典, cust.contact.Contact]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 联系人 (`cust.contact.Contact`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`cust_contact` | domain：`yycrm` | 应用：`CUST` | 业务对象ID：`47610aa2-e001-4254-b43c-1bcb65272a2a`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 联系人 |
| 物理表 | `cust_contact` |
| 数据库 schema | `yycrm` |
| 所属应用 | `CUST` |
| 直连字段 | 82 个 |
| 子表 | 4 个 |
| 关联引用 | 33 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `contactRelatedObjList` | `cust.contact.ContactRelatedObj` | composition |
| `contactDefList` | `cust.contact.ContactDef` | composition |
| `contactParticipantList` | `cust.contact.ContactParticipant` | composition |
| `contactImageList` | `cust.contact.ContactImage` | composition |

## 关联引用 (33个)

| 字段名 | 引用类型 |
|--------|---------|
| `superiorcontact` | `yycrm.cust_contactref` |
| `cCountry` | `ucfbasedoc.bd_countryref` |
| `latestFollower` | `` |
| `role` | `yycrm.crmc_custdocref` |
| `` | `` |
| `contacttype` | `yycrm.crmc_custdocref` |
| `source_clue` | `` |
| `follow_id` | `` |
| `oppt_id` | `` |
| `clue_id` | `yycrm.sfa_clueref` |
| `tenant_id` | `` |
| `customer_dept` | `` |
| `ower` | `ucf-staff-center.bd_staff_ref` |
| `marketing_personnel_id` | `` |
| `org` | `ucf-org-center.bd_salesorg` |
| `ytenant_id` | `` |
| `processStage_id` | `` |
| `salearea` | `productcenter.aa_salearearef` |
| `terminal` | `yxybase.aa_store` |
| `dept` | `ucf-org-center.bd_adminorgsharetreeref` |
| `contactDefineCharacter` | `` |
| `partner_person` | `ucf-staff-center.bd_staff_ref` |
| `action_id` | `` |
| `partner_dept` | `` |
| `iCustID` | `yycrm.cust_customerref` |
| `task_id` | `` |
| `attitude` | `yycrm.crmc_custdocref` |
| `customer` | `yycrm.cust_customerref` |

## 继承接口 (6个, 17字段)

- **审计信息** (`base.itf.IAuditInfo`)
  - `create_date` → `create_date`
  - `create_time` → `create_time`
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `modify_date` → `modify_date`
  - `modify_time` → `modify_time`
- **数字营销数据权限** (`crmc.base.IDataPermissions`)
  - `dept` → `dept`
  - `org` → `org`
  - `ower` → `ower`
  - `salearea` → `salearea`
- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **停用信息** (`base.itf.IStopping`)
  - `stopstatus` → `stopstatus`
  - `stop_time` → `stop_time`
- **自动编号** (`voucher.base.IAutoCode`)
  - `` → ``
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 82 个直连字段

### 文本字段 (31个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `code` | `code` | `code` | 联系人编码 |
| `cArea` | `cArea` | `area` | 区 |
| `cCity` | `cCity` | `city` | 市 |
| `area_code_mobile` | `area_code_mobile` | `areaCodeMobile` | 手机号 |
| `yunke_contact_id` | `yunke_contact_id` | `yunKeContactId` | 云客联系人ID |
| `latestfollowContext` | `latestfollowContext` | `latestfollowContext` | 最近跟进内容 |
| `photo` | `photo` | `photo` | 头像 |
| `cProvince` | `cProvince` | `province` | 省 |
| `cRegion` | `cRegion` | `region` | 所在地区 |
| `yhtUserId` | `yhtUserId` | `yhtUserId` | 伙伴用户id |
| `telephone` | `telephone` | `telephone` | 备用手机号 |
| `phone` | `phone` | `phone` | 电话 |
| `email` | `email` | `email` | 邮箱 |
| `qq` | `qq` | `qq` | QQ |
| `wechat` | `wechat` | `weChat` | 微信 |
| `hobby` | `hobby` | `hobby` | 兴趣爱好 |
| `memo` | `memo` | `memo` | 备注 |
| `timenotfollowedup` | `timenotfollowedup` | `timeNotFollowedUp` | 未跟进时长 |
| `cRegionCode` | `cRegionCode` | `regionCode` | 注册地区 |
| `address` | `address` | `address` | 家庭地址 |
| `workdept` | `workdept` | `workDept` | 任职部门 |
| `job` | `job` | `job` | 职务 |
| `remarks` | `remarks` | `remarks` | 备注 |
| `` | `creator` | `creator` | 创建人 |
| `` | `modifier` | `modifier` | 修改人 |
| `picture_1` | `picture_1` | `picture1` | 照片1 |
| `largeText1` | `largeText1` | `largeText1` | 大字段1 |
| `largeText4` | `largeText4` | `largeText4` | 大字段4 |
| `largeText2` | `largeText2` | `largeText2` | 大字段2 |
| `largeText3` | `largeText3` | `largeText3` | 大字段3 |
| `largeText5` | `largeText5` | `largeText5` | 大字段5 |

### 引用字段 (28个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `marketing_personnel_id` | `marketing_personnel_id` | `marketingPersonnel` | 营销人员ID |
| `latestFollower` | `latestFollower` | `latestFollower` | 最近跟进人 |
| `customer_dept` | `customer_dept` | `customerDept` | 客户部门 |
| `partner_dept` | `partner_dept` | `partnerDept` | 伙伴部门 |
| `follow_id` | `follow_id` | `followId` | 跟进记录 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
| `` | `modifierId` | `modifierId` | 修改人 |
| `source_clue` | `source_clue` | `sourceClue` | 来源线索 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `customer` | `customer` | `customer` | 客户ID |
| `contacttype` | `contacttype` | `contactType` | 联系人分类ID |
| `` | `creatorId` | `creatorId` | 创建人 |
| `superiorcontact` | `superiorcontact` | `superiorContact` | 上级联系人ID |
| `terminal` | `terminal` | `terminal` | 终端ID |
| `cCountry` | `cCountry` | `country` | 国家id |
| `role` | `role` | `role` | 角色ID |
| `attitude` | `attitude` | `attitude` | 态度ID |
| `org` | `org` | `org` | 销售组织ID |
| `salearea` | `salearea` | `saleArea` | 销售区域ID |
| `dept` | `dept` | `dept` | 部门ID |
| `ower` | `ower` | `ower` | 负责人 |
| `task_id` | `task_id` | `taskId` | 任务 |
| `action_id` | `action_id` | `actionId` | 行动 |
| `oppt_id` | `oppt_id` | `oppt` | 商机 |
| `processStage_id` | `processStage_id` | `processStage` | 商机阶段 |
| `clue_id` | `clue_id` | `clue` | 线索 |
| `iCustID` | `iCustID` | `cust` | 伙伴ID |
| `partner_person` | `partner_person` | `partnerPerson` | 伙伴负责人ID |

### 日期字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |

### 布尔字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `stopstatus` | `stopstatus` | `stopstatus` | 停用状态 |
| `isDefault` | `isDefault` | `isDefault` | 默认联系人 |
| `isremind` | `isremind` | `isremind` | 生日提醒 |

### 枚举字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `syn_status_for_yunke` | `syn_status_for_yunke` | `synStatusForYunke` | 同步状态 |
| `gender` | `gender` | `gender` | 性别 |
| `contactUser` | `contactUser` | `contactUser` | 关联状态 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |

### 数值字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `iLNG` | `iLNG` | `longitude` | 经度 |
| `iLAT` | `iLAT` | `latitude` | 纬度 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `contactDefineCharacter` | `contactDefineCharacter` | `contactDefineCharacter` | 联系人自定义项特征属性组 |

### timestamp (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `stop_time` | `stop_time` | `stoptime` | 停用时间 |
| `birthday` | `birthday` | `birthday` | 生日 |
| `latestfollowuptime` | `latestfollowuptime` | `latestFollowUpTime` | 最近跟进时间 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### multiLanguage (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `name` | `name` | `name` | 姓名 |

### other (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `contactDefList` | 联系人主表自定义项 |
| `` | `` | `contactImageList` | 证照证书图片 |
| `` | `` | `contactParticipantList` | 联系人参与人 |
| `` | `` | `contactRelatedObjList` | 关联对象 |
