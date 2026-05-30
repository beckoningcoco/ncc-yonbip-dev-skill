# |<<

**银行托收子表 (fbm_consignbank_b / nc.vo.fbm.consignbank.ConsignBankBVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2123.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_consignbank_b | 主键 | pk_consignbank_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_entrustorg | 业务组织 | pk_entrustorg | varchar(20) |  | 组织 (org) |
| 3 | fbmbillno | 票据编号 | fbmbillno | varchar(50) |  | 主键 (UFID) |
| 4 | rowno | 行号 | rowno | varchar(50) |  | 字符串 (String) |
| 5 | iscantrans | 能否转让 | iscantrans | char(1) |  | 布尔类型 (UFBoolean) |
| 6 | collectionplanitem | 托收计划项目 | collectionplanitem | varchar(20) |  | 资金计划项目 (fundplan) |
| 7 | fbmplanitem | 收票支出计划项目 | fbmplanitem | varchar(20) |  | 资金计划项目 (fundplan) |
| 8 | onlinebankflag | 网银办理 | onlinebankflag | char(1) |  | 布尔类型 (UFBoolean) |
| 9 | opbilltype | 票据类别 | opbilltype | varchar(30) |  | 票据类别 (ConsignBankBillTypeEnum) |  | bill_privacy=私有; |