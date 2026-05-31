# |<<

**折旧分摊汇总子表 (fa_depgather_b / nc.vo.fa.dep.gather.GatherBVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2007.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_depgather_b | 主键 | pk_depgather_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_card | 资产卡片 | pk_card | varchar(20) |  | 资产卡片 (asset) |
| 3 | pk_raorg | 利润中心 | pk_raorg | varchar(20) |  | 字符串 (String) |
| 4 | pk_costcenter | 成本中心 | pk_costcenter | varchar(50) |  | 字符串 (String) |
| 5 | pk_usedept | 使用部门最新版本 | pk_usedept | varchar(20) |  | 字符串 (String) |
| 6 | pk_usedept_v | 使用部门 | pk_usedept_v | varchar(20) |  | 字符串 (String) |
| 7 | pk_mandept | 管理部门最新版本 | pk_mandept | varchar(20) |  | 字符串 (String) |
| 8 | pk_mandept_v | 管理部门 | pk_mandept_v | varchar(20) |  | 字符串 (String) |
| 9 | pk_dept | 部门最新版本 | pk_dept | varchar(20) |  | 字符串 (String) |
| 10 | pk_dept_v | 部门 | pk_dept_v | varchar(20) |  | 字符串 (String) |
| 11 | pk_category | 资产类别 | pk_category | varchar(20) |  | 字符串 (String) |
| 12 | pk_usingstatus | 使用状况 | pk_usingstatus | varchar(20) |  | 字符串 (String) |
| 13 | pk_depmethod | 折旧方法 | pk_depmethod | varchar(20) |  | 字符串 (String) |
| 14 | pk_addreducestyle | 增减方式 | pk_addreducestyle | varchar(20) |  | 字符串 (String) |
| 15 | pk_assetuser | 使用人 | pk_assetuser | varchar(20) |  | 字符串 (String) |
| 16 | pk_jobmngfil | 项目档案 | pk_jobmngfil | varchar(20) |  | 字符串 (String) |
| 17 | pk_equiporg | 使用权 | pk_equiporg | varchar(20) |  | 字符串 (String) |
| 18 | pk_ownerorg | 货主管理组织 | pk_ownerorg | varchar(20) |  | 字符串 (String) |
| 19 | pk_equip_usedept | 设备使用部门 | pk_equip_usedept | varchar(20) |  | 字符串 (String) |
| 20 | workcenter | 工作中心 | workcenter | varchar(20) |  | 字符串 (String) |
| 21 | provider | 供应商 | provider | varchar(20) |  | 字符串 (String) |
| 22 | pk_account_subject | 会计科目 | pk_account_subject | varchar(20) |  | 字符串 (String) |
| 23 | usufructasset_flag | 是否使用权资产 | usufructasset_flag | varchar(2) |  | 字符串 (String) |
| 24 | depamount | 月折旧额 | depamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 25 | depamount_global | 月折旧额(全局) | depamount_global | decimal(28, 8) |  | 金额 (UFMoney) |
| 26 | depamount_group | 月折旧额(集团) | depamount_group | decimal(28, 8) |  | 金额 (UFMoney) |
| 27 | extend1 | 扩展项1 | extend1 | varchar(200) |  | 字符串 (String) |
| 28 | extend2 | 扩展项2 | extend2 | varchar(200) |  | 字符串 (String) |
| 29 | extend3 | 扩展项3 | extend3 | varchar(200) |  | 字符串 (String) |
| 30 | extend4 | 扩展项4 | extend4 | varchar(200) |  | 字符串 (String) |
| 31 | extend5 | 扩展项5 | extend5 | varchar(200) |  | 字符串 (String) |
| 32 | extend6 | 扩展项6 | extend6 | varchar(200) |  | 字符串 (String) |
| 33 | extend7 | 扩展项7 | extend7 | varchar(200) |  | 字符串 (String) |
| 34 | extend8 | 扩展项8 | extend8 | varchar(200) |  | 字符串 (String) |
| 35 | extend9 | 扩展项9 | extend9 | varchar(200) |  | 字符串 (String) |
| 36 | pk_fundsource | 资金来源 | pk_fundsource | varchar(50) |  | 字符串 (String) |
| 37 | pk_calat | 核算属性 | pk_calat | varchar(50) |  | 字符串 (String) |
| 38 | pk_jobmngfils | 多项目档案 | pk_jobmngfils | varchar(50) |  | 字符串 (String) |