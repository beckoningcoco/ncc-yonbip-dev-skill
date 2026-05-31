# |<<

**应付运费发票主实体 (dm_apinvoice / nc.vo.dm.m4812.entity.ApInvoiceHVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1706.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cinvoice_hid | 运费发票 | cinvoice_hid | char(20) | √ | 主键 (UFID) |
| 2 | vbillcode | 发票号 | vbillcode | varchar(40) |  | 字符串 (String) |
| 3 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | pk_org_v | 运费财务组织 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 5 | pk_org | 运费财务组织版本信息 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 6 | dbilldate | 单据日期 | dbilldate | char(19) |  | 日期 (UFDate) |
| 7 | csendcountryid | 发货国家/地区 | csendcountryid | varchar(20) |  | 国家地区 (countryzone) |
| 8 | crececountryid | 收货国家/地区 | crececountryid | varchar(20) |  | 国家地区 (countryzone) |
| 9 | ctaxcountryid | 报税国/地区 | ctaxcountryid | varchar(20) |  | 国家地区 (countryzone) |
| 10 | fbuysellflag | 购销类型 | fbuysellflag | int |  | 购销类型 (pursaletype) |  | 1=国内销售; |