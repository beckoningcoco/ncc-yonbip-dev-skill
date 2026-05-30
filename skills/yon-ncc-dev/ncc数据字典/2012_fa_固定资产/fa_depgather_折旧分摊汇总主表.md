# |<<

**折旧分摊汇总主表 (fa_depgather / nc.vo.fa.dep.gather.GatherHVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2006.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_depgather | 主键 | pk_depgather | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 字符串 (String) |
| 3 | pk_org | 财务组织最新版本 | pk_org | varchar(20) |  | 字符串 (String) |
| 4 | pk_org_v | 财务组织 | pk_org_v | varchar(20) |  | 字符串 (String) |
| 5 | pk_accbook | 财务核算账簿 | pk_accbook | varchar(20) |  | 字符串 (String) |
| 6 | accyear | 年度 | accyear | char(4) |  | 字符串 (String) |
| 7 | period | 期间 | period | char(2) |  | 字符串 (String) |
| 8 | bill_date | 业务日期 | bill_date | char(19) |  | 日期 (UFDate) |
| 9 | pk_currency | 币种 | pk_currency | varchar(20) |  | 字符串 (String) |
| 10 | bill_maker | 操作员 | bill_maker | varchar(20) |  | 字符串 (String) |
| 11 | gather_type | 汇总数据类型 | gather_type | int |  | 整数 (Integer) |