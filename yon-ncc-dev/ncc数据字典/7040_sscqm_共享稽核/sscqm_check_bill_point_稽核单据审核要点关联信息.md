# |<<

**稽核单据审核要点关联信息 (sscqm_check_bill_point / nccloud.vo.sscqm.qualityapi.vo.CheckBillPointVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5597.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | id | 主键 | id | char(20) | √ | 主键 (UFID) |
| 2 | checkbillid | 稽核单据 | checkbillid | varchar(50) |  | 字符串 (String) |
| 3 | taskid | 稽核任务 | taskid | varchar(50) |  | 字符串 (String) |
| 4 | pointid | 审核要点 | pointid | varchar(50) |  | 字符串 (String) |
| 5 | checkresult | 审核结果 | checkresult | char(1) |  | 布尔类型 (UFBoolean) |