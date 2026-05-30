# |<<

**分布式接收日志 (gl_receivelog / nc.vo.gl.distribution.ReceiveLogVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2451.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_receivelog | 接收日志主键 | pk_receivelog | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 组织 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | taskid | 任务ID | taskid | varchar(50) |  | 字符串 (String) |
| 5 | sendercode | 发送方 | sendercode | varchar(50) |  | 字符串 (String) |
| 6 | receiptercode | 接收方 | receiptercode | varchar(50) |  | 字符串 (String) |
| 7 | transdata | 传输资源 | transdata | varchar(50) |  | 传输资源 (transtype) |  | 1=期初凭证; |