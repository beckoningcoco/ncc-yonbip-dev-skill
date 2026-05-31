# |<<

**应收租金计算单 (rom_rentreceive / nc.vo.rom.rentreceive.RentReceiveHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4999.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_rentreceive | 应收租金计算单主键 | pk_rentreceive | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 出租组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 4 | pk_org_v | 出租组织 | pk_org_v | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 5 | pk_fiorg | 财务组织最新版本 | pk_fiorg | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 6 | pk_fiorg_v | 财务组织 | pk_fiorg_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 7 | pk_raorg | 利润中心最新版本 | pk_raorg | varchar(20) |  | 利润中心 (profitcenter) |
| 8 | pk_raorg_v | 利润中心 | pk_raorg_v | varchar(20) |  | 利润中心版本 (profitcenterVersion) |
| 9 | pk_customer | 承租方 | pk_customer | varchar(20) |  | 客户基本信息 (customer) |
| 10 | pk_supplier | 出租方 | pk_supplier | varchar(20) |  | 供应商基本信息 (supplier) |
| 11 | pk_org_in | 承租组织最新版本 | pk_org_in | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 12 | pk_org_in_v | 承租组织 | pk_org_in_v | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 13 | pk_currency | 本币 | pk_currency | varchar(20) |  | 币种 (currtype) |
| 14 | bill_code | 租金计算单号 | bill_code | varchar(40) |  | 字符串 (String) |
| 15 | business_date | 本次计租日 | business_date | char(19) |  | 日期(结束) (UFDateEnd) |
| 16 | bill_status | 单据状态 | bill_status | int |  | 单据状态 (billstatus) |  | 0=自由态; |