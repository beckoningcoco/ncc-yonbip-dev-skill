# |<<

**共享中心_绩效岗位数据表 (sscpfm_timetable / nc.vo.sscpfm.basic.PFMTimeTableVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5588.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | id | 主键 | id | varchar(50) | √ | 字符串 (String) |
| 2 | sscpost | 作业组主键 | sscpost | varchar(50) | √ | 字符串 (String) |
| 3 | time | 小时 | time | varchar(50) |  | 字符串 (String) |
| 4 | value | 流程数据 | value | int |  | 整数 (Integer) |
| 5 | ssc_date | 日期 | ssc_date | char(19) |  | 日期 (UFDate) |
| 6 | sscunit | 共享中心主键 | sscunit | varchar(50) |  | 字符串 (String) |
| 7 | num_deal | 已处理单据数据 | num_deal | int |  | 整数 (Integer) |