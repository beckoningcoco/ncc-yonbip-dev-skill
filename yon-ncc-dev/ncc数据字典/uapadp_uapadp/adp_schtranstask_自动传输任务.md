# |<<

**自动传输任务 (adp_schtranstask / nc.vo.uap.distribution.schedtranstask.SchedTransTaskVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/26.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | taskid | ID | taskid | char(20) | √ | 主键 (UFID) |
| 2 | taskuuid | 传输任务的全局唯一编码 | taskuuid | varchar(50) |  | 字符串 (String) |
| 3 | taskname | 任务名称 | taskname | varchar(200) |  | 多语文本 (MultiLangText) |
| 4 | taskcode | 任务编码 | taskcode | varchar(50) |  | 字符串 (String) |
| 5 | mnemoniccode | 助记码 | mnemoniccode | varchar(50) |  | 字符串 (String) |
| 6 | taskstatus | 任务状态 | taskstatus | int |  | 任务状态 (taskstatus) |  | 1=未启用; |