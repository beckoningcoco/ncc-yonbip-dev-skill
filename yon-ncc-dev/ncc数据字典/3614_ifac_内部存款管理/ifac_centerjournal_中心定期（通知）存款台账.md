# |<<

**中心定期（通知）存款台账 (ifac_centerjournal / nc.vo.ifac.centerjournal.CenterJournalVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3068.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_centerjournal | 中心定期存款台账主键 | pk_centerjournal | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 资金组织 | pk_org | varchar(20) |  | 组织_业务单元_资金组织 (fundorg) |
| 3 | pk_org_v | 资金组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_资金组织版本信息 (fundorg_v) |
| 4 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 5 | pk_sourcebill | 来源单据pk | pk_sourcebill | char(20) |  | 主键 (UFID) |
| 6 | pk_profitcenter | 资金组织利润中心 | pk_profitcenter | varchar(20) |  | 利润中心 (profitcenter) |
| 7 | pk_costcenter | 资金组织成本中心 | pk_costcenter | varchar(20) |  | 成本中心 (resacostcenter) |
| 8 | pk_depositorg | 存款单位 | pk_depositorg | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 9 | billdate | 日期 | billdate | char(19) |  | 日期 (UFDate) |
| 10 | summary | 摘要 | summary | varchar(50) |  | 字符串 (String) |
| 11 | pk_billcode | 单据编号 | pk_billcode | varchar(50) |  | 字符串 (String) |
| 12 | depositmode | 存款方式 | depositmode | varchar(50) |  | 存款方式 (DepositModeEnum) |  | DEPOSIT=普通定期; |