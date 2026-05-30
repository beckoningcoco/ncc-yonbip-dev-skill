# |<<

**付款计划明细 (pm_expendplan_b / nc.vo.pcm.expend.ExpendPlanBodyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4462.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_expendplan_b | 付款计划子表主键 | pk_expendplan_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(50) |  | 字符串 (String) |
| 3 | pk_org | 项目组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_项目组织 (itemorg) |
| 4 | pk_org_v | 项目组织 | pk_org_v | varchar(20) |  | 组织_业务单元_项目组织版本信息 (itemorg_v) |
| 5 | pk_project | 项目 | pk_project | varchar(20) |  | 项目(项目管理) (pmproject) |
| 6 | payitem | 付款项 | payitem | varchar(200) |  | 字符串 (String) |
| 7 | pk_contr | 付款合同 | pk_contr | varchar(20) |  | 付款合同 (contractheadvo) |
| 8 | pk_supplier | 供应商 | pk_supplier | varchar(20) |  | 供应商基本信息 (supplier) |
| 9 | contr_taxmny | 含税总金额 | contr_taxmny | decimal(28, 8) |  | 金额 (UFMoney) |
| 10 | sld_bal_mny | 应付余额 | sld_bal_mny | decimal(28, 8) |  | 金额 (UFMoney) |
| 11 | sld_est_mny | 本期预估应付 | sld_est_mny | decimal(28, 8) |  | 金额 (UFMoney) |
| 12 | sld_mny | 本期应付 | sld_mny | decimal(28, 8) |  | 金额 (UFMoney) |
| 13 | plan_mny | 本期计划付款额 | plan_mny | decimal(28, 8) |  | 金额 (UFMoney) |
| 14 | check_mny | 本期核定额 | check_mny | decimal(28, 8) |  | 金额 (UFMoney) |
| 15 | memo | 备注 | memo | varchar(200) |  | 字符串 (String) |
| 16 | def1 | 自定义项1 | def1 | varchar(101) |  | 自定义项 (Custom) |
| 17 | def2 | 自定义项2 | def2 | varchar(101) |  | 自定义项 (Custom) |
| 18 | def3 | 自定义项3 | def3 | varchar(101) |  | 自定义项 (Custom) |
| 19 | def4 | 自定义项4 | def4 | varchar(101) |  | 自定义项 (Custom) |
| 20 | def5 | 自定义项5 | def5 | varchar(101) |  | 自定义项 (Custom) |
| 21 | def6 | 自定义项6 | def6 | varchar(101) |  | 自定义项 (Custom) |
| 22 | def7 | 自定义项7 | def7 | varchar(101) |  | 自定义项 (Custom) |
| 23 | def8 | 自定义项8 | def8 | varchar(101) |  | 自定义项 (Custom) |
| 24 | def9 | 自定义项9 | def9 | varchar(101) |  | 自定义项 (Custom) |
| 25 | def10 | 自定义项10 | def10 | varchar(101) |  | 自定义项 (Custom) |
| 26 | def11 | 自定义项11 | def11 | varchar(101) |  | 自定义项 (Custom) |
| 27 | def12 | 自定义项12 | def12 | varchar(101) |  | 自定义项 (Custom) |
| 28 | def13 | 自定义项13 | def13 | varchar(101) |  | 自定义项 (Custom) |
| 29 | def14 | 自定义项14 | def14 | varchar(101) |  | 自定义项 (Custom) |
| 30 | def15 | 自定义项15 | def15 | varchar(101) |  | 自定义项 (Custom) |
| 31 | def16 | 自定义项16 | def16 | varchar(101) |  | 自定义项 (Custom) |
| 32 | def17 | 自定义项17 | def17 | varchar(101) |  | 自定义项 (Custom) |
| 33 | def18 | 自定义项18 | def18 | varchar(101) |  | 自定义项 (Custom) |
| 34 | def19 | 自定义项19 | def19 | varchar(101) |  | 自定义项 (Custom) |
| 35 | def20 | 自定义项20 | def20 | varchar(101) |  | 自定义项 (Custom) |