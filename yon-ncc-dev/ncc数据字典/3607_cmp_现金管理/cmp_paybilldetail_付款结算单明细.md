# |<<

**付款结算单明细 (cmp_paybilldetail / nc.vo.cmp.bill.BillDetailVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1573.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_paybill_detail | 辅表主键 | pk_paybill_detail | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 结算财务组织 | pk_org | varchar(20) | √ | 组织_业务单元_财务组织 (financeorg) |
| 3 | pk_fiorg | 财务组织 | pk_fiorg | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | pk_pcorg | 利润中心 | pk_pcorg | varchar(20) |  | 利润中心 (profitcenter) |
| 5 | pk_account | 收款银行账号 | pk_account | varchar(20) |  | 客商银行账户子户 (custbankaccsub) |
| 6 | accounttype | 收款账户性质 | accounttype | int |  | 银行账户性质 (enum) |  | 0=公司; |