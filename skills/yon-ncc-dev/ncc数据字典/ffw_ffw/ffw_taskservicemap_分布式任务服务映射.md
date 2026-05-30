# |<<

**分布式任务服务映射 (ffw_taskservicemap / nc.vo.ffw.taskservicemap.TaskServiceMapVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2194.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_taskservicemap | 主键 | pk_taskservicemap | char(20) | √ | 主键 (UFID) |
| 2 | pk_distributetasktype | 任务类型 | pk_distributetasktype | varchar(20) |  | 分布式任务类型 (distributetasktype) |
| 3 | servicename | 服务名 | servicename | varchar(50) |  | 字符串 (String) |
| 4 | threadnum | 线程数量 | threadnum | int |  | 整数 (Integer) |