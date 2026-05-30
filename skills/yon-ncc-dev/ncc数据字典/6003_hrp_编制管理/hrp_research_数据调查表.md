# |<<

**数据调查表 (hrp_research / nc.vo.hrp.research.ResearchVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2747.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_research | 调查表主键 | pk_research | char(20) | √ | 主键 (UFID) |
| 2 | research_code | 调查表编码 | research_code | varchar(28) |  | 字符串 (String) |
| 3 | research_type | 调查类型 | research_type | varchar(50) |  | 调查类型 (ResearchType) |  | 1=地区; |