# |<<

**卷积历史任务 (sca_convhistorytask / nc.vo.sca.stdcostconv.ConvHistoryTaskVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5040.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | ptk_historytask | 历史任务主键 | ptk_historytask | char(20) | √ | 主键 (UFID) |
| 2 | history_name | 卷积任务名称 | history_name | varchar(50) |  | 字符串 (String) |
| 3 | history_code | 卷积任务编码 | history_code | varchar(50) |  | 字符串 (String) |
| 4 | convdate | 卷积日期 | convdate | char(19) |  | 日期时间 (UFDateTime) |
| 5 | executor | 执行人 | executor | varchar(20) |  | 用户 (user) |
| 6 | execute_type | 任务类型 | execute_type | varchar(50) |  | 任务类型 (execute_type) |  | 1=手动; |