# |<<

**报告问题描述 (sscqm_check_report_problem / nccloud.vo.sscqm.qualityapi.vo.CheckReportProblemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5600.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | id | 主键 | id | char(20) | √ | 主键 (UFID) |
| 2 | reportid | 报告主键 | reportid | varchar(50) |  | 字符串 (String) |
| 3 | problemid | 问题类型主键 | problemid | varchar(50) |  | 字符串 (String) |
| 4 | problem_siz | 问题数量 | problem_siz | int |  | 整数 (Integer) |
| 5 | serious_level | 严重程度 | serious_level | varchar(50) |  | 字符串 (String) |
| 6 | problem_name | 问题名称 | problem_name | varchar(50) |  | 字符串 (String) |