# |<<

**monitor (iufo_monitor / nc.vo.iufo.monitor.MonitorVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3482.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pkvalue | 主键 | pkvalue | char(50) | √ | 主键 (UFID) |
| 2 | repname | 报表名称 | repname | varchar(1024) |  | 字符串 (String) |
| 3 | comcell | 已完成单元数 | comcell | int |  | 整数 (Integer) |
| 4 | nocomcell | 未完成单元数 | nocomcell | int |  | 整数 (Integer) |
| 5 | avgcost | 平均耗时 | avgcost | decimal(28, 8) |  | 数值 (UFDouble) |
| 6 | bigcost | 最大耗时 | bigcost | varchar(200) |  | 备注 (Memo) |