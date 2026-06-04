---
tags: ["BIP", "元数据", "数据字典", "ycSouring", "lawbid.cpuexpert.CpuExpert"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 专家库 (`lawbid.cpuexpert.CpuExpert`)

> **平台版本：BIP 旗舰版 V5**

> ycSouring 模块 | 物理表：`cpu_expert`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 专家库 |
| 物理表 | `cpu_expert` |
| 数据库 schema | `yonbip-cpu-lawbid` |
| 所属应用 | `ycSouring` |
| 构建时间 | `2026-06-04 19:56:51.3540` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | 主键 |
| 编码 | `expert_code` | String | 专家编号 |

## 部署信息

- 部署时间: 2026-05-22 23:55:08:000

## 依赖接口（7个）

| # | 接口名 | URI | 版本 |
|---|--------|-----|------|
| 1 | 审计信息 | `base.itf.IAuditInfo` | 340 |
| 2 | 自动编号 | `voucher.base.IAutoCode` | 49 |
| 3 | 统一租户接口 | `ucfbase.ucfbaseItf.IYTenant` | 40 |
| 4 | 逻辑删除相关 | `ucfbase.ucfbaseItf.LogicDelete` | 74 |
| 5 | 跨租户采购商租户接口 | `cpu.itf.IBuyerTenant` | 10 |
| 6 | 审批信息 | `base.itf.IApprovalInfo` | 172 |
| 7 | 审批流信息 | `base.itf.IApprovalFlow` | 134 |

---

## 直接属性（74个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 2 | `createDate` | 创建日期 | `create_date` | Date |
| 3 | `createStyle` | 产生方式 | `create_style` | Short |
| 4 | `createTime` | 建档日期 | `create_time` | Date |
| 5 | `creator` | 创建人名称 | `creator` | String |
| 6 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 7 | `cpuExpertDefineCharacter` | 专家库特征 | `define_character_id` | 36e55f1f-566f-412e-94d0-22073fed46c5 |
| 8 | `deptName` | 职业 | `dept_name` | String |
| 9 | `ucUserId` | 关联BIP用户 | `uc_userid` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b |
| 10 | `auditor` | 审批人名称 | `auditor` | String |
| 11 | `auditorId` | 审批人 | `auditorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 12 | `auditTime` | 审批时间 | `audit_time` | DateTime |
| 13 | `auditDate` | 审批日期 | `audit_date` | Date |
| 14 | `isWfControlled` | 是否审批流控制 | `isWfControlled` | Boolean |
| 15 | `verifystate` | 审批状态 | `verifystate` | Short |
| 16 | `returncount` | 退回次数 | `returncount` | Short |
| 17 | `districtName` | 所在行政区域名称 | `district_name` | String |
| 18 | `dr` | 逻辑删除标记 | `dr` | Short |
| 19 | `enterpriseId` | 租户 | `enterprise_id` | Long |
| 20 | `expertTitle` | 专家职称 | `expert_title` | String |
| 21 | `modifier` | 修改人名称 | `modifier` | String |
| 22 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 23 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 24 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 25 | `operationStyle` | 操作权限 | `operation_style` | Short |
| 26 | `other01` | 备用字段() | `other_01` | String |
| 27 | `other02` | 备用字段2() | `other_02` | String |
| 28 | `postalcode` | 邮政编码 | `postalcode` | String |
| 29 | `professionalRank` | 职业资格等级 | `professional_rank` | String |
| 30 | `pubts` | 时间戳 | `pubts` | DateTime |
| 31 | `purevadeOrgids` | 采购商回避内容 | `purevade_orgids` | String |
| 32 | `purevadeOrgnames` | 采购商回避内容 | `purevade_orgnames` | String |
| 33 | `relateCompanyId` | 工作单位 | `relate_company_id` | Long |
| 34 | `relatePersonId` | 关联人员 | `relate_person_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 35 | `relateUserName` | 关联用户名称 | `relate_user_name` | String |
| 36 | `remarks` | 备注信息 | `remarks` | String |
| 37 | `supevadeOrgids` | 供应商回避内容 | `supevade_orgids` | String |
| 38 | `supevadeOrgnames` | 供应商回避内容 | `supevade_orgnames` | String |
| 39 | `updatestatusTime` | 更新日期 | `updatestatus_time` | DateTime |
| 40 | `userEmail` | 邮箱 | `user_email` | String |
| 41 | `userLevel` | 用户等级 | `user_level` | String |
| 42 | `userName` | 用户名 | `user_name` | String |
| 43 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 44 | `id` | 主键 | `id` | Long |
| 45 | `provinceId` | 省份名称 | `province_id` | Long |
| 46 | `provinceName` | 省份名称 | `province_name` | String |
| 47 | `cityId` | 市区名称 | `city_id` | Long |
| 48 | `cityName` | 市区名称 | `city_name` | String |
| 49 | `districtId` | 所在行政区域 | `district_id` | Long |
| 50 | `relateUserId` | 关联用户 | `relate_user_id` | String |
| 51 | `code` | 专家编号 | `expert_code` | String |
| 52 | `expertName` | 专家姓名 | `expert_name` | String |
| 53 | `relateCompanyName` | 工作单位 | `relate_company_name` | String |
| 54 | `birthday` | 出生日期 | `birthday` | Date |
| 55 | `sex` | 性别 | `sex` | String |
| 56 | `expertStyle` | 专家类型 | `expert_style` | Short |
| 57 | `nation` | 民族 | `nation` | String |
| 58 | `idcardType` | 身份证件类型 | `idcard_type` | String |
| 59 | `idcard` | 身份证件号码 | `idcard` | String |
| 60 | `address` | 通讯地址 | `address` | String |
| 61 | `userTel` | 移动电话 | `user_tel` | String |
| 62 | `highestEductuion` | 最高学历 | `highest_eductuion` | String |
| 63 | `professionalNum` | 职业资格序列 | `professional_num` | String |
| 64 | `technonologyTip` | 技术职称 | `technonology_tip` | String |
| 65 | `lastGraduation` | 最后毕业院校 | `last_graduation` | String |
| 66 | `state` | 专家状态 | `state` | String |
| 67 | `source` | 专家来源 | `source` | Short |
| 68 | `expertPhoto` | 照片 | `expert_photo` | String |
| 69 | `workYears` | 从业年限 | `work_years` | Decimal |
| 70 | `cpuAssList` | 专家参评项目表 | `` | 3529a91f-db89-4833-b65c-8da17760445d |
| 71 | `cpuExperienceList` | 专家考核表 | `` | d0a65b84-c4f5-473c-8016-670875c4d767 |
| 72 | `cpuExpertDetailList` | 专家详情 | `` | 6f932140-a27b-4ed2-9897-68215bcd7e47 |
| 73 | `cpuExpertOrgrangeList` | 专家组织 | `` | 9979a4d2-3e9b-4447-95f8-dd37f22064d3 |
| 74 | `cpuExpertRecordList` | 专家履历 | `` | 3ece1342-fb8b-4ecd-9fa7-721eea323e83 |

---

## 关联属性（12个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `cpuExpertDetailList` | 专家详情 | `lawbid.cpuexpert.CpuExpertDetail` | None | true |
| 2 | `cpuExpertDefineCharacter` | 专家库特征 | `lawbid.cpuexpert.CpuExpertDefineCharacter` | None |  |
| 3 | `relatePersonId` | 关联人员 | `bd.staff.Staff` | Service |  |
| 4 | `auditorId` | 审批人 | `base.user.User` | Service |  |
| 5 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 6 | `ucUserId` | 关联BIP用户 | `base.user.BipUser` | Service |  |
| 7 | `cpuExpertOrgrangeList` | 专家组织 | `lawbid.cpuexpert.CpuExpertOrgrange` | None | true |
| 8 | `cpuExpertRecordList` | 专家履历 | `lawbid.cpuexpert.CpuExpertRecord` | None | true |
| 9 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 10 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 11 | `cpuAssList` | 专家参评项目表 | `lawbid.cpuexpert.CpuExpertAss` | None | true |
| 12 | `cpuExperienceList` | 专家考核表 | `lawbid.cpuexpert.CpuExpertExperience` | None | true |
