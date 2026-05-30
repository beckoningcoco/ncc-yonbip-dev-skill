# |<<

**成本阶层推算 (scaba_cmlevelcal / nc.vo.scaba.cmLevel.entity.CmLevelCalVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5079.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cmlevelcalid | 成本阶层推算ID | cmlevelcalid | varchar(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org_v | 工厂 | pk_org_v | varchar(20) |  | 组织_业务单元_工厂版本信息 (factory_v) |
| 4 | pk_org | 工厂最新版本 | pk_org | varchar(20) |  | 组织_业务单元_工厂 (factory) |
| 5 | pk_org_co | 业务单元 | pk_org_co | varchar(20) |  | 组织 (org) |
| 6 | pk_profitcenter | 利润中心 | pk_profitcenter | varchar(20) |  | 利润中心 (profitcenter) |
| 7 | pk_setofbook | 账簿类型 | pk_setofbook | varchar(20) |  | 账簿_账簿类型 (setofbook) |
| 8 | pk_accbook | 核算账簿 | pk_accbook | varchar(20) |  | 账簿_核算账簿 (accbook) |
| 9 | cperiod | 会计期间 | cperiod | varchar(20) |  | 会计月份 (accperiodmonth) |
| 10 | cmaterialid | 物料 | cmaterialid | varchar(20) |  | 物料基本信息 (material_v) |
| 11 | nlevel | 阶层 | nlevel | int |  | 整数 (Integer) |
| 12 | calgroup | 分组 | calgroup | int |  | 整数 (Integer) |
| 13 | calstatus | 计算状态 | calstatus | int |  | 计算状态 (calStatusEnum) | 1 | 1=待计算; |