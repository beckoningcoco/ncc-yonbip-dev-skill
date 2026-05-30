# |<<

**CA日志记录实体 (tmpub_calog / nc.vo.tmpub.security.log.CaLogVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5754.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_calog | 标识 | pk_calog | char(20) | √ | 主键 (UFID) |
| 2 | billtype | 单据类型或交易类型 | billtype | varchar(20) |  | 字符串 (String) |
| 3 | modulecode | 模块编码 | modulecode | varchar(30) |  | 字符串 (String) |
| 4 | pk_vbill | 业务单据标识 | pk_vbill | varchar(20) |  | 主键 (UFID) |
| 5 | vbillno | 业务单据号 | vbillno | varchar(50) |  | 字符串 (String) |
| 6 | actioncode | 动作编码 | actioncode | varchar(30) |  | 字符串 (String) |
| 7 | unsigncontext | 签名明文 | unsigncontext | image |  | BLOB (BLOB) |
| 8 | signcontext | 签名数字摘要 | signcontext | varchar(1024) |  | 字符串 (String) |
| 9 | pk_signuser | 签名操作员 | pk_signuser | varchar(20) |  | 主键 (UFID) |
| 10 | isclientsign | 是否客户端签名 | isclientsign | char(1) |  | 布尔类型 (UFBoolean) |
| 11 | pk_property | 签名规则线索标识 | pk_property | varchar(20) |  | 主键 (UFID) |
| 12 | vuserdef1 | 自定义项1 | vuserdef1 | varchar(100) |  | 字符串 (String) |
| 13 | vuserdef2 | 自定义项2 | vuserdef2 | varchar(100) |  | 字符串 (String) |
| 14 | vuserdef3 | 自定义项3 | vuserdef3 | varchar(100) |  | 字符串 (String) |