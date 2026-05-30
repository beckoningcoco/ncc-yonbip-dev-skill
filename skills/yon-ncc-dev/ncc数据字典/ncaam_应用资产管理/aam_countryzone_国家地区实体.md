# |<<

**国家地区实体 (aam_countryzone / nc.vo.ncaam.countryzone.CountryZoneVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_countryzone | 国家地区主键 | pk_countryzone | char(20) | √ | 主键 (UFID) |
| 2 | countryzonecode | 国家地区编码 | countryzonecode | varchar(2) | √ | 字符串 (String) |
| 3 | countryzonename | 国家地区名称 | countryzonename | varchar(200) | √ | 多语文本 (MultiLangText) |
| 4 | isdefault | 是否预置 | isdefault | char(1) |  | 布尔类型 (UFBoolean) |
| 5 | issystem | 是否系统 | issystem | char(1) |  | 布尔类型 (UFBoolean) |
| 6 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 7 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 8 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 9 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |