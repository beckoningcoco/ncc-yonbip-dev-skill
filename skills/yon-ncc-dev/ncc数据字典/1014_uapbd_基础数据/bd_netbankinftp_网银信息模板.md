# |<<

**网银信息模板 (bd_netbankinftp / nc.vo.bd.netbanktemplate.NetbankinftpVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/916.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_netbankinftp | 网银信息模板主键 | pk_netbankinftp | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | code | 网银信息模板编码 | code | varchar(40) | √ | 字符串 (String) |
| 5 | name | 网银信息模板名称 | name | varchar(200) | √ | 多语文本 (MultiLangText) |
| 6 | pk_banktype | 银行类别 | pk_banktype | varchar(20) | √ | 银行类别 (banktype) |
| 7 | netitfname | 网银接口名称 | netitfname | varchar(200) |  | 字符串 (String) |
| 8 | netbankinftpdes | 网银信息模板描述 | netbankinftpdes | varchar(200) |  | 字符串 (String) |
| 9 | ispreparetp | 是否预置模板 | ispreparetp | char(1) |  | 布尔类型 (UFBoolean) |
| 10 | isdefault | 是否默认模板 | isdefault | char(1) |  | 布尔类型 (UFBoolean) |
| 11 | dataoriginflag | 分布式 | dataoriginflag | int |  | 数据来源 (dataorigin) |  | 0=本级产生; |