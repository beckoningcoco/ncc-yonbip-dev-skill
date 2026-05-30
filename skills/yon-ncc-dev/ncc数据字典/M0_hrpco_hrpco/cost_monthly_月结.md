# |<<

**月结 (cost_monthly / nc.vo.hrpco.monthly.MonthlyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1620.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_monthly | 主键 | pk_monthly | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) | √ | 组织_集团 (group) |
| 3 | pk_org | 组织 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | pk_org_v | 组织版本 | pk_org_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 5 | vperiod | 会计期间 | vperiod | varchar(20) |  | 会计月份 (accperiodmonth) |
| 6 | umonthly | 是否月结 | umonthly | char(1) |  | 布尔类型 (UFBoolean) |
| 7 | vmemo | 备注 | vmemo | varchar(50) |  | 字符串 (String) |
| 8 | code | code | code | varchar(50) |  | 字符串 (String) |
| 9 | name | name | name | varchar(50) |  | 字符串 (String) |
| 10 | vfree1 | 预留项1 | vfree1 | varchar(101) |  | 自由项 (Custom) |
| 11 | vfree2 | 预留项2 | vfree2 | varchar(101) |  | 自由项 (Custom) |
| 12 | vfree3 | 预留项3 | vfree3 | varchar(101) |  | 自由项 (Custom) |
| 13 | vfree4 | 预留项4 | vfree4 | varchar(101) |  | 自由项 (Custom) |
| 14 | vfree5 | 预留项5 | vfree5 | varchar(101) |  | 自由项 (Custom) |
| 15 | free6 | 预留项6 | free6 | decimal(28, 8) |  | BigDecimal (BigDecimal) |
| 16 | free7 | 预留项7 | free7 | decimal(28, 8) |  | BigDecimal (BigDecimal) |
| 17 | free8 | 预留项8 | free8 | decimal(28, 8) |  | BigDecimal (BigDecimal) |
| 18 | free9 | 预留项9 | free9 | decimal(28, 8) |  | BigDecimal (BigDecimal) |
| 19 | free10 | 预留项10 | free10 | decimal(28, 8) |  | BigDecimal (BigDecimal) |
| 20 | vfree11 | 预留项11 | vfree11 | char(1) |  | 布尔类型 (UFBoolean) |
| 21 | vfree12 | 预留项12 | vfree12 | char(1) |  | 布尔类型 (UFBoolean) |
| 22 | vfree13 | 预留项13 | vfree13 | char(1) |  | 布尔类型 (UFBoolean) |
| 23 | vfree14 | 预留项14 | vfree14 | char(1) |  | 布尔类型 (UFBoolean) |
| 24 | vfree15 | 预留项15 | vfree15 | char(1) |  | 布尔类型 (UFBoolean) |
| 25 | vdef1 | 自定义项1 | vdef1 | varchar(101) |  | 自定义项 (Custom) |
| 26 | vdef2 | 自定义项2 | vdef2 | varchar(101) |  | 自定义项 (Custom) |
| 27 | vdef3 | 自定义项3 | vdef3 | varchar(101) |  | 自定义项 (Custom) |
| 28 | vdef4 | 自定义项4 | vdef4 | varchar(101) |  | 自定义项 (Custom) |
| 29 | vdef5 | 自定义项5 | vdef5 | varchar(101) |  | 自定义项 (Custom) |
| 30 | def6 | 自定义项6 | def6 | decimal(28, 8) |  | BigDecimal (BigDecimal) |
| 31 | vdef7 | 自定义项7 | vdef7 | varchar(101) |  | 自定义项 (Custom) |
| 32 | vdef8 | 自定义项8 | vdef8 | varchar(101) |  | 自定义项 (Custom) |
| 33 | vdef9 | 自定义项9 | vdef9 | varchar(101) |  | 自定义项 (Custom) |
| 34 | vdef10 | 自定义项10 | vdef10 | varchar(101) |  | 自定义项 (Custom) |
| 35 | vdef11 | 自定义项11 | vdef11 | varchar(101) |  | 自定义项 (Custom) |
| 36 | vdef12 | 自定义项12 | vdef12 | varchar(101) |  | 自定义项 (Custom) |
| 37 | vdef13 | 自定义项13 | vdef13 | varchar(101) |  | 自定义项 (Custom) |
| 38 | vdef14 | 自定义项14 | vdef14 | varchar(101) |  | 自定义项 (Custom) |
| 39 | vdef15 | 自定义项15 | vdef15 | varchar(101) |  | 自定义项 (Custom) |
| 40 | vdef16 | 自定义项16 | vdef16 | varchar(101) |  | 自定义项 (Custom) |
| 41 | vdef17 | 自定义项17 | vdef17 | varchar(101) |  | 自定义项 (Custom) |
| 42 | vdef18 | 自定义项18 | vdef18 | varchar(101) |  | 自定义项 (Custom) |
| 43 | vdef19 | 自定义项19 | vdef19 | varchar(101) |  | 自定义项 (Custom) |
| 44 | vdef20 | 自定义项20 | vdef20 | varchar(101) |  | 自定义项 (Custom) |
| 45 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 46 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 47 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 48 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |