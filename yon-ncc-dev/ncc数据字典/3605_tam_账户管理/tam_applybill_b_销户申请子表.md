# |<<

**销户申请子表 (tam_applybill_b / nc.vo.tam.account.destroy.DestroyApplySubVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5678.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_applychild | 销户申请子表主键 | pk_applychild | char(20) | √ | 主键 (UFID) |
| 2 | pk_bankaccsub | 子户档案 | pk_bankaccsub | varchar(20) |  | 银行账户子户 (bankaccsub) |
| 3 | sub_code | 子户编码 | sub_code | varchar(40) |  | 字符串 (String) |
| 4 | sub_name | 子户名称 | sub_name | varchar(181) |  | 字符串 (String) |
| 5 | pk_currtype | 币种编码 | pk_currtype | varchar(20) |  | 币种 (currtype) |
| 6 | account_type | 账户类型 | account_type | int |  | 账户类型 (accounttype) |  | 0=活期; |