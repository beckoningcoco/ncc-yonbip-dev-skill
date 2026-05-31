# |<<

**支付指令主信息 (ebank_paylog_h / nc.vo.obm.ebankpaylog.EBankPayLogHVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1775.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ebank_paylog_h | 主键 | pk_ebank_paylog_h | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | pk_org_v | 所属组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 5 | srcsystem | 来源系统 | srcsystem | varchar(50) |  | 指令来源系统 (LogSrcSystem) |  | FTS=结算系统; |