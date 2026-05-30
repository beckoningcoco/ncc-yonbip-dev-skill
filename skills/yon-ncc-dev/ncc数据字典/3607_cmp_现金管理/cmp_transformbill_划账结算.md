# |<<

**划账结算 (cmp_transformbill / nc.vo.cmp.bill.TransformBillVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1592.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_transformbill | 单据主表主键 | pk_transformbill | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 所属组织 | pk_org | varchar(20) | √ | 组织_业务单元_财务组织 (financeorg) |
| 3 | pk_org_v | 所属组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 4 | pk_group | 集团 | pk_group | varchar(20) | √ | 组织_集团 (group) |
| 5 | billdate | 单据日期 | billdate | char(19) |  | 日期 (UFDate) |
| 6 | pk_billtypecode | 单据类型 | pk_billtypecode | varchar(20) |  | 字符串 (String) |
| 7 | pk_billtypeid | 单据类型主键 | pk_billtypeid | varchar(20) |  | 单据类型 (BilltypeVO) |
| 8 | billclass | 单据大类 | billclass | varchar(2) |  | 字符串 (String) |
| 9 | vbillno | 单据编号 | vbillno | varchar(40) |  | 字符串 (String) |
| 10 | busistatus | 单据状态 | busistatus | int |  | 单据状态 (busistatus) |  | 1=保存; |