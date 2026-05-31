# |<<

**电子签章回单 (tmpub_ElecSign / nc.vo.tmpub.security.ElecSignVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5761.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_elecsign | 主键 | pk_elecsign | char(20) | √ | 主键 (UFID) |
| 2 | ca_id | 组织密钥编码 | ca_id | varchar(200) |  | 字符串 (String) |
| 3 | operatedate | 操作日期 | operatedate | char(19) |  | 日期 (UFDate) |
| 4 | operator | 操作人 | operator | varchar(20) |  | 用户 (user) |
| 5 | pk_source | 来源主键 | pk_source | varchar(20) |  | 字符串 (String) |
| 6 | sourcestr | 回单二维码明文 | sourcestr | image |  | BLOB (BLOB) |
| 7 | value | 回单二维码密文 | value | varchar(500) |  | 字符串 (String) |