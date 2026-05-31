# |<<

**销售大屏数据抽取日志 (so_dashboard_log / nc.vo.so.dashboard.entity.SODashboardLogVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5398.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_so_dashboard_log | 销售大屏数据抽取日志 | pk_so_dashboard_log | char(20) | √ | 主键 (UFID) |
| 2 | lastts | 抽取时间左边界 | lastts | char(19) |  | 日期时间 (UFDateTime) |
| 3 | nextts | 抽取时间右边界 | nextts | char(19) |  | 日期时间 (UFDateTime) |
| 4 | status | 执行状态 | status | varchar(1) |  | 字符串 (String) |