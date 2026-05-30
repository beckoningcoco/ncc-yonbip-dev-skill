# |<<

**是否取过数的-取数信息 (cm_fetchinfo / nc.vo.cm.fetchdata.entity.PullDataStateVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1473.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cfetchinfoid | 取数信息 | cfetchinfoid | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 工厂 | pk_org | varchar(20) |  | 组织_业务单元_工厂 (factory) |
| 4 | pk_org_v | 工厂版本 | pk_org_v | varchar(20) |  | 组织_业务单元_工厂版本信息 (factory_v) |
| 5 | cperiod | 会计期间 | cperiod | varchar(50) |  | 字符串 (String) |
| 6 | dbegindate | 开始日期 | dbegindate | char(19) |  | 日期 (UFDate) |
| 7 | denddate | 结束日期 | denddate | char(19) |  | 日期 (UFDate) |
| 8 | bfetched | 已取数 | bfetched | char(1) |  | 布尔类型 (UFBoolean) |
| 9 | ifetchscheme | 取数方案 | ifetchscheme | int |  | 取数方案 (fetchdataschema) | 1 | 1=月取数; |