# |<<

**分布式扩展配置日志表 (bd_distributeres_log / nc.bs.bd.pub.distribution.DistributeResLogVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/802.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_distributereglog | 主键 | pk_distributereglog | char(20) | √ | 主键 (UFID) |
| 2 | typecode | 资源编码 | typecode | varchar(50) |  | 字符串 (String) |
| 3 | sendercode | 发送方编码 | sendercode | varchar(100) |  | 字符串 (String) |
| 4 | receiptcode | 接收方编码 | receiptcode | varchar(100) |  | 字符串 (String) |
| 5 | resourceid | 任务资源唯一标识 | resourceid | varchar(100) |  | 字符串 (String) |
| 6 | uploadtime | 上传时间 | uploadtime | char(19) |  | 日期时间 (UFDateTime) |
| 7 | receipttime | 接收时间 | receipttime | char(19) |  | 日期时间 (UFDateTime) |
| 8 | receiptstatus | 接收状态 | receiptstatus | int |  | 资源接收状态 (BDDistReceiptStatus) | 0 | 0=未接收; |