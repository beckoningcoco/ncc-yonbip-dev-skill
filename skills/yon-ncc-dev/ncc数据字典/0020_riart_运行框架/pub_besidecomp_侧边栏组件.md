# |<<

**侧边栏组件 (pub_besidecomp / nc.vo.pub.beside.BesideCompVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4709.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_besidecomp | 侧边栏组件主键 | pk_besidecomp | char(20) | √ | 主键 (UFID) |
| 2 | compname | 组件名称 | compname | varchar(200) | √ | 多语文本 (MultiLangText) |
| 3 | compcode | 组件编码 | compcode | varchar(50) | √ | 字符串 (String) |
| 4 | comppanel | 业务组件 | comppanel | varchar(20) | √ | 侧边栏业务组件 (besidebusicomp) |
| 5 | moduleid | 所属模块 | moduleid | varchar(50) |  | 字符串 (String) |
| 6 | comptype | 组件类型 | comptype | varchar(20) | √ | 侧边栏组件类型 (besidecomptype) |
| 7 | pk_industry | 所属行业 | pk_industry | varchar(20) |  | 行业目录 (industry) |
| 8 | pk_country | 国家地区 | pk_country | varchar(20) |  | 国家地区 (countryzone) |
| 9 | pk_level | 研发层次 | pk_level | varchar(50) |  | 研发机构类别 (DevelopOrgTypeEnum) |  | 1=内部-核心研发; |