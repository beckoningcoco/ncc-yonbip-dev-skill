# |<<

**期初余额管理 (tpf_Initdatamanage / nc.vo.tmpf.initdatamanage.InitdatamanageVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5827.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_initdatamanager | 期初余额管理主键 | pk_initdatamanager | char(20) | √ | 主键 (UFID) |
| 2 | pk_predictionmodel | 预测模型主键 | pk_predictionmodel | varchar(20) |  | 预测模型管理 (predictionmodel) |
| 3 | predictionmodelname | 预测模型名称 | predictionmodelname | varchar(1024) |  | 字符串 (String) |
| 4 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 5 | pk_org_v | 财务组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 6 | datasrc | 数据来源 | datasrc | varchar(50) |  | 数据来源 (DataTypeEnum) |  | 1=手工录入; |