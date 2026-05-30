# |<<

**医保结算分解 (zzhp_stsplit / com.yonyou.yh.nhis.hp.zz.vo.ZZHPStSplitVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6406.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_stsplit | 费用分解主键 | pk_stsplit | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 4 | pk_hpst | 医保结算 | pk_hpst | varchar(20) |  | 医保结算 (ZZHPStVO) |
| 5 | pk_hpsegm | 医保分解字段主键 | pk_hpsegm | varchar(20) |  | 医保分解数据项定义 (hppaysegment) |
| 6 | segmname | 分解字段名称 | segmname | varchar(50) |  | 字符串 (String) |
| 7 | segmcode | 分解字段编码 | segmcode | varchar(50) |  | 字符串 (String) |
| 8 | segmvalue | 分解字段值 | segmvalue | varchar(100) |  | 字符串 (String) |
| 9 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 10 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 11 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 12 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |