# |<<

**编制年度 (hrp_year / nc.vo.hrp.budgetyear.BudgetYearVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2751.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_year | 年度主键 | pk_year | char(20) | √ | 主键 (UFID) |
| 2 | hrp_year | 年度 | hrp_year | char(4) | √ | 字符串 (String) |  | [1900 , 9999] |
| 3 | year_type | 年度类型 | year_type | int |  | 年度类型 (BudgetYearTypeEnum) |  | 1=数据调查项目; |