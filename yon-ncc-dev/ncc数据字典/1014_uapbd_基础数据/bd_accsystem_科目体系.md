# |<<

**科目体系 (bd_accsystem / nc.vo.bd.accsystem.AccSystemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/319.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_accsystem | 主键 | pk_accsystem | char(20) | √ | 主键 (UFID) |
| 2 | code | 科目体系编码 | code | varchar(40) | √ | 字符串 (String) |
| 3 | name | 科目体系名称 | name | varchar(200) | √ | 多语文本 (MultiLangText) |
| 4 | acccoderule | 科目编码规则 | acccoderule | varchar(40) | √ | 字符串 (String) |
| 5 | memo | 备注 | memo | varchar(200) |  | 备注 (Memo) |
| 6 | pk_org | 创建组织 | pk_org | varchar(20) |  | 组织 (org) |
| 7 | pk_group | 创建集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 8 | dataoriginflag | 数据来源 | dataoriginflag | smallint |  | 数据来源 (dataorigin) |  | 0=本级产生; |