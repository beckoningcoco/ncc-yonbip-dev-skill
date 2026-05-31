# |<<

**传输内容对象 (adp_tasktranscnt / nc.vo.uap.distribution.schedtranstask.TaskTransContentVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/34.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | contentid | 传输内容id | contentid | char(20) | √ | 主键 (UFID) |
| 2 | restypeid | 传输资源id | restypeid | varchar(20) |  | 传输资源注册信息 (resourcetyperegister) |
| 3 | tasktranscontent | 任务实际内容 | tasktranscontent | image |  | BLOB (BLOB) |
| 4 | tasktransrule | 传输规则内容 | tasktransrule | image |  | BLOB (BLOB) |
| 5 | neglecttimestamp | 增量传输 | neglecttimestamp | char(1) |  | 布尔类型 (UFBoolean) |