# |<<

**数据调查项目 (hrp_researchitem / nc.vo.hrp.researchitem.ResearchItemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2749.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_researchitem | 项目主键 | pk_researchitem | char(20) | √ | 主键 (UFID) |
| 2 | item_code | 项目编码 | item_code | varchar(28) | √ | 字符串 (String) |
| 3 | item_name | 项目名称 | item_name | varchar(50) | √ | 多语文本 (MultiLangText) |
| 4 | item_year | 年度 | item_year | char(4) |  | 字符串 (String) |
| 5 | sysinit_flag | 系统预置 | sysinit_flag | char(1) |  | 布尔类型 (UFBoolean) |
| 6 | data_type | 数据类型 | data_type | int | √ | 数据类型 (datamode) |  | 1=整数; |