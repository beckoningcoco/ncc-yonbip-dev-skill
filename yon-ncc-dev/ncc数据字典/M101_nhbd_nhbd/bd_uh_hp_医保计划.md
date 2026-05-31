# |<<

**医保计划 (bd_uh_hp / nc.vo.nhbd.price.HealthPlanVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1032.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_hp | 医保计划主键 | pk_hp | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | pk_payer | 付款人主键 | pk_payer | varchar(20) |  | 医保付款机构 (PayerVO) |
| 5 | code | 医保计划编码 | code | varchar(50) |  | 字符串 (String) |
| 6 | name | 医保计划名称 | name | varchar(50) |  | 字符串 (String) |
| 7 | pk_father | 上级医保主键 | pk_father | varchar(20) |  | 医保计划 (healthplan) |
| 8 | mnecode | 输入码 | mnecode | varchar(50) |  | 字符串 (String) |
| 9 | pk_hp_link | 复用计划编码 | pk_hp_link | varchar(20) |  | 医保计划 (healthplan) |
| 10 | flag_active | 启用标志 | flag_active | char(1) |  | 布尔类型 (UFBoolean) |
| 11 | pk_icmode_prop | 分摊接口模式主键 | pk_icmode_prop | varchar(20) |  | 分摊接口模式(自定义档案) (Defdoc-040002) |
| 12 | dt_icmode_prop | 分摊接口模式编码 | dt_icmode_prop | varchar(50) |  | 字符串 (String) |
| 13 | icfunc_prop | 分摊接口启动函数 | icfunc_prop | varchar(50) |  | 字符串 (String) |
| 14 | pk_icmode_ratio | 比例接口模式主键 | pk_icmode_ratio | varchar(20) |  | 比例接口模式(自定义档案) (Defdoc-040003) |
| 15 | dt_icmode_ratio | 比例接口模式编码 | dt_icmode_ratio | varchar(50) |  | 字符串 (String) |
| 16 | icfunc_ratio | 比例接口启动函数 | icfunc_ratio | varchar(50) |  | 字符串 (String) |
| 17 | eu_selmd | 选择范围模式 | eu_selmd | varchar(50) |  | 选择范围模式 (SelmdEnum) |  | 0=全局选择; |