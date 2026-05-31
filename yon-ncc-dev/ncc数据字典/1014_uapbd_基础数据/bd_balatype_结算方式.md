# |<<

**结算方式 (bd_balatype / nc.vo.bd.balatype.BalaTypeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/345.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_balatype | 结算方式主键 | pk_balatype | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | code | 结算方式编码 | code | varchar(40) |  | 字符串 (String) |
| 5 | name | 结算方式名称 | name | varchar(200) |  | 多语文本 (MultiLangText) |
| 6 | defaultflag | 缺省标记 | defaultflag | char(1) |  | 布尔类型 (UFBoolean) |
| 7 | netbankflag | 网银支付 | netbankflag | char(1) |  | 布尔类型 (UFBoolean) |
| 8 | dataoriginflag | 数据来源 | dataoriginflag | smallint |  | 数据来源 (dataorigin) | 0 | 0=本级产生; |