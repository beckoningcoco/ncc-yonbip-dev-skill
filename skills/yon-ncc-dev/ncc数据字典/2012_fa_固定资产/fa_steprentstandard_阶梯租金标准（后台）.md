# |<<

**阶梯租金标准（后台） (fa_steprentstandard / nc.vo.fa.assetcard.StepRentStandardVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2063.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_steprentstandard | 主键 | pk_steprentstandard | char(20) | √ | 主键 (UFID) |
| 2 | start_date | 开始月份 | start_date | char(19) |  | 日期(开始) (UFDateBegin) |
| 3 | end_date | 结束月份 | end_date | char(19) |  | 日期(结束) (UFDateEnd) |
| 4 | rent | 租金 | rent | decimal(28, 8) |  | 金额 (UFMoney) |
| 5 | remarks | 备注 | remarks | varchar(200) |  | 字符串 (String) |
| 6 | pk_card | 卡片主键 | pk_card | char(20) |  | 主键 (UFID) |