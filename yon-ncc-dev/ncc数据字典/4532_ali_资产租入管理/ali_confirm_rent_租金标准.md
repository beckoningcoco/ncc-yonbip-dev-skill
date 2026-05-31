# |<<

**租金标准 (ali_confirm_rent / nc.vo.ali.used.confirm.RentVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/39.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_rent | 租金标准主键 | pk_rent | char(20) | √ | 主键 (UFID) |
| 2 | pk_contract_b | 合同基本等页签主键 | pk_contract_b | varchar(50) |  | 字符串 (String) |
| 3 | start_date | 起始日期 | start_date | char(19) |  | 日期(开始) (UFDateBegin) |
| 4 | end_date | 截止日期 | end_date | char(19) |  | 日期(结束) (UFDateEnd) |
| 5 | pre_rent_tax | 租金单价含税 | pre_rent_tax | decimal(28, 8) |  | 数值 (UFDouble) |
| 6 | pre_rent_notax | 租金单价无税 | pre_rent_notax | decimal(28, 8) |  | 数值 (UFDouble) |
| 7 | pre_rent_tax_org | 租金单价含税（本币） | pre_rent_tax_org | decimal(28, 8) |  | 数值 (UFDouble) |
| 8 | pre_rent_notax_org | 租金单价无税（本币） | pre_rent_notax_org | decimal(28, 8) |  | 数值 (UFDouble) |
| 9 | memo | 备注 | memo | varchar(50) |  | 字符串 (String) |
| 10 | def1 | 自定义项1 | def1 | varchar(101) |  | 自定义项 (Custom) |
| 11 | def2 | 自定义项2 | def2 | varchar(101) |  | 自定义项 (Custom) |
| 12 | def3 | 自定义项3 | def3 | varchar(101) |  | 自定义项 (Custom) |
| 13 | def4 | 自定义项4 | def4 | varchar(101) |  | 自定义项 (Custom) |
| 14 | def5 | 自定义项5 | def5 | varchar(101) |  | 自定义项 (Custom) |