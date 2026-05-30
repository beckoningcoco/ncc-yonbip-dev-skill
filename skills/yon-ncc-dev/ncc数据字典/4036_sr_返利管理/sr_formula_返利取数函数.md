# |<<

**返利取数函数 (sr_formula / nc.vo.sr.formula.entity.FormulaVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5451.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_formula | 返利取数函数实体 | pk_formula | char(20) | √ | 主键 (UFID) |
| 2 | iorder | 行号 | iorder | int |  | 整数 (Integer) |
| 3 | vcode | 函数编码 | vcode | varchar(40) |  | 字符串 (String) |
| 4 | vname | 函数名称 | vname | varchar(200) |  | 多语文本 (MultiLangText) |
| 5 | moduleid | 所属模块 | moduleid | varchar(20) |  | 模块信息 (module) |
| 6 | modulecode | 所属模块编码 | modulecode | varchar(50) |  | 字符串 (String) |
| 7 | vformulaclass | 函数实现类 | vformulaclass | varchar(200) |  | 字符串 (String) |
| 8 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 9 | pk_org | 组织 | pk_org | varchar(20) |  | 组织_业务单元_销售组织 (salesorg) |
| 10 | bpresetflag | 预置 | bpresetflag | char(1) |  | 布尔类型 (UFBoolean) |