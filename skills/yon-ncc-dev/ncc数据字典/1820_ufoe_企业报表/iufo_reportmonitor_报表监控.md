# |<<

**报表监控 (iufo_reportmonitor / nc.vo.ufoe.monitor.IUFOMonitorVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3503.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_iufomonitor | pk_iufomonitor | pk_iufomonitor | char(20) | √ | 主键 (UFID) |
| 2 | pk_distributetask | pk_distributetask | pk_distributetask | char(20) | √ | 字符串 (String) |
| 3 | pk_distributesubtask | pk_distributesubtask | pk_distributesubtask | char(20) | √ | 字符串 (String) |
| 4 | errormsg | 错误信息 | errormsg | varchar(1000) |  | 字符串 (String) |
| 5 | reltype | 发布方式 | reltype | int |  | 发布方式 (reltypeenum) |  | 1=邮件发布; |