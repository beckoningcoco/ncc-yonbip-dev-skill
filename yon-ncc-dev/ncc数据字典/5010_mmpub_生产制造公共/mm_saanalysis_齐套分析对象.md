# |<<

**齐套分析对象 (mm_saanalysis / nc.vo.mmpub.setanalysis.entity.SaAnalysisVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3769.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_analysis | 分析对象主键 | pk_analysis | varchar(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 工厂最新版本 | pk_org | varchar(20) |  | 组织_业务单元_工厂 (factory) |
| 4 | pk_org_v | 工厂 | pk_org_v | varchar(20) |  | 组织_业务单元_工厂版本信息 (factory_v) |
| 5 | sortcode | 顺序码 | sortcode | int |  | 整数 (Integer) |
| 6 | optionkey | 分析选项主键 | optionkey | varchar(20) |  | 字符串 (String) |
| 7 | fdemandtype | 需求类型 | fdemandtype | int |  | 需求单据类型 (SaDemandType) |  | 1=备料计划; |