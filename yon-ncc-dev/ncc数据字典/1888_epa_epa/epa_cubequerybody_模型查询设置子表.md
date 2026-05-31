# |<<

**模型查询设置子表 (epa_cubequerybody / nc.vo.epa.dataset.cube.CubeQueryBody)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1853.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_obj | pk_obj | pk_obj | char(20) | √ | 主键 (UFID) |
| 2 | pk_dimlevel | pk_dimlevel | pk_dimlevel | varchar(30) |  | 字符串 (String) |
| 3 | operator | 操作符 | operator | varchar(50) |  | 字符串 (String) |
| 4 | express | 表达式 | express | image |  | BLOB (BLOB) |
| 5 | dimlevelname | dimlevelname | dimlevelname | varchar(100) |  | 字符串 (String) |
| 6 | dimprops | 维度属性pk集合 | dimprops | varchar(500) |  | 字符串 (String) |
| 7 | useprops | useprops | useprops | varchar(500) |  | 字符串 (String) |
| 8 | ismeasure_epa | isMeasure_epa | ismeasure_epa | char(1) |  | 布尔类型 (UFBoolean) |
| 9 | isrequired | 是否必选维度 | isrequired | char(1) |  | 布尔类型 (UFBoolean) |
| 10 | usepropstree | 指定的维度层次 | usepropstree | image |  | BLOB (BLOB) |
| 11 | def1 | def1 | def1 | varchar(100) |  | 字符串 (String) |
| 12 | def2 | def2 | def2 | varchar(100) |  | 字符串 (String) |
| 13 | def3 | def3 | def3 | varchar(100) |  | 字符串 (String) |
| 14 | def4 | def4 | def4 | varchar(100) |  | 字符串 (String) |
| 15 | def5 | va | def5 | varchar(100) |  | 字符串 (String) |
| 16 | def6 | def6 | def6 | varchar(100) |  | 字符串 (String) |