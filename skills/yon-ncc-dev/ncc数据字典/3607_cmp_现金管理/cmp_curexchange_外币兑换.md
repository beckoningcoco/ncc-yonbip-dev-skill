# |<<

**外币兑换 (cmp_curexchange / nc.vo.cmp.curexchange.CurExchangeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1551.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_cruexchange | 外币兑换主键 | pk_cruexchange | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 3 | pk_org_v | 财务组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 4 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 5 | profitcenter | 利润中心 | profitcenter | varchar(20) |  | 利润中心 (profitcenter) |
| 6 | costcenter | 成本中心 | costcenter | varchar(20) |  | 成本中心 (resacostcenter) |
| 7 | vbillno | 单据编号 | vbillno | varchar(40) |  | 字符串 (String) |
| 8 | pk_billtypecode | 单据类型编码 | pk_billtypecode | varchar(20) |  | 字符串 (String) |
| 9 | pk_billtypeid | 单据类型 | pk_billtypeid | varchar(20) |  | 单据类型 (BilltypeVO) |
| 10 | busitype | 业务类型 | busitype | varchar(50) |  | 业务类型 (CeBusiTypeEnum) |  | BUY=买入外汇; |