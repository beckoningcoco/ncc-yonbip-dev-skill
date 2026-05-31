# |<<

**任务 (iufo_task / nc.vo.iufo.task.TaskVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3513.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_task | 任务主键 | pk_task | char(20) | √ | 主键 (UFID) |
| 2 | pk_tasksort | 任务分类 | pk_tasksort | char(20) | √ | 任务分类 (tasksort) |
| 3 | code | 任务编码 | code | varchar(50) | √ | 字符串 (String) |
| 4 | name | 任务名称 | name | varchar(200) |  | 多语文本 (MultiLangText) |
| 5 | note | 备注 | note | varchar(1024) |  | 备注 (Memo) |
| 6 | pk_keygroup | 任务关键字 | pk_keygroup | varchar(20) |  | 关键字组合 (关键字组合) |
| 7 | pk_accscheme | 会计期间方案 | pk_accscheme | varchar(20) |  | 会计期间方案 (accperiodscheme) |
| 8 | start_date | 起始日期 | start_date | char(19) |  | 日期 (UFDate) |
| 9 | end_date | 终止日期 | end_date | char(19) |  | 日期 (UFDate) |
| 10 | commit_end_day | 上报截止天数 | commit_end_day | int |  | 整数 (Integer) |
| 11 | commit_end_time | 上报截止时间(格式:00:00:00) | commit_end_time | char(8) |  | 时间 (UFTime) |
| 12 | data_contype | 数据权限控制方式 | data_contype | int |  | 数据权限控制方式 (EnumDataRightControlType) |  | 0=不进行控制; |