# |<<

**开票申请担保子表 (cfbm_sign_apply_b / nc.vo.cfbm.signapply.SignApplyBVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1430.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_sign_apply_b | 主键 | pk_sign_apply_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_sign_apply | 主表主键 | pk_sign_apply | varchar(20) |  | 主键 (UFID) |
| 4 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 5 | pk_org_v | 所属组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 6 | pk_gpmcurr | 担保合同币种 | pk_gpmcurr | varchar(20) |  | 币种 (currtype) |
| 7 | guaranteeamount | 占用担保金额 | guaranteeamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 8 | olcguaranteeamount | 占用担保组织本币金额 | olcguaranteeamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 9 | glcguaranteeamount | 占用担保集团本币金额 | glcguaranteeamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 10 | gllguaranteeamount | 占用担保全局本币金额 | gllguaranteeamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 11 | guarantallamout | 担保合同总金额 | guarantallamout | decimal(28, 8) |  | 金额 (UFMoney) |
| 12 | pk_guarantee | 担保合同 | pk_guarantee | varchar(20) |  | 担保合同 (GuaContractVO) |
| 13 | guanrantorg | 担保单位 | guanrantorg | varchar(50) |  | 字符串 (String) |
| 14 | guanstartdate | 担保合同开始日期 | guanstartdate | char(19) |  | 日期 (UFDate) |
| 15 | guanenddate | 担保合同结束日期 | guanenddate | char(19) |  | 日期 (UFDate) |
| 16 | guantype | 担保方式 | guantype | int |  | 担保方式 (DebttypeEnum) |  | 1=保证; |