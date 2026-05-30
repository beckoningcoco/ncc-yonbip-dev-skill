# |<<

**组合订阅执行实例 (iufo_light_subtask_instance / nccloud.vo.report.subscibetask.LightSubscibeTaskInstanceVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3469.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_task_instance | 任务实例pk | pk_task_instance | char(20) | √ | 主键 (UFID) |
| 2 | pk_subscibe_task | 订阅任务pk | pk_subscibe_task | varchar(20) |  | 字符串 (String) |
| 3 | display | 实例显示内容 | display | varchar(200) |  | 字符串 (String) |
| 4 | query_condition | 查询条件 | query_condition | image |  | 图片类型 (IMAGE) |
| 5 | query_result | 查询结果 | query_result | image |  | 图片类型 (IMAGE) |
| 6 | pk_conds_config | 条件设置pk | pk_conds_config | varchar(20) |  | 字符串 (String) |