---
tags: [BIP, 元数据, 数据字典, bd.staff.StaffNew]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 员工(新) (`bd.staff.StaffNew`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`bd_staff` | domain：`ucf-staff-center` | 应用：`DPMSTF` | 业务对象ID：`ec712a95-3316-4686-973e-59a531a84124`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 员工(新) |
| 物理表 | `bd_staff` |
| 数据库 schema | `ucf-staff-center` |
| 所属应用 | `DPMSTF` |
| 直连字段 | 77 个 |
| 子表 | 3 个 |
| 关联引用 | 28 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `mainJobList` | `bd.staff.StaffNewJob` | composition |
| `quoteInfo` | `bd.staff.QuoteStaffNew` | composition |
| `outerStaffInfo` | `bd.staff.outerinfo` | composition |

## 关联引用 (28个)

| 字段名 | 引用类型 |
|--------|---------|
| `country` | `ucfbasedoc.bd_countryref` |
| `cert_type` | `ucfbasedoc.bd_IDtyperef` |
| `education` | `hrcloud-staff-mgr.hred_educationref` |
| `` | `` |
| `modifier` | `` |
| `origin` | `ucfbasedoc.bd_baseregiontreeref` |
| `political` | `ucfbasedoc.0004` |
| `majorcorpid` | `` |
| `psncl_id` | `ucf-staff-center.bd_psnl_catg_ref` |
| `characterrpr` | `` |
| `user_define_character` | `` |
| `jobgrade_id` | `` |
| `unit_id` | `` |
| `tenantid` | `` |
| `creator` | `` |
| `ytenant_id` | `` |
| `jobrank_id` | `` |
| `degree` | `hrcloud-staff-mgr.hred_degreeref` |
| `wagegroup` | `` |
| `current_job` | `` |
| `permanreside` | `` |
| `marital` | `ucfbasedoc.0003` |
| `nationality` | `` |
| `post_id` | `` |
| `dept_id` | `` |
| `addr_id` | `` |

## 继承接口 (8个, 14字段)

- **审批信息** (`bd.itf.ISystemInfo`)
  - `dr` → `dr`
  - `enable` → `enable`
  - `sysid` → `sysid`
  - `tenantid` → `tenantid`
  - `ts` → `ts`
- **UCF公共状态** (`basedoc.basedocItf.BasedocIState`)
  - `enable` → `enable`
- **自动编号** (`voucher.base.IAutoCode`)
  - `` → ``
- **UCF公共租户相关** (`basedoc.basedocItf.BasedocITenant`)
  - `tenantid` → `tenantid`
- **审计信息** (`bd.itf.IAuditInfo`)
  - `creationtime` → `creationtime`
  - `creator` → `creator`
  - `modifiedtime` → `modifiedtime`
  - `modifier` → `modifier`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **逻辑删除(待废除)** (`basedoc.basedocItf.LogicDelete`)
- **逻辑删除相关** (`ucfbase.ucfbaseItf.LogicDelete`)
  - `dr` → `dr`

## 字段列表（按类型分组）

> 共 77 个直连字段

### 文本字段 (31个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `photo` | `photo` | `photo` | 头像 |
| `name` | `name` | `name` | 姓名 |
| `shortname` | `shortname` | `shortname` | 姓名简拼 |
| `code` | `code` | `code` | 编码 |
| `cert_no` | `cert_no` | `cert_no` | 证件号 |
| `mobile` | `mobile` | `mobile` | 手机号 |
| `email` | `email` | `email` | 邮箱 |
| `officetel` | `officetel` | `officetel` | 办公电话 |
| `remark` | `remark` | `remark` | 备注 |
| `user_id` | `user_id` | `user_id` | 关联用户 |
| `id` | `id` | `id` | 主键 |
| `userrlatid` | `userrlatid` | `userrlatid` | 友企联用户关联主键 |
| `objid` | `objid` | `objid` | 混合云ID |
| `bu_id` | `bu_id` | `bu_id` | 所属业务群 |
| `businessid` | `businessid` | `businessid` | 友企联同步业务主键 |
| `sysid` | `sysid` | `sysid` | 来源系统标识 |
| `tenantid` | `tenantid` | `tenantid` | 租户ID |
| `org_id` | `org_id` | `org_id` | 所属组织 |
| `log` | `log` | `log` | 删除引用日志(隐藏) |
| `name2` | `name2` | `name2` | 姓名 |
| `name3` | `name3` | `name3` | 姓名 |
| `name4` | `name4` | `name4` | 姓名 |
| `name5` | `name5` | `name5` | 姓名 |
| `name6` | `name6` | `name6` | 姓名 |
| `bloodtype` | `bloodtype` | `bloodtype` | 血型(隐藏) |
| `qq` | `qq` | `qq` | QQ(隐藏) |
| `weixin` | `weixin` | `weixin` | 微信(隐藏) |
| `linkedin` | `linkedin` | `linkedin` | 领英 |
| `selfemail` | `selfemail` | `selfemail` | 个人邮箱(隐藏) |
| `linkaddr` | `linkaddr` | `linkaddr` | 通讯地址(隐藏) |
| `jsonextattr` | `jsonextattr` | `jsonextattr` | 扩展属性(隐藏) |

### 引用字段 (24个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `cert_type` | `cert_type` | `cert_type` | 证件类型 |
| `current_job` | `current_job` | `current_job` | 当前任职 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户ID |
| `tenantid` | `tenantid` | `tenant` | 租户ID |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `unit_id` | `unit_id` | `unit_id` | 组织 |
| `dept_id` | `dept_id` | `dept_id` | 部门 |
| `country` | `country` | `country` | 国家地区(隐藏) |
| `education` | `education` | `education` | 学历(隐藏) |
| `political` | `political` | `political` | 政治面貌(隐藏) |
| `psncl_id` | `psncl_id` | `psncl_id` | 人员类别 |
| `jobgrade_id` | `jobgrade_id` | `jobgrade_id` | 职级 |
| `addr_id` | `addr_id` | `addr_id` | 工作地点 |
| `majorcorpid` | `majorcorpid` | `majorcorpid` | 合同主体 |
| `post_id` | `post_id` | `post_id` | 岗位 |
| `jobrank_id` | `jobrank_id` | `jobrank_id` | 职等  |
| `wagegroup` | `wagegroup` | `wagegroup` | 薪资组  |
| `degree` | `degree` | `degree` | 学位(隐藏) |
| `permanreside` | `permanreside` | `permanreside` | 户口所在地(隐藏) |
| `nationality` | `nationality` | `nationality` | 民族(隐藏) |
| `origin` | `origin` | `origin` | 籍贯(隐藏) |
| `characterrpr` | `characterrpr` | `characterrpr` | 户口性质(隐藏) |
| `marital` | `marital` | `marital` | 婚姻状况(隐藏) |

### 日期字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `birthdate` | `birthdate` | `birthdate` | 出生日期 |
| `joinworkdate` | `joinworkdate` | `joinworkdate` | 参加工作日期(隐藏) |
| `joinpolitydate` | `joinpolitydate` | `joinpolitydate` | 加入党团时间(隐藏) |
| `modifiedtime` | `modifiedtime` | `modifiedtime` | 修改时间 |

### 布尔字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `shop_assis_tag` | `shop_assis_tag` | `shop_assis_tag` | 店员 |
| `biz_man_tag` | `biz_man_tag` | `biz_man_tag` | 业务员 |
| `candidate_flag` | `candidate_flag` | `candidate_flag` | 是否候选人 |

### 整数 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `sex` | `sex` | `sex` | 性别 |
| `enable` | `enable` | `enable` | 状态 |
| `ordernumber` | `ordernumber` | `ordernumber` | 排序号 |
| `is_outer_staff` | `is_outer_staff` | `is_outer_staff` | 是否外部用户 |
| `dr` | `dr` | `dr` | 逻辑删除标记 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `user_define_character` | `user_define_character` | `user_define_character` | 特征 |

### timestamp (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `synchts` | `synchts` | `synchts` | 友企联同步时间戳 |
| `creationtime` | `creationtime` | `createTime` | 创建时间 |
| `modifiedtime` | `modifiedtime` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `ts` | `ts` | `ts` | 时间戳 |
| `creationtime` | `creationtime` | `creationtime` | 创建时间(隐藏) |

### other (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `mainJobList` | 员工任职兼职 |
| `` | `` | `outerStaffInfo` | 人员性质具体信息 |
| `` | `` | `quoteInfo` | 员工引入人员(新) |
