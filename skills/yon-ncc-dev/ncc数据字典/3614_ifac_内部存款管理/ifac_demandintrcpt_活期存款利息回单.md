# |<<

**活期存款利息回单 (ifac_demandintrcpt / nc.vo.ifac.demandintrcpt.DemandIntRcptVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3073.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_intlist | 利息回单主键 | pk_intlist | char(20) | √ | 主键 (UFID) |
| 2 | pk_billtype | 单据类型 | pk_billtype | varchar(21) |  | 字符串 (String) |
| 3 | pk_billtypeid | 单据类型标识 | pk_billtypeid | varchar(20) |  | 单据类型 (BilltypeVO) |
| 4 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 5 | pk_org_v | 财务组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 6 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 7 | pk_gaincenter | 利润中心 | pk_gaincenter | varchar(20) |  | 利润中心 (profitcenter) |
| 8 | pk_capitalcenter | 成本中心 | pk_capitalcenter | varchar(20) |  | 成本中心 (resacostcenter) |
| 9 | pk_org_g | 资金组织 | pk_org_g | varchar(20) |  | 组织_业务单元_资金组织 (fundorg) |
| 10 | pk_org_g_v | 资金组织版本 | pk_org_g_v | varchar(20) |  | 组织_业务单元_资金组织版本信息 (fundorg_v) |
| 11 | vbillno | 回单编号 | vbillno | varchar(50) |  | 字符串 (String) |
| 12 | tallyflag | 回单状态 | tallyflag | varchar(50) |  | 记账标识 (TallyEnum) |  | 0=未记账; |