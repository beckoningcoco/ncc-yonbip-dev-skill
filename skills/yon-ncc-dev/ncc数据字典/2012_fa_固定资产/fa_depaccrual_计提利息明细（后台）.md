# |<<

**计提利息明细（后台） (fa_depaccrual / nc.vo.fa.assetcard.DepAccrualVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2004.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_depaccrual | 主键 | pk_depaccrual | char(20) | √ | 主键 (UFID) |
| 2 | accounting_period | 期间 | accounting_period | char(19) |  | 日期 (UFDate) |
| 3 | day_date | 日期 | day_date | char(19) |  | 日期 (UFDate) |
| 4 | begin_date | 起始日期 | begin_date | char(19) |  | 日期 (UFDate) |
| 5 | end_date | 截止日期 | end_date | char(19) |  | 日期 (UFDate) |
| 6 | begin_liability | 期初租赁负债 | begin_liability | decimal(28, 8) |  | 金额 (UFMoney) |
| 7 | interest | 计提利息(原币) | interest | decimal(28, 8) |  | 金额 (UFMoney) |
| 8 | end_liability | 期末租赁负债 | end_liability | decimal(28, 8) |  | 金额 (UFMoney) |
| 9 | change_information | 变更信息 | change_information | varchar(200) |  | 字符串 (String) |
| 10 | remarks | 备注 | remarks | varchar(200) |  | 字符串 (String) |
| 11 | calculate_renttax | 含税租金 | calculate_renttax | decimal(28, 8) |  | 金额 (UFMoney) |
| 12 | calculate_rentnotax | 无税租金 | calculate_rentnotax | decimal(28, 8) |  | 金额 (UFMoney) |
| 13 | discouted | 计算属性 | discouted | decimal(28, 8) |  | 金额 (UFMoney) |
| 14 | isaccruedbymonth | 按月计提标识 | isaccruedbymonth | char(1) |  | 布尔类型 (UFBoolean) |
| 15 | pk_card | 卡片主键 | pk_card | char(20) |  | 主键 (UFID) |
| 16 | def1 | 自定义项1 | def1 | varchar(101) |  | 自定义项 (Custom) |
| 17 | def2 | 自定义项2 | def2 | varchar(101) |  | 自定义项 (Custom) |
| 18 | def3 | 自定义项3 | def3 | varchar(101) |  | 自定义项 (Custom) |
| 19 | def4 | 自定义项4 | def4 | varchar(101) |  | 自定义项 (Custom) |
| 20 | def5 | 自定义项5 | def5 | varchar(101) |  | 自定义项 (Custom) |