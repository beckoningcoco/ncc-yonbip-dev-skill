# |<<

**处理历史 (sscpfa_flowpath / nc.vo.sscpfa.pfareport.FlowpathVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5565.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_flowpath | 唯一标识 | pk_flowpath | char(20) | √ | 主键 (UFID) |
| 2 | pk_task | 任务主键 | pk_task | varchar(20) |  | 字符串 (String) |
| 3 | pk_currenttask | 当前任务主键 | pk_currenttask | varchar(20) |  | 字符串 (String) |
| 4 | beigntime | 开始时间 | beigntime | char(19) |  | 日期时间 (UFDateTime) |
| 5 | beginstate | 开始状态 | beginstate | varchar(20) |  | 任务状态 (takenstate) |  | create=创建; |