# |<<

**定时分享任务 (iufo_timingshare_task / nccloud.vo.report.timingshare.TimingShareTaskVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3526.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_timingshare_task | pk_timingshare_task | pk_timingshare_task | char(20) | √ | 主键 (UFID) |
| 2 | task_name | 任务名称 | task_name | varchar(200) | √ | 多语文本 (MultiLangText) |
| 3 | task_note | 任务说明 | task_note | varchar(200) |  | 多语文本 (MultiLangText) |
| 4 | reportid | 报表id | reportid | varchar(50) |  | 字符串 (String) |
| 5 | timeconfig | 定时设置 | timeconfig | image |  | 图片类型 (IMAGE) |
| 6 | sender | 发送人 | sender | varchar(50) |  | 字符串 (String) |
| 7 | receivers | 接收人 | receivers | image |  | 图片类型 (IMAGE) |
| 8 | schedule_id | 调度id | schedule_id | varchar(50) |  | 字符串 (String) |
| 9 | filetype | 附件类型 | filetype | varchar(50) |  | 字符串 (String) |
| 10 | taskexecroom | 执行环境 | taskexecroom | image |  | 图片类型 (IMAGE) |
| 11 | reportqueryvo | 查询对象 | reportqueryvo | image |  | 图片类型 (IMAGE) |
| 12 | msgtitle | 消息标题 | msgtitle | varchar(200) | √ | 字符串 (String) |
| 13 | msgvars | 消息标题变量 | msgvars | varchar(50) |  | 字符串 (String) |
| 14 | msgtext | 消息正文 | msgtext | varchar(300) |  | 字符串 (String) |
| 15 | extendobj | 扩展属性 | extendobj | image |  | 图片类型 (IMAGE) |
| 16 | instance_type | 实例命名方式 | instance_type | varchar(200) |  | 字符串 (String) |
| 17 | instance_period | 实例有效期 | instance_period | varchar(19) |  | 字符串 (String) |
| 18 | condsconfig_id | 条件配置id | condsconfig_id | varchar(50) |  | 字符串 (String) |
| 19 | push_type | 推送方式0 | push_type | varchar(19) |  | 字符串 (String) |
| 20 | creator | 创建人 | creator | varchar(50) |  | 字符串 (String) |
| 21 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 22 | modifier | 修改人 | modifier | varchar(50) |  | 字符串 (String) |
| 23 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |