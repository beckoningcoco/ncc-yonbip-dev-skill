# |<<

**绩效看板_本月作业人员处理量表 (sscpfm_user_num / nc.vo.sscpfm.basic.PFMUserNumVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5591.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | id | 主键 | id | varchar(50) | √ | 字符串 (String) |
| 2 | sscpost | 作业组主键 | sscpost | varchar(50) |  | 字符串 (String) |
| 3 | sscuser | 作业人员主键 | sscuser | varchar(50) |  | 字符串 (String) |
| 4 | sscunit | 共享中心主键 | sscunit | varchar(50) |  | 字符串 (String) |
| 5 | num_deal | 已处理单据数量 | num_deal | int |  | 整数 (Integer) |
| 6 | time_deal | 总处理时长（分钟） | time_deal | int |  | 整数 (Integer) |
| 7 | work_deal | 工作日历总处理时长（分钟） | work_deal | int |  | 整数 (Integer) |