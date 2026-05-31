# |<<

**单位支付信息变更 (cmp_settlechange / nc.vo.cmp.settlechange.SettleChangeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1580.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_settlechange | 支付变更单号 | pk_settlechange | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | pk_org_v | 所属组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 5 | pk_curr | 币种 | pk_curr | varchar(20) |  | 币种 (currtype) |
| 6 | vbillno | 单据编号 | vbillno | varchar(50) |  | 字符串 (String) |
| 7 | dbilldate | 单据日期 | dbilldate | char(19) |  | 日期 (UFDate) |
| 8 | pk_billtypecode | 单据类型编码 | pk_billtypecode | varchar(50) |  | 字符串 (String) |
| 9 | pk_billtypeid | 单据类型主键 | pk_billtypeid | varchar(20) |  | 单据类型 (BilltypeVO) |
| 10 | busistatus | 单据状态 | busistatus | varchar(50) |  | 单据状态 (busistatus) |  | 1=保存; |