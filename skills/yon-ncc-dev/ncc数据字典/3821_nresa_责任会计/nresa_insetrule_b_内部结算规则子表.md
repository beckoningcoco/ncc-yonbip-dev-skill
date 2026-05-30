# |<<

**内部结算规则子表 (nresa_insetrule_b / nc.vo.nresa.internally.rules.InsetRuleBVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3879.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_insetrule_b | 内部结算规则子表主键 | pk_insetrule_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_insetrule | 内部结算规则主表主键 | pk_insetrule | varchar(20) |  | 内部结算规则 (nresa_insetrule) |
| 3 | pk_marbaseclass | 物料分类编码 | pk_marbaseclass | varchar(20) |  | 物料基本分类 (marbasclass) |
| 4 | marbaseclass_name | 物料分类名称 | marbaseclass_name | varchar(50) |  | 字符串 (String) |
| 5 | pk_material | 物料编码 | pk_material | varchar(20) |  | 物料基本信息（多版本） (material) |
| 6 | material_name | 物料名称 | material_name | varchar(50) |  | 字符串 (String) |
| 7 | pk_group | 集团 | pk_group | varchar(50) |  | 字符串 (String) |
| 8 | naddpricerate | 加价率 | naddpricerate | decimal(28, 2) |  | 数值 (UFDouble) |
| 9 | vpricerule | 价格规则 | vpricerule | varchar(50) |  | 字符串 (String) |
| 10 | flag | 询价后价格是否可改 | flag | char(1) |  | 布尔类型 (UFBoolean) |
| 11 | insetbvoorder | 排序 | insetbvoorder | varchar(50) |  | 字符串 (String) |
| 12 | predata | 是否预制数据 | predata | char(1) |  | 布尔类型 (UFBoolean) |
| 13 | def1 | 自定义项1 | def1 | varchar(100) |  | 字符串 (String) |
| 14 | def2 | 自定义项2 | def2 | varchar(100) |  | 字符串 (String) |
| 15 | def3 | 自定义项3 | def3 | varchar(100) |  | 字符串 (String) |
| 16 | def4 | 自定义项4 | def4 | varchar(100) |  | 字符串 (String) |
| 17 | def5 | 自定义项5 | def5 | varchar(100) |  | 字符串 (String) |
| 18 | def6 | 自定义项6 | def6 | varchar(100) |  | 字符串 (String) |
| 19 | def7 | 自定义项7 | def7 | varchar(100) |  | 字符串 (String) |
| 20 | def8 | 自定义项8 | def8 | varchar(100) |  | 字符串 (String) |
| 21 | def9 | 自定义项9 | def9 | varchar(100) |  | 字符串 (String) |
| 22 | def10 | 自定义项10 | def10 | varchar(100) |  | 字符串 (String) |
| 23 | def11 | 自定义项11 | def11 | varchar(100) |  | 字符串 (String) |
| 24 | def12 | 自定义项12 | def12 | varchar(100) |  | 字符串 (String) |
| 25 | def13 | 自定义项13 | def13 | varchar(100) |  | 字符串 (String) |
| 26 | def14 | 自定义项14 | def14 | varchar(100) |  | 字符串 (String) |
| 27 | def15 | 自定义项15 | def15 | varchar(100) |  | 字符串 (String) |
| 28 | def16 | 自定义项16 | def16 | varchar(100) |  | 字符串 (String) |
| 29 | def17 | 自定义项17 | def17 | varchar(100) |  | 字符串 (String) |
| 30 | def18 | 自定义项18 | def18 | varchar(100) |  | 字符串 (String) |
| 31 | def19 | 自定义项19 | def19 | varchar(100) |  | 字符串 (String) |
| 32 | def20 | 自定义项20 | def20 | varchar(100) |  | 字符串 (String) |