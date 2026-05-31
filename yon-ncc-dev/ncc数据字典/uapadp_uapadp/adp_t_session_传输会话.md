# |<<

**传输会话 (adp_t_session / nc.vo.uap.distribution.datatrans.TransSessionVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/30.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | sessionid | 会话ID | sessionid | char(20) | √ | 主键 (UFID) |
| 2 | sessionuuid | 会话全局唯一ID | sessionuuid | varchar(50) |  | 字符串 (String) |
| 3 | originator | 会话的原始创建者的系统编码 | originator | varchar(50) |  | 字符串 (String) |
| 4 | sessionheader | 会话头 | sessionheader | image |  | BLOB (BLOB) |
| 5 | localprop | 本地属性 | localprop | image |  | BLOB (BLOB) |
| 6 | createtime | 创建时间 | createtime | char(19) |  | 日期时间 (UFDateTime) |
| 7 | sessionstatus | 会话状态 | sessionstatus | int |  | 会话状态 (SessionStatus) |  | 1=开启; |