# |<<

**会计期间方案 (bd_accperiodscheme / nc.vo.bd.period.AccperiodschemeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/317.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_accperiodscheme | 期间方案主键 | pk_accperiodscheme | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 主组织 | pk_org | char(20) | √ | 组织 (org) |
| 3 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | code | 期间方案编码 | code | varchar(40) | √ | 字符串 (String) |
| 5 | name | 期间方案名称 | name | varchar(200) | √ | 多语文本 (MultiLangText) |
| 6 | memo | 期间方案描述 | memo | varchar(100) |  | 字符串 (String) |
| 7 | dataoriginflag | 分布式字段 | dataoriginflag | int |  | 数据来源 (dataorigin) |  | 0=本级产生; |