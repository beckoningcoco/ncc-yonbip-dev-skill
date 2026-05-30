# |<<

**委托借款合同 (cdmc_consigncontract / nc.vo.cdmc.ccm.consigndebitcontract.ConsignDebitContractVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1329.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_contract | 合同主键 | pk_contract | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | pk_org_v | 组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 5 | vbillno | 合同编号 | vbillno | varchar(50) |  | 字符串 (String) |
| 6 | busitype | 业务类型 | busitype | varchar(50) |  | 业务类型 (BusiTypeEnum) |  | DEBIT=委借; |