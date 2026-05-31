# |<<

**客户联系人 (bd_custlinkman / nc.vo.bd.cust.CustlinkmanVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/440.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_custlinkman | 联系人主键 | pk_custlinkman | char(20) | √ | 主键 (UFID) |
| 2 | pk_linkman | 联系人 | pk_linkman | char(20) | √ | 联系人 (linkman) |
| 3 | isdefault | 是否默认 | isdefault | char(1) | √ | 布尔类型 (UFBoolean) | N |
| 4 | dataoriginflag | 分布式 | dataoriginflag | int |  | 数据来源 (dataorigin) | 0 | 0=本级产生; |