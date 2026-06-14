---
tags: [BIP, 元数据, 数据字典, cust.custoperateplan.CustOperatePlan]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 客户经营计划 (`cust.custoperateplan.CustOperatePlan`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`cust_operate_plan` | domain：`yycrm` | 应用：`CUST` | 业务对象ID：`24ab2474-84da-4c90-9dd0-7bfd5b7f0017`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 客户经营计划 |
| 物理表 | `cust_operate_plan` |
| domain/服务域 | `yycrm` |
| schema | `crm` |
| 所属应用 | `CUST` |
| 直连字段 | 45 个 |
| 子表 | 1 个 |
| 关联引用 | 13 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `headDef` | `cust.custoperateplan.CustOperatePlanDef` | composition |

## 关联引用 (13个)

| 字段名 | 引用类型 |
|--------|---------|
| `ower` | `ucf-staff-center.bd_staff_ref` |
| `` | `` |
| `org` | `ucf-org-center.bd_salesorg` |
| `ytenant_id` | `` |
| `salearea` | `productcenter.aa_salearearef` |
| `industry` | `` |
| `dept` | `ucf-org-center.bd_adminorgsharetreeref` |
| `bustype` | `` |
| `cust_operate_plan_define_character` | `` |
| `tenant_id` | `` |
| `customer` | `cust_customerref` |

## 继承接口 (5个, 15字段)

- **审计信息** (`base.itf.IAuditInfo`)
  - `create_date` → `create_date`
  - `create_time` → `create_time`
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `modify_date` → `modify_date`
  - `modify_time` → `modify_time`
- **自动编号** (`voucher.base.IAutoCode`)
  - `` → ``
- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **数字营销数据权限** (`crmc.base.IDataPermissions`)
  - `dept` → `dept`
  - `org` → `org`
  - `ower` → `ower`
  - `salearea` → `salearea`
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 45 个直连字段

### 文本字段 (21个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `code` | `code` | `code` | 编码 |
| `sign_target` | `sign_target` | `signTarget` | 签约目标金额 |
| `return_money_target` | `return_money_target` | `returnMoneyTarget` | 回款目标金额 |
| `oppt_plan_money` | `oppt_plan_money` | `opptPlanMoney` | 商机规划金额 |
| `real_sign_money` | `real_sign_money` | `realSignMoney` | 实际签约金额 |
| `real_return_money_target` | `real_return_money_target` | `realReturnMoneyTarget` | 实际回款金额 |
| `win_oppt_money` | `win_oppt_money` | `winOpptMoney` | 赢单商机金额 |
| `` | `creator` | `creator` | 创建人 |
| `strategy_adjust` | `strategy_adjust` | `strategyAdjust` | 战略调整 |
| `organization_adjust` | `organization_adjust` | `OrganizationAdjust` | 组织架构调整 |
| `other_adjust` | `other_adjust` | `otherAdjust` | 其他异动情况 |
| `leader_adjust` | `leader_adjust` | `leaderAdjust` | 高层变动 |
| `develop_strategy_need` | `develop_strategy_need` | `developStrategyNeed` | 发展战略/需求 |
| `operate_main_strategy` | `operate_main_strategy` | `operateMainStrategy` | 经营主策略 |
| `comment` | `comment` | `comment` | 备注 |
| `` | `modifier` | `modifier` | 修改人 |
| `industrystatus` | `industrystatus` | `industrystatus` | 行业地位 |
| `planname` | `planname` | `planname` | 客户经营计划名称 |
| `region` | `region` | `region` | 城市 |
| `cRegionCode` | `cRegionCode` | `regionCode` | 城市 |
| `subsidiary` | `subsidiary` | `subsidiary` | 分子公司数 |

### 引用字段 (11个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `customer` | `customer` | `customer` | 客户ID |
| `org` | `org` | `org` | 销售组织ID |
| `ower` | `ower` | `ower` | 负责人ID |
| `dept` | `dept` | `dept` | 部门ID |
| `salearea` | `salearea` | `saleArea` | 销售区域ID |
| `` | `creatorId` | `creatorId` | 创建人ID |
| `bustype` | `bustype` | `bustype` | 交易类型 |
| `industry` | `industry` | `industry` | 行业 |
| `` | `modifierId` | `modifierId` | 修改人 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 日期字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `beginDate` | `beginDate` | `beginDate` | 开始日期 |
| `endDate` | `endDate` | `endDate` | 截止日期 |
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 主键 |

### 数值字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `sing_finish_rate` | `sing_finish_rate` | `singFinishRate` | 签约达成率 |
| `return_money_rate` | `return_money_rate` | `returnMoneyRate` | 回款达成率 |
| `oppt_win_rate` | `oppt_win_rate` | `opptWinRate` | 商机赢单率 |

### timestamp (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `cust_operate_plan_define_character` | `cust_operate_plan_define_character` | `custOperatePlanDefineCharacter` | 客户经营计划自定义特征 |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `headDef` | 客户经营计划自定义项 |
