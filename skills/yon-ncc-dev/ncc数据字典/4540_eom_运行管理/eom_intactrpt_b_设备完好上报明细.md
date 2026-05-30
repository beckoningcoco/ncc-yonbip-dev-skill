# |<<

**设备完好上报明细 (eom_intactrpt_b / nc.vo.eom.intactrpt.IntactrptBodyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1840.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_intactrpt_b | 设备完好上报明细标识 | pk_intactrpt_b | char(20) | √ | 主键 (UFID) |
| 2 | rowno | 行号 | rowno | varchar(30) |  | 字符串 (String) |
| 3 | pk_org | 资产组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_资产组织 (assetorg) |
| 4 | pk_org_v | 资产组织 | pk_org_v | varchar(20) |  | 组织_业务单元_资产组织版本信息 (assetorg_v) |
| 5 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 6 | report_type | 上报类型 | report_type | int |  | 上报类型 (enum) |  | 0=不完好上报; |