# |<<

**担保合同版本 (ccc_guarantee_v / nc.vo.ccc.bankprotocol.GuaranteeVersionVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1315.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_version | 版本pk | pk_version | char(20) | √ | 主键 (UFID) |
| 2 | pk_guarantee | 主键 | pk_guarantee | char(20) | √ | 字符串 (String) |
| 3 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 5 | pk_org_v | 财务组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 6 | guarantee | 担保合约 | guarantee | varchar(20) |  | 担保合同 (GuaContractVO) |
| 7 | pk_currtype | 担保币种 | pk_currtype | varchar(20) |  | 币种 (currtype) |
| 8 | useguamoney | 占用担保额度 | useguamoney | decimal(28, 8) |  | 金额 (UFMoney) |
| 9 | rowno | 行号 | rowno | int |  | 整数 (Integer) |
| 10 | olcguarate | 占用担保组织汇率 | olcguarate | decimal(15, 8) |  | 数值 (UFDouble) |
| 11 | glcguarate | 占用担保集团汇率 | glcguarate | decimal(15, 8) |  | 数值 (UFDouble) |
| 12 | gllguarate | 占用担保全局汇率 | gllguarate | decimal(15, 8) |  | 数值 (UFDouble) |
| 13 | olcguacdtlnamt | 占用担保组织本币额度 | olcguacdtlnamt | decimal(28, 8) |  | 金额 (UFMoney) |
| 14 | glcguacdtlnamt | 占用担保集团本币额度 | glcguacdtlnamt | decimal(28, 8) |  | 金额 (UFMoney) |
| 15 | gllguacdtlnamt | 占用担保全局本币额度 | gllguacdtlnamt | decimal(28, 8) |  | 金额 (UFMoney) |
| 16 | guatype | 担保方式 | guatype | varchar(50) |  | 担保方式 (GuaranteeTypeEnum) |  | credit=信用; |