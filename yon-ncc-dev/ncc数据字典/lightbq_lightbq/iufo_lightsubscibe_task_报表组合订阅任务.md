# |<<

**报表组合订阅任务 (iufo_lightsubscibe_task / nccloud.vo.report.subscibetask.LightSubscibeTaskVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3471.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_subscribe_task | pk_subscribe_task | pk_subscribe_task | char(20) | √ | 主键 (UFID) |
| 2 | receivers | 接收人 | receivers | image |  | 图片类型 (IMAGE) |
| 3 | instance_type | 实例命名方式 | instance_type | varchar(200) |  | 字符串 (String) |
| 4 | instance_period | 实例有效期 | instance_period | varchar(19) |  | 字符串 (String) |
| 5 | isstart | 是否启用 | isstart | varchar(19) |  | 字符串 (String) |
| 6 | isstaticdata | 是否是静态数据 | isstaticdata | varchar(19) |  | 字符串 (String) |
| 7 | msgtext | 消息正文 | msgtext | varchar(300) |  | 字符串 (String) |
| 8 | msgtitle | 消息标题 | msgtitle | varchar(200) |  | 字符串 (String) |
| 9 | note | 注释 | note | varchar(200) |  | 多语文本 (MultiLangText) |
| 10 | oncetask | oncetask | oncetask | varchar(19) |  | 字符串 (String) |
| 11 | pk_group | 集团pk | pk_group | varchar(50) |  | 字符串 (String) |
| 12 | pk_org | 组织pk | pk_org | varchar(50) |  | 字符串 (String) |
| 13 | publisher | 发布人 | publisher | varchar(50) |  | 字符串 (String) |
| 14 | push_type | 推送方式 | push_type | varchar(19) |  | 字符串 (String) |
| 15 | query_condition | 查询条件 | query_condition | image |  | 图片类型 (IMAGE) |
| 16 | subscribe_taskname | 任务名称 | subscribe_taskname | varchar(200) |  | 多语文本 (MultiLangText) |
| 17 | msgvars | 消息标题变量 | msgvars | varchar(50) |  | 字符串 (String) |
| 18 | subsistance | 留存数据 | subsistance | varchar(19) |  | 字符串 (String) |
| 19 | taskexecroom | 执行环境 | taskexecroom | image |  | 图片类型 (IMAGE) |
| 20 | schedule_id | 调度id | schedule_id | varchar(50) |  | 字符串 (String) |
| 21 | task_type | 任务类型 | task_type | varchar(19) |  | 字符串 (String) |
| 22 | timeconfig | 时间配置 | timeconfig | image |  | 图片类型 (IMAGE) |
| 23 | isperson | isperson | isperson | varchar(19) |  | 字符串 (String) |
| 24 | filetype | 附件类型 | filetype | varchar(50) |  | 字符串 (String) |
| 25 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 26 | creator | 创建人 | creator | varchar(50) |  | 字符串 (String) |
| 27 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |
| 28 | modifier | 修改者 | modifier | varchar(50) |  | 字符串 (String) |