---
tags: [BIP, 元数据, 数据字典, bd.staff.Staff]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 员工 (`bd.staff.Staff`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`bd_staff` | domain：`ucf-staff-center` | 应用：`DPMSTF` | 业务对象ID：`9ae91cbc-a901-4505-a63a-0f97dec1da8f`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 员工 |
| 物理表 | `bd_staff` |
| domain/服务域 | `ucf-staff-center` |
| schema | `iuap_apdoc_basedoc` |
| 所属应用 | `DPMSTF` |
| 直连字段 | 80 个 |
| 子表 | 6 个 |
| 关联引用 | 31 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `bankAcctList` | `bd.staff.StaffBankAcct` | composition |
| `mainJobList` | `bd.staff.StaffMainJob` | composition |
| `jobList` | `bd.staff.StaffJob` | composition |
| `quoteInfo` | `bd.staff.QuoteStaff` | composition |
| `ptJobList` | `bd.staff.StaffPtJob` | composition |
| `defines` | `bd.staff.StaffDefine` | composition |

## 关联引用 (31个)

| 字段名 | 引用类型 |
|--------|---------|
| `country` | `` |
| `cert_type` | `` |
| `education` | `` |
| `` | `` |
| `modifier` | `` |
| `origin` | `` |
| `political` | `` |
| `majorcorpid` | `` |
| `psncl_id` | `` |
| `characterrpr` | `` |
| `user_define_character` | `` |
| `jobgrade_id` | `` |
| `unit_id` | `` |
| `tenantid` | `` |
| `creator` | `` |
| `jobrank_id` | `` |
| `ytenant_id` | `` |
| `degree` | `` |
| `wagegroup` | `` |
| `current_job` | `` |
| `permanreside` | `` |
| `marital` | `` |
| `nationality` | `` |
| `post_id` | `` |
| `dept_id` | `` |
| `addr_id` | `` |

## 继承接口 (8个, 14字段)

- **UCF公共租户相关** (`basedoc.basedocItf.BasedocITenant`)
  - `tenantid` → `tenantid`
- **UCF公共状态** (`basedoc.basedocItf.BasedocIState`)
  - `enable` → `enable`
- **审批信息** (`bd.itf.ISystemInfo`)
  - `dr` → `dr`
  - `enable` → `enable`
  - `sysid` → `sysid`
  - `tenantid` → `tenantid`
  - `ts` → `ts`
- **审计信息** (`bd.itf.IAuditInfo`)
  - `creationtime` → `creationtime`
  - `creator` → `creator`
  - `modifiedtime` → `modifiedtime`
  - `modifier` → `modifier`
- **自动编号** (`voucher.base.IAutoCode`)
  - `` → ``
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **逻辑删除(待废除)** (`basedoc.basedocItf.LogicDelete`)
- **逻辑删除相关** (`ucfbase.ucfbaseItf.LogicDelete`)
  - `dr` → `dr`

## 字段列表（按类型分组）

> 共 80 个直连字段

### 文本字段 (31个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `photo` | `photo` | `photo` | 头像 |
| `name` | `name` | `name` | 员工姓名 |
| `code` | `code` | `code` | 员工编码 |
| `shortname` | `shortname` | `shortname` | 姓名简拼 |
| `cert_no` | `cert_no` | `cert_no` | 证件号 |
| `email` | `email` | `email` | 邮箱 |
| `mobile` | `mobile` | `mobile` | 手机号 |
| `officetel` | `officetel` | `officetel` | 办公电话 |
| `remark` | `remark` | `remark` | 备注 |
| `user_id` | `user_id` | `user_id` | 关联用户 |
| `id` | `id` | `id` | ID |
| `businessid` | `businessid` | `businessid` | 友企联同步业务主键 |
| `objid` | `objid` | `objid` | 混合云ID |
| `userrlatid` | `userrlatid` | `userrlatid` | 友企联用户关联主键 |
| `sysid` | `sysid` | `sysid` | 系统标识 |
| `tenantid` | `tenantid` | `tenantid` | 租户ID |
| `org_id` | `org_id` | `org_id` | 所属组织 |
| `name2` | `name2` | `name2` | 姓名 |
| `name3` | `name3` | `name3` | 姓名 |
| `name4` | `name4` | `name4` | 姓名 |
| `name5` | `name5` | `name5` | 姓名 |
| `name6` | `name6` | `name6` | 姓名 |
| `bloodtype` | `bloodtype` | `bloodtype` | 血型 |
| `bu_id` | `bu_id` | `bu_id` | 所属业务群 |
| `jsonextattr` | `jsonextattr` | `jsonextattr` | 扩展属性 |
| `linkaddr` | `linkaddr` | `linkaddr` | 通讯地址 |
| `linkedin` | `linkedin` | `linkedin` | 领英 |
| `selfemail` | `selfemail` | `selfemail` | 个人邮箱 |
| `qq` | `qq` | `qq` | QQ |
| `weixin` | `weixin` | `weixin` | 微信 |
| `log` | `log` | `log` | 删除引用日志 |

### 引用字段 (24个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `cert_type` | `cert_type` | `cert_type` | 证件类型 |
| `current_job` | `current_job` | `current_job` | 当前任职 |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `tenantid` | `tenantid` | `tenant` | 租户ID |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户ID |
| `unit_id` | `unit_id` | `unit_id` | 组织 |
| `dept_id` | `dept_id` | `dept_id` | 部门 |
| `jobgrade_id` | `jobgrade_id` | `jobgrade_id` | 职级 |
| `post_id` | `post_id` | `post_id` | 岗位 |
| `psncl_id` | `psncl_id` | `psncl_id` | 员工类别 |
| `jobrank_id` | `jobrank_id` | `jobrank_id` | 职等  |
| `addr_id` | `addr_id` | `addr_id` | 工作地点 |
| `characterrpr` | `characterrpr` | `characterrpr` | 户口性质 |
| `degree` | `degree` | `degree` | 学位 |
| `education` | `education` | `education` | 学历 |
| `majorcorpid` | `majorcorpid` | `majorcorpid` | 合同主体单位 |
| `marital` | `marital` | `marital` | 婚姻状况 |
| `nationality` | `nationality` | `nationality` | 民族 |
| `origin` | `origin` | `origin` | 籍贯 |
| `permanreside` | `permanreside` | `permanreside` | 户口所在地 |
| `political` | `political` | `political` | 政治面貌 |
| `country` | `country` | `country` | 国家地区 |
| `wagegroup` | `wagegroup` | `wagegroup` | 薪资组  |

### 日期字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `birthdate` | `birthdate` | `birthdate` | 出生日期 |
| `joinpolitydate` | `joinpolitydate` | `joinpolitydate` | 加入党团时间 |
| `joinworkdate` | `joinworkdate` | `joinworkdate` | 参加工作日期 |

### 布尔字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `biz_man_tag` | `biz_man_tag` | `biz_man_tag` | 业务员 |
| `shop_assis_tag` | `shop_assis_tag` | `shop_assis_tag` | 店员 |
| `candidate_flag` | `candidate_flag` | `candidate_flag` | 是否候选人 |

### 整数 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `sex` | `sex` | `sex` | 性别 |
| `enable` | `enable` | `enable` | 状态 |
| `is_outer_staff` | `is_outer_staff` | `is_outer_staff` | 外部用户 |
| `ordernumber` | `ordernumber` | `ordernumber` | 排序号 |
| `dr` | `dr` | `dr` | 逻辑删除标识 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `user_define_character` | `user_define_character` | `user_define_character` | 特征 |

### timestamp (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `synchts` | `synchts` | `synchts` | 友企联同步时间戳 |
| `creationtime` | `creationtime` | `createTime` | 创建时间 |
| `modifiedtime` | `modifiedtime` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `ts` | `ts` | `ts` | 时间戳 |
| `creationtime` | `creationtime` | `creationtime` | 创建时间 |
| `modifiedtime` | `modifiedtime` | `modifiedtime` | 修改时间 |

### other (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `bankAcctList` | 员工银行账号 |
| `` | `` | `defines` | 员工自定义项 |
| `` | `` | `jobList` | 员工任职兼职 |
| `` | `` | `mainJobList` | 员工任职(主职) |
| `` | `` | `ptJobList` | 员工兼职 |
| `` | `` | `quoteInfo` | 员工引入人员 |
