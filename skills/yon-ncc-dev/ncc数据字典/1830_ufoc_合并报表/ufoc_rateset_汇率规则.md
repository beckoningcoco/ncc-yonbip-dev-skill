# |<<

**汇率规则 (ufoc_rateset / nc.vo.ufoc.ratesetinfo.RateSetVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5888.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ratesetinfo | 主键 | pk_ratesetinfo | char(20) | √ | 主键 (UFID) |
| 2 | pk_report | 报表标识 | pk_report | varchar(20) |  | 采集表信息 (reportinfo) |
| 3 | pk_measure | 指标标识 | pk_measure | varchar(50) |  | 字符串 (String) |
| 4 | pk_dayrateproject | 汇率项目 | pk_dayrateproject | varchar(20) |  | 交易日汇率项目 (dayrateproject) |
| 5 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 6 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 7 | day_convert_method | 交易日汇率折算方法 | day_convert_method | varchar(20) |  | 字符串 (String) |
| 8 | dataorigin | 数据来源 | dataorigin | varchar(50) |  | 字符串 (String) |
| 9 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 10 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 11 | modifier | 最后修改人 | modifier | varchar(20) |  | 用户 (user) |
| 12 | modifiedtime | 最后修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |