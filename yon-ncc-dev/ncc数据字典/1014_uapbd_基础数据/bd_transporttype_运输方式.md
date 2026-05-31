# |<<

**运输方式 (bd_transporttype / nc.vo.bd.transporttype.TransportTypeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1014.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_transporttype | 运输方式主键 | pk_transporttype | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 所属组织 | pk_org | char(20) | √ | 组织 (org) |
| 3 | pk_group | 所属集团 | pk_group | char(20) | √ | 组织_集团 (group) |
| 4 | code | 运输方式编码 | code | varchar(40) | √ | 字符串 (String) |
| 5 | name | 运输方式名称 | name | varchar(200) | √ | 多语文本 (MultiLangText) |
| 6 | dataoriginflag | 分布式 | dataoriginflag | int |  | 数据来源 (dataorigin) | 0 | 0=本级产生; |