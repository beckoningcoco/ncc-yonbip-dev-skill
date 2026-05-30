# |<<

**医保数据字典 (zzhp_dict / com.yonyou.yh.nhis.bd.tpi.hpcontrast.vo.ZZHPDictVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6395.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_hpdict | 主键 | pk_hpdict | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 4 | dicttype | 字典类型编码 | dicttype | varchar(30) |  | 字符串 (String) |
| 5 | dictname | 类型名称 | dictname | varchar(50) |  | 字符串 (String) |
| 6 | code | 编码 | code | varchar(30) |  | 字符串 (String) |
| 7 | name | 名称 | name | varchar(50) |  | 字符串 (String) |
| 8 | mnecode | 拼音码 | mnecode | varchar(30) |  | 字符串 (String) |
| 9 | hiscode | HIS编码 | hiscode | varchar(30) |  | 字符串 (String) |
| 10 | hisname | HIS名称 | hisname | varchar(50) |  | 字符串 (String) |
| 11 | note | 备注 | note | varchar(256) |  | 字符串 (String) |
| 12 | pk_hp | 医保类型 | pk_hp | varchar(20) |  | 字符串 (String) |
| 13 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 14 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 15 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 16 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |