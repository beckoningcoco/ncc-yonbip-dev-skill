---
tags: [BIP, 元数据, 数据字典, sfa.clue.Clue]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 线索 (`sfa.clue.Clue`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`sfa_clue` | domain：`yycrm` | 应用：`SFA` | 业务对象ID：`caf062ca-5736-4cc1-8892-0a67098b18ee`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 线索 |
| 物理表 | `sfa_clue` |
| domain/服务域 | `yycrm` |
| schema | `crm` |
| 所属应用 | `SFA` |
| 直连字段 | 133 个 |
| 子表 | 5 个 |
| 关联引用 | 53 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `subList` | `sfa.clue.ClueSub` | composition |
| `headDef` | `sfa.clue.ClueDef` | composition |
| `highseasBusi` | `sfa.clue.ClueHighSeasTrace` | composition |
| `authDimensionList` | `sfa.clue.AuthBusiobjectDimensionClue` | composition |
| `clueParticipantList` | `sfa.clue.ClueParticipant` | composition |

## 关联引用 (53个)

| 字段名 | 引用类型 |
|--------|---------|
| `clue_type` | `` |
| `country` | `ucfbasedoc.bd_countryref` |
| `` | `yycrm.sfa_modifieridref` |
| `trans_oppt_report` | `` |
| `source` | `yycrm.crmc_custdocref` |
| `reasonForClosing` | `yycrm.crmc_custdocref` |
| `oppt_report_transfer` | `` |
| `attachment_group_id` | `` |
| `tenant_id` | `yycrm.sfa_tenantref` |
| `ower` | `ucf-staff-center.bd_staff_ref` |
| `salearea` | `productcenter.aa_salearearef` |
| `clueHighSeas_id` | `yycrm.sfa_cluehighseasref` |
| `closePerson` | `ucf-staff-center.bd_staff_ref` |
| `transType` | `transtype.bd_billtyperef` |
| `action_id` | `` |
| `activator` | `ucf-staff-center.bd_staff_ref` |
| `partner_dept` | `` |
| `createArea` | `productcenter.aa_salearearef` |
| `activity` | `yycrm.mka_activityref` |
| `returnPerson` | `` |
| `transformer` | `ucf-staff-center.bd_staff_ref` |
| `clueassignrecord` | `` |
| `clueApplyPerson` | `` |
| `industry` | `productcenter.aa_customertraderef` |
| `attachment_group_item_id` | `` |
| `transCustomer` | `yycrm.cust_customerref` |
| `linkmanTransfer` | `` |
| `customer_add_apply_transfer` | `` |
| `clueDefineCharacter` | `` |
| `follow_id` | `` |
| `recentFollower` | `` |
| `transOppm` | `` |
| `returnReason` | `` |
| `trans_customer_add_apply` | `` |
| `transLinkman` | `` |
| `opptTransfer` | `` |
| `org` | `ucf-org-center.bd_salesorg` |
| `ytenant_id` | `` |
| `dept` | `ucf-org-center.bd_adminorgsharetreeref` |
| `bustype` | `` |
| `partner_person` | `yycrm.cust_contactref` |
| `createDept` | `ucf-org-center.bd_adminorgsharetreeref` |
| `natureOfTheEnterprise` | `ucfbasedoc.bd_enterprisenatureref` |
| `oldClueHighSeas_id` | `yycrm.sfa_cluehighseasref` |
| `iCustID` | `yycrm.cust_customerref` |
| `task_id` | `` |
| `customer_id` | `` |

## 继承接口 (6个, 17字段)

- **数字营销数据权限** (`crmc.base.IDataPermissions`)
  - `dept` → `dept`
  - `org` → `org`
  - `ower` → `ower`
  - `salearea` → `salearea`
- **审计信息** (`base.itf.IAuditInfo`)
  - `create_date` → `create_date`
  - `create_time` → `create_time`
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `modify_date` → `modify_date`
  - `modify_time` → `modify_time`
- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **自动编号** (`voucher.base.IAutoCode`)
  - `` → ``
- **停用信息** (`base.itf.IStopping`)
  - `stopstatus` → `stopstatus`
  - `stop_time` → `stop_time`
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 133 个直连字段

### 文本字段 (44个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `largeText1` | `largeText1` | `largeText1` | 大字段1 |
| `largeText2` | `largeText2` | `largeText2` | 大字段2 |
| `largeText3` | `largeText3` | `largeText3` | 大字段3 |
| `largeText4` | `largeText4` | `largeText4` | 大字段4 |
| `largeText5` | `largeText5` | `largeText5` | 大字段5 |
| `verfiyId` | `verfiyId` | `verfiyId` | 核实主键 |
| `returnRemark` | `returnRemark` | `returnRemark` | 退回备注 |
| `business_information` | `business_information` | `businessInformation` | 工商信息 |
| `operate_status` | `operate_status` | `operateStatus` | 线索业务操作状态 |
| `close_no` | `close_no` | `closeNo` | 关闭版本号 |
| `provinceName` | `provinceName` | `provinceName` | 省 |
| `cityName` | `cityName` | `cityName` | 市 |
| `areaName` | `areaName` | `areaName` | 区 |
| `recentFollowContent` | `recentFollowContent` | `recentFollowContent` | 最近跟进内容 |
| `region` | `region` | `region` | 所在地区 |
| `transCustomerOrg` | `transCustomerOrg` | `transCustomerOrg` | 已转化客户组织 |
| `transOppmReport` | `transOppmReport` | `transOppmReport` | 是否转化商机报备 |
| `code` | `code` | `code` | 线索编码 |
| `name` | `name` | `name` | 线索名称 |
| `marketAct` | `marketAct` | `marketAct` | 市场活动 |
| `contactPerson` | `contactPerson` | `contactPerson` | 联系人 |
| `contact_dept` | `contact_dept` | `contactDept` | 任职部门 |
| `jobTitle` | `jobTitle` | `jobTitle` | 职务 |
| `companyName` | `companyName` | `companyName` | 公司名称 |
| `employeeCount` | `employeeCount` | `employeeCount` | 员工数 |
| `annualTurnover` | `annualTurnover` | `annualTurnover` | 年营业额(万元) |
| `cellPhone` | `cellPhone` | `cellPhone` | 手机 |
| `phone` | `phone` | `phone` | 电话 |
| `qq` | `qq` | `qq` | QQ |
| `wechat` | `wechat` | `wechat` | 微信 |
| `mailbox` | `mailbox` | `mailbox` | 邮箱 |
| `url` | `url` | `url` | 网址 |
| `longitude` | `longitude` | `longitude` | 经度 |
| `latitude` | `latitude` | `latitude` | 纬度 |
| `regioncode` | `regioncode` | `regionCode` | 行政区划 |
| `address` | `address` | `address` | 详细地址 |
| `description` | `description` | `description` | 描述 |
| `closeNote` | `closeNote` | `closeNote` | 关闭备注 |
| `` | `creator` | `creator` | 创建人名称 |
| `` | `modifier` | `modifier` | 修改人名称 |
| `picture_1` | `picture_1` | `picture1` | 图片 |
| `bidContentLink` | `bidContentLink` | `bidContentLink` | 招投标源链接 |
| `national_phone` | `national_phone` | `nationalPhone` | 国际化手机号 |
| `source_type` | `source_type` | `sourceType` | 来源类型 |

### 引用字段 (47个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `attachment_group_id` | `attachment_group_id` | `attachmentGroupId` | 附件分组 |
| `attachment_group_item_id` | `attachment_group_item_id` | `attachmentGroupItemId` | 附件分组项 |
| `bustype` | `bustype` | `bustype` | 交易类型 |
| `clueApplyPerson` | `clueApplyPerson` | `clueApplyPerson` | 申领人 |
| `clueassignrecord` | `clueassignrecord` | `clueassignrecord` | 线索分配记录 |
| `trans_oppt_report` | `trans_oppt_report` | `transOpptReport` | 已转化商机报备 |
| `trans_customer_add_apply` | `trans_customer_add_apply` | `transCustomerAddApply` | 已转化客户申请 |
| `oppt_report_transfer` | `oppt_report_transfer` | `opptReportTransfer` | 商机报备转化人 |
| `customer_add_apply_transfer` | `customer_add_apply_transfer` | `customerAddApplyTransfer` | 客户申请转化人 |
| `follow_id` | `follow_id` | `followId` | 跟进记录 |
| `returnReason` | `returnReason` | `returnReason` | 退回原因 |
| `returnPerson` | `returnPerson` | `returnPerson` | 退回操作人 |
| `customer_id` | `customer_id` | `customer` | 客户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
| `linkmanTransfer` | `linkmanTransfer` | `linkmanTransfer` | 联系人转化人 |
| `opptTransfer` | `opptTransfer` | `opptTransfer` | 商机转化人 |
| `recentFollower` | `recentFollower` | `recentFollower` | 最近跟进人 |
| `transLinkman` | `transLinkman` | `transLinkman` | 已转化联系人 |
| `transOppm` | `transOppm` | `transOppm` | 已转化商机 |
| `ower` | `ower` | `ower` | 负责人 |
| `source` | `source` | `source` | 线索来源id |
| `dept` | `dept` | `dept` | 部门ID |
| `transType` | `transType` | `transType` | 线索平台交易类型ID |
| `clue_type` | `clue_type` | `clueType` | 类型ID |
| `salearea` | `salearea` | `saleArea` | 销售区域ID |
| `org` | `org` | `org` | 销售组织ID |
| `clueHighSeas_id` | `clueHighSeas_id` | `clueHighSeasId` | 线索公海ID |
| `natureOfTheEnterprise` | `natureOfTheEnterprise` | `natureOfTheEnterprise` | 企业性质ID |
| `oldClueHighSeas_id` | `oldClueHighSeas_id` | `oldClueHighSeasId` | 原线索公海ID |
| `industry` | `industry` | `industry` | 行业ID |
| `transCustomer` | `transCustomer` | `transCustomer` | 已转化客户ID |
| `activity` | `activity` | `activity` | 营销活动ID |
| `country` | `country` | `country` | 国家ID |
| `iCustID` | `iCustID` | `cust` | 伙伴ID |
| `partner_person` | `partner_person` | `partnerPerson` | 伙伴负责人ID |
| `transformer` | `transformer` | `transformer` | 转化人ID |
| `createDept` | `createDept` | `createDept` | 创建部门ID |
| `reasonForClosing` | `reasonForClosing` | `reasonForClosing` | 关闭原因id |
| `closePerson` | `closePerson` | `closePerson` | 关闭人ID |
| `createArea` | `createArea` | `createArea` | 创建区域ID |
| `activator` | `activator` | `activator` | 激活人ID |
| `task_id` | `task_id` | `taskId` | 任务ID |
| `action_id` | `action_id` | `actionId` | 行动ID |
| `` | `creatorId` | `creatorId` | 创建人ID |
| `` | `modifierId` | `modifierId` | 修改人ID |
| `tenant_id` | `tenant_id` | `tenant` | 租户ID |
| `partner_dept` | `partner_dept` | `partnerDept` | 伙伴部门 |

### 日期字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |

### 布尔字段 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `lockStatus` | `lockStatus` | `lockStatus` | 锁定状态 0-未锁定 1-已锁定,默认0 |
| `is_transfer_oppt_report` | `is_transfer_oppt_report` | `isTransferOpptReport` | 是否转化商机报备 |
| `is_trans_customer_add_apply` | `is_trans_customer_add_apply` | `isTransCustomerAddApply` | 是否转化客户申请 |
| `isTransferOppmSuccess` | `isTransferOppmSuccess` | `isTransferOppmSuccess` | 是否成功转化商机 |
| `isTransferCustomer` | `isTransferCustomer` | `isTransferCustomer` | 转化客户 |
| `isTransferOppm` | `isTransferOppm` | `isTransferOppm` | 转化商机 |
| `isTransferLinkman` | `isTransferLinkman` | `isTransferLinkman` | 转化联系人 |
| `stopstatus` | `stopstatus` | `stopstatus` | 停用状态 |

### 枚举字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `trans_new_customer` | `trans_new_customer` | `transNewCustomer` | 转化新/老客户 |
| `trans_potential_customer` | `trans_potential_customer` | `transPotentialCustomer` | 转化潜客/正客 |
| `iVerfyMark` | `iVerfyMark` | `verfyMark` | 核实状态 |
| `status` | `status` | `status` | 线索状态 |

### 整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `inSeasCount` | `inSeasCount` | `inSeasCount` | 进公海次数 |
| `isClueApply` | `isClueApply` | `isClueApply` | 是否申领中 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |

### 数值字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `expect_deliver_money` | `expect_deliver_money` | `expectDeliverMoney` | 预计交付金额 |
| `timeNotFollowed` | `timeNotFollowed` | `timeNotFollowed` | 未跟进时长 |

### timestamp (17个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `clueApplyTime` | `clueApplyTime` | `clueApplyTime` | 申领时间 |
| `oppt_report_trans_time` | `oppt_report_trans_time` | `opptReportTransTime` | 商机报备转化时间 |
| `customer_add_apply_trans_time` | `customer_add_apply_trans_time` | `customerAddApplyTransTime` | 客户申请转化时间 |
| `returnTime` | `returnTime` | `returnTime` | 退回时间 |
| `expect_deliver_date` | `expect_deliver_date` | `expectDeliverDate` | 预计交付日期 |
| `linkmanTransTime` | `linkmanTransTime` | `linkmanTransTime` | 联系人转化时间 |
| `opptTransTime` | `opptTransTime` | `opptTransTime` | 商机转化时间 |
| `owerChangeTime` | `owerChangeTime` | `owerChangeTime` | 负责人变更时间 |
| `owerRecentFollowTime` | `owerRecentFollowTime` | `owerRecentFollowTime` | 负责人最近跟进时间 |
| `recentFollowupTime` | `recentFollowupTime` | `recentFollowupTime` | 最近跟进时间 |
| `conversionTime` | `conversionTime` | `conversionTime` | 转化时间 |
| `closingTime` | `closingTime` | `closingTime` | 关闭时间 |
| `activationTime` | `activationTime` | `activationTime` | 激活时间 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `stop_time` | `stop_time` | `stoptime` | 停用时间 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `clueDefineCharacter` | `clueDefineCharacter` | `clueDefineCharacter` | 线索自定义项特征属性组 |

### other (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `authDimensionList` | 相关管理维度-线索关联数据表 |
| `` | `` | `clueParticipantList` | 线索参与人 |
| `` | `` | `headDef` | 线索主表自定义项扩展 |
| `` | `` | `highseasBusi` | 线索公海业务信息 |
| `` | `` | `subList` | 线索子表 |
