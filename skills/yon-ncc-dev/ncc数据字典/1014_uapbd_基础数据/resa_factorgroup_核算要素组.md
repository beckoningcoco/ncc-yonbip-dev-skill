# |<<

**核算要素组 (resa_factorgroup / nc.vo.resa.factor.FactorGroupVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4912.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_factorgroup | 核算要素组ID | pk_factorgroup | char(20) | √ | 主键 (UFID) |
| 2 | groupcode | 要素组编码 | groupcode | varchar(50) |  | 字符串 (String) |
| 3 | groupname | 要素组名称 | groupname | varchar(200) |  | 多语文本 (MultiLangText) |
| 4 | pk_factorchart | 要素表 | pk_factorchart | varchar(20) |  | 要素表 (FactorChart) |
| 5 | enablestate | 启用状态 | enablestate | int |  | 启用状态 (enablestate) |  | 1=未启用; |