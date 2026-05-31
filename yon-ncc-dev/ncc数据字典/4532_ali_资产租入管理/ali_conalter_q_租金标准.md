# |<<

**租金标准 (ali_conalter_q / nc.vo.ali.contract.alter.ContractInAlterRentVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/37.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_contalter_q | 租金标准主键 | pk_contalter_q | char(20) | √ | 主键 (UFID) |
| 2 | pk_contract_b | 业务主键 | pk_contract_b | varchar(50) |  | 字符串 (String) |
| 3 | start_date | 起始日期 | start_date | char(19) |  | 日期(开始) (UFDateBegin) |
| 4 | end_date | 截止日期 | end_date | char(19) |  | 日期(结束) (UFDateEnd) |
| 5 | pre_rent_tax | 租金标准含税金额 | pre_rent_tax | decimal(28, 8) |  | 金额 (UFMoney) |
| 6 | pre_rent_tax_org | 租金标准含税金额（本币） | pre_rent_tax_org | decimal(28, 8) |  | 金额 (UFMoney) |
| 7 | pre_rent_type | 租金标准类型 | pre_rent_type | int |  | 租金标准类型 (RentTypeConst) |  | 1=租金标准; |