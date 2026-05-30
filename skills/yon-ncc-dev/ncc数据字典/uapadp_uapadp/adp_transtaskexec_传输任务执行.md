# |<<

**传输任务执行 (adp_transtaskexec / nc.vo.uap.distribution.restrans.TransTaskExecutionVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/36.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | taskexecid | 编号 | taskexecid | char(20) | √ | 主键 (UFID) |
| 2 | taskid | 传输任务编号 | taskid | varchar(20) | √ | 自动传输任务 (schedtranstask) |
| 3 | endtime | 结束执行时间 | endtime | char(19) |  | 日期时间 (UFDateTime) |
| 4 | rescount | 传输资源数 | rescount | int |  | 整数 (Integer) |
| 5 | execuser | 执行任务的用户编号 | execuser | varchar(20) |  | 用户 (user) |