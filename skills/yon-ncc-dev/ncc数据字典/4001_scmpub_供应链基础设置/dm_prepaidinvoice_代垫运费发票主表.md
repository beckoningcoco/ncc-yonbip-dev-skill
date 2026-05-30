# |<<

**代垫运费发票主表 (dm_prepaidinvoice / nc.vo.scmf.dm.m4816.entity.PrePaidInvoiceHVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1737.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cinvoice_hid | 代垫运费发票主键 | cinvoice_hid | char(20) | √ | 主键 (UFID) |
| 2 | vbillcode | 运费发票号 | vbillcode | varchar(40) |  | 字符串 (String) |
| 3 | dbilldate | 单据日期 | dbilldate | char(19) |  | 日期 (UFDate) |
| 4 | pk_org_v | 财务组织 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 5 | pk_org | 组织版本信息 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 6 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 7 | cdmsupplierid | 承运商 | cdmsupplierid | varchar(20) |  | 承运商定义 (dm_carrier) |
| 8 | capcustid | 开票方 | capcustid | varchar(20) |  | 供应商基本信息 (supplier) |
| 9 | ccosignid | 委托单位 | ccosignid | varchar(20) |  | 客户基本信息 (customer) |
| 10 | ctakefeeid | 客户 | ctakefeeid | varchar(20) |  | 客户基本信息 (customer) |
| 11 | ntotaltaxmny | 本币价税合计 | ntotaltaxmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 12 | ntotalorigtaxmny | 价税合计 | ntotalorigtaxmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 13 | fstatusflag | 单据状态 | fstatusflag | int |  | 单据状态 (fstatusflag) |  | 0=自由; |