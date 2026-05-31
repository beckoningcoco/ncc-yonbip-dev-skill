# |<<

**郑州跨省医保疾病目录对照 (zzhp_country_jb / com.yonyou.yh.nhis.hp.zzhp.pub.country.vo.ZZHPJBVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6393.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_jbhp | 主键 | pk_jbhp | char(20) | √ | 主键 (UFID) |
| 2 | n902_01 | ICD编码 | n902_01 | varchar(50) |  | 字符串 (String) |
| 3 | n902_02 | ICD名称 | n902_02 | varchar(50) |  | 字符串 (String) |
| 4 | n902_03 | 拼音码 | n902_03 | varchar(50) |  | 字符串 (String) |
| 5 | n902_04 | 说明 | n902_04 | varchar(50) |  | 字符串 (String) |
| 6 | n902_05 | 年度 | n902_05 | varchar(50) |  | 字符串 (String) |
| 7 | n902_06 | 版本号 | n902_06 | varchar(50) |  | 字符串 (String) |
| 8 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 9 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 10 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 11 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |