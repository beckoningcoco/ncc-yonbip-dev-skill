# |<<

**租入合同交易类型扩展 (ali_contract_ext / nc.vo.ali.contract.leasecont.ContractInExtVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/47.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_contractin_ext | 租入合同交易扩展主键 | pk_contractin_ext | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 集团属性 (groupsattribute) |
| 3 | lease_out_flag | 外部租赁 | lease_out_flag | char(1) |  | 布尔类型 (UFBoolean) |
| 4 | lease_in_flag | 内部租赁-协同 | lease_in_flag | char(1) |  | 布尔类型 (UFBoolean) |
| 5 | cooperate_flag | 协同 | cooperate_flag | char(1) |  | 布尔类型 (UFBoolean) |
| 6 | lease_alone_flag | 内部租赁-单方 | lease_alone_flag | char(1) |  | 布尔类型 (UFBoolean) |
| 7 | transtypecode | 交易类型编码 | transtypecode | varchar(50) |  | 字符串 (String) |
| 8 | contract_pay_flag | 合同进行租金收取 | contract_pay_flag | char(1) |  | 布尔类型 (UFBoolean) |
| 9 | settle_pay_flag | 合同结算后收取租金 | settle_pay_flag | char(1) |  | 布尔类型 (UFBoolean) |
| 10 | framework_flag | 价格协议型合同租赁 | framework_flag | char(1) |  | 布尔类型 (UFBoolean) |
| 11 | non_fixed_flag | 非固定支付周期租赁 | non_fixed_flag | char(1) |  | 布尔类型 (UFBoolean) |