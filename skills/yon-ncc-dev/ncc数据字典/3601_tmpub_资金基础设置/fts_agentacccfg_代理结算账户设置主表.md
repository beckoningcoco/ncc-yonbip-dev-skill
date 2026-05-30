# |<<

**代理结算账户设置主表 (fts_agentacccfg / nc.vo.fts.agentacccfg.AgentAccCfgVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2298.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_agentacccfg | 代理结算账户设置主表主键 | pk_agentacccfg | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) | √ | 主键 (UFID) |
| 3 | pk_org | 主组织 | pk_org | char(20) | √ | 组织_业务单元_资金组织 (fundorg) |
| 4 | pk_org_v | 主组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_资金组织版本信息 (fundorg_v) |
| 5 | pk_bankaccount | 代理结算帐户 | pk_bankaccount | char(20) | √ | 银行账户子户 (bankaccsub) |
| 6 | billtype | 单据类型编码 | billtype | varchar(30) |  | 字符串 (String) |
| 7 | billstatus | 状态 | billstatus | int |  | 单据状态 (BillState) |  | 0=待确认; |