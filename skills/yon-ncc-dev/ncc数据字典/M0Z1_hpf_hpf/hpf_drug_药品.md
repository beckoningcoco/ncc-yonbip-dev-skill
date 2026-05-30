# |<<

**药品 (hpf_drug / nc.vo.hpf.drug.DrugVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2623.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_drug | 主键 | pk_drug | char(20) | √ | 主键 (UFID) |
| 2 | code | 药品编码 | code | varchar(50) |  | 字符串 (String) |
| 3 | name | 药品名称 | name | varchar(50) |  | 字符串 (String) |
| 4 | syscode | 来源系统 | syscode | varchar(20) |  | 数据来源系统设置 (EntryconfigVO) |
| 5 | rowno | 行号 | rowno | varchar(50) |  | 字符串 (String) |
| 6 | pk_group | 集团 | pk_group | varchar(20) | √ | 组织_集团 (group) |
| 7 | pk_org | 组织 | pk_org | varchar(20) |  | 组织 (org) |
| 8 | pk_org_v | 组织版本 | pk_org_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 9 | mnemonic | 助记码 | mnemonic | varchar(50) |  | 字符串 (String) |
| 10 | standards | 规格 | standards | varchar(50) |  | 字符串 (String) |
| 11 | type | 型号 | type | varchar(50) |  | 字符串 (String) |
| 12 | pk_measdoc | 计量单位 | pk_measdoc | varchar(20) |  | 计量单位 (measdoc) |
| 13 | barcode | 条形码 | barcode | varchar(50) |  | 字符串 (String) |
| 14 | costprice | 成本价 | costprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 15 | enablestate | 是否封存 | enablestate | char(1) |  | 布尔类型 (UFBoolean) |
| 16 | def1 | 自定义项1 | def1 | varchar(200) |  | 字符串 (String) |
| 17 | def2 | 自定义项2 | def2 | varchar(200) |  | 字符串 (String) |
| 18 | def3 | 自定义项3 | def3 | varchar(200) |  | 字符串 (String) |
| 19 | def4 | 自定义项4 | def4 | varchar(200) |  | 字符串 (String) |
| 20 | def5 | 自定义项5 | def5 | varchar(200) |  | 字符串 (String) |
| 21 | def6 | 自定义项6 | def6 | varchar(200) |  | 字符串 (String) |
| 22 | def7 | 自定义项7 | def7 | varchar(200) |  | 字符串 (String) |
| 23 | def8 | 自定义项8 | def8 | varchar(200) |  | 字符串 (String) |
| 24 | def9 | 自定义项9 | def9 | varchar(200) |  | 字符串 (String) |
| 25 | def10 | 自定义项10 | def10 | varchar(200) |  | 字符串 (String) |
| 26 | def11 | 自定义项11 | def11 | decimal(28, 8) |  | 数值 (UFDouble) |
| 27 | def12 | 自定义项12 | def12 | decimal(28, 8) |  | 数值 (UFDouble) |
| 28 | def13 | 自定义项13 | def13 | decimal(28, 8) |  | 数值 (UFDouble) |
| 29 | def14 | 自定义项14 | def14 | decimal(28, 8) |  | 数值 (UFDouble) |
| 30 | def15 | 自定义项15 | def15 | decimal(28, 8) |  | 数值 (UFDouble) |
| 31 | def16 | 自定义项16 | def16 | decimal(28, 8) |  | 数值 (UFDouble) |
| 32 | def17 | 自定义项17 | def17 | decimal(28, 8) |  | 数值 (UFDouble) |
| 33 | def18 | 自定义项18 | def18 | decimal(28, 8) |  | 数值 (UFDouble) |
| 34 | def19 | 自定义项19 | def19 | decimal(28, 8) |  | 数值 (UFDouble) |
| 35 | def20 | 自定义项20 | def20 | decimal(28, 8) |  | 数值 (UFDouble) |
| 36 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 37 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 38 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 39 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |