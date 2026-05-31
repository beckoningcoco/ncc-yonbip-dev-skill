# |<<

**销售发票待结算单主实体 (so_squareinv / nc.vo.so.m33.m32.entity.SquareInvHVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5440.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | csalesquareid | 销售发票结算单主实体 | csalesquareid | char(20) | √ | 主键 (UFID) |
| 2 | csquarebillid | 销售发票主实体 | csquarebillid | char(20) |  | 主键 (UFID) |
| 3 | pk_org | 结算财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | pk_org_v | 结算财务组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 5 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 6 | vbillcode | 销售发票单据号 | vbillcode | varchar(40) |  | 字符串 (String) |
| 7 | ctrantypeid | 销售发票交易类型实体 | ctrantypeid | varchar(20) |  | 单据类型 (BilltypeVO) |
| 8 | vtrantypecode | 销售发票交易类型 | vtrantypecode | varchar(20) |  | 字符串 (String) |
| 9 | cbiztypeid | 业务流程 | cbiztypeid | varchar(20) |  | 业务流程 (BusitypeVO) |
| 10 | dbilldate | 销售发票单据日期 | dbilldate | char(19) |  | 日期 (UFDate) |
| 11 | dbillapprovedate | 销售发票审核日期 | dbillapprovedate | char(19) |  | 日期 (UFDate) |
| 12 | cinvoicecustid | 开票客户 | cinvoicecustid | varchar(20) |  | 客户基本信息 (customer) |
| 13 | ccustbankaccid | 开户银行账户 | ccustbankaccid | varchar(20) |  | 客商银行账户子户 (custbankaccsub) |
| 14 | cpaytermid | 发票收付款协议 | cpaytermid | varchar(20) |  | 收款协议 (income) |
| 15 | bautosquareincome | 是否自动收入结算 | bautosquareincome | char(1) |  | 布尔类型 (UFBoolean) |
| 16 | bautosquarecost | 是否自动成本结算 | bautosquarecost | char(1) |  | 布尔类型 (UFBoolean) |
| 17 | csendcountryid | 发货国家/地区 | csendcountryid | varchar(20) |  | 国家地区 (countryzone) |
| 18 | crececountryid | 收货国家/地区 | crececountryid | varchar(20) |  | 国家地区 (countryzone) |
| 19 | ctaxcountryid | 报税国家/地区 | ctaxcountryid | varchar(20) |  | 国家地区 (countryzone) |
| 20 | fbuysellflag | 购销类型 | fbuysellflag | int |  | 购销类型 (pursaletype) |  | 1=国内销售; |