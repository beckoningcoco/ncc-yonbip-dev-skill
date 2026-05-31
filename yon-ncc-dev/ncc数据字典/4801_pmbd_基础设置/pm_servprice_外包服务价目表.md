# |<<

**外包服务价目表 (pm_servprice / nc.vo.pmbd.servprice.ServPriceHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4531.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_servprice | 服务价表主键 | pk_servprice | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 项目组织 | pk_org | varchar(20) |  | 组织_业务单元_项目组织 (itemorg) |
| 4 | code | 价表编码 | code | varchar(40) |  | 字符串 (String) |
| 5 | name | 价表名称 | name | varchar(200) |  | 多语文本 (MultiLangText) |
| 6 | version | 版本号 | version | int |  | 整数 (Integer) | 1 |
| 7 | last_v_flag | 最新版本 | last_v_flag | char(1) |  | 布尔类型 (UFBoolean) | Y |
| 8 | validate_date | 生效日期 | validate_date | char(19) |  | 日期(开始) (UFDateBegin) |
| 9 | meomo | 备注 | meomo | varchar(200) |  | 字符串 (String) |
| 10 | pk_up_version | 上一个版本的主键 | pk_up_version | varchar(20) |  | 字符串 (String) |
| 11 | pk_currtype | 币种 | pk_currtype | varchar(20) |  | 币种 (currtype) |
| 12 | pk_sendcountry | 发货国家/地区 | pk_sendcountry | varchar(20) |  | 国家地区 (countryzone) |
| 13 | pk_rececountry | 收货国家/地区 | pk_rececountry | varchar(20) |  | 国家地区 (countryzone) |
| 14 | pk_taxcountry | 报税国家/地区 | pk_taxcountry | varchar(20) |  | 国家地区 (countryzone) |
| 15 | buysellflag | 购销类型 | buysellflag | int |  | 购销类型 (pursaletype) |  | 1=国内销售; |