# |<<

**催款语气子表 (arap_notice_b / nc.vo.arap.reminder.ArapNoticeItemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/188.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_notice_b | 催款语气子表pk | pk_notice_b | varchar(20) | √ | 字符串 (String) |
| 2 | beizhu | 备注 | beizhu | varchar(100) |  | 字符串 (String) |
| 3 | startvalue | 下限 | startvalue | decimal(28, 8) |  | 数值 (UFDouble) |
| 4 | endvalue | 上限 | endvalue | decimal(28, 8) |  | 数值 (UFDouble) |
| 5 | notice | 催款用语 | notice | varchar(1000) |  | 字符串 (String) |
| 6 | pk_notice | 催款语气主表pk | pk_notice | varchar(20) |  | 字符串 (String) |
| 7 | propertyid | 序号 | propertyid | int |  | 整数 (Integer) |