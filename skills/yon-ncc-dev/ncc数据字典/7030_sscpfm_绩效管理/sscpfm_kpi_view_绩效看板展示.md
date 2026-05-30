# |<<

**绩效看板展示 (sscpfm_kpi_view / nc.vo.sscpfm.kpi.PFMKpiViewVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5578.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | id | id | id | varchar(36) | √ | 字符串 (String) |
| 2 | animation | 动画效果 | animation | varchar(254) |  | 字符串 (String) |
| 3 | backgroundcolor | 背景颜色 | backgroundcolor | varchar(50) |  | 字符串 (String) |
| 4 | config | 配置信息 | config | text(0) |  | BLOB (BLOB) |
| 5 | groupid | 看板群组主键 | groupid | varchar(50) |  | 字符串 (String) |
| 6 | name | 名称 | name | varchar(254) |  | 字符串 (String) |
| 7 | refreshtime | 刷新时间 | refreshtime | int |  | 整数 (Integer) |
| 8 | showorder | 排序 | showorder | int |  | 整数 (Integer) |
| 9 | showtime | 展示时间 | showtime | int |  | 整数 (Integer) |