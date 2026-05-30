# |<<

**付款结算单 (cmp_paybill / nc.vo.cmp.bill.BillVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1571.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_paybill | 单据主表ID | pk_paybill | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 结算财务组织 | pk_org | varchar(20) | √ | 组织_业务单元_财务组织 (financeorg) |
| 3 | pk_fiorg | 财务组织 | pk_fiorg | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | pk_pcorg | 利润中心 | pk_pcorg | varchar(20) |  | 利润中心 (profitcenter) |
| 5 | pk_group | 所属集团 | pk_group | varchar(20) | √ | 组织_集团 (group) |
| 6 | bill_no | 单据编号 | bill_no | varchar(40) |  | 字符串 (String) |
| 7 | trade_type | 付款结算类型 | trade_type | varchar(50) |  | 字符串 (String) |
| 8 | bill_date | 单据日期 | bill_date | char(19) | √ | 日期 (UFDate) |
| 9 | source_flag | 来源系统 | source_flag | varchar(20) |  | 来源系统 (cmp_syscode) |
| 10 | bill_status | 单据状态 | bill_status | int | √ | 单据状态 (billstatus) |  | -99=暂存; |