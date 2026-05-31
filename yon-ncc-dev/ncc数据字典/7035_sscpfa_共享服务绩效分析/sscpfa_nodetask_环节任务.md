# |<<

**环节任务 (sscpfa_nodetask / nc.vo.sscpfa.pfareport.NodeTaskVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5566.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_task | 唯一标识 | pk_task | char(20) | √ | 主键 (UFID) |
| 2 | pk_currenttask | 作业任务主键 | pk_currenttask | varchar(20) |  | 字符串 (String) |
| 3 | pk_sscgroup | 共享作业组 | pk_sscgroup | varchar(20) |  | 共享作业组 (ssctp_workinggroup) |
| 4 | pk_sscnode | 共享环节 | pk_sscnode | varchar(20) |  | 作业任务定义 (ssctp_node) |
| 5 | pk_sscuser | 作业人员 | pk_sscuser | varchar(20) |  | 用户 (user) |
| 6 | taskstatus | 任务状态 | taskstatus | varchar(20) |  | 任务状态 (takenstate) |  | create=创建; |