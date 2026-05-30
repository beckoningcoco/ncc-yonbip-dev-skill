# |<<

**付款申请管理明细 (cmp_apply_b / nc.vo.cmp.apply.ApplyManagerBVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1526.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_apply_b | 主键 | pk_apply_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_apply | 付款申请主键 | pk_apply | char(20) |  | 字符串 (String) |
| 3 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | pk_org | 付款财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 5 | pk_org_v | 付款财务组织多版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 6 | pk_supplier | 供应商 | pk_supplier | varchar(20) |  | 客商 (custsupplier) |
| 7 | pk_receiveunit | 收款单位 | pk_receiveunit | varchar(20) |  | 客商 (custsupplier) |
| 8 | vbillno | 申请编号 | vbillno | varchar(50) |  | 字符串 (String) |
| 9 | pk_busitype | 业务流程 | pk_busitype | varchar(20) |  | 业务流程 (BusitypeVO) |
| 10 | pk_billtypecode | 单据类型 | pk_billtypecode | varchar(21) |  | 字符串 (String) |
| 11 | pk_billtypeid | 单据类型主键 | pk_billtypeid | varchar(50) |  | 字符串 (String) |
| 12 | busistatus | 单据状态 | busistatus | int |  | 付款申请单据状态 (applybillstatus) |  | 1=待提交; |