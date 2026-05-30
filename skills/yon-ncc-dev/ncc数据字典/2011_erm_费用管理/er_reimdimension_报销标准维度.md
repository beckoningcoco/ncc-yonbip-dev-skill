# |<<

**报销标准维度 (er_reimdimension / nc.vo.er.reimrule.ReimRuleDimVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1913.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_reimdimension | 主键 | pk_reimdimension | char(20) | √ | 主键 (UFID) |
| 2 | pk_billtype | 单据类型 | pk_billtype | varchar(20) | √ | 单据类型 (BilltypeVO) |
| 3 | displayname | 显示名称 | displayname | varchar(50) | √ | 字符串 (String) |
| 4 | datatype | 数据类型 | datatype | varchar(36) | √ | 实体 (entity) |
| 5 | datatypename | 数据类型名称 | datatypename | varchar(50) |  | 字符串 (String) |
| 6 | beanname | 元数据名称 | beanname | varchar(50) |  | 字符串 (String) |
| 7 | orders | 顺序 | orders | int |  | 整数 (Integer) |
| 8 | correspondingitem | 对应项 | correspondingitem | varchar(50) |  | 字符串 (String) |
| 9 | referential | 参照类型 | referential | varchar(50) |  | 字符串 (String) |
| 10 | billref | 单据对应项 | billref | varchar(50) |  | 字符串 (String) |
| 11 | billrefcode | 单据对应项编码 | billrefcode | varchar(50) |  | 字符串 (String) |
| 12 | showflag | 单据显示项 | showflag | char(1) |  | 布尔类型 (UFBoolean) |
| 13 | pk_org | 组织 | pk_org | varchar(20) | √ | 组织_业务单元_财务组织 (financeorg) |
| 14 | pk_group | 集团 | pk_group | varchar(20) | √ | 组织_集团 (group) |