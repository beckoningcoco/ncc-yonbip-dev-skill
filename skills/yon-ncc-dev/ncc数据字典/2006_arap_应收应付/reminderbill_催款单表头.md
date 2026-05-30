# |<<

**催款单表头 (reminderbill / nc.vo.arap.reminder.ReminderBillVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4870.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_reminder | 催款单表头pk | pk_reminder | varchar(50) | √ | 字符串 (String) |
| 2 | reminder_customer | 催款对象 | reminder_customer | varchar(20) |  | 客户基本信息 (customer) |
| 3 | ybye | 原币余额 | ybye | decimal(28, 8) |  | 数值 (UFDouble) |
| 4 | reminder_dept | 催款对象 | reminder_dept | varchar(20) |  | 组织_部门 (dept) |
| 5 | reminder_psndoc | 催款对象 | reminder_psndoc | varchar(20) |  | 人员基本信息 (psndoc) |
| 6 | notice | 催款用语 | notice | varchar(500) |  | 字符串 (String) |
| 7 | expiredmny | 已到期款项 | expiredmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 8 | unexpiremny | 未到期款项 | unexpiremny | decimal(28, 8) |  | 数值 (UFDouble) |