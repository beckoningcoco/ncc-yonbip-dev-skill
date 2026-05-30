# |<<

**活期存款利息清单 (ifac_demandintlist / nc.vo.ifac.demandintlist.DemandIntListVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3070.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_intlist | 利息清单主键 | pk_intlist | char(20) | √ | 主键 (UFID) |
| 2 | pk_billtypeid | 单据类型标识 | pk_billtypeid | varchar(20) |  | 单据类型 (BilltypeVO) |
| 3 | pk_org | 资金组织 | pk_org | varchar(20) |  | 组织_业务单元_资金组织 (fundorg) |
| 4 | pk_org_v | 所属组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_资金组织版本信息 (fundorg_v) |
| 5 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 6 | pk_gaincenter | 利润中心 | pk_gaincenter | varchar(20) |  | 利润中心 (profitcenter) |
| 7 | pk_capitalcenter | 成本中心 | pk_capitalcenter | varchar(20) |  | 成本中心 (resacostcenter) |
| 8 | pk_org_r | 存款单位 | pk_org_r | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 9 | pk_org_r_v | 存款单位版本 | pk_org_r_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 10 | vbillno | 清单编号 | vbillno | varchar(50) |  | 字符串 (String) |
| 11 | pk_billtype | 单据类型 | pk_billtype | varchar(21) |  | 字符串 (String) |
| 12 | intbilltype | 清单类型 | intbilltype | varchar(50) |  | 清单类型 (IntbillTypeEnum) |  | JX=计息清单; |