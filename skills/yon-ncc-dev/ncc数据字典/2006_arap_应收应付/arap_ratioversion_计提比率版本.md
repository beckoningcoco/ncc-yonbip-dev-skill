# |<<

**计提比率版本 (arap_ratioversion / nccloud.vo.arap.ratioversion.RatioVersionVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/193.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ratioversion | 计提比率版本主键 | pk_ratioversion | char(20) | √ | 主键 (UFID) |
| 2 | pk_bdprovisionratio | 计提比率主键 | pk_bdprovisionratio | varchar(20) |  | 坏账计提比率 (bdprovisionratio) |
| 3 | begindate | 生效日期 | begindate | char(19) |  | 日期 (UFDate) |
| 4 | enddate | 失效日期 | enddate | char(19) |  | 日期 (UFDate) |
| 5 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 6 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 7 | modifier | 最后修改人 | modifier | varchar(20) |  | 用户 (user) |
| 8 | modifiedtime | 最后修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |