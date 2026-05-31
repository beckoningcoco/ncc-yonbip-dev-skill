# |<<

**跨省结算定点医疗结构 (nhhp_country_hospinfo / com.yonyou.yh.nhis.hp.zzhp.pub.country.vo.ZZHPHOSPINFOVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3824.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_hospinfo | 主键 | pk_hospinfo | char(20) | √ | 主键 (UFID) |
| 2 | hospitalid | 机构代码 | hospitalid | varchar(50) |  | 字符串 (String) |
| 3 | hospitalname | 机构名称 | hospitalname | varchar(50) |  | 字符串 (String) |
| 4 | hospitalareaid | 地区代码 | hospitalareaid | varchar(50) |  | 字符串 (String) |
| 5 | hospitallevel | 医院资质等级 | hospitallevel | varchar(50) |  | 字符串 (String) |
| 6 | hospitaladdress | 通讯地址 | hospitaladdress | varchar(50) |  | 字符串 (String) |
| 7 | contacter | 联系人姓名 | contacter | varchar(50) |  | 字符串 (String) |
| 8 | phone | 电话号码 | phone | varchar(50) |  | 字符串 (String) |
| 9 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 10 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 11 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 12 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |