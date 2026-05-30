# |<<

**支付条款 (ewm_mtcon_pay / nc.vo.ewm.maintaincon.MaintainConPayVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1935.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_mtcon_pay | 支付条款主键 | pk_mtcon_pay | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 维修组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_维修组织 (maintainorg) |
| 4 | pk_org_v | 维修组织 | pk_org_v | varchar(20) |  | 组织_业务单元_维修组织版本信息 (maintainorg_v) |
| 5 | rowno | 行号 | rowno | varchar(30) |  | 字符串 (String) |
| 6 | pay_condition | 支付条件 | pay_condition | varchar(200) |  | 字符串 (String) |
| 7 | plan_pay_date | 计划支付日期 | plan_pay_date | char(19) |  | 日期(开始) (UFDateBegin) |
| 8 | pay_content | 支付内容 | pay_content | varchar(200) |  | 字符串 (String) |
| 9 | pay_proportion | 支付比例(%) | pay_proportion | varchar(80) |  | 字符串 (String) |
| 10 | plan_pay | 计划原币支付金额 | plan_pay | decimal(28, 8) |  | 金额 (UFMoney) |
| 11 | plan_pay_org | 计划本币支付金额 | plan_pay_org | decimal(28, 8) |  | 金额 (UFMoney) |
| 12 | plan_pay_group | 计划本币支付金额集团 | plan_pay_group | decimal(28, 8) |  | 金额 (UFMoney) |
| 13 | plan_pay_global | 计划本币支付金额全局 | plan_pay_global | decimal(28, 8) |  | 金额 (UFMoney) |
| 14 | act_pay_date | 实际支付日期 | act_pay_date | char(19) |  | 日期 (UFDate) |
| 15 | act_pay | 实际原币支付金额 | act_pay | decimal(28, 8) |  | 金额 (UFMoney) |
| 16 | act_pay_org | 实际本币支付金额 | act_pay_org | decimal(28, 8) |  | 金额 (UFMoney) |
| 17 | act_pay_group | 实际本币支付金额集团 | act_pay_group | decimal(28, 8) |  | 金额 (UFMoney) |
| 18 | act_pay_global | 实际本币支付金额全局 | act_pay_global | decimal(28, 8) |  | 金额 (UFMoney) |
| 19 | memo | 备注 | memo | varchar(200) |  | 字符串 (String) |
| 20 | def1 | 自定义项1 | def1 | varchar(101) |  | 自定义项 (Custom) |
| 21 | def2 | 自定义项2 | def2 | varchar(101) |  | 自定义项 (Custom) |
| 22 | def3 | 自定义项3 | def3 | varchar(101) |  | 自定义项 (Custom) |
| 23 | def4 | 自定义项4 | def4 | varchar(101) |  | 自定义项 (Custom) |
| 24 | def5 | 自定义项5 | def5 | varchar(101) |  | 自定义项 (Custom) |