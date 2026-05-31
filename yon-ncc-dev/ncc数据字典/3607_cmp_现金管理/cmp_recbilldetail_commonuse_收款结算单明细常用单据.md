# |<<

**收款结算单明细常用单据 (cmp_recbilldetail_commonuse / nc.vo.cmp.commonusebill.CommonUseRecBillDetailVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1579.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_recbill_detail | 辅表主键 | pk_recbill_detail | varchar(20) | √ | 主键 (UFID) |
| 2 | pk_org | 结算财务组织 | pk_org | varchar(20) | √ | 组织_业务单元_财务组织 (financeorg) |
| 3 | pk_pcorg | 利润中心 | pk_pcorg | varchar(20) |  | 利润中心 (profitcenter) |
| 4 | pk_fiorg | 财务组织 | pk_fiorg | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 5 | pk_group | 所属集团 | pk_group | varchar(20) | √ | 组织_集团 (group) |
| 6 | pk_account | 收款银行帐户 | pk_account | varchar(20) |  | 银行账户子户 (bankaccsub) |
| 7 | pk_oppaccount | 付款银行帐户 | pk_oppaccount | varchar(20) |  | 客商银行账户 (custsupbank) |
| 8 | oppaccountname | 付款银行账户名称 | oppaccountname | varchar(200) |  | 字符串 (String) |
| 9 | oppaccounttype | 付款银行账户性质 | oppaccounttype | int |  | 银行账户性质 (enum) |  | 0=公司; |