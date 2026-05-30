# |<<

**医保卡信息 (nhhp_zzhpcountrysidecardinfo / com.yonyou.yh.nhis.hp.zz.countryside.vo.ZZHPCountrysideCardInfoVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3832.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_cardinfo | 医保卡信息主键 | pk_cardinfo | char(20) | √ | 主键 (UFID) |
| 2 | code | 就诊编码 | code | varchar(50) | √ | 字符串 (String) |
| 3 | cardcode | 医保卡号 | cardcode | varchar(50) | √ | 字符串 (String) |
| 4 | yhzgx | 与户主关系 | yhzgx | varchar(50) |  | 字符串 (String) |
| 5 | xm | 成员姓名 | xm | varchar(20) |  | 字符串 (String) |
| 6 | sdx | 试点县行政区域编码 | sdx | varchar(20) |  | 字符串 (String) |
| 7 | grbm | 个人编码 | grbm | varchar(20) |  | 字符串 (String) |
| 8 | sfzh | 身份证号 | sfzh | varchar(20) |  | 字符串 (String) |
| 9 | xb | 性别 | xb | varchar(10) |  | 字符串 (String) |
| 10 | csrq | 出生日期 | csrq | char(10) |  | 模糊日期 (UFLiteralDate) |
| 11 | ljbc | 本年度住院累计补偿 | ljbc | decimal(14, 2) |  | 数值 (UFDouble) |
| 12 | jtzz | 地址 | jtzz | varchar(100) |  | 字符串 (String) |
| 13 | flag_new | 最近一次登记标志 | flag_new | char(1) |  | 布尔类型 (UFBoolean) |
| 14 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 15 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 16 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 17 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |