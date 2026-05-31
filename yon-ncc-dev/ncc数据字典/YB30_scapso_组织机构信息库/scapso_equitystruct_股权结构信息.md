# |<<

**股权结构信息 (scapso_equitystruct / nc.vo.scapso.basicdatareport.EquityStructVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5105.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_equitystruct | 股权结构信息主键 | pk_equitystruct | char(20) | √ | 主键 (UFID) |
| 2 | crowno | 行号 | crowno | varchar(50) |  | 字符串 (String) |
| 3 | vholdernames | 股东名称 | vholdernames | varchar(1024) |  | 字符串 (String) |
| 4 | pk_country | 股东国别 | pk_country | varchar(20) |  | 国家地区 (countryzone) |
| 5 | vholderproperty | 股东性质 | vholderproperty | varchar(50) |  | 股东性质 (ScapSoHolderPropertyEnum) |  | 1=本企业; |