# |<<

**邮件发送监控详情 (ufoe_MailSendDetail / nc.vo.iufo.mailrule.MailSendDetailVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5903.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_mailmntrdtl | 邮件监控详情主键 | pk_mailmntrdtl | varchar(50) | √ | 字符串 (String) |
| 2 | target | 发送目标名称 | target | varchar(50) |  | 字符串 (String) |
| 3 | sendtype | 发送方式 | sendtype | varchar(50) |  | 字符串 (String) |
| 4 | sendstatus | 发送状态 | sendstatus | varchar(50) |  | 字符串 (String) |
| 5 | failreason | 失败原因 | failreason | varchar(50) |  | 字符串 (String) |
| 6 | targetpk | 发送目标主键 | targetpk | varchar(50) |  | 字符串 (String) |
| 7 | sendtypename | 发送方式名称 | sendtypename | varchar(50) |  | 字符串 (String) |
| 8 | queuetaskname | 后台调度任务名称 | queuetaskname | varchar(50) |  | 字符串 (String) |