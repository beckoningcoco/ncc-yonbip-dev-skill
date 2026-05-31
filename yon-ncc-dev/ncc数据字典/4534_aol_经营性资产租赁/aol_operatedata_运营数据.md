# |<<

**运营数据 (aol_operatedata / nc.vo.aol.lease.operatedata.OperateDataHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/122.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_operatedata | 运营数据主键 | pk_operatedata | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org_out | 出租组织版本 | pk_org_out | varchar(20) |  | 组织_业务单元_资产组织 (assetorg) |
| 4 | pk_org_out_v | 出租组织 | pk_org_out_v | varchar(20) |  | 组织_业务单元_资产组织版本信息 (assetorg_v) |
| 5 | pk_fiorg_out_v | 出租财务组织 | pk_fiorg_out_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 6 | pk_fiorg_out | 出租财务组织版本 | pk_fiorg_out | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 7 | pk_org | 资产组织版本信息 | pk_org | varchar(20) |  | 组织_业务单元_资产组织 (assetorg) |
| 8 | pk_org_v | 资产组织 | pk_org_v | varchar(20) |  | 组织_业务单元_资产组织版本信息 (assetorg_v) |
| 9 | pk_org_in | 承租组织版本 | pk_org_in | varchar(20) |  | 组织_业务单元_资产组织 (assetorg) |
| 10 | pk_org_in_v | 承租组织 | pk_org_in_v | varchar(20) |  | 组织_业务单元_资产组织版本信息 (assetorg_v) |
| 11 | pk_customer | 承租方 | pk_customer | varchar(20) |  | 客户基本信息 (customer) |
| 12 | bill_status | 单据状态 | bill_status | int |  | 单据状态 (billstatus) |  | 0=自由态; |