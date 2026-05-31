# |<<

**预测模型管理子表 (tpf_predictionmodeldetail / nc.vo.tmpf.predictionmodel.PredictionmodeldetailVo)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5830.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_predictionmodeldetail | 主键 | pk_predictionmodeldetail | char(20) | √ | 主键 (UFID) |
| 2 | vbillno | 预测模型编号 | vbillno | varchar(50) |  | 字符串 (String) |
| 3 | name | 预测模型名称 | name | varchar(50) |  | 字符串 (String) |
| 4 | indicatorcode | 预测指标编号 | indicatorcode | varchar(20) |  | 指标库 (IndicatorlibraryVO) |
| 5 | indicatorname | 预测指标名称 | indicatorname | varchar(50) |  | 字符串 (String) |
| 6 | targettype | 指标类型 | targettype | varchar(50) |  | 指标类型 (TargetTypeEnum) |  | 0=预置; |