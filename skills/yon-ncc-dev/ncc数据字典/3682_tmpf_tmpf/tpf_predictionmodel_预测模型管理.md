# |<<

**预测模型管理 (tpf_predictionmodel / nc.vo.tmpf.predictionmodel.PreDictionModelVo)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5829.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_predictionmodel | 主键 | pk_predictionmodel | char(20) | √ | 主键 (UFID) |
| 2 | vbillno | 预测模型编号 | vbillno | varchar(50) |  | 字符串 (String) |
| 3 | name | 预测模型名称 | name | varchar(200) |  | 多语文本 (MultiLangText) |
| 4 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 5 | pk_org_v | 财务组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 6 | predspace | 预测间距 | predspace | varchar(50) |  | 预测间距 (PredspaceEnum) |  | D=日; |