# |<<

**评委信息 (ipmdm_task_judge / nc.vo.ipmdm.task.TaskJudgeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3265.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_task_judge | 评委主键 | pk_task_judge | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | judgetype | 评委类型 | judgetype | varchar(50) |  | 评委类型 (JudgeType) |  | 1=内部评委; |