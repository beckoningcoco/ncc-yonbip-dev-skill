# |<<

**汇率方案表 (bcs_rate / nc.vo.tbb.exchangerate.RateExchangeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/281.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_rate | 主键 | pk_rate | char(20) | √ | 主键 (UFID) |
| 2 | pk_curr | 原币 | pk_curr | varchar(50) |  | 字符串 (String) |
| 3 | pk_aimcurr | 目标币 | pk_aimcurr | varchar(50) |  | 字符串 (String) |
| 4 | transmodel | 折算模式 | transmodel | char(1) |  | 布尔类型 (UFBoolean) |
| 5 | digits | 小数位数 | digits | int |  | 整数 (Integer) |
| 6 | pk_entiy | 实体 | pk_entiy | varchar(50) |  | 字符串 (String) |
| 7 | objname | 汇率方案名称 | objname | varchar(100) |  | 字符串 (String) |
| 8 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 9 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 10 | modifiedby | 最后修改人 | modifiedby | varchar(50) |  | 字符串 (String) |
| 11 | createddate | 创建时间 | createddate | char(19) |  | 日期时间 (UFDateTime) |
| 12 | modifieddate | 最后修改时间 | modifieddate | char(19) |  | 日期时间 (UFDateTime) |
| 13 | def1 | 自定义项1 | def1 | varchar(101) |  | 字符串 (String) |
| 14 | def2 | 自定义项2 | def2 | varchar(101) |  | 字符串 (String) |
| 15 | def3 | 自定义项3 | def3 | varchar(101) |  | 字符串 (String) |
| 16 | def4 | 自定义项4 | def4 | varchar(101) |  | 字符串 (String) |
| 17 | def5 | 自定义项5 | def5 | varchar(101) |  | 字符串 (String) |
| 18 | def6 | 自定义项6 | def6 | varchar(101) |  | 字符串 (String) |
| 19 | def7 | 自定义项7 | def7 | varchar(101) |  | 字符串 (String) |
| 20 | def8 | 自定义项8 | def8 | varchar(101) |  | 字符串 (String) |
| 21 | def9 | 自定义项9 | def9 | varchar(101) |  | 字符串 (String) |
| 22 | def10 | 自定义项10 | def10 | varchar(101) |  | 字符串 (String) |
| 23 | creator | 创建人 | creator | varchar(20) |  | 字符串 (String) |