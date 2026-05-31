# |<<

**稽核问题记录表 (sscqm_check_bill_problem / nccloud.vo.sscqm.qualityapi.vo.CheckBillProblemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5598.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | id | pk | id | char(20) | √ | 主键 (UFID) |
| 2 | checkbillid | 稽核单据外键 | checkbillid | varchar(20) |  | 字符串 (String) |
| 3 | taskid | 任务表外键 | taskid | varchar(20) |  | 字符串 (String) |
| 4 | problemid | 稽核问题表外键 | problemid | varchar(20) |  | 字符串 (String) |
| 5 | problem_name | 稽核问题类型名称 | problem_name | varchar(200) |  | 字符串 (String) |
| 6 | serious_level | 问题严重程度 | serious_level | varchar(50) |  | 字符串 (String) |
| 7 | memo | 备注 | memo | varchar(400) |  | 字符串 (String) |
| 8 | problem_desc | 问题说明 | problem_desc | varchar(400) |  | 字符串 (String) |