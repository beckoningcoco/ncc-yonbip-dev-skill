# |<<

**薪资条项目明细 (wa_payslip_item / nc.vo.wa.payslip.PayslipItemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6342.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_payslip_item | 薪资条项目主键 | pk_payslip_item | char(20) | √ | 主键 (UFID) |
| 2 | pk_payslip | 薪资条主键 | pk_payslip | char(20) |  | 主键 (UFID) |
| 3 | item_table | 项目表 | item_table | varchar(50) |  | 字符串 (String) |
| 4 | slip_item | 项目主键 | slip_item | char(20) |  | 主键 (UFID) |
| 5 | pre_flag | 是否是预制 | pre_flag | char(50) |  | 字符串 (String) |
| 6 | item_displayname | 项目显示名称 | item_displayname | varchar(50) |  | 字符串 (String) |
| 7 | showorder | 项目显示顺序 | showorder | int |  | 整数 (Integer) |
| 8 | iscountpro | 是否合计 | iscountpro | char(1) |  | 布尔类型 (UFBoolean) |
| 9 | data_type | 数据类型 | data_type | int |  | 整数 (Integer) |
| 10 | iflddecimal | iflddecimal | iflddecimal | int |  | 整数 (Integer) |
| 11 | isemppro | 我的薪资是否显示 | isemppro | char(1) |  | 数值 (UFDouble) |
| 12 | ismngpro | 员工薪资是否显示 | ismngpro | char(1) |  | 数值 (UFDouble) |
| 13 | dr | dr | dr | int |  | 整数 (Integer) |