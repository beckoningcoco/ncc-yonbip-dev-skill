# |<<

**计提维度表 (arap_provisiondim / nccloud.vo.arap.provisiondim.ProvisiondimVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/189.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_provisiondim | 主键 | pk_provisiondim | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | seqno | 序号 | seqno | int |  | 整数 (Integer) |
| 4 | busidataattr | 业务表字段 | busidataattr | varchar(50) |  | 字符串 (String) |
| 5 | refname | 参照名称 | refname | varchar(50) |  | 字符串 (String) |
| 6 | mappingattr | 对应字段 | mappingattr | varchar(50) |  | 字符串 (String) |
| 7 | tablename | 维度表 | tablename | varchar(50) |  | 字符串 (String) |
| 8 | dimattr | 维度字段 | dimattr | varchar(50) |  | 字符串 (String) |
| 9 | datatype | 数据类型 | datatype | int |  | 整数 (Integer) |
| 10 | name | 名称 | name | varchar(200) |  | 多语文本 (MultiLangText) |
| 11 | displayname | 显示名称 | displayname | varchar(200) |  | 多语文本 (MultiLangText) |
| 12 | classid | 元数据ID | classid | varchar(50) |  | 字符串 (String) |