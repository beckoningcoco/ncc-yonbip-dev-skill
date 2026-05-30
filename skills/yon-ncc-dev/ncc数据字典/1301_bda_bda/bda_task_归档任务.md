# |<<

**归档任务 (bda_task / uap.vo.bda.ap.task.entity.TaskVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1168.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_adptask | 任务主键 | pk_adptask | char(20) | √ | 主键 (UFID) |
| 2 | taskcode | 编码 | taskcode | varchar(50) |  | 字符串 (String) |
| 3 | taskname | 名称 | taskname | varchar(200) |  | 多语文本 (MultiLangText) |
| 4 | sourceadp | 数据来源 | sourceadp | varchar(20) |  | ADP管理 (bda_adp) |
| 5 | targetadp | 数据去向 | targetadp | varchar(20) |  | ADP管理 (bda_adp) |
| 6 | condition | 迁移条件 | condition | varchar(4000) |  | 备注 (Memo) |
| 7 | taskstatus | 任务状态 | taskstatus | int |  | 任务状态 (TaskStatus) |  | 1=初始; |