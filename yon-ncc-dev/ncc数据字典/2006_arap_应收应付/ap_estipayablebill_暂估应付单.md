# |<<

**暂估应付单 (ap_estipayablebill / nc.vo.arap.estipayable.EstiPayableBillVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/127.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_estipayablebill | 暂估应付单标识 | pk_estipayablebill | char(20) | √ | 主键 (UFID) |
| 2 | pk_pcorg | 利润中心 | pk_pcorg | varchar(20) |  | 利润中心 (profitcenter) |
| 3 | pk_fiorg | 废弃财务组织 | pk_fiorg | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | pk_org | 应付财务组织 | pk_org | char(20) | √ | 组织_业务单元_财务组织 (financeorg) |
| 5 | sett_org | 结算财务组织 | sett_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 6 | pk_fiorg_v | 废弃财务组织版本 | pk_fiorg_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 7 | pk_pcorg_v | 利润中心版本 | pk_pcorg_v | varchar(20) |  | 利润中心版本 (profitcenterVersion) |
| 8 | pk_org_v | 应付财务组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 9 | sett_org_v | 结算财务组织版本 | sett_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 10 | estflag | 暂估标志 | estflag | int |  | 暂估类型 (estitype) |  | 0=暂估确认; |