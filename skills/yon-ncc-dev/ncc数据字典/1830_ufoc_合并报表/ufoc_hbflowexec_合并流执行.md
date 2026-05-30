# |<<

**合并流执行 (ufoc_hbflowexec / nc.vo.hbbb.hbflow.HBFlowExecVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5880.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_exec | 主键 | pk_exec | varchar(50) | √ | 字符串 (String) |
| 2 | pk_org | 组织 | pk_org | varchar(20) |  | 组织_业务单元_报表组织 (reportorg) |
| 3 | generalstate | 合并总状态 | generalstate | varchar(50) |  | 字符串 (String) |
| 4 | step1 | 合并步骤 | step1 | varchar(50) |  | 字符串 (String) |
| 5 | aloneid | aloneid | aloneid | varchar(50) |  | 字符串 (String) |
| 6 | pk_fatherorg | 上级组织 | pk_fatherorg | varchar(50) |  | 字符串 (String) |
| 7 | repstate | 个别报表状态 | repstate | varchar(50) |  | 个别报表状态 (sepstate) |  | 99=未录入; |