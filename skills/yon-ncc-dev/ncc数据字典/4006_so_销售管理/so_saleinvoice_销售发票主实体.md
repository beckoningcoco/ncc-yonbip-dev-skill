# |<<

**销售发票主实体 (so_saleinvoice / nc.vo.so.m32.entity.SaleInvoiceHVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5433.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | csaleinvoiceid | 发票主实体 | csaleinvoiceid | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 开票组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | pk_org_v | 开票组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 5 | vbillcode | 发票号 | vbillcode | varchar(40) |  | 字符串 (String) |
| 6 | cbiztypeid | 业务流程 | cbiztypeid | varchar(20) |  | 业务流程 (BusitypeVO) |
| 7 | ctrantypeid | 发票类型 | ctrantypeid | varchar(20) |  | 单据类型 (BilltypeVO) |
| 8 | vtrantypecode | 发票类型编码 | vtrantypecode | varchar(20) |  | 字符串 (String) |
| 9 | dbilldate | 开票日期 | dbilldate | char(19) |  | 日期 (UFDate) |
| 10 | cinvoicecustid | 客户名称 | cinvoicecustid | varchar(20) |  | 客户基本信息 (customer) |
| 11 | vprintcustname | 客户打印名称 | vprintcustname | varchar(50) |  | 字符串 (String) |
| 12 | ccustbankid | 客户开户银行 | ccustbankid | varchar(20) |  | 银行档案 (bankdoc) |
| 13 | ccustbankaccid | 客户银行账号 | ccustbankaccid | varchar(20) |  | 客商银行账户子户 (custbankaccsub) |
| 14 | cpaytermid | 收款协议 | cpaytermid | varchar(20) |  | 收款协议 (income) |
| 15 | vcreditnum | 信用证号 | vcreditnum | varchar(20) |  | 字符串 (String) |
| 16 | vgoldtaxcode | 金税票号 | vgoldtaxcode | varchar(100) |  | 字符串 (String) |
| 17 | btogoldtaxflag | 是否已经传金税 | btogoldtaxflag | char(1) |  | 布尔类型 (UFBoolean) | N |
| 18 | tgoldtaxtime | 最后传金税时间 | tgoldtaxtime | varchar(19) |  | 日期时间 (UFDateTime) |
| 19 | corigcurrencyid | 币种 | corigcurrencyid | varchar(20) |  | 币种 (currtype) |
| 20 | nexchangerate | 折本汇率 | nexchangerate | decimal(28, 8) |  | 数值 (UFDouble) |
| 21 | ccurrencyid | 本位币 | ccurrencyid | varchar(20) |  | 币种 (currtype) |
| 22 | ngroupexchgrate | 集团本位币汇率 | ngroupexchgrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 23 | nglobalexchgrate | 全局本位币汇率 | nglobalexchgrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 24 | nhvoicedisrate | 发票折扣 | nhvoicedisrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 25 | ntotalastnum | 总数量 | ntotalastnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 26 | ntotalorigsubmny | 冲抵金额 | ntotalorigsubmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 27 | ntotalorigmny | 价税合计 | ntotalorigmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 28 | csendcountryid | 发货国家/地区 | csendcountryid | varchar(20) |  | 国家地区 (countryzone) |
| 29 | crececountryid | 收货国家/地区 | crececountryid | varchar(20) |  | 国家地区 (countryzone) |
| 30 | ctaxcountryid | 报税国家/地区 | ctaxcountryid | varchar(20) |  | 国家地区 (countryzone) |
| 31 | fbuysellflag | 购销类型 | fbuysellflag | int |  | 购销类型 (pursaletype) |  | 1=国内销售; |