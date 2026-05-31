# |<<

**订阅任务信息表 (iufo_subscibe_task / nc.vo.report.subscibe.SubscibeTaskVo)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3511.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_subscibe_task | 订阅任务主键 | pk_subscibe_task | char(20) | √ | 主键 (UFID) |
| 2 | subscibe_task_name | 订阅任务名称 | subscibe_task_name | varchar(200) |  | 多语文本 (MultiLangText) |
| 3 | embracer | 接收人 | embracer | image |  | BLOB (BLOB) |
| 4 | promulgator | 发布人 | promulgator | varchar(20) |  | 用户 (user) |
| 5 | push_type | 推送方式 | push_type | int |  | 推送方式 (PushTypeEnum) |  | 1=邮件; |