# |<<

**收款结算单明细 (cmp_recbilldetail / nc.vo.cmp.bill.RecBillDetailVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1578.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_recbill_detail | 辅表主键 | pk_recbill_detail | varchar(20) | √ | 主键 (UFID) |
| 2 | pk_org | 结算财务组织 | pk_org | varchar(20) | √ | 组织_业务单元_财务组织 (financeorg) |
| 3 | pk_pcorg | 利润中心 | pk_pcorg | varchar(20) |  | 利润中心 (profitcenter) |
| 4 | pk_fiorg | 财务组织 | pk_fiorg | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 5 | pk_group | 所属集团 | pk_group | varchar(20) | √ | 组织_集团 (group) |
| 6 | pk_account | 收款银行账户 | pk_account | varchar(20) |  | 银行账户子户 (bankaccsub) |
| 7 | pk_oppaccount | 付款银行账号 | pk_oppaccount | varchar(20) |  | 客商银行账户子户 (custbankaccsub) |
| 8 | oppaccountname | 付款账户户名 | oppaccountname | varchar(200) |  | 字符串 (String) |
| 9 | oppaccountcode | 付款银行账户编码 | oppaccountcode | varchar(50) |  | 字符串 (String) |
| 10 | oppaccountopenbank | 付款银行名称 | oppaccountopenbank | varchar(200) |  | 字符串 (String) |
| 11 | cash_item | 现金流量项目 | cash_item | varchar(20) |  | 现金流量项目 (cashflow) |
| 12 | bankroll_projet | 资金计划项目 | bankroll_projet | varchar(20) |  | 资金计划项目 (fundplan) |
| 13 | note_type | 票据类型 | note_type | varchar(20) |  | 票据类型 (notetype) |
| 14 | note_no | 票据号 | note_no | varchar(20) |  | 票据登记 (fbm_register) |
| 15 | blanknote_no | 空白票据号 | blanknote_no | varchar(100) |  | 字符串 (String) |
| 16 | pk_balatype | 结算方式 | pk_balatype | varchar(20) |  | 结算方式 (balatype) |
| 17 | cinventoryid | 物料基本信息 | cinventoryid | varchar(20) |  | 物料基本信息（多版本） (material) |
| 18 | pk_recproject | 收支项目 | pk_recproject | varchar(20) |  | 收支项目 (inoutbusiclass) |
| 19 | pk_busiman | 业务员 | pk_busiman | varchar(20) |  | 人员基本信息 (psndoc) |
| 20 | pk_dept | 部门 | pk_dept | varchar(20) |  | 组织_部门 (dept) |
| 21 | pk_currtype | 币种 | pk_currtype | varchar(20) |  | 币种 (currtype) |
| 22 | pk_supplier | 供应商 | pk_supplier | varchar(20) |  | 供应商基本信息 (supplier) |
| 23 | pk_customer | 客户 | pk_customer | varchar(20) |  | 客户基本信息 (customer) |
| 24 | pk_subjct | 科目 | pk_subjct | varchar(20) |  | 会计科目 (accasoa) |
| 25 | memo | 摘要 | memo | varchar(181) |  | 字符串 (String) |
| 26 | freeitemid | 自由项关联主键 | freeitemid | varchar(20) |  | 主键 (UFID) |
| 27 | bill_no | 单据编号冗余 | bill_no | varchar(40) |  | 字符串 (String) |
| 28 | teade_type | 单据类型pk冗余 | teade_type | varchar(20) |  | 字符串 (String) |
| 29 | billdetail_no | 单据分录编号 | billdetail_no | int |  | 整数 (Integer) |
| 30 | direction | 方向 | direction | int | √ | 方向 (direction) |  | 1=收; |