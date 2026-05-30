# |<<

**划账结算单明细常用单据 (cmp_changebilldetail_cu / nc.vo.cmp.commonusebill.CommonUseChangeBillDetailVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1549.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_changebill_detail | 辅表主键 | pk_changebill_detail | varchar(20) | √ | 主键 (UFID) |
| 2 | pk_org | 结算财务组织 | pk_org | varchar(20) | √ | 组织_业务单元_财务组织 (financeorg) |
| 3 | pk_fiorg | 财务组织 | pk_fiorg | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | pk_pcorg | 利润中心 | pk_pcorg | varchar(20) |  | 利润中心 (profitcenter) |
| 5 | pk_group | 所属集团 | pk_group | varchar(20) | √ | 组织_集团 (group) |
| 6 | pk_account | 收款银行账户 | pk_account | varchar(20) |  | 银行账户子户 (bankaccsub) |
| 7 | pk_oppaccount | 付款银行账户 | pk_oppaccount | varchar(20) |  | 银行账户子户 (bankaccsub) |
| 8 | mon_account | 现金账户 | mon_account | varchar(20) |  | 现金账户 (cashaccount) |
| 9 | bankroll_projet | 资金计划项目 | bankroll_projet | varchar(20) |  | 资金计划项目 (fundplan) |
| 10 | cash_item | 现金流量项目 | cash_item | varchar(20) |  | 现金流量项目 (cashflow) |
| 11 | note_type | 票据类型 | note_type | varchar(20) |  | 票据类型 (notetype) |
| 12 | pk_balatype | 结算方式 | pk_balatype | varchar(20) |  | 结算方式 (balatype) |
| 13 | cinventoryid | 物料基本信息 | cinventoryid | varchar(20) |  | 物料基本信息（多版本） (material) |
| 14 | pk_busiman | 业务员 | pk_busiman | varchar(20) |  | 人员基本信息 (psndoc) |
| 15 | pk_dept | 部门 | pk_dept | varchar(20) |  | 组织_部门 (dept) |
| 16 | pk_customer | 客户 | pk_customer | varchar(20) |  | 客户基本信息 (customer) |
| 17 | pk_supplier | 供应商 | pk_supplier | varchar(20) |  | 供应商基本信息 (supplier) |
| 18 | pk_corp | 公司 | pk_corp | varchar(20) |  | 组织_业务单元_公司 (corp) |
| 19 | pk_recproject | 收支项目 | pk_recproject | varchar(20) |  | 收支项目 (inoutbusiclass) |
| 20 | pk_subjct | 科目 | pk_subjct | varchar(20) |  | 会计科目 (accasoa) |
| 21 | pk_currtype | 币种 | pk_currtype | varchar(20) |  | 币种 (currtype) |
| 22 | memo | 摘要 | memo | varchar(181) |  | 字符串 (String) |
| 23 | freeitemid | 自由项关联主键 | freeitemid | varchar(20) |  | 主键 (UFID) |
| 24 | bill_no | 单据编号冗余 | bill_no | varchar(40) |  | 字符串 (String) |
| 25 | teade_type | 单据类型pk冗余 | teade_type | varchar(20) |  | 字符串 (String) |
| 26 | billdetail_no | 单据分录编号 | billdetail_no | int |  | 整数 (Integer) |
| 27 | local_rate | 组织本币汇率 | local_rate | decimal(15, 8) |  | 数值 (UFDouble) |
| 28 | price | 单价 | price | decimal(28, 8) |  | 数值 (UFDouble) |
| 29 | jobphaseid | 专项阶段 | jobphaseid | varchar(20) |  | 主键 (UFID) |
| 30 | trade_type | 单据类型编码 | trade_type | varchar(20) | √ | 字符串 (String) |
| 31 | direction | 方向 | direction | int |  | 方向 (direction) |  | 1=收; |