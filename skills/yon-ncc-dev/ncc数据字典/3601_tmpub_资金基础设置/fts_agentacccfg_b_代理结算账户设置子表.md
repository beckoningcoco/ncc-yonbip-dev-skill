# |<<

**代理结算账户设置子表 (fts_agentacccfg_b / nc.vo.fts.agentacccfg.AgentAccCfgBVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2299.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_agentacccfg_b | 代理结算账户设置子表主键 | pk_agentacccfg_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_financeorg | 代理结算账户成员单位名称 | pk_financeorg | char(20) | √ | 组织_业务单元_财务组织 (financeorg) |
| 3 | linestatus | 状态 | linestatus | varchar(50) |  | 单据状态 (BillState) |  | 0=待确认; |