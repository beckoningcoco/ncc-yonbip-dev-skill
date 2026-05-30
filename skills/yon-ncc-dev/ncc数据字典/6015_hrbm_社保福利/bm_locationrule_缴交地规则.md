# |<<

**缴交地规则 (bm_locationrule / nc.vo.bm.locationrule.LocationRule)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1229.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_loctrule | 缴交地规则主键 | pk_loctrule | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) | √ | 组织_集团 (group) |
| 3 | pk_org | 所属组织 | pk_org | varchar(20) | √ | 组织 (org) |
| 4 | code | 编码 | code | varchar(40) | √ | 字符串 (String) |
| 5 | name | 名称 | name | varchar(100) | √ | 多语文本 (MultiLangText) |
| 6 | postalcode | 地区编码 | postalcode | varchar(20) |  | 行政区划 (region) |
| 7 | postalname | 地区名称 | postalname | char(20) | √ | 行政区划 (region) |
| 8 | note | 备注 | note | varchar(200) |  | 备注 (Memo) |
| 9 | usestate | 是否停启用 | usestate | char(1) |  | 布尔类型 (UFBoolean) | Y |
| 10 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 11 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 12 | modifier | 最后修改人 | modifier | varchar(20) |  | 用户 (user) |
| 13 | modifiedtime | 最后修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |