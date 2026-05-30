# |<<

**渠道类型 (bd_channeltype / nc.vo.bd.cust.channeltype.ChannelTypeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/394.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_type | 类型主键 | pk_type | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 所属组织 | pk_org | varchar(20) | √ | 组织 (org) |
| 3 | code | 渠道类型编码 | code | varchar(40) | √ | 字符串 (String) |
| 4 | name | 渠道类型名称 | name | varchar(200) | √ | 多语文本 (MultiLangText) |
| 5 | dataoriginflag | 分布式字段 | dataoriginflag | int |  | 数据来源 (dataorigin) |  | 0=本级产生; |