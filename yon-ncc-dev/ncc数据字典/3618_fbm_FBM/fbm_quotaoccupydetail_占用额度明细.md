# |<<

**占用额度明细 (fbm_quotaoccupydetail / nc.vo.pfbm.quotaoccupydetial.QuotaOccupyDetailVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2148.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk | 主键 | pk | char(50) | √ | 主键 (UFID) |
| 2 | srcbilltype | 来源单据交易类型 | srcbilltype | varchar(50) |  | 字符串 (String) |
| 3 | pk_downquota | 额度下拨单主键 | pk_downquota | varchar(50) | √ | 字符串 (String) |
| 4 | quota | 占用额度 | quota | decimal(28, 8) | √ | 数值 (UFDouble) |
| 5 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 6 | pk_curr | 币种 | pk_curr | varchar(20) |  | 币种 (currtype) |
| 7 | pk_srcbill | 来源单据主键 | pk_srcbill | varchar(50) |  | 字符串 (String) |