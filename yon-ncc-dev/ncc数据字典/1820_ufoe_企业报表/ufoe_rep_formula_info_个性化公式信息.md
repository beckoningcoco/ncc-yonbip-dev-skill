# |<<

**个性化公式信息 (ufoe_rep_formula_info / nc.vo.iufo.personalformula.RepFormulaInfoVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5908.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_formula_info | 个性化公式信息主键 | pk_formula_info | varchar(50) | √ | 字符串 (String) |
| 2 | formula_info | 公式信息 | formula_info | varchar(50) |  | 字符串 (String) |
| 3 | report | 报表 | report | varchar(20) |  | 采集表信息 (reportinfo) |
| 4 | org | 组织 | org | varchar(20) |  | 组织 (org) |
| 5 | org_code | 组织编码 | org_code | varchar(50) |  | 字符串 (String) |
| 6 | org_name | 组织名称 | org_name | varchar(50) |  | 字符串 (String) |
| 7 | is_personal | 是否为私有公式 | is_personal | char(1) |  | 布尔类型 (UFBoolean) |