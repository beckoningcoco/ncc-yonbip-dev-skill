# |<<

**郑州跨省医保目录对照 (nhhp_country_ml / com.yonyou.yh.nhis.hp.zzhp.pub.country.vo.ZZHPMLVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3825.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_mlhp | 主键 | pk_mlhp | char(20) | √ | 主键 (UFID) |
| 2 | exportdate | 导出时间 | exportdate | char(19) |  | 日期时间 (UFDateTime) |
| 3 | datatype | 导出数据的业务类型 | datatype | varchar(50) |  | 字符串 (String) |
| 4 | sourcecode | 数据来源 | sourcecode | varchar(50) |  | 字符串 (String) |
| 5 | sourcecoderef | 数据来源编码 | sourcecoderef | varchar(50) |  | 字符串 (String) |
| 6 | targetcode | 数据目标 | targetcode | varchar(50) |  | 字符串 (String) |
| 7 | targetcoderef | 数据目标编码 | targetcoderef | varchar(50) |  | 字符串 (String) |
| 8 | sourcetype | 数据来源类型 | sourcetype | varchar(50) |  | 字符串 (String) |
| 9 | sourcetyperef | 数据来源类型编码 | sourcetyperef | varchar(50) |  | 字符串 (String) |
| 10 | n901_01 | 项目编码 | n901_01 | varchar(50) |  | 字符串 (String) |
| 11 | n901_02 | 项目名称 | n901_02 | varchar(50) |  | 字符串 (String) |
| 12 | n901_03 | 分类编码 | n901_03 | varchar(50) |  | 字符串 (String) |
| 13 | n901_04 | 分类名称 | n901_04 | varchar(50) |  | 字符串 (String) |
| 14 | n901_05 | 剂型 | n901_05 | varchar(50) |  | 字符串 (String) |
| 15 | n901_06 | 项目分类 | n901_06 | varchar(50) |  | 字符串 (String) |
| 16 | n901_07 | 项目分类名称 | n901_07 | varchar(50) |  | 字符串 (String) |
| 17 | n901_08 | 拼音码 | n901_08 | varchar(50) |  | 字符串 (String) |
| 18 | n901_09 | 费用类别代码 | n901_09 | varchar(50) |  | 字符串 (String) |
| 19 | n901_10 | 备注 | n901_10 | varchar(50) |  | 字符串 (String) |
| 20 | n901_11 | 年度 | n901_11 | varchar(50) |  | 字符串 (String) |
| 21 | n901_12 | 版本号 | n901_12 | varchar(50) |  | 字符串 (String) |
| 22 | gjxmbm | 国家项目编码 | gjxmbm | varchar(50) |  | 字符串 (String) |
| 23 | gjxmmc | 国家项目名称 | gjxmmc | varchar(50) |  | 字符串 (String) |
| 24 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 25 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 26 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 27 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |