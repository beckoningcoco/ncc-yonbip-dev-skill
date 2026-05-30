# |<<

**合同交易类型扩展 (aol_cont_ext / nc.vo.aol.contract.leasecont.ContractOutExtVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/111.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_contract_ext | 合同交易扩展主键 | pk_contract_ext | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 集团属性 (groupsattribute) |
| 3 | transtypecode | 交易类型编码 | transtypecode | varchar(50) |  | 字符串 (String) |
| 4 | settle_flag | 是否结算 | settle_flag | char(1) |  | 布尔类型 (UFBoolean) |