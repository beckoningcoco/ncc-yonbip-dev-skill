# |<<

**报销标准 (er_reimruler / nc.vo.er.reimrule.ReimRulerVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1914.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_reimrule | 报销标准主键 | pk_reimrule | char(20) | √ | 主键 (UFID) |
| 2 | pk_expensetype | 费用类型 | pk_expensetype | varchar(36) |  | 费用类型 (ExpenseType) |
| 3 | pk_expensetype_name | 费用类型名称 | pk_expensetype_name | varchar(50) |  | 字符串 (String) |
| 4 | pk_reimtype | 报销类型 | pk_reimtype | varchar(36) |  | 报销类型 (ReimType) |
| 5 | pk_reimtype_name | 报销类型名称 | pk_reimtype_name | varchar(50) |  | 字符串 (String) |
| 6 | pk_deptid | 部门 | pk_deptid | varchar(36) |  | 组织_部门 (dept) |
| 7 | pk_deptid_name | 部门名称 | pk_deptid_name | varchar(50) |  | 字符串 (String) |
| 8 | pk_position | 职位 | pk_position | varchar(36) |  | 字符串 (String) |
| 9 | pk_position_name | 职位名称 | pk_position_name | varchar(50) |  | 字符串 (String) |
| 10 | pk_currtype | 币种 | pk_currtype | varchar(36) |  | 币种 (currtype) |
| 11 | pk_currtype_name | 币种名称 | pk_currtype_name | varchar(50) |  | 字符串 (String) |
| 12 | amount | 金额 | amount | decimal(28, 8) |  | 数值 (UFDouble) |
| 13 | amount_name | 金额名称 | amount_name | varchar(50) |  | 字符串 (String) |
| 14 | memo | 备注 | memo | varchar(50) |  | 字符串 (String) |
| 15 | memo_name | 备注名称 | memo_name | varchar(50) |  | 字符串 (String) |
| 16 | def1_name | 自定义项1名称 | def1_name | varchar(50) |  | 字符串 (String) |
| 17 | def2_name | 自定义项2名称 | def2_name | varchar(50) |  | 字符串 (String) |
| 18 | def3_name | 自定义项3名称 | def3_name | varchar(50) |  | 字符串 (String) |
| 19 | def4_name | 自定义项4名称 | def4_name | varchar(50) |  | 字符串 (String) |
| 20 | def5_name | 自定义项5名称 | def5_name | varchar(50) |  | 字符串 (String) |
| 21 | def6_name | 自定义项6名称 | def6_name | varchar(50) |  | 字符串 (String) |
| 22 | def7_name | 自定义项7名称 | def7_name | varchar(50) |  | 字符串 (String) |
| 23 | def8_name | 自定义项8名称 | def8_name | varchar(50) |  | 字符串 (String) |
| 24 | def9_name | 自定义项9名称 | def9_name | varchar(50) |  | 字符串 (String) |
| 25 | def10_name | 自定义项10名称 | def10_name | varchar(50) |  | 字符串 (String) |
| 26 | def11_name | 自定义项11名称 | def11_name | varchar(50) |  | 字符串 (String) |
| 27 | def12_name | 自定义项12名称 | def12_name | varchar(50) |  | 字符串 (String) |
| 28 | def13_name | 自定义项13名称 | def13_name | varchar(50) |  | 字符串 (String) |
| 29 | def14_name | 自定义项14名称 | def14_name | varchar(50) |  | 字符串 (String) |
| 30 | def15_name | 自定义项15名称 | def15_name | varchar(50) |  | 字符串 (String) |
| 31 | def16_name | 自定义项16名称 | def16_name | varchar(50) |  | 字符串 (String) |
| 32 | def17_name | 自定义项17名称 | def17_name | varchar(50) |  | 字符串 (String) |
| 33 | def18_name | 自定义项18名称 | def18_name | varchar(50) |  | 字符串 (String) |
| 34 | def19_name | 自定义项19名称 | def19_name | varchar(50) |  | 字符串 (String) |
| 35 | def20_name | 自定义项20名称 | def20_name | varchar(50) |  | 字符串 (String) |
| 36 | priority | 优先级 | priority | int |  | 整数 (Integer) |
| 37 | pk_group | 集团 | pk_group | varchar(36) |  | 组织_集团 (group) |
| 38 | pk_org | 组织 | pk_org | varchar(36) |  | 组织_业务单元_财务组织 (financeorg) |
| 39 | pk_billtype | 单据类型 | pk_billtype | varchar(20) |  | 字符串 (String) |
| 40 | defformula | 自定义公式 | defformula | varchar(50) |  | 字符串 (String) |
| 41 | validateformula | 验证公式 | validateformula | varchar(50) |  | 字符串 (String) |
| 42 | showitem | 显示项 | showitem | varchar(50) |  | 字符串 (String) |
| 43 | showitem_name | 显示项名称 | showitem_name | varchar(50) |  | 字符串 (String) |
| 44 | controlitem | 控制项 | controlitem | varchar(50) |  | 字符串 (String) |
| 45 | controlitem_name | 控制项名称 | controlitem_name | varchar(50) |  | 字符串 (String) |
| 46 | controlflag | 控制模式 | controlflag | int |  | 控制模式 (controlflag) |  | 0=不控制; |