# |<<

**数据调查项信息 (hrp_researchinfo / nc.vo.hrp.research.ResearchInfoVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2748.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_researchinfo | 数据调查项信息主键 | pk_researchinfo | char(20) | √ | 主键 (UFID) |
| 2 | pk_research | 调查表主键 | pk_research | char(20) |  | 主键 (UFID) |
| 3 | pk_researchitem | 调查项目 | pk_researchitem | varchar(20) |  | 数据调查项目 (ResearchItem) |
| 4 | num | 数值 | num | varchar(50) |  | 字符串 (String) |