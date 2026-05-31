# |<<

**周转材租出合同交易类型扩展 (rom_contract_ext / nc.vo.rom.contract.ContractOutExtVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4989.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_contract_ext | 交易类型扩展主键 | pk_contract_ext | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | lease_out_flag | 外部租赁 | lease_out_flag | char(1) |  | 布尔类型 (UFBoolean) |
| 4 | lease_in_flag | 内部租赁-协同 | lease_in_flag | char(1) |  | 布尔类型 (UFBoolean) |
| 5 | lease_alone_flag | 内部租赁-单方 | lease_alone_flag | char(1) |  | 布尔类型 (UFBoolean) |
| 6 | transtypecode | 交易类型编码 | transtypecode | varchar(30) |  | 字符串 (String) |
| 7 | pk_transtype | 交易类型 | pk_transtype | varchar(20) |  | 单据类型 (BilltypeVO) |