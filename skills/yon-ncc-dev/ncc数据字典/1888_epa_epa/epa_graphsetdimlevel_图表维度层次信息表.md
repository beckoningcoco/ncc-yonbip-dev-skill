# |<<

**图表维度层次信息表 (epa_graphsetdimlevel / nc.vo.epa.query.graph.GraphSetDimLevelVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1863.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_obj | pk_obj | pk_obj | char(20) | √ | 主键 (UFID) |
| 2 | refpk | 层次Pk | refpk | varchar(50) |  | 字符串 (String) |
| 3 | refname | 层次Name | refname | varchar(50) |  | 字符串 (String) |
| 4 | dimpk | 维度Pk | dimpk | varchar(50) |  | 字符串 (String) |
| 5 | dimname | 维度Name | dimname | varchar(50) |  | 字符串 (String) |
| 6 | checkedall | 成员是否全选 | checkedall | char(1) |  | 布尔类型 (UFBoolean) |
| 7 | axistype | 使用轴 | axistype | varchar(50) |  | 字符串 (String) |
| 8 | ratio | 比例 | ratio | varchar(50) |  | 字符串 (String) |
| 9 | unit | 单位 | unit | varchar(50) |  | 字符串 (String) |
| 10 | max | 最大值 | max | varchar(50) |  | 字符串 (String) |
| 11 | calculatevalues | 扩展属性 | calculatevalues | image |  | BLOB (BLOB) |
| 12 | pk_graphsetid | 图表pk | pk_graphsetid | char(20) |  | 主键 (UFID) |
| 13 | prefix | 前导符 | prefix | varchar(50) |  | 字符串 (String) |
| 14 | suffix | 后缀符 | suffix | varchar(50) |  | 字符串 (String) |
| 15 | digits | 小数位数 | digits | varchar(50) |  | 字符串 (String) |
| 16 | showratio | 显示比率 | showratio | varchar(50) |  | 字符串 (String) |
| 17 | thousandbit | 显示千分位 | thousandbit | char(1) |  | 布尔类型 (UFBoolean) |
| 18 | subtotal | subtotal | subtotal | char(1) |  | 布尔类型 (UFBoolean) |
| 19 | categoriesinformation | categoriesInformation | categoriesinformation | image |  | BLOB (BLOB) |
| 20 | measure | measure | measure | char(1) |  | 布尔类型 (UFBoolean) |
| 21 | def1 | def1 | def1 | varchar(1000) |  | 字符串 (String) |
| 22 | def2 | def2 | def2 | varchar(50) |  | 字符串 (String) |
| 23 | def3 | def3 | def3 | varchar(50) |  | 字符串 (String) |
| 24 | def4 | def4 | def4 | varchar(50) |  | 字符串 (String) |
| 25 | def5 | def5 | def5 | varchar(50) |  | 字符串 (String) |