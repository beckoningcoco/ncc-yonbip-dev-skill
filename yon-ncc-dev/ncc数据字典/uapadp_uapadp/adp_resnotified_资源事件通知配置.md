# |<<

**资源事件通知配置 (adp_resnotified / nc.vo.uap.distribution.restype.ResNotifiedConfigVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/20.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | configid | 配置ID | configid | varchar(50) | √ | 字符串 (String) |
| 2 | restypeid | 资源类型ID | restypeid | varchar(20) |  | 传输资源注册信息 (resourcetyperegister) |
| 3 | ncuserid | 用户ID | ncuserid | varchar(20) |  | 用户 (user) |
| 4 | ncmsgenable | 是否发送消息 | ncmsgenable | char(1) |  | 布尔类型 (UFBoolean) |
| 5 | emailenable | 是否发送电子邮件 | emailenable | char(1) |  | 布尔类型 (UFBoolean) |
| 6 | smsenable | 是否发送短信 | smsenable | char(1) |  | 布尔类型 (UFBoolean) |
| 7 | msgtemplate | 消息模版 | msgtemplate | varchar(2000) |  | 字符串 (String) |