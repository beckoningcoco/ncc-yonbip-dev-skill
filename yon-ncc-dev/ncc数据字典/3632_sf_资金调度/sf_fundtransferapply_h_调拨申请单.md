# |<<

**调拨申请单 (sf_fundtransferapply_h / nc.vo.sf.fundtransferapply.FundTransferApplyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5270.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_fundtransferapply_h | 调拨申请单标识 | pk_fundtransferapply_h | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 付款单位 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 3 | pk_org_v | 所属组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 4 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 5 | pk_billtypeid | 单据类型 | pk_billtypeid | varchar(20) |  | 单据类型 (BilltypeVO) |
| 6 | pk_billtype | 单据类型编码 | pk_billtype | varchar(50) |  | 字符串 (String) |
| 7 | vbillno | 调拨申请号 | vbillno | varchar(50) |  | 字符串 (String) |
| 8 | pk_org_t | 调拨组织 | pk_org_t | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 9 | pk_org_t_v | 调拨组织版本 | pk_org_t_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 10 | busitype | 交易类型 | busitype | int |  | 交易类型 (busitype) |  | 1=集团调拨; |