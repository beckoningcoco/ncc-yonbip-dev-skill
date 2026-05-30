# |<<

**应收运费发票主实体 (dm_arinvoice / nc.vo.dm.m4814.entity.ArInvoiceHVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1712.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cinvoice_hid | 应收运费发票主实体主键 | cinvoice_hid | char(20) | √ | 主键 (UFID) |
| 2 | vbillcode | 运费发票号 | vbillcode | varchar(40) |  | 字符串 (String) |
| 3 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | dbilldate | 单据日期 | dbilldate | char(19) |  | 日期 (UFDate) |
| 5 | crececountryid | 收货国家/地区 | crececountryid | varchar(20) |  | 国家地区 (countryzone) |
| 6 | csendcountryid | 发货国/地区 | csendcountryid | varchar(20) |  | 国家地区 (countryzone) |
| 7 | ctaxcountryid | 报税国/地区 | ctaxcountryid | varchar(20) |  | 国家地区 (countryzone) |
| 8 | fbuysellflag | 购销类型 | fbuysellflag | int |  | 购销类型 (pursaletype) |  | 1=国内销售; |